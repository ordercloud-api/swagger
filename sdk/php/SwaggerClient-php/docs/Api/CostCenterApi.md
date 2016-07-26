# Swagger\Client\CostCenterApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](CostCenterApi.md#callList) | **GET** /buyers/{buyerID}/costcenters | 
[**create**](CostCenterApi.md#create) | **POST** /buyers/{buyerID}/costcenters | 
[**delete**](CostCenterApi.md#delete) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**deleteAssignment**](CostCenterApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID}/assignments | 
[**get**](CostCenterApi.md#get) | **GET** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**listAssignments**](CostCenterApi.md#listAssignments) | **GET** /buyers/{buyerID}/costcenters/assignments | 
[**patch**](CostCenterApi.md#patch) | **PATCH** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**saveAssignment**](CostCenterApi.md#saveAssignment) | **POST** /buyers/{buyerID}/costcenters/assignments | 
[**update**](CostCenterApi.md#update) | **PUT** /buyers/{buyerID}/costcenters/{costCenterID} | 


# **callList**
> object callList($buyer_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($buyer_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->callList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
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
> object create($buyer_id, $cost_center)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center = new \Swagger\Client\Model\CostCenter(); // \Swagger\Client\Model\CostCenter | 

try {
    $result = $api_instance->create($buyer_id, $cost_center);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center** | [**\Swagger\Client\Model\CostCenter**](../Model/\Swagger\Client\Model\CostCenter.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $cost_center_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.

try {
    $api_instance->delete($buyer_id, $cost_center_id);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($buyer_id, $cost_center_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($buyer_id, $cost_center_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. |
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $cost_center_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.

try {
    $result = $api_instance->get($buyer_id, $cost_center_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAssignments**
> object listAssignments($buyer_id, $cost_center_id, $user_id, $user_group_id, $level, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the cost center.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($buyer_id, $cost_center_id, $user_id, $user_group_id, $level, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the cost center. | [optional]
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
> object patch($buyer_id, $cost_center_id, $cost_center)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.
$cost_center = new \Swagger\Client\Model\CostCenter(); // \Swagger\Client\Model\CostCenter | 

try {
    $result = $api_instance->patch($buyer_id, $cost_center_id, $cost_center);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. |
 **cost_center** | [**\Swagger\Client\Model\CostCenter**](../Model/\Swagger\Client\Model\CostCenter.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveAssignment**
> saveAssignment($buyer_id, $assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$assignment = new \Swagger\Client\Model\CostCenterAssignment(); // \Swagger\Client\Model\CostCenterAssignment | 

try {
    $api_instance->saveAssignment($buyer_id, $assignment);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **assignment** | [**\Swagger\Client\Model\CostCenterAssignment**](../Model/\Swagger\Client\Model\CostCenterAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $cost_center_id, $cost_center)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CostCenterApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$cost_center_id = "cost_center_id_example"; // string | ID of the cost center.
$cost_center = new \Swagger\Client\Model\CostCenter(); // \Swagger\Client\Model\CostCenter | 

try {
    $result = $api_instance->update($buyer_id, $cost_center_id, $cost_center);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CostCenterApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **cost_center_id** | **string**| ID of the cost center. |
 **cost_center** | [**\Swagger\Client\Model\CostCenter**](../Model/\Swagger\Client\Model\CostCenter.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

