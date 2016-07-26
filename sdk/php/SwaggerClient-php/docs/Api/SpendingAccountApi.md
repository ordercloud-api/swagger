# Swagger\Client\SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](SpendingAccountApi.md#callList) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**create**](SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**delete**](SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**deleteAssignment**](SpendingAccountApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**get**](SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**listAssignments**](SpendingAccountApi.md#listAssignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**patch**](SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**saveAssignment**](SpendingAccountApi.md#saveAssignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**update**](SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


# **callList**
> object callList($buyer_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
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
    echo 'Exception when calling SpendingAccountApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($buyer_id, $spending_account)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account = new \Swagger\Client\Model\SpendingAccount(); // \Swagger\Client\Model\SpendingAccount | 

try {
    $result = $api_instance->create($buyer_id, $spending_account);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account** | [**\Swagger\Client\Model\SpendingAccount**](../Model/\Swagger\Client\Model\SpendingAccount.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $spending_account_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.

try {
    $api_instance->delete($buyer_id, $spending_account_id);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($buyer_id, $spending_account_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($buyer_id, $spending_account_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. |
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
> object get($buyer_id, $spending_account_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.

try {
    $result = $api_instance->get($buyer_id, $spending_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAssignments**
> object listAssignments($buyer_id, $spending_account_id, $user_id, $user_group_id, $level, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the spending account.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($buyer_id, $spending_account_id, $user_id, $user_group_id, $level, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the spending account. | [optional]
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
> object patch($buyer_id, $spending_account_id, $spending_account)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.
$spending_account = new \Swagger\Client\Model\SpendingAccount(); // \Swagger\Client\Model\SpendingAccount | 

try {
    $result = $api_instance->patch($buyer_id, $spending_account_id, $spending_account);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. |
 **spending_account** | [**\Swagger\Client\Model\SpendingAccount**](../Model/\Swagger\Client\Model\SpendingAccount.md)|  |

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

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$assignment = new \Swagger\Client\Model\SpendingAccountAssignment(); // \Swagger\Client\Model\SpendingAccountAssignment | 

try {
    $api_instance->saveAssignment($buyer_id, $assignment);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **assignment** | [**\Swagger\Client\Model\SpendingAccountAssignment**](../Model/\Swagger\Client\Model\SpendingAccountAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $spending_account_id, $spending_account)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpendingAccountApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$spending_account_id = "spending_account_id_example"; // string | ID of the spending account.
$spending_account = new \Swagger\Client\Model\SpendingAccount(); // \Swagger\Client\Model\SpendingAccount | 

try {
    $result = $api_instance->update($buyer_id, $spending_account_id, $spending_account);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpendingAccountApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **spending_account_id** | **string**| ID of the spending account. |
 **spending_account** | [**\Swagger\Client\Model\SpendingAccount**](../Model/\Swagger\Client\Model\SpendingAccount.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

