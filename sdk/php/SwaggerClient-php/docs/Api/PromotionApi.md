# Swagger\Client\PromotionApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](PromotionApi.md#callList) | **GET** /promotions | 
[**create**](PromotionApi.md#create) | **POST** /promotions | 
[**delete**](PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**deleteAssignment**](PromotionApi.md#deleteAssignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**get**](PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**listAssignments**](PromotionApi.md#listAssignments) | **GET** /promotions/assignments | 
[**patch**](PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**saveAssignment**](PromotionApi.md#saveAssignment) | **POST** /promotions/assignments | 
[**update**](PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


# **callList**
> object callList($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($promo)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promo = new \Swagger\Client\Model\Promotion(); // \Swagger\Client\Model\Promotion | 

try {
    $result = $api_instance->create($promo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**\Swagger\Client\Model\Promotion**](../Model/\Swagger\Client\Model\Promotion.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($promotion_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.

try {
    $api_instance->delete($promotion_id);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($promotion_id, $buyer_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($promotion_id, $buyer_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. |
 **buyer_id** | **string**| ID of the buyer. |
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
> object get($promotion_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.

try {
    $result = $api_instance->get($promotion_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->get: ', $e->getMessage(), PHP_EOL;
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

# **listAssignments**
> object listAssignments($buyer_id, $promotion_id, $user_id, $user_group_id, $level, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$promotion_id = "promotion_id_example"; // string | ID of the promotion.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the promotion.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($buyer_id, $promotion_id, $user_id, $user_group_id, $level, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **promotion_id** | **string**| ID of the promotion. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the promotion. | [optional]
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
> object patch($promotion_id, $partial_promotion)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.
$partial_promotion = new \Swagger\Client\Model\Promotion(); // \Swagger\Client\Model\Promotion | 

try {
    $result = $api_instance->patch($promotion_id, $partial_promotion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. |
 **partial_promotion** | [**\Swagger\Client\Model\Promotion**](../Model/\Swagger\Client\Model\Promotion.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveAssignment**
> saveAssignment($assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$assignment = new \Swagger\Client\Model\PromotionAssignment(); // \Swagger\Client\Model\PromotionAssignment | 

try {
    $api_instance->saveAssignment($assignment);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**\Swagger\Client\Model\PromotionAssignment**](../Model/\Swagger\Client\Model\PromotionAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($promotion_id, $promo)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PromotionApi();
$promotion_id = "promotion_id_example"; // string | ID of the promotion.
$promo = new \Swagger\Client\Model\Promotion(); // \Swagger\Client\Model\Promotion | 

try {
    $result = $api_instance->update($promotion_id, $promo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. |
 **promo** | [**\Swagger\Client\Model\Promotion**](../Model/\Swagger\Client\Model\Promotion.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

