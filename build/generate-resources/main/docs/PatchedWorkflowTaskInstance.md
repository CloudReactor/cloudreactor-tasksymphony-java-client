

# PatchedWorkflowTaskInstance

A WorkflowTaskInstance contains a Task that is configured to run in a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**workflow** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**task** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
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
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



