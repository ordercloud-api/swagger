# Swagger\Client\OrderApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPromotion**](OrderApi.md#addPromotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**listApprovals**](OrderApi.md#listApprovals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**listEligibleApprovers**](OrderApi.md#listEligibleApprovers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**listIncoming**](OrderApi.md#listIncoming) | **GET** /orders/incoming | 
[**listOutgoing**](OrderApi.md#listOutgoing) | **GET** /orders/outgoing | 
[**listPromotions**](OrderApi.md#listPromotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**patchBillingAddress**](OrderApi.md#patchBillingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**patchShippingAddress**](OrderApi.md#patchShippingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**removePromotion**](OrderApi.md#removePromotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**setBillingAddress**](OrderApi.md#setBillingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**setShippingAddress**](OrderApi.md#setShippingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**transferTempUserOrder**](OrderApi.md#transferTempUserOrder) | **PUT** /buyers/{buyerID}/orders | 
[**update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


# **addPromotion**
> object addPromotion($buyer_id, $order_id, $promo_code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$promo_code = "promo_code_example"; // string | Promo code of the order.

try {
    $result = $api_instance->addPromotion($buyer_id, $order_id, $promo_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->addPromotion: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **promo_code** | **string**| Promo code of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **approve**
> object approve($buyer_id, $order_id, $comments)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$comments = "comments_example"; // string | Comments to be saved with the order approval.

try {
    $result = $api_instance->approve($buyer_id, $order_id, $comments);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->approve: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **comments** | **string**| Comments to be saved with the order approval. | [optional]

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cancel**
> object cancel($buyer_id, $order_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.

try {
    $result = $api_instance->cancel($buyer_id, $order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->cancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **create**
> object create($buyer_id, $order)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order = new \Swagger\Client\Model\Order(); // \Swagger\Client\Model\Order | 

try {
    $result = $api_instance->create($buyer_id, $order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order** | [**\Swagger\Client\Model\Order**](../Model/\Swagger\Client\Model\Order.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **decline**
> object decline($buyer_id, $order_id, $comments)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$comments = "comments_example"; // string | Comments to be saved with the order denial.

try {
    $result = $api_instance->decline($buyer_id, $order_id, $comments);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->decline: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **comments** | **string**| Comments to be saved with the order denial. | [optional]

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $order_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.

try {
    $api_instance->delete($buyer_id, $order_id);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $order_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.

try {
    $result = $api_instance->get($buyer_id, $order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listApprovals**
> object listApprovals($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listApprovals($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->listApprovals: ', $e->getMessage(), PHP_EOL;
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

# **listEligibleApprovers**
> object listEligibleApprovers($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listEligibleApprovers($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->listEligibleApprovers: ', $e->getMessage(), PHP_EOL;
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

# **listIncoming**
> object listIncoming($buyer_id, $from, $to, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$from = "from_example"; // string | Lower bound of date range that the order was submitted.
$to = "to_example"; // string | Upper bound of date range that the order was submitted.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listIncoming($buyer_id, $from, $to, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->listIncoming: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | [optional]
 **from** | **string**| Lower bound of date range that the order was submitted. | [optional]
 **to** | **string**| Upper bound of date range that the order was submitted. | [optional]
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

# **listOutgoing**
> object listOutgoing($buyer_id, $from, $to, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$from = "from_example"; // string | Lower bound of date range that the order was created.
$to = "to_example"; // string | Upper bound of date range that the order was created.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listOutgoing($buyer_id, $from, $to, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->listOutgoing: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | [optional]
 **from** | **string**| Lower bound of date range that the order was created. | [optional]
 **to** | **string**| Upper bound of date range that the order was created. | [optional]
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

# **listPromotions**
> object listPromotions($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listPromotions($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->listPromotions: ', $e->getMessage(), PHP_EOL;
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

# **patch**
> object patch($buyer_id, $order_id, $partial_order)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$partial_order = new \Swagger\Client\Model\Order(); // \Swagger\Client\Model\Order | 

try {
    $result = $api_instance->patch($buyer_id, $order_id, $partial_order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **partial_order** | [**\Swagger\Client\Model\Order**](../Model/\Swagger\Client\Model\Order.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchBillingAddress**
> object patchBillingAddress($buyer_id, $order_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$address = new \Swagger\Client\Model\Address(); // \Swagger\Client\Model\Address | 

try {
    $result = $api_instance->patchBillingAddress($buyer_id, $order_id, $address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->patchBillingAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **address** | [**\Swagger\Client\Model\Address**](../Model/\Swagger\Client\Model\Address.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchShippingAddress**
> object patchShippingAddress($buyer_id, $order_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$address = new \Swagger\Client\Model\Address(); // \Swagger\Client\Model\Address | 

try {
    $result = $api_instance->patchShippingAddress($buyer_id, $order_id, $address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->patchShippingAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **address** | [**\Swagger\Client\Model\Address**](../Model/\Swagger\Client\Model\Address.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **removePromotion**
> object removePromotion($buyer_id, $order_id, $promo_code)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$promo_code = "promo_code_example"; // string | Promo code of the order.

try {
    $result = $api_instance->removePromotion($buyer_id, $order_id, $promo_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->removePromotion: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **promo_code** | **string**| Promo code of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **setBillingAddress**
> object setBillingAddress($buyer_id, $order_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$address = new \Swagger\Client\Model\Address(); // \Swagger\Client\Model\Address | 

try {
    $result = $api_instance->setBillingAddress($buyer_id, $order_id, $address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->setBillingAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **address** | [**\Swagger\Client\Model\Address**](../Model/\Swagger\Client\Model\Address.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **setShippingAddress**
> object setShippingAddress($buyer_id, $order_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$address = new \Swagger\Client\Model\Address(); // \Swagger\Client\Model\Address | 

try {
    $result = $api_instance->setShippingAddress($buyer_id, $order_id, $address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->setShippingAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **address** | [**\Swagger\Client\Model\Address**](../Model/\Swagger\Client\Model\Address.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **ship**
> object ship($buyer_id, $order_id, $shipment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$shipment = new \Swagger\Client\Model\Shipment(); // \Swagger\Client\Model\Shipment | 

try {
    $result = $api_instance->ship($buyer_id, $order_id, $shipment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->ship: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **shipment** | [**\Swagger\Client\Model\Shipment**](../Model/\Swagger\Client\Model\Shipment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **submit**
> object submit($buyer_id, $order_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.

try {
    $result = $api_instance->submit($buyer_id, $order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->submit: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transferTempUserOrder**
> transferTempUserOrder($buyer_id, $temp_user_token)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$temp_user_token = "temp_user_token_example"; // string | Temp user token of the order.

try {
    $api_instance->transferTempUserOrder($buyer_id, $temp_user_token);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->transferTempUserOrder: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **temp_user_token** | **string**| Temp user token of the order. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $order_id, $order)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\OrderApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$order_id = "order_id_example"; // string | ID of the order.
$order = new \Swagger\Client\Model\Order(); // \Swagger\Client\Model\Order | 

try {
    $result = $api_instance->update($buyer_id, $order_id, $order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. |
 **order** | [**\Swagger\Client\Model\Order**](../Model/\Swagger\Client\Model\Order.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

