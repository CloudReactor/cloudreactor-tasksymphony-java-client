

# PatchedWorkflowExecution


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**workflow** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**status** | **WorkflowExecutionStatus** |  |  [optional]
**runReason** | **Integer** |  |  [optional]
**startedAt** | **OffsetDateTime** |  |  [optional] [readonly]
**startedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**finishedAt** | **OffsetDateTime** |  |  [optional]
**lastHeartbeatAt** | **OffsetDateTime** |  |  [optional]
**stopReason** | **Integer** |  |  [optional]
**markedDoneAt** | **OffsetDateTime** |  |  [optional]
**markedDoneBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**killStartedAt** | **OffsetDateTime** |  |  [optional]
**killedBy** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**killFinishedAt** | **OffsetDateTime** |  |  [optional]
**killErrorCode** | **Integer** |  |  [optional]
**failedAttempts** | **Integer** |  |  [optional]
**timedOutAttempts** | **Integer** |  |  [optional]
**workflowSnapshot** | **Map&lt;String, Object&gt;** |  |  [optional]
**workflowTaskInstanceExecutions** | [**List&lt;WorkflowTaskInstanceExecution&gt;**](WorkflowTaskInstanceExecution.md) |  |  [optional] [readonly]
**workflowTransitionEvaluations** | [**List&lt;WorkflowTransitionEvaluation&gt;**](WorkflowTransitionEvaluation.md) |  |  [optional] [readonly]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



