

# WorkflowTransitionEvaluation

A WorkflowTransitionEvaluation is a saved evaluation of the conditions in a WorkflowTransition during a WorkflowExecution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [readonly]
**result** | **Boolean** |  | 
**workflowTransition** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**workflowExecution** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**fromWorkflowTaskInstanceExecution** | **String** |  |  [readonly]
**evaluatedAt** | **OffsetDateTime** |  |  [readonly]



