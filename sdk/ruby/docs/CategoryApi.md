# SwaggerClient::CategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**delete_assignment**](CategoryApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**delete_product_assignment**](CategoryApi.md#delete_product_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**list**](CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**list_assignments**](CategoryApi.md#list_assignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**list_children**](CategoryApi.md#list_children) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**list_product_assignments**](CategoryApi.md#list_product_assignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**save_assignment**](CategoryApi.md#save_assignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**save_product_assignment**](CategoryApi.md#save_product_assignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


# **create**
> Object create(buyer_id, category)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category = SwaggerClient::Category.new # Category | 


begin
  result = api_instance.create(buyer_id, category)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, category_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.


begin
  api_instance.delete(buyer_id, category_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, category_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, category_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_product_assignment**
> delete_product_assignment(buyer_id, category_id, product_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.

product_id = "product_id_example" # String | ID of the product.


begin
  api_instance.delete_product_assignment(buyer_id, category_id, product_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->delete_product_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 
 **product_id** | **String**| ID of the product. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, category_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.


begin
  result = api_instance.get(buyer_id, category_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 

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

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  parent_id: "parent_id_example", # String | ID of the parent.
  depth: "depth_example", # String | Depth of the category.
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
  puts "Exception when calling CategoryApi->list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **parent_id** | **String**| ID of the parent. | [optional] 
 **depth** | **String**| Depth of the category. | [optional] 
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

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  category_id: "category_id_example", # String | ID of the category.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the category.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the category. | [optional] 
 **page** | **Integer**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list_children**
> Object list_children(buyer_id, parent_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

parent_id = "parent_id_example" # String | ID of the parent.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  depth: "depth_example", # String | Depth of the category.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_children(buyer_id, parent_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->list_children: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **parent_id** | **String**| ID of the parent. | 
 **search** | **String**| Word or phrase to search for. | [optional] 
 **depth** | **String**| Depth of the category. | [optional] 
 **page** | **Integer**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list_product_assignments**
> Object list_product_assignments(buyer_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  category_id: "category_id_example", # String | ID of the category.
  product_id: "product_id_example", # String | ID of the product.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_product_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->list_product_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | [optional] 
 **product_id** | **String**| ID of the product. | [optional] 
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
> patch(buyer_id, category_id, category)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.

category = SwaggerClient::Category.new # Category | 


begin
  api_instance.patch(buyer_id, category_id, category)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_assignment**
> save_assignment(buyer_id, category_assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_assignment = SwaggerClient::CategoryAssignment.new # CategoryAssignment | 


begin
  api_instance.save_assignment(buyer_id, category_assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_assignment** | [**CategoryAssignment**](CategoryAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_product_assignment**
> save_product_assignment(buyer_id, product_assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

product_assignment = SwaggerClient::CategoryProductAssignment.new # CategoryProductAssignment | 


begin
  api_instance.save_product_assignment(buyer_id, product_assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->save_product_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **product_assignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, category_id, category)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CategoryApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

category_id = "category_id_example" # String | ID of the category.

category = SwaggerClient::Category.new # Category | 


begin
  result = api_instance.update(buyer_id, category_id, category)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoryApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **category_id** | **String**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



