# SwaggerClient::CostCenterApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CostCenterApi.md#create) | **POST** /buyers/{buyerID}/costcenters | 
[**delete**](CostCenterApi.md#delete) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**delete_assignment**](CostCenterApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID}/assignments | 
[**get**](CostCenterApi.md#get) | **GET** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**list**](CostCenterApi.md#list) | **GET** /buyers/{buyerID}/costcenters | 
[**list_assignments**](CostCenterApi.md#list_assignments) | **GET** /buyers/{buyerID}/costcenters/assignments | 
[**patch**](CostCenterApi.md#patch) | **PATCH** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**save_assignment**](CostCenterApi.md#save_assignment) | **POST** /buyers/{buyerID}/costcenters/assignments | 
[**update**](CostCenterApi.md#update) | **PUT** /buyers/{buyerID}/costcenters/{costCenterID} | 


# **create**
> Object create(buyer_id, cost_center)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center = SwaggerClient::CostCenter.new # CostCenter | 


begin
  result = api_instance.create(buyer_id, cost_center)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center** | [**CostCenter**](CostCenter.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, cost_center_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center_id = "cost_center_id_example" # String | ID of the cost center.


begin
  api_instance.delete(buyer_id, cost_center_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, cost_center_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center_id = "cost_center_id_example" # String | ID of the cost center.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, cost_center_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | 
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
> Object get(buyer_id, cost_center_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center_id = "cost_center_id_example" # String | ID of the cost center.


begin
  result = api_instance.get(buyer_id, cost_center_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | 

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

api_instance = SwaggerClient::CostCenterApi.new

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
  puts "Exception when calling CostCenterApi->list: #{e}"
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

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  cost_center_id: "cost_center_id_example", # String | ID of the cost center.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the cost center.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the cost center. | [optional] 
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
> Object patch(buyer_id, cost_center_id, cost_center)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center_id = "cost_center_id_example" # String | ID of the cost center.

cost_center = SwaggerClient::CostCenter.new # CostCenter | 


begin
  result = api_instance.patch(buyer_id, cost_center_id, cost_center)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | 
 **cost_center** | [**CostCenter**](CostCenter.md)|  | 

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

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

assignment = SwaggerClient::CostCenterAssignment.new # CostCenterAssignment | 


begin
  api_instance.save_assignment(buyer_id, assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **assignment** | [**CostCenterAssignment**](CostCenterAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, cost_center_id, cost_center)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CostCenterApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

cost_center_id = "cost_center_id_example" # String | ID of the cost center.

cost_center = SwaggerClient::CostCenter.new # CostCenter | 


begin
  result = api_instance.update(buyer_id, cost_center_id, cost_center)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CostCenterApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **cost_center_id** | **String**| ID of the cost center. | 
 **cost_center** | [**CostCenter**](CostCenter.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



