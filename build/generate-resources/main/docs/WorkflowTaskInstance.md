

# WorkflowTaskInstance

A WorkflowTaskInstance contains a Task that is configured to run in a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**workflow** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**task** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**startTransitionCondition** | **StartTransitionConditionEnum** |  |  [optional]
**maxCompleteExecutions** | **Integer** |  |  [optional]
**shouldEvalTransitionsAfterFirstExecution** | **Boolean** |  |  [optional]
**conditionCountThreshold** | **Integer** |  |  [optional]
**conditionRatioThreshold** | **Float** |  |  [optional]
**maxAgeSeconds** | **Integer** |  |  [optional]
**defaultMaxRetries** | **Integer** |  |  [optional]
**failureBehavior** | **FailureBehaviorEnum** |  |  [optional]
**allowWorkflowExecutionAfterFailure** | **Boolean** |  |  [optional]
**timeoutBehavior** | **TimeoutBehaviorEnum** |  |  [optional]
**allowWorkflowExecutionAfterTimeout** | **Boolean** |  |  [optional]
**environmentVariablesOverrides** | **Map&lt;String, Object&gt;** |  |  [optional]
**allocatedCpuUnits** | **Integer** |  |  [optional]
**allocatedMemoryMb** | **Integer** |  |  [optional]
**useTaskAlertMethods** | **Boolean** |  |  [optional]
**uiColor** | **String** |  |  [optional]
**uiIconType** | **String** |  |  [optional]
**uiScale** | **Float** |  |  [optional]
**uiCenterMarginTop** | **Float** |  |  [optional]
**uiCenterMarginLeft** | **Float** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



