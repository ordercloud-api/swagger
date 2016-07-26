# SwaggerClient::SpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpecApi.md#create) | **POST** /specs | 
[**create_option**](SpecApi.md#create_option) | **POST** /specs/{specID}/options | 
[**delete**](SpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**delete_option**](SpecApi.md#delete_option) | **DELETE** /specs/{specID}/options/{optionID} | 
[**delete_product_assignment**](SpecApi.md#delete_product_assignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**get**](SpecApi.md#get) | **GET** /specs/{specID} | 
[**get_option**](SpecApi.md#get_option) | **GET** /specs/{specID}/options/{optionID} | 
[**list**](SpecApi.md#list) | **GET** /specs | 
[**list_options**](SpecApi.md#list_options) | **GET** /specs/{specID}/options | 
[**list_product_assignments**](SpecApi.md#list_product_assignments) | **GET** /specs/productassignments | 
[**patch**](SpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**patch_option**](SpecApi.md#patch_option) | **PATCH** /specs/{specID}/options/{optionID} | 
[**save_product_assignment**](SpecApi.md#save_product_assignment) | **POST** /specs/productassignments | 
[**update**](SpecApi.md#update) | **PUT** /specs/{specID} | 
[**update_option**](SpecApi.md#update_option) | **PUT** /specs/{specID}/options/{optionID} | 


# **create**
> Object create(spec)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec = SwaggerClient::Spec.new # Spec | 


begin
  result = api_instance.create(spec)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **create_option**
> Object create_option(spec_id, option)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

option = SwaggerClient::SpecOption.new # SpecOption | 


begin
  result = api_instance.create_option(spec_id, option)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->create_option: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(spec_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.


begin
  api_instance.delete(spec_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_option**
> delete_option(spec_id, option_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

option_id = "option_id_example" # String | ID of the option.


begin
  api_instance.delete_option(spec_id, option_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->delete_option: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **option_id** | **String**| ID of the option. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_product_assignment**
> delete_product_assignment(spec_id, product_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

product_id = "product_id_example" # String | ID of the product.


begin
  api_instance.delete_product_assignment(spec_id, product_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->delete_product_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **product_id** | **String**| ID of the product. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(spec_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.


begin
  result = api_instance.get(spec_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_option**
> Object get_option(spec_id, option_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

option_id = "option_id_example" # String | ID of the option.


begin
  result = api_instance.get_option(spec_id, option_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->get_option: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **option_id** | **String**| ID of the option. | 

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

api_instance = SwaggerClient::SpecApi.new

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
  puts "Exception when calling SpecApi->list: #{e}"
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



# **list_options**
> Object list_options(spec_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_options(spec_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->list_options: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
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



# **list_product_assignments**
> Object list_product_assignments(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

opts = { 
  spec_id: "spec_id_example", # String | ID of the spec.
  product_id: "product_id_example", # String | ID of the product.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_product_assignments(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->list_product_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | [optional] 
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
> Object patch(spec_id, spec)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

spec = SwaggerClient::Spec.new # Spec | 


begin
  result = api_instance.patch(spec_id, spec)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch_option**
> Object patch_option(spec_id, option_id, option)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

option_id = "option_id_example" # String | ID of the option.

option = SwaggerClient::SpecOption.new # SpecOption | 


begin
  result = api_instance.patch_option(spec_id, option_id, option)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->patch_option: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **option_id** | **String**| ID of the option. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_product_assignment**
> save_product_assignment(product_assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

product_assignment = SwaggerClient::SpecProductAssignment.new # SpecProductAssignment | 


begin
  api_instance.save_product_assignment(product_assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->save_product_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**SpecProductAssignment**](SpecProductAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(spec_id, spec)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

spec = SwaggerClient::Spec.new # Spec | 


begin
  result = api_instance.update(spec_id, spec)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_option**
> Object update_option(spec_id, option_id, option)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::SpecApi.new

spec_id = "spec_id_example" # String | ID of the spec.

option_id = "option_id_example" # String | ID of the option.

option = SwaggerClient::SpecOption.new # SpecOption | 


begin
  result = api_instance.update_option(spec_id, option_id, option)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SpecApi->update_option: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **String**| ID of the spec. | 
 **option_id** | **String**| ID of the option. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



