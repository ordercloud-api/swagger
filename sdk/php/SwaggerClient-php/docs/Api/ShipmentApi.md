# Swagger\Client\ShipmentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](ShipmentApi.md#callList) | **GET** /buyers/{buyerID}/shipments | 
[**create**](ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
[**delete**](ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
[**deleteItem**](ShipmentApi.md#deleteItem) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
[**get**](ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
[**patch**](ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
[**saveItem**](ShipmentApi.md#saveItem) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
[**update**](ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 


# **callList**
> object callList($buyer_id, $order_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
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
    echo 'Exception when calling ShipmentApi->callList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **order_id** | **string**| ID of the order. | [optional]
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
> object create($buyer_id, $shipment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment = new \Swagger\Client\Model\Shipment(); // \Swagger\Client\Model\Shipment | 

try {
    $result = $api_instance->create($buyer_id, $shipment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment** | [**\Swagger\Client\Model\Shipment**](../Model/\Swagger\Client\Model\Shipment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $shipment_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.

try {
    $api_instance->delete($buyer_id, $shipment_id);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteItem**
> object deleteItem($buyer_id, $shipment_id, $order_id, $line_item_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.
$order_id = "order_id_example"; // string | ID of the order.
$line_item_id = "line_item_id_example"; // string | ID of the line item.

try {
    $result = $api_instance->deleteItem($buyer_id, $shipment_id, $order_id, $line_item_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->deleteItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |
 **order_id** | **string**| ID of the order. |
 **line_item_id** | **string**| ID of the line item. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $shipment_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.

try {
    $result = $api_instance->get($buyer_id, $shipment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patch**
> object patch($buyer_id, $shipment_id, $shipment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.
$shipment = new \Swagger\Client\Model\Shipment(); // \Swagger\Client\Model\Shipment | 

try {
    $result = $api_instance->patch($buyer_id, $shipment_id, $shipment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |
 **shipment** | [**\Swagger\Client\Model\Shipment**](../Model/\Swagger\Client\Model\Shipment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveItem**
> object saveItem($buyer_id, $shipment_id, $item)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.
$item = new \Swagger\Client\Model\ShipmentItem(); // \Swagger\Client\Model\ShipmentItem | 

try {
    $result = $api_instance->saveItem($buyer_id, $shipment_id, $item);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->saveItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |
 **item** | [**\Swagger\Client\Model\ShipmentItem**](../Model/\Swagger\Client\Model\ShipmentItem.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $shipment_id, $shipment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ShipmentApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$shipment_id = "shipment_id_example"; // string | ID of the shipment.
$shipment = new \Swagger\Client\Model\Shipment(); // \Swagger\Client\Model\Shipment | 

try {
    $result = $api_instance->update($buyer_id, $shipment_id, $shipment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ShipmentApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **shipment_id** | **string**| ID of the shipment. |
 **shipment** | [**\Swagger\Client\Model\Shipment**](../Model/\Swagger\Client\Model\Shipment.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

