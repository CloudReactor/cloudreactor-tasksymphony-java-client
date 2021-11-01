

# PatchedAlertMethod

An AlertMethod specifies one or more configured methods of notifying users or external sources of events that trigger when one or more conditions are satisfied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**enabled** | **Boolean** |  |  [optional]
**methodDetails** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly]
**notifyOnSuccess** | **Boolean** |  |  [optional]
**notifyOnFailure** | **Boolean** |  |  [optional]
**notifyOnTimeout** | **Boolean** |  |  [optional]
**errorSeverityOnMissingExecution** | **ErrorSeverityOnMissingExecutionEnum** |  |  [optional]
**errorSeverityOnMissingHeartbeat** | **ErrorSeverityOnMissingHeartbeatEnum** |  |  [optional]
**errorSeverityOnServiceDown** | **ErrorSeverityOnServiceDownEnum** |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



