# SwaggerClient::ProductApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ProductApi.md#create) | **POST** /products | 
[**delete**](ProductApi.md#delete) | **DELETE** /products/{productID} | 
[**delete_assignment**](ProductApi.md#delete_assignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
[**generate_variants**](ProductApi.md#generate_variants) | **POST** /products/{productID}/variants/generate | 
[**get**](ProductApi.md#get) | **GET** /products/{productID} | 
[**get_inventory**](ProductApi.md#get_inventory) | **GET** /products/{productID}/inventory | 
[**get_variant**](ProductApi.md#get_variant) | **GET** /products/{productID}/variants/{variantID} | 
[**get_variant_inventory**](ProductApi.md#get_variant_inventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
[**list**](ProductApi.md#list) | **GET** /products | 
[**list_assignments**](ProductApi.md#list_assignments) | **GET** /products/assignments | 
[**list_inventory**](ProductApi.md#list_inventory) | **GET** /products/inventory | 
[**list_variant_inventory**](ProductApi.md#list_variant_inventory) | **GET** /products/{productID}/variants/inventory | 
[**list_variants**](ProductApi.md#list_variants) | **GET** /products/{productID}/variants | 
[**patch**](ProductApi.md#patch) | **PATCH** /products/{productID} | 
[**patch_variant**](ProductApi.md#patch_variant) | **PATCH** /products/{productID}/variants/{variantID} | 
[**save_assignment**](ProductApi.md#save_assignment) | **POST** /products/assignments | 
[**update**](ProductApi.md#update) | **PUT** /products/{productID} | 
[**update_inventory**](ProductApi.md#update_inventory) | **PUT** /products/{productID}/inventory/{inventory} | 
[**update_variant**](ProductApi.md#update_variant) | **PUT** /products/{productID}/variants/{variantID} | 
[**update_variant_inventory**](ProductApi.md#update_variant_inventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 


# **create**
> Object create(product)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product = SwaggerClient::Product.new # Product | 


begin
  result = api_instance.create(product)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(product_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.


begin
  api_instance.delete(product_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, product_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

product_id = "product_id_example" # String | ID of the product.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, product_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **product_id** | **String**| ID of the product. | 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **generate_variants**
> Object generate_variants(product_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

opts = { 
  overwrite_existing: true # BOOLEAN | Overwrite existing of the product.
}

begin
  result = api_instance.generate_variants(product_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->generate_variants: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **overwrite_existing** | **BOOLEAN**| Overwrite existing of the product. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(product_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.


begin
  result = api_instance.get(product_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_inventory**
> Object get_inventory(product_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.


begin
  result = api_instance.get_inventory(product_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->get_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_variant**
> Object get_variant(product_id, variant_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

variant_id = "variant_id_example" # String | ID of the variant.


begin
  result = api_instance.get_variant(product_id, variant_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->get_variant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **variant_id** | **String**| ID of the variant. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_variant_inventory**
> Object get_variant_inventory(product_id, variant_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

variant_id = "variant_id_example" # String | ID of the variant.


begin
  result = api_instance.get_variant_inventory(product_id, variant_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->get_variant_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **variant_id** | **String**| ID of the variant. | 

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

api_instance = SwaggerClient::ProductApi.new

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
  puts "Exception when calling ProductApi->list: #{e}"
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



# **list_assignments**
> Object list_assignments(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

opts = { 
  product_id: "product_id_example", # String | ID of the product.
  buyer_id: "buyer_id_example", # String | ID of the buyer.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the product.
  price_schedule_id: "price_schedule_id_example", # String | ID of the price schedule.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | [optional] 
 **buyer_id** | **String**| ID of the buyer. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the product. | [optional] 
 **price_schedule_id** | **String**| ID of the price schedule. | [optional] 
 **page** | **Integer**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list_inventory**
> Object list_inventory(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_inventory(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->list_inventory: #{e}"
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



# **list_variant_inventory**
> Object list_variant_inventory(product_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_variant_inventory(product_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->list_variant_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
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



# **list_variants**
> Object list_variants(product_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_variants(product_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->list_variants: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
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
> patch(product_id, product)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

product = SwaggerClient::Product.new # Product | 


begin
  api_instance.patch(product_id, product)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **product** | [**Product**](Product.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch_variant**
> Object patch_variant(product_id, variant_id, variant)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

variant_id = "variant_id_example" # String | ID of the variant.

variant = SwaggerClient::Variant.new # Variant | 


begin
  result = api_instance.patch_variant(product_id, variant_id, variant)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->patch_variant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **variant_id** | **String**| ID of the variant. | 
 **variant** | [**Variant**](Variant.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_assignment**
> save_assignment(product_assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_assignment = SwaggerClient::ProductAssignment.new # ProductAssignment | 


begin
  api_instance.save_assignment(product_assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**ProductAssignment**](ProductAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(product_id, product)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

product = SwaggerClient::Product.new # Product | 


begin
  result = api_instance.update(product_id, product)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **product** | [**Product**](Product.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_inventory**
> Object update_inventory(product_id, inventory)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

inventory = 56 # Integer | Inventory of the product.


begin
  result = api_instance.update_inventory(product_id, inventory)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->update_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **inventory** | **Integer**| Inventory of the product. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_variant**
> Object update_variant(product_id, variant_id, variant)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

variant_id = "variant_id_example" # String | ID of the variant.

variant = SwaggerClient::Variant.new # Variant | 


begin
  result = api_instance.update_variant(product_id, variant_id, variant)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->update_variant: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **variant_id** | **String**| ID of the variant. | 
 **variant** | [**Variant**](Variant.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_variant_inventory**
> Object update_variant_inventory(product_id, variant_id, inventory)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ProductApi.new

product_id = "product_id_example" # String | ID of the product.

variant_id = "variant_id_example" # String | ID of the variant.

inventory = 56 # Integer | Inventory of the product.


begin
  result = api_instance.update_variant_inventory(product_id, variant_id, inventory)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ProductApi->update_variant_inventory: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **String**| ID of the product. | 
 **variant_id** | **String**| ID of the variant. | 
 **inventory** | **Integer**| Inventory of the product. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



