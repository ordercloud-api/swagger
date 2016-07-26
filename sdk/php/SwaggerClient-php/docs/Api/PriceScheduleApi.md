# Swagger\Client\PriceScheduleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](PriceScheduleApi.md#callList) | **GET** /priceschedules | 
[**create**](PriceScheduleApi.md#create) | **POST** /priceschedules | 
[**delete**](PriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**deletePriceBreak**](PriceScheduleApi.md#deletePriceBreak) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**patch**](PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**savePriceBreak**](PriceScheduleApi.md#savePriceBreak) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


# **callList**
> object callList($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->callList: ', $e->getMessage(), PHP_EOL;
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

# **create**
> object create($price_schedule)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule = new \Swagger\Client\Model\PriceSchedule(); // \Swagger\Client\Model\PriceSchedule | 

try {
    $result = $api_instance->create($price_schedule);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule** | [**\Swagger\Client\Model\PriceSchedule**](../Model/\Swagger\Client\Model\PriceSchedule.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($price_schedule_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.

try {
    $api_instance->delete($price_schedule_id);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deletePriceBreak**
> deletePriceBreak($price_schedule_id, $quantity)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.
$quantity = 56; // int | Quantity of the price schedule.

try {
    $api_instance->deletePriceBreak($price_schedule_id, $quantity);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->deletePriceBreak: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |
 **quantity** | **int**| Quantity of the price schedule. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($price_schedule_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.

try {
    $result = $api_instance->get($price_schedule_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patch**
> object patch($price_schedule_id, $price_schedule)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.
$price_schedule = new \Swagger\Client\Model\PriceSchedule(); // \Swagger\Client\Model\PriceSchedule | 

try {
    $result = $api_instance->patch($price_schedule_id, $price_schedule);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |
 **price_schedule** | [**\Swagger\Client\Model\PriceSchedule**](../Model/\Swagger\Client\Model\PriceSchedule.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **savePriceBreak**
> object savePriceBreak($price_schedule_id, $price_break)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.
$price_break = new \Swagger\Client\Model\PriceBreak(); // \Swagger\Client\Model\PriceBreak | 

try {
    $result = $api_instance->savePriceBreak($price_schedule_id, $price_break);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->savePriceBreak: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |
 **price_break** | [**\Swagger\Client\Model\PriceBreak**](../Model/\Swagger\Client\Model\PriceBreak.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($price_schedule_id, $price_schedule)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PriceScheduleApi();
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.
$price_schedule = new \Swagger\Client\Model\PriceSchedule(); // \Swagger\Client\Model\PriceSchedule | 

try {
    $result = $api_instance->update($price_schedule_id, $price_schedule);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PriceScheduleApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. |
 **price_schedule** | [**\Swagger\Client\Model\PriceSchedule**](../Model/\Swagger\Client\Model\PriceSchedule.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

