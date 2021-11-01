

# WorkflowTaskInstanceExecution

A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [readonly]
**workflowExecution** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**workflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**taskExecution** | [**TaskExecution**](TaskExecution.md) |  | 
**isLatest** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]



