# SwaggerClient::PromotionApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PromotionApi.md#create) | **POST** /promotions | 
[**delete**](PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**delete_assignment**](PromotionApi.md#delete_assignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**get**](PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**list**](PromotionApi.md#list) | **GET** /promotions | 
[**list_assignments**](PromotionApi.md#list_assignments) | **GET** /promotions/assignments | 
[**patch**](PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**save_assignment**](PromotionApi.md#save_assignment) | **POST** /promotions/assignments | 
[**update**](PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


# **create**
> Object create(promo)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promo = SwaggerClient::Promotion.new # Promotion | 


begin
  result = api_instance.create(promo)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**Promotion**](Promotion.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(promotion_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promotion_id = "promotion_id_example" # String | ID of the promotion.


begin
  api_instance.delete(promotion_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **String**| ID of the promotion. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(promotion_id, buyer_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promotion_id = "promotion_id_example" # String | ID of the promotion.

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(promotion_id, buyer_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **String**| ID of the promotion. | 
 **buyer_id** | **String**| ID of the buyer. | 
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
> Object get(promotion_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promotion_id = "promotion_id_example" # String | ID of the promotion.


begin
  result = api_instance.get(promotion_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **String**| ID of the promotion. | 

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

api_instance = SwaggerClient::PromotionApi.new

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
  puts "Exception when calling PromotionApi->list: #{e}"
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

api_instance = SwaggerClient::PromotionApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  promotion_id: "promotion_id_example", # String | ID of the promotion.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the promotion.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **promotion_id** | **String**| ID of the promotion. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the promotion. | [optional] 
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
> Object patch(promotion_id, partial_promotion)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promotion_id = "promotion_id_example" # String | ID of the promotion.

partial_promotion = SwaggerClient::Promotion.new # Promotion | 


begin
  result = api_instance.patch(promotion_id, partial_promotion)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **String**| ID of the promotion. | 
 **partial_promotion** | [**Promotion**](Promotion.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_assignment**
> save_assignment(assignment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

assignment = SwaggerClient::PromotionAssignment.new # PromotionAssignment | 


begin
  api_instance.save_assignment(assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**PromotionAssignment**](PromotionAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(promotion_id, promo)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PromotionApi.new

promotion_id = "promotion_id_example" # String | ID of the promotion.

promo = SwaggerClient::Promotion.new # Promotion | 


begin
  result = api_instance.update(promotion_id, promo)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PromotionApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **String**| ID of the promotion. | 
 **promo** | [**Promotion**](Promotion.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



