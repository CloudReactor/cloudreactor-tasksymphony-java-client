

# Workflow

A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**schedule** | **String** |  |  [optional]
**maxConcurrency** | **Integer** |  |  [optional]
**maxAgeSeconds** | **Integer** |  |  [optional]
**defaultMaxRetries** | **Integer** |  |  [optional]
**latestWorkflowExecution** | [**WorkflowExecutionSummary**](WorkflowExecutionSummary.md) |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]
**alertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [readonly]
**workflowTaskInstances** | [**List&lt;WorkflowTaskInstance&gt;**](WorkflowTaskInstance.md) |  |  [readonly]
**workflowTransitions** | [**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md) |  |  [readonly]



