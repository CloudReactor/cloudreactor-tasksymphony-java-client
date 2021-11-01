

# PatchedRunEnvironment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]
**awsAccountId** | **String** |  |  [optional]
**awsDefaultRegion** | **String** |  |  [optional]
**awsAccessKey** | **String** |  |  [optional]
**awsAssumedRoleExternalId** | **String** |  |  [optional]
**awsEventsRoleArn** | **String** |  |  [optional]
**awsWorkflowStarterLambdaArn** | **String** |  |  [optional]
**awsWorkflowStarterAccessKey** | **String** |  |  [optional]
**defaultAlertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [optional]
**executionMethodCapabilities** | [**List&lt;AwsEcsRunEnvironmentExecutionMethodCapability&gt;**](AwsEcsRunEnvironmentExecutionMethodCapability.md) |  |  [optional] [readonly]



