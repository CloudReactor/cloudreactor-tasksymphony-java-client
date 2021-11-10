

# PatchedWorkflowTransition

A WorkflowTransition is a directed edge in a Worfklow, which is a directed graph. It contains a source WorkflowTaskInstance, a destination WorkflowTaskInstance, as well as conditions for triggering the destination to execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**description** | **String** |  |  [optional]
**fromWorkflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**toWorkflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**ruleType** | **RuleTypeEnum** |  |  [optional]
**exitCodes** | **List&lt;String&gt;** |  |  [optional]
**thresholdProperty** | **ThresholdPropertyEnum** |  |  [optional]
**customExpression** | **String** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**uiColor** | **String** |  |  [optional]
**uiLineStyle** | **String** |  |  [optional]
**uiScale** | **Float** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



