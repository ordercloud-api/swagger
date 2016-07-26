# SwaggerClient::OrderApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_promotion**](OrderApi.md#add_promotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**list_approvals**](OrderApi.md#list_approvals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**list_eligible_approvers**](OrderApi.md#list_eligible_approvers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**list_incoming**](OrderApi.md#list_incoming) | **GET** /orders/incoming | 
[**list_outgoing**](OrderApi.md#list_outgoing) | **GET** /orders/outgoing | 
[**list_promotions**](OrderApi.md#list_promotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**patch_billing_address**](OrderApi.md#patch_billing_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**patch_shipping_address**](OrderApi.md#patch_shipping_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**remove_promotion**](OrderApi.md#remove_promotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**set_billing_address**](OrderApi.md#set_billing_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**set_shipping_address**](OrderApi.md#set_shipping_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**transfer_temp_user_order**](OrderApi.md#transfer_temp_user_order) | **PUT** /buyers/{buyerID}/orders | 
[**update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


# **add_promotion**
> Object add_promotion(buyer_id, order_id, promo_code)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

promo_code = "promo_code_example" # String | Promo code of the order.


begin
  result = api_instance.add_promotion(buyer_id, order_id, promo_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->add_promotion: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **promo_code** | **String**| Promo code of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **approve**
> Object approve(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

opts = { 
  comments: "comments_example" # String | Comments to be saved with the order approval.
}

begin
  result = api_instance.approve(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->approve: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **comments** | **String**| Comments to be saved with the order approval. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **cancel**
> Object cancel(buyer_id, order_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.


begin
  result = api_instance.cancel(buyer_id, order_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->cancel: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **create**
> Object create(buyer_id, order)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order = SwaggerClient::Order.new # Order | 


begin
  result = api_instance.create(buyer_id, order)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **decline**
> Object decline(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

opts = { 
  comments: "comments_example" # String | Comments to be saved with the order denial.
}

begin
  result = api_instance.decline(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->decline: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **comments** | **String**| Comments to be saved with the order denial. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, order_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.


begin
  api_instance.delete(buyer_id, order_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, order_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.


begin
  result = api_instance.get(buyer_id, order_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list_approvals**
> Object list_approvals(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_approvals(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->list_approvals: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
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



# **list_eligible_approvers**
> Object list_eligible_approvers(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_eligible_approvers(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->list_eligible_approvers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
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



# **list_incoming**
> Object list_incoming(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  buyer_id: "buyer_id_example", # String | ID of the buyer.
  from: "from_example", # String | Lower bound of date range that the order was submitted.
  to: "to_example", # String | Upper bound of date range that the order was submitted.
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_incoming(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->list_incoming: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | [optional] 
 **from** | **String**| Lower bound of date range that the order was submitted. | [optional] 
 **to** | **String**| Upper bound of date range that the order was submitted. | [optional] 
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



# **list_outgoing**
> Object list_outgoing(opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  buyer_id: "buyer_id_example", # String | ID of the buyer.
  from: "from_example", # String | Lower bound of date range that the order was created.
  to: "to_example", # String | Upper bound of date range that the order was created.
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_outgoing(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->list_outgoing: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | [optional] 
 **from** | **String**| Lower bound of date range that the order was created. | [optional] 
 **to** | **String**| Upper bound of date range that the order was created. | [optional] 
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



# **list_promotions**
> Object list_promotions(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

opts = { 
  search: "search_example", # String | Word or phrase to search for.
  search_on: "search_on_example", # String | Comma-delimited list of fields to search on.
  sort_by: "sort_by_example", # String | Comma-delimited list of fields to sort by.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_promotions(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->list_promotions: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
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
> Object patch(buyer_id, order_id, partial_order)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

partial_order = SwaggerClient::Order.new # Order | 


begin
  result = api_instance.patch(buyer_id, order_id, partial_order)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **partial_order** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch_billing_address**
> Object patch_billing_address(buyer_id, order_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.patch_billing_address(buyer_id, order_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->patch_billing_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch_shipping_address**
> Object patch_shipping_address(buyer_id, order_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.patch_shipping_address(buyer_id, order_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->patch_shipping_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **remove_promotion**
> Object remove_promotion(buyer_id, order_id, promo_code)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

promo_code = "promo_code_example" # String | Promo code of the order.


begin
  result = api_instance.remove_promotion(buyer_id, order_id, promo_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->remove_promotion: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **promo_code** | **String**| Promo code of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **set_billing_address**
> Object set_billing_address(buyer_id, order_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.set_billing_address(buyer_id, order_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->set_billing_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **set_shipping_address**
> Object set_shipping_address(buyer_id, order_id, address)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

address = SwaggerClient::Address.new # Address | 


begin
  result = api_instance.set_shipping_address(buyer_id, order_id, address)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->set_shipping_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **ship**
> Object ship(buyer_id, order_id, shipment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

shipment = SwaggerClient::Shipment.new # Shipment | 


begin
  result = api_instance.ship(buyer_id, order_id, shipment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->ship: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **submit**
> Object submit(buyer_id, order_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.


begin
  result = api_instance.submit(buyer_id, order_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->submit: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **transfer_temp_user_order**
> transfer_temp_user_order(buyer_id, temp_user_token)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

temp_user_token = "temp_user_token_example" # String | Temp user token of the order.


begin
  api_instance.transfer_temp_user_order(buyer_id, temp_user_token)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->transfer_temp_user_order: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **temp_user_token** | **String**| Temp user token of the order. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, order_id, order)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::OrderApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

order = SwaggerClient::Order.new # Order | 


begin
  result = api_instance.update(buyer_id, order_id, order)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



