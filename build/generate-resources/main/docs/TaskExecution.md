

# TaskExecution

A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**dashboardUrl** | **String** |  |  [readonly]
**infrastructureWebsiteUrl** | **String** |  |  [readonly]
**task** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**taskVersionNumber** | **Long** |  |  [optional]
**taskVersionText** | **String** |  |  [optional]
**taskVersionSignature** | **String** |  |  [optional]
**commitUrl** | **String** |  |  [readonly]
**otherInstanceMetadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**hostname** | **String** |  |  [optional]
**environmentVariablesOverrides** | **Map&lt;String, Object&gt;** |  |  [optional]
**executionMethod** | [**AwsEcsExecutionMethod**](AwsEcsExecutionMethod.md) |  |  [readonly]
**status** | **String** |  | 
**startedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**startedAt** | **OffsetDateTime** |  |  [readonly]
**finishedAt** | **OffsetDateTime** |  |  [optional]
**markedDoneBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**markedDoneAt** | **OffsetDateTime** |  |  [optional]
**markedOutdatedAt** | **OffsetDateTime** |  |  [optional]
**killedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**killStartedAt** | **OffsetDateTime** |  |  [optional]
**killFinishedAt** | **OffsetDateTime** |  |  [optional]
**killErrorCode** | **Integer** |  |  [optional]
**stopReason** | **String** |  |  [optional]
**lastHeartbeatAt** | **OffsetDateTime** |  |  [optional]
**failedAttempts** | **Integer** |  |  [optional]
**timedOutAttempts** | **Integer** |  |  [optional]
**exitCode** | **Integer** |  |  [optional]
**lastStatusMessage** | **String** |  |  [optional]
**errorCount** | **Long** |  |  [optional]
**skippedCount** | **Long** |  |  [optional]
**expectedCount** | **Long** |  |  [optional]
**successCount** | **Long** |  |  [optional]
**otherRuntimeMetadata** | **Map&lt;String, Object&gt;** |  |  [optional]
**currentCpuUnits** | **Integer** |  |  [optional]
**meanCpuUnits** | **Integer** |  |  [optional]
**maxCpuUnits** | **Integer** |  |  [optional]
**currentMemoryMb** | **Integer** |  |  [optional]
**meanMemoryMb** | **Integer** |  |  [optional]
**maxMemoryMb** | **Integer** |  |  [optional]
**wrapperVersion** | **String** |  |  [optional]
**wrapperLogLevel** | **String** |  |  [optional]
**deployment** | **String** |  |  [optional]
**processCommand** | **String** |  |  [optional]
**isService** | **Boolean** |  |  [optional]
**taskMaxConcurrency** | **Integer** |  |  [optional]
**maxConflictingAgeSeconds** | **Integer** |  |  [optional]
**preventOfflineExecution** | **Boolean** |  |  [optional]
**processTimeoutSeconds** | **Integer** |  |  [optional]
**processTerminationGracePeriodSeconds** | **Integer** |  |  [optional]
**processMaxRetries** | **Integer** |  |  [optional]
**processRetryDelaySeconds** | **Integer** |  |  [optional]
**schedule** | **String** |  |  [optional]
**heartbeatIntervalSeconds** | **Integer** |  |  [optional]
**workflowTaskInstanceExecution** | **String** |  |  [readonly]
**apiBaseUrl** | **String** |  |  [optional]
**apiRequestTimeoutSeconds** | **Integer** |  |  [optional]
**apiRetryDelaySeconds** | **Integer** |  |  [optional]
**apiResumeDelaySeconds** | **Integer** |  |  [optional]
**apiErrorTimeoutSeconds** | **Integer** |  |  [optional]
**apiTaskExecutionCreationErrorTimeoutSeconds** | **Integer** |  |  [optional]
**apiTaskExecutionCreationConflictTimeoutSeconds** | **Integer** |  |  [optional]
**apiTaskExecutionCreationConflictRetryDelaySeconds** | **Integer** |  |  [optional]
**apiFinalUpdateTimeoutSeconds** | **Integer** |  |  [optional]
**statusUpdateIntervalSeconds** | **Integer** |  |  [optional]
**statusUpdatePort** | **Integer** |  |  [optional]
**statusUpdateMessageMaxBytes** | **Integer** |  |  [optional]
**debugLogTail** | **String** |  |  [optional]
**errorLogTail** | **String** |  |  [optional]
**embeddedMode** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]


