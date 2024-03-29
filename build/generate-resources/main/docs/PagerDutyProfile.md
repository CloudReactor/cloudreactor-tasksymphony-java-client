

# PagerDutyProfile

A PagerDutyProfile contains user-specific configuration on how to notify PagerDuty of events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**integrationKey** | **String** |  | 
**defaultEventSeverity** | **NotificationSeverity** |  |  [optional]
**defaultEventComponentTemplate** | **String** |  |  [optional]
**defaultEventGroupTemplate** | **String** |  |  [optional]
**defaultEventClassTemplate** | **String** |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]



