

# PatchedWorkflow

Workflows are Tasks arranged in a directed graph. Configured Tasks are held by WorkflowTaskInstances, and WorkflowTransitions connect WorkflowTaskInstances together.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**schedule** | **String** |  |  [optional]
**maxConcurrency** | **Integer** |  |  [optional]
**maxAgeSeconds** | **Integer** |  |  [optional]
**defaultMaxRetries** | **Integer** |  |  [optional]
**latestWorkflowExecution** | [**WorkflowExecutionSummary**](WorkflowExecutionSummary.md) |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]
**alertMethods** | [**List&lt;NameAndUuid&gt;**](NameAndUuid.md) |  |  [optional] [readonly]
**workflowTaskInstances** | [**List&lt;WorkflowTaskInstance&gt;**](WorkflowTaskInstance.md) |  |  [optional] [readonly]
**workflowTransitions** | [**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md) |  |  [optional] [readonly]



