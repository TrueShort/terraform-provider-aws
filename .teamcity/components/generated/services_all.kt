// Code generated by internal/generate/teamcity/services.go; DO NOT EDIT.

val services = mapOf(
    "accessanalyzer" to ServiceSpec("IAM Access Analyzer"),
    "account" to ServiceSpec("Account Management"),
    "acm" to ServiceSpec("ACM (Certificate Manager)"),
    "acmpca" to ServiceSpec("ACM PCA (Certificate Manager Private Certificate Authority)"),
    "amp" to ServiceSpec("AMP (Managed Prometheus)"),
    "amplify" to ServiceSpec("Amplify"),
    "apigateway" to ServiceSpec("API Gateway", vpcLock = true),
    "apigatewayv2" to ServiceSpec("API Gateway V2", vpcLock = true),
    "appautoscaling" to ServiceSpec("Application Auto Scaling", vpcLock = true),
    "appconfig" to ServiceSpec("AppConfig"),
    "appfabric" to ServiceSpec("AppFabric"),
    "appflow" to ServiceSpec("AppFlow"),
    "appintegrations" to ServiceSpec("AppIntegrations"),
    "applicationinsights" to ServiceSpec("CloudWatch Application Insights"),
    "applicationsignals" to ServiceSpec("Application Signals"),
    "appmesh" to ServiceSpec("App Mesh"),
    "apprunner" to ServiceSpec("App Runner"),
    "appstream" to ServiceSpec("AppStream 2.0", vpcLock = true, parallelismOverride = 10),
    "appsync" to ServiceSpec("AppSync"),
    "athena" to ServiceSpec("Athena"),
    "auditmanager" to ServiceSpec("Audit Manager"),
    "autoscaling" to ServiceSpec("Auto Scaling", vpcLock = true),
    "autoscalingplans" to ServiceSpec("Auto Scaling Plans"),
    "backup" to ServiceSpec("Backup"),
    "batch" to ServiceSpec("Batch", vpcLock = true),
    "bcmdataexports" to ServiceSpec("BCM Data Exports"),
    "bedrock" to ServiceSpec("Bedrock"),
    "bedrockagent" to ServiceSpec("Agents for Amazon Bedrock"),
    "budgets" to ServiceSpec("Web Services Budgets"),
    "ce" to ServiceSpec("CE (Cost Explorer)"),
    "chatbot" to ServiceSpec("Chatbot"),
    "chime" to ServiceSpec("Chime"),
    "chimesdkmediapipelines" to ServiceSpec("Chime SDK Media Pipelines"),
    "chimesdkvoice" to ServiceSpec("Chime SDK Voice"),
    "cleanrooms" to ServiceSpec("Clean Rooms"),
    "cloud9" to ServiceSpec("Cloud9"),
    "cloudcontrol" to ServiceSpec("Cloud Control API"),
    "cloudformation" to ServiceSpec("CloudFormation", vpcLock = true),
    "cloudfront" to ServiceSpec("CloudFront"),
    "cloudfrontkeyvaluestore" to ServiceSpec("CloudFront KeyValueStore"),
    "cloudhsmv2" to ServiceSpec("CloudHSM", vpcLock = true),
    "cloudsearch" to ServiceSpec("CloudSearch"),
    "cloudtrail" to ServiceSpec("CloudTrail"),
    "cloudwatch" to ServiceSpec("CloudWatch"),
    "codeartifact" to ServiceSpec("CodeArtifact"),
    "codebuild" to ServiceSpec("CodeBuild"),
    "codecatalyst" to ServiceSpec("CodeCatalyst"),
    "codecommit" to ServiceSpec("CodeCommit"),
    "codeguruprofiler" to ServiceSpec("CodeGuru Profiler"),
    "codegurureviewer" to ServiceSpec("CodeGuru Reviewer"),
    "codepipeline" to ServiceSpec("CodePipeline"),
    "codestarconnections" to ServiceSpec("CodeStar Connections"),
    "codestarnotifications" to ServiceSpec("CodeStar Notifications"),
    "cognitoidentity" to ServiceSpec("Cognito Identity"),
    "cognitoidp" to ServiceSpec("Cognito IDP (Identity Provider)"),
    "comprehend" to ServiceSpec("Comprehend", parallelismOverride = 10),
    "computeoptimizer" to ServiceSpec("Compute Optimizer"),
    "configservice" to ServiceSpec("Config"),
    "connect" to ServiceSpec("Connect"),
    "connectcases" to ServiceSpec("Connect Cases"),
    "controltower" to ServiceSpec("Control Tower"),
    "costoptimizationhub" to ServiceSpec("Cost Optimization Hub"),
    "cur" to ServiceSpec("Cost and Usage Report", regionOverride = "us-east-1"),
    "customerprofiles" to ServiceSpec("Connect Customer Profiles"),
    "dataexchange" to ServiceSpec("Data Exchange"),
    "datapipeline" to ServiceSpec("Data Pipeline"),
    "datasync" to ServiceSpec("DataSync", vpcLock = true),
    "datazone" to ServiceSpec("DataZone"),
    "dax" to ServiceSpec("DynamoDB Accelerator (DAX)"),
    "deploy" to ServiceSpec("CodeDeploy", vpcLock = true),
    "detective" to ServiceSpec("Detective"),
    "devicefarm" to ServiceSpec("Device Farm"),
    "devopsguru" to ServiceSpec("DevOps Guru"),
    "directconnect" to ServiceSpec("Direct Connect", vpcLock = true),
    "dlm" to ServiceSpec("DLM (Data Lifecycle Manager)"),
    "dms" to ServiceSpec("DMS (Database Migration)", vpcLock = true),
    "docdb" to ServiceSpec("DocumentDB", vpcLock = true),
    "docdbelastic" to ServiceSpec("DocumentDB Elastic"),
    "drs" to ServiceSpec("DRS (Elastic Disaster Recovery)"),
    "ds" to ServiceSpec("Directory Service", vpcLock = true),
    "dynamodb" to ServiceSpec("DynamoDB"),
    "ec2" to ServiceSpec("EC2 (Elastic Compute Cloud)", vpcLock = true, patternOverride = "TestAccEC2", excludePattern = "TestAccEC2EBS|TestAccEC2Outposts"),
    "ec2ebs" to ServiceSpec("EBS (EC2)", vpcLock = true, patternOverride = "TestAccEC2EBS", splitPackageRealPackage = "ec2"),
    "ec2outposts" to ServiceSpec("Outposts (EC2)", vpcLock = true, patternOverride = "TestAccEC2Outposts", splitPackageRealPackage = "ec2"),
    "ecr" to ServiceSpec("ECR (Elastic Container Registry)"),
    "ecrpublic" to ServiceSpec("ECR Public", regionOverride = "us-east-1"),
    "ecs" to ServiceSpec("ECS (Elastic Container)", vpcLock = true),
    "efs" to ServiceSpec("EFS (Elastic File System)", vpcLock = true),
    "eks" to ServiceSpec("EKS (Elastic Kubernetes)", vpcLock = true),
    "elasticache" to ServiceSpec("ElastiCache", vpcLock = true),
    "elasticbeanstalk" to ServiceSpec("Elastic Beanstalk", vpcLock = true),
    "elasticsearch" to ServiceSpec("Elasticsearch", vpcLock = true),
    "elastictranscoder" to ServiceSpec("Elastic Transcoder"),
    "elb" to ServiceSpec("ELB Classic", vpcLock = true),
    "elbv2" to ServiceSpec("ELB (Elastic Load Balancing)", vpcLock = true),
    "emr" to ServiceSpec("EMR", vpcLock = true),
    "emrcontainers" to ServiceSpec("EMR Containers"),
    "emrserverless" to ServiceSpec("EMR Serverless"),
    "events" to ServiceSpec("EventBridge"),
    "evidently" to ServiceSpec("CloudWatch Evidently"),
    "finspace" to ServiceSpec("FinSpace"),
    "firehose" to ServiceSpec("Kinesis Firehose"),
    "fis" to ServiceSpec("FIS (Fault Injection Simulator)"),
    "fms" to ServiceSpec("FMS (Firewall Manager)", regionOverride = "us-east-1"),
    "fsx" to ServiceSpec("FSx", vpcLock = true),
    "gamelift" to ServiceSpec("GameLift"),
    "glacier" to ServiceSpec("S3 Glacier"),
    "globalaccelerator" to ServiceSpec("Global Accelerator"),
    "glue" to ServiceSpec("Glue"),
    "grafana" to ServiceSpec("Managed Grafana"),
    "greengrass" to ServiceSpec("IoT Greengrass"),
    "groundstation" to ServiceSpec("Ground Station"),
    "guardduty" to ServiceSpec("GuardDuty"),
    "healthlake" to ServiceSpec("HealthLake"),
    "iam" to ServiceSpec("IAM (Identity & Access Management)"),
    "identitystore" to ServiceSpec("SSO Identity Store"),
    "imagebuilder" to ServiceSpec("EC2 Image Builder", vpcLock = true),
    "inspector" to ServiceSpec("Inspector Classic"),
    "inspector2" to ServiceSpec("Inspector"),
    "internetmonitor" to ServiceSpec("CloudWatch Internet Monitor"),
    "iot" to ServiceSpec("IoT Core"),
    "iotanalytics" to ServiceSpec("IoT Analytics"),
    "iotevents" to ServiceSpec("IoT Events"),
    "ipam" to ServiceSpec("VPC IPAM (IP Address Manager)", vpcLock = true, patternOverride = "TestAccIPAM", splitPackageRealPackage = "ec2"),
    "ivs" to ServiceSpec("IVS (Interactive Video)"),
    "ivschat" to ServiceSpec("IVS (Interactive Video) Chat"),
    "kafka" to ServiceSpec("Managed Streaming for Kafka", vpcLock = true),
    "kafkaconnect" to ServiceSpec("Managed Streaming for Kafka Connect"),
    "keyspaces" to ServiceSpec("Keyspaces (for Apache Cassandra)"),
    "kinesis" to ServiceSpec("Kinesis"),
    "kinesisvideo" to ServiceSpec("Kinesis Video"),
    "kms" to ServiceSpec("KMS (Key Management)"),
    "lakeformation" to ServiceSpec("Lake Formation"),
    "lambda" to ServiceSpec("Lambda", vpcLock = true),
    "launchwizard" to ServiceSpec("Launch Wizard"),
    "lexmodels" to ServiceSpec("Lex Model Building"),
    "lexv2models" to ServiceSpec("Lex V2 Models"),
    "licensemanager" to ServiceSpec("License Manager"),
    "lightsail" to ServiceSpec("Lightsail", regionOverride = "us-east-1"),
    "location" to ServiceSpec("Location"),
    "logs" to ServiceSpec("CloudWatch Logs"),
    "lookoutmetrics" to ServiceSpec("Lookout for Metrics"),
    "m2" to ServiceSpec("Mainframe Modernization"),
    "macie2" to ServiceSpec("Macie"),
    "mediaconnect" to ServiceSpec("Elemental MediaConnect"),
    "mediaconvert" to ServiceSpec("Elemental MediaConvert"),
    "medialive" to ServiceSpec("Elemental MediaLive"),
    "mediapackage" to ServiceSpec("Elemental MediaPackage"),
    "mediapackagev2" to ServiceSpec("Elemental MediaPackage Version 2"),
    "mediastore" to ServiceSpec("Elemental MediaStore"),
    "memorydb" to ServiceSpec("MemoryDB for Redis"),
    "mq" to ServiceSpec("MQ", vpcLock = true),
    "mwaa" to ServiceSpec("MWAA (Managed Workflows for Apache Airflow)", vpcLock = true),
    "neptune" to ServiceSpec("Neptune"),
    "neptunegraph" to ServiceSpec("Neptune Analytics"),
    "networkfirewall" to ServiceSpec("Network Firewall", vpcLock = true),
    "networkmanager" to ServiceSpec("Network Manager", vpcLock = true),
    "oam" to ServiceSpec("CloudWatch Observability Access Manager"),
    "opensearch" to ServiceSpec("OpenSearch", vpcLock = true),
    "opensearchserverless" to ServiceSpec("OpenSearch Serverless"),
    "opsworks" to ServiceSpec("OpsWorks", vpcLock = true),
    "organizations" to ServiceSpec("Organizations"),
    "osis" to ServiceSpec("OpenSearch Ingestion"),
    "outposts" to ServiceSpec("Outposts"),
    "paymentcryptography" to ServiceSpec("Payment Cryptography Control Plane"),
    "pcaconnectorad" to ServiceSpec("Private CA Connector for Active Directory"),
    "pinpoint" to ServiceSpec("Pinpoint"),
    "pipes" to ServiceSpec("EventBridge Pipes"),
    "polly" to ServiceSpec("Polly"),
    "pricing" to ServiceSpec("Pricing Calculator", regionOverride = "us-east-1"),
    "qbusiness" to ServiceSpec("Amazon Q Business"),
    "qldb" to ServiceSpec("QLDB (Quantum Ledger Database)"),
    "quicksight" to ServiceSpec("QuickSight"),
    "ram" to ServiceSpec("RAM (Resource Access Manager)"),
    "rbin" to ServiceSpec("Recycle Bin (RBin)"),
    "rds" to ServiceSpec("RDS (Relational Database)", vpcLock = true),
    "redshift" to ServiceSpec("Redshift", vpcLock = true),
    "redshiftdata" to ServiceSpec("Redshift Data"),
    "redshiftserverless" to ServiceSpec("Redshift Serverless"),
    "rekognition" to ServiceSpec("Rekognition"),
    "resourceexplorer2" to ServiceSpec("Resource Explorer"),
    "resourcegroups" to ServiceSpec("Resource Groups"),
    "resourcegroupstaggingapi" to ServiceSpec("Resource Groups Tagging"),
    "rolesanywhere" to ServiceSpec("Roles Anywhere"),
    "route53" to ServiceSpec("Route 53", vpcLock = true),
    "route53domains" to ServiceSpec("Route 53 Domains"),
    "route53profiles" to ServiceSpec("Route 53 Profiles"),
    "route53recoverycontrolconfig" to ServiceSpec("Route 53 Recovery Control Config"),
    "route53recoveryreadiness" to ServiceSpec("Route 53 Recovery Readiness"),
    "route53resolver" to ServiceSpec("Route 53 Resolver", vpcLock = true),
    "rum" to ServiceSpec("CloudWatch RUM"),
    "s3" to ServiceSpec("S3 (Simple Storage)"),
    "s3control" to ServiceSpec("S3 Control"),
    "s3outposts" to ServiceSpec("S3 on Outposts"),
    "sagemaker" to ServiceSpec("SageMaker", vpcLock = true),
    "scheduler" to ServiceSpec("EventBridge Scheduler"),
    "schemas" to ServiceSpec("EventBridge Schemas"),
    "secretsmanager" to ServiceSpec("Secrets Manager"),
    "securityhub" to ServiceSpec("Security Hub"),
    "securitylake" to ServiceSpec("Security Lake"),
    "serverlessrepo" to ServiceSpec("Serverless Application Repository"),
    "servicecatalog" to ServiceSpec("Service Catalog"),
    "servicecatalogappregistry" to ServiceSpec("Service Catalog AppRegistry"),
    "servicediscovery" to ServiceSpec("Cloud Map", vpcLock = true),
    "servicequotas" to ServiceSpec("Service Quotas"),
    "ses" to ServiceSpec("SES (Simple Email)"),
    "sesv2" to ServiceSpec("SESv2 (Simple Email V2)"),
    "sfn" to ServiceSpec("SFN (Step Functions)"),
    "shield" to ServiceSpec("Shield"),
    "signer" to ServiceSpec("Signer"),
    "simpledb" to ServiceSpec("SDB (SimpleDB)"),
    "sns" to ServiceSpec("SNS (Simple Notification)"),
    "sqs" to ServiceSpec("SQS (Simple Queue)"),
    "ssm" to ServiceSpec("SSM (Systems Manager)", vpcLock = true),
    "ssmcontacts" to ServiceSpec("SSM Contacts"),
    "ssmincidents" to ServiceSpec("SSM Incident Manager Incidents"),
    "ssmsap" to ServiceSpec("Systems Manager for SAP"),
    "sso" to ServiceSpec("SSO (Single Sign-On)"),
    "ssoadmin" to ServiceSpec("SSO Admin"),
    "storagegateway" to ServiceSpec("Storage Gateway", vpcLock = true),
    "sts" to ServiceSpec("STS (Security Token)"),
    "swf" to ServiceSpec("SWF (Simple Workflow)"),
    "synthetics" to ServiceSpec("CloudWatch Synthetics", parallelismOverride = 10),
    "timestreaminfluxdb" to ServiceSpec("Timestream for InfluxDB"),
    "timestreamwrite" to ServiceSpec("Timestream Write"),
    "transcribe" to ServiceSpec("Transcribe"),
    "transfer" to ServiceSpec("Transfer Family", vpcLock = true),
    "transitgateway" to ServiceSpec("Transit Gateway", vpcLock = true, patternOverride = "TestAccTransitGateway", splitPackageRealPackage = "ec2"),
    "verifiedaccess" to ServiceSpec("Verified Access", vpcLock = true, patternOverride = "TestAccVerifiedAccess", splitPackageRealPackage = "ec2"),
    "verifiedpermissions" to ServiceSpec("Verified Permissions"),
    "vpc" to ServiceSpec("VPC (Virtual Private Cloud)", vpcLock = true, patternOverride = "TestAccVPC", splitPackageRealPackage = "ec2"),
    "vpclattice" to ServiceSpec("VPC Lattice"),
    "vpnclient" to ServiceSpec("VPN (Client)", vpcLock = true, patternOverride = "TestAccClientVPN", splitPackageRealPackage = "ec2"),
    "vpnsite" to ServiceSpec("VPN (Site-to-Site)", vpcLock = true, patternOverride = "TestAccSiteVPN", splitPackageRealPackage = "ec2"),
    "waf" to ServiceSpec("WAF Classic", regionOverride = "us-east-1"),
    "wafregional" to ServiceSpec("WAF Classic Regional"),
    "wafv2" to ServiceSpec("WAF"),
    "wavelength" to ServiceSpec("Wavelength", vpcLock = true, patternOverride = "TestAccWavelength", splitPackageRealPackage = "ec2"),
    "wellarchitected" to ServiceSpec("Well-Architected Tool"),
    "worklink" to ServiceSpec("WorkLink"),
    "workspaces" to ServiceSpec("WorkSpaces", vpcLock = true),
    "workspacesweb" to ServiceSpec("WorkSpaces Web"),
    "xray" to ServiceSpec("X-Ray"),
)
