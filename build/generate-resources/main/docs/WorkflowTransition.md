

# WorkflowTransition

A WorkflowTransition is a directed edge in a Worfklow, which is a directed graph. It contains a source WorkflowTaskInstance, a destination WorkflowTaskInstance, as well as conditions for triggering the destination to execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**description** | **String** |  |  [optional]
**fromWorkflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**toWorkflowTaskInstance** | [**NameAndUuid**](NameAndUuid.md) |  |  [readonly]
**ruleType** | **RuleTypeEnum** |  | 
**exitCodes** | **List&lt;String&gt;** |  |  [optional]
**thresholdProperty** | **ThresholdPropertyEnum** |  |  [optional]
**customExpression** | **String** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**uiColor** | **String** |  |  [optional]
**uiLineStyle** | **String** |  |  [optional]
**uiScale** | **Float** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



