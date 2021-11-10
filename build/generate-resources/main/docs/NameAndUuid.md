

# NameAndUuid

Identifies an entity in three ways: 1. UUID; 2. Name; and 3. URL. When used to indentify an entity in a request method body, only one of uuid and name needs to be specified. If both are present, they must refer to the same entity or else the response will be a 400 error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional]
**url** | **String** |  |  [readonly]
**name** | **String** |  |  [optional]



