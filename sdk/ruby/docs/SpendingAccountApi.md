# SwaggerClient::SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**delete**](SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**delete_assignment**](SpendingAccountApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**get**](SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**list**](SpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**list_assignments**](SpendingAccountApi.md#list_assignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**patch**](SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**save_assignment**](SpendingAccountApi.md#save_assignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**update**](SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


# **create**
> Object create(buyer_id, spending_account)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account = SwaggerClient::SpendingAccount.new # SpendingAccount | 


begin
  result = api_instance.create(buyer_id, spending_account)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, spending_account_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account_id = "spending_account_id_example" # String | ID of the spending account.


begin
  api_instance.delete(buyer_id, spending_account_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, spending_account_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account_id = "spending_account_id_example" # String | ID of the spending account.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, spending_account_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, spending_account_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account_id = "spending_account_id_example" # String | ID of the spending account.


begin
  result = api_instance.get(buyer_id, spending_account_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | 

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

api_instance = SwaggerClient::SpendingAccountApi.new

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
  puts "Exception when calling SpendingAccountApi->list: #{e}"
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



# **list_assignments**
> Object list_assignments(buyer_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  spending_account_id: "spending_account_id_example", # String | ID of the spending account.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the spending account.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the spending account. | [optional] 
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
> Object patch(buyer_id, spending_account_id, spending_account)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account_id = "spending_account_id_example" # String | ID of the spending account.

spending_account = SwaggerClient::SpendingAccount.new # SpendingAccount | 


begin
  result = api_instance.patch(buyer_id, spending_account_id, spending_account)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_assignment**
> save_assignment(buyer_id, assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

assignment = SwaggerClient::SpendingAccountAssignment.new # SpendingAccountAssignment | 


begin
  api_instance.save_assignment(buyer_id, assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **assignment** | [**SpendingAccountAssignment**](SpendingAccountAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, spending_account_id, spending_account)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpendingAccountApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

spending_account_id = "spending_account_id_example" # String | ID of the spending account.

spending_account = SwaggerClient::SpendingAccount.new # SpendingAccount | 


begin
  result = api_instance.update(buyer_id, spending_account_id, spending_account)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpendingAccountApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **spending_account_id** | **String**| ID of the spending account. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



