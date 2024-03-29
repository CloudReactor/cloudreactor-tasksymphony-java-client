

# ExecutionMethodCapability


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionArn** | **String** |  |  [optional]
**taskDefinitionInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**allocatedCpuUnits** | **Integer** |  |  [optional]
**allocatedMemoryMb** | **Integer** |  |  [optional]
**type** | **String** |  |  [readonly]
**capabilities** | **List&lt;String&gt;** |  |  [readonly]
**tags** | **Map&lt;String, String&gt;** |  | 
**defaultSubnets** | **List&lt;String&gt;** |  |  [optional]
**defaultSubnetInfrastructureWebsiteUrls** | **List&lt;String&gt;** |  |  [readonly]
**defaultLaunchType** | [**AwsEcsLaunchType**](AwsEcsLaunchType.md) |  |  [optional]
**supportedLaunchTypes** | [**List&lt;AwsEcsLaunchType&gt;**](AwsEcsLaunchType.md) |  |  [optional]
**defaultClusterArn** | **String** |  |  [optional]
**defaultClusterInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**defaultSecurityGroups** | **List&lt;String&gt;** |  |  [optional]
**defaultSecurityGroupInfrastructureWebsiteUrls** | **List&lt;String&gt;** |  |  [readonly]
**defaultAssignPublicIp** | **Boolean** |  |  [optional]
**defaultExecutionRole** | **String** |  |  [optional]
**defaultExecutionRoleInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**defaultTaskRole** | **String** |  |  [optional]
**defaultTaskRoleInfrastructureWebsiteUrl** | **String** |  |  [readonly]
**defaultPlatformVersion** | **String** |  |  [optional]
**mainContainerName** | **String** |  |  [optional]
**serviceOptions** | [**AwsEcsServiceOptions**](AwsEcsServiceOptions.md) |  |  [optional]



