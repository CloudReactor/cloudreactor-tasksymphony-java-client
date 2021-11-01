

# AwsEcsExecutionMethod

A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  |  [readonly]
**taskDefinitionArn** | **String** |  |  [optional]
**taskDefinitionInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**allocatedCpuUnits** | **Integer** |  |  [optional]
**allocatedMemoryMb** | **Integer** |  |  [optional]
**tags** | **Map&lt;String, String&gt;** |  | 
**subnets** | **List&lt;String&gt;** |  |  [optional]
**subnetInfrastructureWebsiteUrls** | **List&lt;String&gt;** |  |  [readonly]
**securityGroups** | **List&lt;String&gt;** |  |  [optional]
**securityGroupInfrastructureWebsiteUrls** | **List&lt;String&gt;** |  |  [readonly]
**assignPublicIp** | **Boolean** |  |  [optional]
**taskArn** | **String** |  |  [optional]
**launchType** | [**SupportedLaunchTypesEnum**](SupportedLaunchTypesEnum.md) |  |  [optional]
**clusterArn** | **String** |  |  [optional]
**clusterInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**executionRole** | **String** |  |  [optional]
**executionRoleInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**taskRole** | **String** |  |  [optional]
**taskRoleInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**platformVersion** | **String** |  |  [optional]


