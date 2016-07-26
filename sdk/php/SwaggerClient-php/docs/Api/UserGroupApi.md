# Swagger\Client\UserGroupApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](UserGroupApi.md#callList) | **GET** /buyers/{buyerID}/usergroups | 
[**create**](UserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
[**delete**](UserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**deleteUserAssignment**](UserGroupApi.md#deleteUserAssignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**get**](UserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**listUserAssignments**](UserGroupApi.md#listUserAssignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
[**patch**](UserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**saveUserAssignment**](UserGroupApi.md#saveUserAssignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
[**update**](UserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


# **callList**
> object callList($buyer_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
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
    echo 'Exception when calling UserGroupApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($buyer_id, $group)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$group = new \Swagger\Client\Model\UserGroup(); // \Swagger\Client\Model\UserGroup | 

try {
    $result = $api_instance->create($buyer_id, $group);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **group** | [**\Swagger\Client\Model\UserGroup**](../Model/\Swagger\Client\Model\UserGroup.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->delete($buyer_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteUserAssignment**
> deleteUserAssignment($buyer_id, $user_group_id, $user_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$user_id = "user_id_example"; // string | ID of the user.

try {
    $api_instance->deleteUserAssignment($buyer_id, $user_group_id, $user_id);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->deleteUserAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. |
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
> object get($buyer_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $result = $api_instance->get($buyer_id, $user_group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listUserAssignments**
> object listUserAssignments($buyer_id, $user_group_id, $user_id, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$user_id = "user_id_example"; // string | ID of the user.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listUserAssignments($buyer_id, $user_group_id, $user_id, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->listUserAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
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
> patch($buyer_id, $user_group_id, $group)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$group = new \Swagger\Client\Model\UserGroup(); // \Swagger\Client\Model\UserGroup | 

try {
    $api_instance->patch($buyer_id, $user_group_id, $group);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. |
 **group** | [**\Swagger\Client\Model\UserGroup**](../Model/\Swagger\Client\Model\UserGroup.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveUserAssignment**
> saveUserAssignment($buyer_id, $user_group_assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_assignment = new \Swagger\Client\Model\UserGroupAssignment(); // \Swagger\Client\Model\UserGroupAssignment | 

try {
    $api_instance->saveUserAssignment($buyer_id, $user_group_assignment);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->saveUserAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_assignment** | [**\Swagger\Client\Model\UserGroupAssignment**](../Model/\Swagger\Client\Model\UserGroupAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $user_group_id, $group)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\UserGroupApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$group = new \Swagger\Client\Model\UserGroup(); // \Swagger\Client\Model\UserGroup | 

try {
    $result = $api_instance->update($buyer_id, $user_group_id, $group);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserGroupApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **user_group_id** | **string**| ID of the user group. |
 **group** | [**\Swagger\Client\Model\UserGroup**](../Model/\Swagger\Client\Model\UserGroup.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

