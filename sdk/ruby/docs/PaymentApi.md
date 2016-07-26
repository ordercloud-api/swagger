# SwaggerClient::PaymentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
[**create_transaction**](PaymentApi.md#create_transaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
[**delete**](PaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**delete_transaction**](PaymentApi.md#delete_transaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**get**](PaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**list**](PaymentApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
[**patch**](PaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patch_transaction**](PaymentApi.md#patch_transaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**update**](PaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**update_transaction**](PaymentApi.md#update_transaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 


# **create**
> Object create(buyer_id, order_id, payment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment = SwaggerClient::Payment.new # Payment | 


begin
  result = api_instance.create(buyer_id, order_id, payment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **create_transaction**
> Object create_transaction(buyer_id, order_id, payment_id, transaction)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

transaction = SwaggerClient::PaymentTransaction.new # PaymentTransaction | 


begin
  result = api_instance.create_transaction(buyer_id, order_id, payment_id, transaction)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->create_transaction: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, order_id, payment_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.


begin
  api_instance.delete(buyer_id, order_id, payment_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_transaction**
> delete_transaction(buyer_id, order_id, payment_id, transaction_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

transaction_id = "transaction_id_example" # String | ID of the transaction.


begin
  api_instance.delete_transaction(buyer_id, order_id, payment_id, transaction_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->delete_transaction: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **transaction_id** | **String**| ID of the transaction. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get**
> Object get(buyer_id, order_id, payment_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.


begin
  result = api_instance.get(buyer_id, order_id, payment_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **list**
> Object list(buyer_id, order_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

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
  result = api_instance.list(buyer_id, order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->list: #{e}"
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
> Object patch(buyer_id, order_id, payment_id, partial_payment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

partial_payment = SwaggerClient::Payment.new # Payment | 


begin
  result = api_instance.patch(buyer_id, order_id, payment_id, partial_payment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **partial_payment** | [**Payment**](Payment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **patch_transaction**
> Object patch_transaction(buyer_id, order_id, payment_id, transaction_id, partial_transaction)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

transaction_id = "transaction_id_example" # String | ID of the transaction.

partial_transaction = SwaggerClient::PaymentTransaction.new # PaymentTransaction | 


begin
  result = api_instance.patch_transaction(buyer_id, order_id, payment_id, transaction_id, partial_transaction)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->patch_transaction: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **transaction_id** | **String**| ID of the transaction. | 
 **partial_transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, order_id, payment_id, payment)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

payment = SwaggerClient::Payment.new # Payment | 


begin
  result = api_instance.update(buyer_id, order_id, payment_id, payment)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update_transaction**
> Object update_transaction(buyer_id, order_id, payment_id, transaction_id, transaction)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PaymentApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

order_id = "order_id_example" # String | ID of the order.

payment_id = "payment_id_example" # String | ID of the payment.

transaction_id = "transaction_id_example" # String | ID of the transaction.

transaction = SwaggerClient::PaymentTransaction.new # PaymentTransaction | 


begin
  result = api_instance.update_transaction(buyer_id, order_id, payment_id, transaction_id, transaction)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PaymentApi->update_transaction: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **order_id** | **String**| ID of the order. | 
 **payment_id** | **String**| ID of the payment. | 
 **transaction_id** | **String**| ID of the transaction. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



