

# Task

A Task is a specification for a runnable job, including details on how to run the task and how often the task is supposed to run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**infrastructureWebsiteUrl** | **String** |  |  [readonly]
**maxManualStartDelayBeforeAlertSeconds** | **Integer** |  |  [optional]
**maxManualStartDelayBeforeAbandonmentSeconds** | **Integer** |  |  [optional]
**heartbeatIntervalSeconds** | **Integer** |  |  [optional]
**maxHeartbeatLatenessBeforeAlertSeconds** | **Integer** |  |  [optional]
**maxHeartbeatLatenessBeforeAbandonmentSeconds** | **Integer** |  |  [optional]
**schedule** | **String** |  |  [optional]
**scheduledInstanceCount** | **Integer** |  |  [optional]
**isService** | **Boolean** |  |  [readonly]
**serviceInstanceCount** | **Integer** |  |  [optional]
**minServiceInstanceCount** | **Integer** |  |  [optional]
**maxConcurrency** | **Integer** |  |  [optional]
**maxAgeSeconds** | **Integer** |  |  [optional]
**defaultMaxRetries** | **Integer** |  |  [optional]
**projectUrl** | **String** |  |  [optional]
**logQuery** | **String** |  |  [optional]
**logsUrl** | **String** |  |  [readonly]
**links** | [**Link**](Link.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**executionMethodCapability** | [**ExecutionMethodCapability**](ExecutionMethodCapability.md) |  |  [readonly]
**alertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [readonly]
**otherMetadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**latestTaskExecution** | [**TaskExecution**](TaskExecution.md) |  |  [readonly]
**currentServiceInfo** | [**CurrentServiceInfo**](CurrentServiceInfo.md) |  |  [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**wasAutoCreated** | **Boolean** |  |  [optional]
**passive** | **Boolean** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



