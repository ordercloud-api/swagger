# SwaggerClient::CreditCardApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CreditCardApi.md#create) | **POST** /buyers/{buyerID}/creditcards | 
[**delete**](CreditCardApi.md#delete) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**delete_assignment**](CreditCardApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID}/assignments | 
[**get**](CreditCardApi.md#get) | **GET** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**list**](CreditCardApi.md#list) | **GET** /buyers/{buyerID}/creditcards | 
[**list_assignments**](CreditCardApi.md#list_assignments) | **GET** /buyers/{buyerID}/creditcards/assignments | 
[**patch**](CreditCardApi.md#patch) | **PATCH** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**save_assignment**](CreditCardApi.md#save_assignment) | **POST** /buyers/{buyerID}/creditcards/assignments | 
[**update**](CreditCardApi.md#update) | **PUT** /buyers/{buyerID}/creditcards/{creditCardID} | 


# **create**
> Object create(buyer_id, card)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

card = SwaggerClient::CreditCard.new # CreditCard | 


begin
  result = api_instance.create(buyer_id, card)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->create: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(buyer_id, credit_card_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

credit_card_id = "credit_card_id_example" # String | ID of the credit card.


begin
  api_instance.delete(buyer_id, credit_card_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_assignment**
> delete_assignment(buyer_id, credit_card_id, opts)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

credit_card_id = "credit_card_id_example" # String | ID of the credit card.

opts = { 
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example" # String | ID of the user group.
}

begin
  api_instance.delete_assignment(buyer_id, credit_card_id, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->delete_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | 
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
> Object get(buyer_id, credit_card_id)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

credit_card_id = "credit_card_id_example" # String | ID of the credit card.


begin
  result = api_instance.get(buyer_id, credit_card_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | 

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

api_instance = SwaggerClient::CreditCardApi.new

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
  puts "Exception when calling CreditCardApi->list: #{e}"
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

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

opts = { 
  credit_card_id: "credit_card_id_example", # String | ID of the credit card.
  user_id: "user_id_example", # String | ID of the user.
  user_group_id: "user_group_id_example", # String | ID of the user group.
  level: "level_example", # String | Level of the credit card.
  page: 56, # Integer | Page of results to return. Default: 1
  page_size: 56 # Integer | Number of results to return per page. Default: 20, max: 100.
}

begin
  result = api_instance.list_assignments(buyer_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->list_assignments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | [optional] 
 **user_id** | **String**| ID of the user. | [optional] 
 **user_group_id** | **String**| ID of the user group. | [optional] 
 **level** | **String**| Level of the credit card. | [optional] 
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
> Object patch(buyer_id, credit_card_id, card)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

credit_card_id = "credit_card_id_example" # String | ID of the credit card.

card = SwaggerClient::CreditCard.new # CreditCard | 


begin
  result = api_instance.patch(buyer_id, credit_card_id, card)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->patch: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

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

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

assignment = SwaggerClient::CreditCardAssignment.new # CreditCardAssignment | 


begin
  api_instance.save_assignment(buyer_id, assignment)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->save_assignment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **assignment** | [**CreditCardAssignment**](CreditCardAssignment.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **update**
> Object update(buyer_id, credit_card_id, card)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::CreditCardApi.new

buyer_id = "buyer_id_example" # String | ID of the buyer.

credit_card_id = "credit_card_id_example" # String | ID of the credit card.

card = SwaggerClient::CreditCard.new # CreditCard | 


begin
  result = api_instance.update(buyer_id, credit_card_id, card)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CreditCardApi->update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **String**| ID of the buyer. | 
 **credit_card_id** | **String**| ID of the credit card. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



