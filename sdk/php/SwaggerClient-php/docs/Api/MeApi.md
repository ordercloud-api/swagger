# Swagger\Client\MeApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddress**](MeApi.md#createAddress) | **POST** /me/addresses | 
[**createCreditCard**](MeApi.md#createCreditCard) | **POST** /me/creditcards | 
[**deleteAddress**](MeApi.md#deleteAddress) | **DELETE** /me/addresses/{addressID} | 
[**deleteCreditCard**](MeApi.md#deleteCreditCard) | **DELETE** /me/creditcards/{creditcardID} | 
[**get**](MeApi.md#get) | **GET** /me | 
[**getAddress**](MeApi.md#getAddress) | **GET** /me/addresses/{addressID} | 
[**getCreditCard**](MeApi.md#getCreditCard) | **GET** /me/creditcards/{creditcardID} | 
[**getOrder**](MeApi.md#getOrder) | **GET** /me/orders/{orderID} | 
[**getProduct**](MeApi.md#getProduct) | **GET** /me/products/{productID} | 
[**getPromotion**](MeApi.md#getPromotion) | **GET** /me/promotions/{promotionID} | 
[**getSpec**](MeApi.md#getSpec) | **GET** /me/products/{productID}/specs/{specID} | 
[**listAddresses**](MeApi.md#listAddresses) | **GET** /me/addresses | 
[**listCategories**](MeApi.md#listCategories) | **GET** /me/categories | 
[**listCostCenters**](MeApi.md#listCostCenters) | **GET** /me/costcenters | 
[**listCreditCards**](MeApi.md#listCreditCards) | **GET** /me/creditcards | 
[**listIncomingOrders**](MeApi.md#listIncomingOrders) | **GET** /me/orders/incoming | 
[**listOutgoingOrders**](MeApi.md#listOutgoingOrders) | **GET** /me/orders/outgoing | 
[**listProducts**](MeApi.md#listProducts) | **GET** /me/products | 
[**listPromotions**](MeApi.md#listPromotions) | **GET** /me/promotions | 
[**listSpecs**](MeApi.md#listSpecs) | **GET** /me/products/{productID}/specs | 
[**listSubcategories**](MeApi.md#listSubcategories) | **GET** /me/categories/{parentID}/categories | 
[**listUserGroups**](MeApi.md#listUserGroups) | **GET** /me/usergroups | 
[**patch**](MeApi.md#patch) | **PATCH** /me | 
[**patchAddress**](MeApi.md#patchAddress) | **PATCH** /me/addresses/{addressID} | 
[**patchCreditCard**](MeApi.md#patchCreditCard) | **PATCH** /me/creditcards/{creditcardID} | 
[**update**](MeApi.md#update) | **PUT** /me | 
[**updateAddress**](MeApi.md#updateAddress) | **PUT** /me/addresses/{addressID} | 
[**updateCreditCard**](MeApi.md#updateCreditCard) | **PUT** /me/creditcards/{creditcardID} | 


# **createAddress**
> object createAddress($address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$address = new \Swagger\Client\Model\BuyerAddress(); // \Swagger\Client\Model\BuyerAddress | 

try {
    $result = $api_instance->createAddress($address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->createAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**\Swagger\Client\Model\BuyerAddress**](../Model/\Swagger\Client\Model\BuyerAddress.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCreditCard**
> object createCreditCard($credit_card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$credit_card = new \Swagger\Client\Model\BuyerCreditCard(); // \Swagger\Client\Model\BuyerCreditCard | 

try {
    $result = $api_instance->createCreditCard($credit_card);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->createCreditCard: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credit_card** | [**\Swagger\Client\Model\BuyerCreditCard**](../Model/\Swagger\Client\Model\BuyerCreditCard.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAddress**
> deleteAddress($address_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$address_id = "address_id_example"; // string | ID of the address.

try {
    $api_instance->deleteAddress($address_id);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->deleteAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address_id** | **string**| ID of the address. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCreditCard**
> deleteCreditCard($creditcard_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$creditcard_id = "creditcard_id_example"; // string | ID of the creditcard.

try {
    $api_instance->deleteCreditCard($creditcard_id);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->deleteCreditCard: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcard_id** | **string**| ID of the creditcard. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();

try {
    $result = $api_instance->get();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAddress**
> object getAddress($address_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$address_id = "address_id_example"; // string | ID of the address.

try {
    $result = $api_instance->getAddress($address_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address_id** | **string**| ID of the address. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCreditCard**
> object getCreditCard($creditcard_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$creditcard_id = "creditcard_id_example"; // string | ID of the creditcard.

try {
    $result = $api_instance->getCreditCard($creditcard_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getCreditCard: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcard_id** | **string**| ID of the creditcard. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrder**
> object getOrder($order_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$order_id = "order_id_example"; // string | ID of the order.

try {
    $result = $api_instance->getOrder($order_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getOrder: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **string**| ID of the order. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProduct**
> object getProduct($product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$product_id = "product_id_example"; // string | ID of the product.

try {
    $result = $api_instance->getProduct($product_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getProduct: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPromotion**
> object getPromotion($promotion_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.

try {
    $result = $api_instance->getPromotion($promotion_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getPromotion: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSpec**
> object getSpec($product_id, $spec_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$product_id = "product_id_example"; // string | ID of the product.
$spec_id = "spec_id_example"; // string | ID of the spec.

try {
    $result = $api_instance->getSpec($product_id, $spec_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->getSpec: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **spec_id** | **string**| ID of the spec. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAddresses**
> object listAddresses($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAddresses($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listAddresses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **listCategories**
> object listCategories($depth, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$depth = "depth_example"; // string | Depth of the category.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listCategories($depth, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listCategories: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **string**| Depth of the category. | [optional]
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

# **listCostCenters**
> object listCostCenters($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listCostCenters($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listCostCenters: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **listCreditCards**
> object listCreditCards($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listCreditCards($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listCreditCards: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **listIncomingOrders**
> object listIncomingOrders($from, $to, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$from = "from_example"; // string | Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).
$to = "to_example"; // string | Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listIncomingOrders($from, $to, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listIncomingOrders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
 **to** | **string**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
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

# **listOutgoingOrders**
> object listOutgoingOrders($from, $to, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$from = "from_example"; // string | Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).
$to = "to_example"; // string | Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listOutgoingOrders($from, $to, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listOutgoingOrders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
 **to** | **string**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
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

# **listProducts**
> object listProducts($category_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$category_id = "category_id_example"; // string | ID of the category.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listProducts($category_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listProducts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **string**| ID of the category. | [optional]
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
> object listPromotions($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listPromotions($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listPromotions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **listSpecs**
> object listSpecs($product_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$product_id = "product_id_example"; // string | ID of the product.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listSpecs($product_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listSpecs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
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

# **listSubcategories**
> object listSubcategories($parent_id, $depth, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$parent_id = "parent_id_example"; // string | ID of the parent.
$depth = "depth_example"; // string | Depth of the category.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listSubcategories($parent_id, $depth, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listSubcategories: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent_id** | **string**| ID of the parent. |
 **depth** | **string**| Depth of the category. | [optional]
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

# **listUserGroups**
> object listUserGroups($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listUserGroups($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->listUserGroups: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> object patch($user)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$user = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | 

try {
    $result = $api_instance->patch($user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**\Swagger\Client\Model\User**](../Model/\Swagger\Client\Model\User.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchAddress**
> patchAddress($address_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$address_id = "address_id_example"; // string | ID of the address.
$address = new \Swagger\Client\Model\BuyerAddress(); // \Swagger\Client\Model\BuyerAddress | 

try {
    $api_instance->patchAddress($address_id, $address);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->patchAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address_id** | **string**| ID of the address. |
 **address** | [**\Swagger\Client\Model\BuyerAddress**](../Model/\Swagger\Client\Model\BuyerAddress.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchCreditCard**
> patchCreditCard($creditcard_id, $credit_card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$creditcard_id = "creditcard_id_example"; // string | ID of the creditcard.
$credit_card = new \Swagger\Client\Model\BuyerCreditCard(); // \Swagger\Client\Model\BuyerCreditCard | 

try {
    $api_instance->patchCreditCard($creditcard_id, $credit_card);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->patchCreditCard: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcard_id** | **string**| ID of the creditcard. |
 **credit_card** | [**\Swagger\Client\Model\BuyerCreditCard**](../Model/\Swagger\Client\Model\BuyerCreditCard.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($user)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$user = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | 

try {
    $result = $api_instance->update($user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**\Swagger\Client\Model\User**](../Model/\Swagger\Client\Model\User.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAddress**
> object updateAddress($address_id, $address)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$address_id = "address_id_example"; // string | ID of the address.
$address = new \Swagger\Client\Model\BuyerAddress(); // \Swagger\Client\Model\BuyerAddress | 

try {
    $result = $api_instance->updateAddress($address_id, $address);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->updateAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address_id** | **string**| ID of the address. |
 **address** | [**\Swagger\Client\Model\BuyerAddress**](../Model/\Swagger\Client\Model\BuyerAddress.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCreditCard**
> object updateCreditCard($creditcard_id, $credit_card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\MeApi();
$creditcard_id = "creditcard_id_example"; // string | ID of the creditcard.
$credit_card = new \Swagger\Client\Model\BuyerCreditCard(); // \Swagger\Client\Model\BuyerCreditCard | 

try {
    $result = $api_instance->updateCreditCard($creditcard_id, $credit_card);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MeApi->updateCreditCard: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcard_id** | **string**| ID of the creditcard. |
 **credit_card** | [**\Swagger\Client\Model\BuyerCreditCard**](../Model/\Swagger\Client\Model\BuyerCreditCard.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

