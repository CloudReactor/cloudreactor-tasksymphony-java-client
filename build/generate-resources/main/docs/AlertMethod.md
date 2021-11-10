

# AlertMethod

An AlertMethod specifies one or more configured methods of notifying users or external sources of events that trigger when one or more conditions are satisfied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**enabled** | **Boolean** |  |  [optional]
**methodDetails** | **Map&lt;String, Object&gt;** |  |  [readonly]
**notifyOnSuccess** | **Boolean** |  |  [optional]
**notifyOnFailure** | **Boolean** |  |  [optional]
**notifyOnTimeout** | **Boolean** |  |  [optional]
**errorSeverityOnMissingExecution** | **NotificationSeverity** |  |  [optional]
**errorSeverityOnMissingHeartbeat** | **NotificationSeverity** |  |  [optional]
**errorSeverityOnServiceDown** | **NotificationSeverity** |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



