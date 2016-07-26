# SwaggerClient::AddressApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AddressApi.md#create) | **POST** /buyers/{buyerID}/addresses | 
[**delete**](AddressApi.md#delete) | **DELETE** /buyers/{buyerID}/addresses/{addressID} | 
[**delete_assignment**](AddressApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/addresses/{addressID}/assignments | 
[**get**](AddressApi.md#get) | **GET** /buyers/{buyerID}/addresses/{addressID} | 
[**list**](AddressApi.md#list) | **GET** /buyers/{buyerID}/addresses | 
[**list_assignments**](AddressApi.md#list_assignments) | **GET** /buyers/{buyerID}/addresses/assignments | 
[**patch**](AddressApi.md#patch) | **PATCH** /buyers/{buyerID}/addresses/{addressID} | 
[**save_assignment**](AddressApi.md#save_assignment) | **POST** /buyers/{buyerID}/addresses/assignments | 
[**update**](AddressApi.md#update) | **PUT** /buyers/{buyerID}/addresses/{addressID} | 


# **create**
> Object create(buyer_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.create(buyer_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, address_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address_id = "address_id_example" # String | ID of the address.


begin
  api_instance.delete(buyer_id, address_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, address_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address_id = "address_id_example" # String | ID of the address.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, address_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | 
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
> Object get(buyer_id, address_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address_id = "address_id_example" # String | ID of the address.


begin
  result = api_instance.get(buyer_id, address_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | 

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

api_instance = SwaggerClient::AddressApi.new

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
  puts "Exception when calling AddressApi->list: #{e}"
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

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  address_id: "address_id_example", # String | ID of the address.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the address.
  is_shipping: true, # BOOLEAN | Is shipping of the address.
  is_billing: true, # BOOLEAN | Is billing of the address.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the address. | [optional] 
 **is_shipping** | **BOOLEAN**| Is shipping of the address. | [optional] 
 **is_billing** | **BOOLEAN**| Is billing of the address. | [optional] 
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
> Object patch(buyer_id, address_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address_id = "address_id_example" # String | ID of the address.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.patch(buyer_id, address_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | 
 **address** | [**Address**](Address.md)|  | 

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

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

assignment = SwaggerClient::AddressAssignment.new # AddressAssignment | 


begin
  api_instance.save_assignment(buyer_id, assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **assignment** | [**AddressAssignment**](AddressAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, address_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::AddressApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

address_id = "address_id_example" # String | ID of the address.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.update(buyer_id, address_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **address_id** | **String**| ID of the address. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



