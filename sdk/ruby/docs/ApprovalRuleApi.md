# SwaggerClient::ApprovalRuleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ApprovalRuleApi.md#create) | **POST** /buyers/{buyerID}/approvalrules | 
[**delete**](ApprovalRuleApi.md#delete) | **DELETE** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**get**](ApprovalRuleApi.md#get) | **GET** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**list**](ApprovalRuleApi.md#list) | **GET** /buyers/{buyerID}/approvalrules | 
[**patch**](ApprovalRuleApi.md#patch) | **PATCH** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**update**](ApprovalRuleApi.md#update) | **PUT** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 


# **create**
> Object create(buyer_id, approval_rule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

approval_rule = SwaggerClient::ApprovalRule.new # ApprovalRule | 


begin
  result = api_instance.create(buyer_id, approval_rule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, approval_rule_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

approval_rule_id = "approval_rule_id_example" # String | ID of the approval rule.


begin
  api_instance.delete(buyer_id, approval_rule_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **approval_rule_id** | **String**| ID of the approval rule. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, approval_rule_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

approval_rule_id = "approval_rule_id_example" # String | ID of the approval rule.


begin
  result = api_instance.get(buyer_id, approval_rule_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **approval_rule_id** | **String**| ID of the approval rule. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list**
> Object list(buyer_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **search** | **String**| Word or phrase to search for. | [optional] 
 **search_on** | **String**| Comma-delimited list of fields to search on. | [optional] 
 **sort_by** | **String**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **Integer**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch**
> Object patch(buyer_id, approval_rule_id, partial_approval_rule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

approval_rule_id = "approval_rule_id_example" # String | ID of the approval rule.

partial_approval_rule = SwaggerClient::ApprovalRule.new # ApprovalRule | 


begin
  result = api_instance.patch(buyer_id, approval_rule_id, partial_approval_rule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **approval_rule_id** | **String**| ID of the approval rule. | 
 **partial_approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, approval_rule_id, approval_rule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ApprovalRuleApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

approval_rule_id = "approval_rule_id_example" # String | ID of the approval rule.

approval_rule = SwaggerClient::ApprovalRule.new # ApprovalRule | 


begin
  result = api_instance.update(buyer_id, approval_rule_id, approval_rule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApprovalRuleApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **approval_rule_id** | **String**| ID of the approval rule. | 
 **approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



