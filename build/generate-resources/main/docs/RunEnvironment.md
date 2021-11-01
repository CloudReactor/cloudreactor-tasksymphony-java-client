

# RunEnvironment

RunEnvironments contain common settings for running a set of related Tasks. Usually RunEnvironments group Tasks in the same deployment environment (e.g. staging or production). Task and Workflows belong to a RunEnvironment but can override the RunEnvironment's settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]
**awsAccountId** | **String** |  |  [optional]
**awsDefaultRegion** | **String** |  |  [optional]
**awsAccessKey** | **String** |  |  [optional]
**awsAssumedRoleExternalId** | **String** |  |  [optional]
**awsEventsRoleArn** | **String** |  |  [optional]
**awsWorkflowStarterLambdaArn** | **String** |  |  [optional]
**awsWorkflowStarterAccessKey** | **String** |  |  [optional]
**defaultAlertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [optional]
**executionMethodCapabilities** | [**List&lt;AwsEcsRunEnvironmentExecutionMethodCapability&gt;**](AwsEcsRunEnvironmentExecutionMethodCapability.md) |  |  [readonly]



