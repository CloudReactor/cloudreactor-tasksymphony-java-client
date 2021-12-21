

# PatchedTask

A Task is a specification for a runnable job, including details on how to run the task and how often the task is supposed to run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**infrastructureWebsiteUrl** | **String** |  |  [optional] [readonly]
**maxManualStartDelayBeforeAlertSeconds** | **Integer** |  |  [optional]
**maxManualStartDelayBeforeAbandonmentSeconds** | **Integer** |  |  [optional]
**heartbeatIntervalSeconds** | **Integer** |  |  [optional]
**maxHeartbeatLatenessBeforeAlertSeconds** | **Integer** |  |  [optional]
**maxHeartbeatLatenessBeforeAbandonmentSeconds** | **Integer** |  |  [optional]
**schedule** | **String** |  |  [optional]
**scheduledInstanceCount** | **Integer** |  |  [optional]
**isService** | **Boolean** |  |  [optional] [readonly]
**serviceInstanceCount** | **Integer** |  |  [optional]
**minServiceInstanceCount** | **Integer** |  |  [optional]
**maxConcurrency** | **Integer** |  |  [optional]
**maxAgeSeconds** | **Integer** |  |  [optional]
**defaultMaxRetries** | **Integer** |  |  [optional]
**projectUrl** | **String** |  |  [optional]
**logQuery** | **String** |  |  [optional]
**logsUrl** | **String** |  |  [optional] [readonly]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**executionMethodCapability** | [**ExecutionMethodCapability**](ExecutionMethodCapability.md) |  |  [optional] [readonly]
**alertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [optional]
**otherMetadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**latestTaskExecution** | [**TaskExecution**](TaskExecution.md) |  |  [optional] [readonly]
**currentServiceInfo** | [**CurrentServiceInfo**](CurrentServiceInfo.md) |  |  [optional] [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**wasAutoCreated** | **Boolean** |  |  [optional]
**passive** | **Boolean** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



