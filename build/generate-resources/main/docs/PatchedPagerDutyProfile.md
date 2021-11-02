

# PatchedPagerDutyProfile

A PagerDutyProfile contains user-specific configuration on how to notify PagerDuty of events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**integrationKey** | **String** |  |  [optional]
**defaultEventSeverity** | **DefaultEventSeverityEnum** |  |  [optional]
**defaultEventComponentTemplate** | **String** |  |  [optional]
**defaultEventGroupTemplate** | **String** |  |  [optional]
**defaultEventClassTemplate** | **String** |  |  [optional]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]



