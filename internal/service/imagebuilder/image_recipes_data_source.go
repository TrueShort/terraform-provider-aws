// Copyright (c) HashiCorp, Inc.
// SPDX-License-Identifier: MPL-2.0

package imagebuilder

import (
	"context"

	"github.com/aws/aws-sdk-go-v2/aws"
	"github.com/aws/aws-sdk-go-v2/service/imagebuilder"
	awstypes "github.com/aws/aws-sdk-go-v2/service/imagebuilder/types"
	"github.com/hashicorp/terraform-plugin-sdk/v2/diag"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	"github.com/hashicorp/terraform-provider-aws/internal/conns"
	"github.com/hashicorp/terraform-provider-aws/internal/enum"
	"github.com/hashicorp/terraform-provider-aws/internal/errs/sdkdiag"
	"github.com/hashicorp/terraform-provider-aws/internal/generate/namevaluesfilters"
	"github.com/hashicorp/terraform-provider-aws/internal/generate/namevaluesfiltersv2"
)

// @SDKDataSource("aws_imagebuilder_image_recipes", name="Image Recipes")
func DataSourceImageRecipes() *schema.Resource {
	return &schema.Resource{
		ReadWithoutTimeout: dataSourceImageRecipesRead,
		Schema: map[string]*schema.Schema{
			"arns": {
				Type:     schema.TypeSet,
				Computed: true,
				Elem:     &schema.Schema{Type: schema.TypeString},
			},
			"filter": namevaluesfilters.Schema(),
			"names": {
				Type:     schema.TypeSet,
				Computed: true,
				Elem:     &schema.Schema{Type: schema.TypeString},
			},
			"owner": {
				Type:             schema.TypeString,
				Optional:         true,
				ValidateDiagFunc: enum.Validate[awstypes.Ownership](),
			},
		},
	}
}

func dataSourceImageRecipesRead(ctx context.Context, d *schema.ResourceData, meta interface{}) diag.Diagnostics {
	var diags diag.Diagnostics
	conn := meta.(*conns.AWSClient).ImageBuilderClient(ctx)

	input := &imagebuilder.ListImageRecipesInput{}

	if v, ok := d.GetOk("owner"); ok {
		input.Owner = awstypes.Ownership(v.(string))
	}

	if v, ok := d.GetOk("filter"); ok {
		input.Filters = namevaluesfiltersv2.New(v.(*schema.Set)).ImageBuilderFilters()
	}

	var results []*awstypes.ImageRecipeSummary

	err := conn.ListImageRecipesPages(ctx, input, func(page *imagebuilder.ListImageRecipesOutput, lastPage bool) bool {
		if page == nil {
			return !lastPage
		}

		for _, imageRecipeSummary := range page.ImageRecipeSummaryList {
			if imageRecipeSummary == nil {
				continue
			}

			results = append(results, imageRecipeSummary)
		}

		return !lastPage
	})

	if err != nil {
		return sdkdiag.AppendErrorf(diags, "reading Image Builder Image Recipes: %s", err)
	}

	var arns, names []string

	for _, r := range results {
		arns = append(arns, aws.ToString(r.Arn))
		names = append(names, aws.ToString(r.Name))
	}

	d.SetId(meta.(*conns.AWSClient).Region)
	d.Set("arns", arns)
	d.Set("names", names)

	return diags
}
