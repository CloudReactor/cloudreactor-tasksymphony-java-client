

# WorkflowExecutionSummary

A WorkflowExecution holds data on a specific execution (run) of a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**dashboardUrl** | **String** |  |  [readonly]
**status** | **String** |  | 
**runReason** | **Integer** |  |  [optional]
**startedAt** | **OffsetDateTime** |  |  [readonly]
**finishedAt** | **OffsetDateTime** |  |  [optional]
**lastHeartbeatAt** | **OffsetDateTime** |  |  [optional]
**stopReason** | **Integer** |  |  [optional]
**markedDoneAt** | **OffsetDateTime** |  |  [optional]
**killStartedAt** | **OffsetDateTime** |  |  [optional]
**killFinishedAt** | **OffsetDateTime** |  |  [optional]
**killErrorCode** | **Integer** |  |  [optional]
**failedAttempts** | **Integer** |  |  [optional]
**timedOutAttempts** | **Integer** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



