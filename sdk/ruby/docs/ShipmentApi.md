# SwaggerClient::ShipmentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
[**delete**](ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
[**delete_item**](ShipmentApi.md#delete_item) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
[**get**](ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
[**list**](ShipmentApi.md#list) | **GET** /buyers/{buyerID}/shipments | 
[**patch**](ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
[**save_item**](ShipmentApi.md#save_item) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
[**update**](ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 


# **create**
> Object create(buyer_id, shipment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment = SwaggerClient::Shipment.new # Shipment | 


begin
  result = api_instance.create(buyer_id, shipment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, shipment_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.


begin
  api_instance.delete(buyer_id, shipment_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_item**
> Object delete_item(buyer_id, shipment_id, order_id, line_item_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.

order_id = "order_id_example" # String | ID of the order.

line_item_id = "line_item_id_example" # String | ID of the line item.


begin
  result = api_instance.delete_item(buyer_id, shipment_id, order_id, line_item_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->delete_item: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 
 **order_id** | **String**| ID of the order. | 
 **line_item_id** | **String**| ID of the line item. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, shipment_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.


begin
  result = api_instance.get(buyer_id, shipment_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 

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

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  order_id: "order_id_example", # String | ID of the order.
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
  puts "Exception when calling ShipmentApi->list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | [optional] 
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
> Object patch(buyer_id, shipment_id, shipment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.

shipment = SwaggerClient::Shipment.new # Shipment | 


begin
  result = api_instance.patch(buyer_id, shipment_id, shipment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **save_item**
> Object save_item(buyer_id, shipment_id, item)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.

item = SwaggerClient::ShipmentItem.new # ShipmentItem | 


begin
  result = api_instance.save_item(buyer_id, shipment_id, item)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->save_item: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 
 **item** | [**ShipmentItem**](ShipmentItem.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, shipment_id, shipment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::ShipmentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

shipment_id = "shipment_id_example" # String | ID of the shipment.

shipment = SwaggerClient::Shipment.new # Shipment | 


begin
  result = api_instance.update(buyer_id, shipment_id, shipment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ShipmentApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **shipment_id** | **String**| ID of the shipment. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



