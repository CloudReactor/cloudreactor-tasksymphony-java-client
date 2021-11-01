

# AlertMethod


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
**errorSeverityOnMissingExecution** | **ErrorSeverityOnMissingExecutionEnum** |  |  [optional]
**errorSeverityOnMissingHeartbeat** | **ErrorSeverityOnMissingHeartbeatEnum** |  |  [optional]
**errorSeverityOnServiceDown** | **ErrorSeverityOnServiceDownEnum** |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



