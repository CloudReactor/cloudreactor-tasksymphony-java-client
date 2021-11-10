

# PatchedEmailNotificationProfile

An EmailProfile contains settings for emailing notifications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [optional] [readonly]
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [optional] [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [optional] [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly]
**toAddresses** | **List&lt;String&gt;** |  |  [optional]
**ccAddresses** | **List&lt;String&gt;** |  |  [optional]
**bccAddresses** | **List&lt;String&gt;** |  |  [optional]
**subjectTemplate** | **String** |  |  [optional]
**bodyTemplate** | **String** |  |  [optional]



