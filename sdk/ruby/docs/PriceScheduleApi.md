# SwaggerClient::PriceScheduleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PriceScheduleApi.md#create) | **POST** /priceschedules | 
[**delete**](PriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**delete_price_break**](PriceScheduleApi.md#delete_price_break) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**list**](PriceScheduleApi.md#list) | **GET** /priceschedules | 
[**patch**](PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**save_price_break**](PriceScheduleApi.md#save_price_break) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


# **create**
> Object create(price_schedule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule = SwaggerClient::PriceSchedule.new # PriceSchedule | 


begin
  result = api_instance.create(price_schedule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(price_schedule_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.


begin
  api_instance.delete(price_schedule_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_price_break**
> delete_price_break(price_schedule_id, quantity)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.

quantity = 56 # Integer | Quantity of the price schedule.


begin
  api_instance.delete_price_break(price_schedule_id, quantity)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->delete_price_break: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 
 **quantity** | **Integer**| Quantity of the price schedule. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(price_schedule_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.


begin
  result = api_instance.get(price_schedule_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 

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

api_instance = SwaggerClient::PriceScheduleApi.new

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
  puts "Exception when calling PriceScheduleApi->list: #{e}"
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
> Object patch(price_schedule_id, price_schedule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.

price_schedule = SwaggerClient::PriceSchedule.new # PriceSchedule | 


begin
  result = api_instance.patch(price_schedule_id, price_schedule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_price_break**
> Object save_price_break(price_schedule_id, price_break)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.

price_break = SwaggerClient::PriceBreak.new # PriceBreak | 


begin
  result = api_instance.save_price_break(price_schedule_id, price_break)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->save_price_break: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 
 **price_break** | [**PriceBreak**](PriceBreak.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(price_schedule_id, price_schedule)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PriceScheduleApi.new

price_schedule_id = "price_schedule_id_example" # String | ID of the price schedule.

price_schedule = SwaggerClient::PriceSchedule.new # PriceSchedule | 


begin
  result = api_instance.update(price_schedule_id, price_schedule)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PriceScheduleApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **String**| ID of the price schedule. | 
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



