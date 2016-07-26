# Swagger\Client\PaymentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](PaymentApi.md#callList) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
[**create**](PaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
[**createTransaction**](PaymentApi.md#createTransaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
[**delete**](PaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**deleteTransaction**](PaymentApi.md#deleteTransaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**get**](PaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patch**](PaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patchTransaction**](PaymentApi.md#patchTransaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**update**](PaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**updateTransaction**](PaymentApi.md#updateTransaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 


# **callList**
> object callList($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->callList: ', $e->getMessage(), PHP_EOL;
}
?>
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

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **create**
> object create($buyer_id, $order_id, $payment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment = new \Swagger\Client\Model\Payment(); // \Swagger\Client\Model\Payment | 

try {
    $result = $api_instance->create($buyer_id, $order_id, $payment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment** | [**\Swagger\Client\Model\Payment**](../Model/\Swagger\Client\Model\Payment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createTransaction**
> object createTransaction($buyer_id, $order_id, $payment_id, $transaction)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$transaction = new \Swagger\Client\Model\PaymentTransaction(); // \Swagger\Client\Model\PaymentTransaction | 

try {
    $result = $api_instance->createTransaction($buyer_id, $order_id, $payment_id, $transaction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->createTransaction: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment_id** | **string**| ID of the payment. |
 **transaction** | [**\Swagger\Client\Model\PaymentTransaction**](../Model/\Swagger\Client\Model\PaymentTransaction.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $order_id, $payment_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.

try {
    $api_instance->delete($buyer_id, $order_id, $payment_id);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
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

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteTransaction**
> deleteTransaction($buyer_id, $order_id, $payment_id, $transaction_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$transaction_id = "transaction_id_example"; // string | ID of the transaction.

try {
    $api_instance->deleteTransaction($buyer_id, $order_id, $payment_id, $transaction_id);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->deleteTransaction: ', $e->getMessage(), PHP_EOL;
}
?>
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

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $order_id, $payment_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.

try {
    $result = $api_instance->get($buyer_id, $order_id, $payment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
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

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patch**
> object patch($buyer_id, $order_id, $payment_id, $partial_payment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$partial_payment = new \Swagger\Client\Model\Payment(); // \Swagger\Client\Model\Payment | 

try {
    $result = $api_instance->patch($buyer_id, $order_id, $payment_id, $partial_payment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment_id** | **string**| ID of the payment. |
 **partial_payment** | [**\Swagger\Client\Model\Payment**](../Model/\Swagger\Client\Model\Payment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchTransaction**
> object patchTransaction($buyer_id, $order_id, $payment_id, $transaction_id, $partial_transaction)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$transaction_id = "transaction_id_example"; // string | ID of the transaction.
$partial_transaction = new \Swagger\Client\Model\PaymentTransaction(); // \Swagger\Client\Model\PaymentTransaction | 

try {
    $result = $api_instance->patchTransaction($buyer_id, $order_id, $payment_id, $transaction_id, $partial_transaction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->patchTransaction: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment_id** | **string**| ID of the payment. |
 **transaction_id** | **string**| ID of the transaction. |
 **partial_transaction** | [**\Swagger\Client\Model\PaymentTransaction**](../Model/\Swagger\Client\Model\PaymentTransaction.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $order_id, $payment_id, $payment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$payment = new \Swagger\Client\Model\Payment(); // \Swagger\Client\Model\Payment | 

try {
    $result = $api_instance->update($buyer_id, $order_id, $payment_id, $payment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment_id** | **string**| ID of the payment. |
 **payment** | [**\Swagger\Client\Model\Payment**](../Model/\Swagger\Client\Model\Payment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateTransaction**
> object updateTransaction($buyer_id, $order_id, $payment_id, $transaction_id, $transaction)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PaymentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$payment_id = "payment_id_example"; // string | ID of the payment.
$transaction_id = "transaction_id_example"; // string | ID of the transaction.
$transaction = new \Swagger\Client\Model\PaymentTransaction(); // \Swagger\Client\Model\PaymentTransaction | 

try {
    $result = $api_instance->updateTransaction($buyer_id, $order_id, $payment_id, $transaction_id, $transaction);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->updateTransaction: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **payment_id** | **string**| ID of the payment. |
 **transaction_id** | **string**| ID of the transaction. |
 **transaction** | [**\Swagger\Client\Model\PaymentTransaction**](../Model/\Swagger\Client\Model\PaymentTransaction.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

