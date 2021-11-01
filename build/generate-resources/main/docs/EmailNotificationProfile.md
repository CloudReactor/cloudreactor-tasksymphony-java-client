

# EmailNotificationProfile

An EmailProfile contains settings for emailing notifications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **URI** |  |  [readonly]
**uuid** | **UUID** |  |  [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**dashboardUrl** | **String** |  |  [readonly]
**createdByUser** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [readonly]
**createdByGroup** | [**Group**](Group.md) |  |  [readonly]
**runEnvironment** | [**NameAndUuid**](NameAndUuid.md) |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [readonly]
**updatedAt** | **OffsetDateTime** |  |  [readonly]
**toAddresses** | **List&lt;String&gt;** |  |  [optional]
**ccAddresses** | **List&lt;String&gt;** |  |  [optional]
**bccAddresses** | **List&lt;String&gt;** |  |  [optional]
**subjectTemplate** | **String** |  |  [optional]
**bodyTemplate** | **String** |  |  [optional]



