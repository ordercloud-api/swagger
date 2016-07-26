# Swagger\Client\UserApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](UserApi.md#callList) | **GET** /buyers/{buyerID}/users | 
[**create**](UserApi.md#create) | **POST** /buyers/{buyerID}/users | 
[**delete**](UserApi.md#delete) | **DELETE** /buyers/{buyerID}/users/{userID} | 
[**get**](UserApi.md#get) | **GET** /buyers/{buyerID}/users/{userID} | 
[**getAccessToken**](UserApi.md#getAccessToken) | **POST** /buyers/{buyerID}/users/{userID}/accesstoken | 
[**patch**](UserApi.md#patch) | **PATCH** /buyers/{buyerID}/users/{userID} | 
[**update**](UserApi.md#update) | **PUT** /buyers/{buyerID}/users/{userID} | 


# **callList**
> object callList($buyer_id, $user_group_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($buyer_id, $user_group_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->callList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. | [optional]
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
> object create($buyer_id, $user)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | 

try {
    $result = $api_instance->create($buyer_id, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user** | [**\Swagger\Client\Model\User**](../Model/\Swagger\Client\Model\User.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $user_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.

try {
    $api_instance->delete($buyer_id, $user_id);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_id** | **string**| ID of the user. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $user_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.

try {
    $result = $api_instance->get($buyer_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_id** | **string**| ID of the user. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccessToken**
> object getAccessToken($buyer_id, $user_id, $token_request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.
$token_request = new \Swagger\Client\Model\ImpersonateTokenRequest(); // \Swagger\Client\Model\ImpersonateTokenRequest | 

try {
    $result = $api_instance->getAccessToken($buyer_id, $user_id, $token_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getAccessToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_id** | **string**| ID of the user. |
 **token_request** | [**\Swagger\Client\Model\ImpersonateTokenRequest**](../Model/\Swagger\Client\Model\ImpersonateTokenRequest.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patch**
> patch($buyer_id, $user_id, $user)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.
$user = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | 

try {
    $api_instance->patch($buyer_id, $user_id, $user);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_id** | **string**| ID of the user. |
 **user** | [**\Swagger\Client\Model\User**](../Model/\Swagger\Client\Model\User.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $user_id, $user)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.
$user = new \Swagger\Client\Model\User(); // \Swagger\Client\Model\User | 

try {
    $result = $api_instance->update($buyer_id, $user_id, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_id** | **string**| ID of the user. |
 **user** | [**\Swagger\Client\Model\User**](../Model/\Swagger\Client\Model\User.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

