# SwaggerClient::UserGroupApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
[**delete**](UserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**delete_user_assignment**](UserGroupApi.md#delete_user_assignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**get**](UserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**list**](UserGroupApi.md#list) | **GET** /buyers/{buyerID}/usergroups | 
[**list_user_assignments**](UserGroupApi.md#list_user_assignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
[**patch**](UserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**save_user_assignment**](UserGroupApi.md#save_user_assignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
[**update**](UserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


# **create**
> Object create(buyer_id, group)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

group = SwaggerClient::UserGroup.new # UserGroup | 


begin
  result = api_instance.create(buyer_id, group)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, user_group_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_id = "user_group_id_example" # String | ID of the user group.


begin
  api_instance.delete(buyer_id, user_group_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_user_assignment**
> delete_user_assignment(buyer_id, user_group_id, user_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_id = "user_group_id_example" # String | ID of the user group.

user_id = "user_id_example" # String | ID of the user.


begin
  api_instance.delete_user_assignment(buyer_id, user_group_id, user_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->delete_user_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | 
 **user_id** | **String**| ID of the user. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, user_group_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_id = "user_group_id_example" # String | ID of the user group.


begin
  result = api_instance.get(buyer_id, user_group_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | 

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

api_instance = SwaggerClient::UserGroupApi.new

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
  puts "Exception when calling UserGroupApi->list: #{e}"
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



# **list_user_assignments**
> Object list_user_assignments(buyer_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  user_group_id: "user_group_id_example", # String | ID of the user group.
  user_id: "user_id_example", # String | ID of the user.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_user_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->list_user_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
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
> patch(buyer_id, user_group_id, group)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_id = "user_group_id_example" # String | ID of the user group.

group = SwaggerClient::UserGroup.new # UserGroup | 


begin
  api_instance.patch(buyer_id, user_group_id, group)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_user_assignment**
> save_user_assignment(buyer_id, user_group_assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_assignment = SwaggerClient::UserGroupAssignment.new # UserGroupAssignment | 


begin
  api_instance.save_user_assignment(buyer_id, user_group_assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->save_user_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_assignment** | [**UserGroupAssignment**](UserGroupAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, user_group_id, group)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::UserGroupApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

user_group_id = "user_group_id_example" # String | ID of the user group.

group = SwaggerClient::UserGroup.new # UserGroup | 


begin
  result = api_instance.update(buyer_id, user_group_id, group)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserGroupApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **user_group_id** | **String**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



