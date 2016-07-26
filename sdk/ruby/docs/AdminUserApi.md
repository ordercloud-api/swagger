# SwaggerClient::AdminUserApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AdminUserApi.md#create) | **POST** /adminusers | 
[**delete**](AdminUserApi.md#delete) | **DELETE** /adminusers/{userID} | 
[**get**](AdminUserApi.md#get) | **GET** /adminusers/{userID} | 
[**list**](AdminUserApi.md#list) | **GET** /adminusers | 
[**patch**](AdminUserApi.md#patch) | **PATCH** /adminusers/{userID} | 
[**update**](AdminUserApi.md#update) | **PUT** /adminusers/{userID} | 


# **create**
> Object create(user)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

user = SwaggerClient::User.new # User | 


begin
  result = api_instance.create(user)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(user_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

user_id = "user_id_example" # String | ID of the user.


begin
  api_instance.delete(user_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| ID of the user. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(user_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

user_id = "user_id_example" # String | ID of the user.


begin
  result = api_instance.get(user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| ID of the user. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list**
> Object list(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> patch(user_id, user)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

user_id = "user_id_example" # String | ID of the user.

user = SwaggerClient::User.new # User | 


begin
  api_instance.patch(user_id, user)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| ID of the user. | 
 **user** | [**User**](User.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(user_id, user)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AdminUserApi.new

user_id = "user_id_example" # String | ID of the user.

user = SwaggerClient::User.new # User | 


begin
  result = api_instance.update(user_id, user)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AdminUserApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| ID of the user. | 
 **user** | [**User**](User.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



