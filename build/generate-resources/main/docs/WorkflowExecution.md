

# WorkflowExecution


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**dashboardUrl** | **String** |  |  [readonly]
**workflow** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**status** | **String** |  | 
**runReason** | **Integer** |  |  [optional]
**startedAt** | **OffsetDateTime** |  |  [readonly]
**startedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**finishedAt** | **OffsetDateTime** |  |  [optional]
**lastHeartbeatAt** | **OffsetDateTime** |  |  [optional]
**stopReason** | **Integer** |  |  [optional]
**markedDoneAt** | **OffsetDateTime** |  |  [optional]
**markedDoneBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**killStartedAt** | **OffsetDateTime** |  |  [optional]
**killedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**killFinishedAt** | **OffsetDateTime** |  |  [optional]
**killErrorCode** | **Integer** |  |  [optional]
**failedAttempts** | **Integer** |  |  [optional]
**timedOutAttempts** | **Integer** |  |  [optional]
**workflowSnapshot** | **Map&lt;String, Object&gt;** |  |  [optional]
**workflowTaskInstanceExecutions** | [**List&lt;WorkflowTaskInstanceExecution&gt;**](WorkflowTaskInstanceExecution.md) |  |  [readonly]
**workflowTransitionEvaluations** | [**List&lt;WorkflowTransitionEvaluation&gt;**](WorkflowTransitionEvaluation.md) |  |  [readonly]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



