

# WorkflowTaskInstanceExecution

WorkflowTaskInstanceExecutions hold the execution information for a WorkflowTaskInstance (which holds a Task) for a specific WorkflowExection (run of a Workflow).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [readonly]
**workflowExecution** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**workflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**taskExecution** | [**TaskExecution**](TaskExecution.md) |  |  [readonly]
**isLatest** | **Boolean** |  |  [readonly]
**createdAt** | **OffsetDateTime** |  |  [readonly]



