# WWW::SwaggerClient::PaymentApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::PaymentApi;
```

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
> object create(buyer_id => $buyer_id, order_id => $order_id, payment => $payment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment = WWW::SwaggerClient::Object::Payment->new(); # Payment | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, order_id => $order_id, payment => $payment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transaction**
> object create_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction => $transaction)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $transaction = WWW::SwaggerClient::Object::PaymentTransaction->new(); # PaymentTransaction | 

eval { 
    my $result = $api_instance->create_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction => $transaction);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->create_transaction: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id);
};
if ($@) {
    warn "Exception when calling PaymentApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_transaction**
> delete_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $transaction_id = 'transaction_id_example'; # string | ID of the transaction.

eval { 
    $api_instance->delete_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id);
};
if ($@) {
    warn "Exception when calling PaymentApi->delete_transaction: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **transaction_id** | **string**| ID of the transaction. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **search_on** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sort_by** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **int**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch**
> object patch(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, partial_payment => $partial_payment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $partial_payment = WWW::SwaggerClient::Object::Payment->new(); # Payment | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, partial_payment => $partial_payment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **partial_payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_transaction**
> object patch_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id, partial_transaction => $partial_transaction)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $transaction_id = 'transaction_id_example'; # string | ID of the transaction.
my $partial_transaction = WWW::SwaggerClient::Object::PaymentTransaction->new(); # PaymentTransaction | 

eval { 
    my $result = $api_instance->patch_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id, partial_transaction => $partial_transaction);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->patch_transaction: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **transaction_id** | **string**| ID of the transaction. | 
 **partial_transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, payment => $payment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $payment = WWW::SwaggerClient::Object::Payment->new(); # Payment | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, payment => $payment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_transaction**
> object update_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id, transaction => $transaction)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PaymentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $payment_id = 'payment_id_example'; # string | ID of the payment.
my $transaction_id = 'transaction_id_example'; # string | ID of the transaction.
my $transaction = WWW::SwaggerClient::Object::PaymentTransaction->new(); # PaymentTransaction | 

eval { 
    my $result = $api_instance->update_transaction(buyer_id => $buyer_id, order_id => $order_id, payment_id => $payment_id, transaction_id => $transaction_id, transaction => $transaction);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PaymentApi->update_transaction: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **payment_id** | **string**| ID of the payment. | 
 **transaction_id** | **string**| ID of the transaction. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

