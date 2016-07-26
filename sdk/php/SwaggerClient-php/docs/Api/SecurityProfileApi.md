# Swagger\Client\SecurityProfileApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](SecurityProfileApi.md#callList) | **GET** /SecurityProfiles | 
[**get**](SecurityProfileApi.md#get) | **GET** /SecurityProfiles/{securityProfileID} | 


# **callList**
> object callList($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SecurityProfileApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityProfileApi->callList: ', $e->getMessage(), PHP_EOL;
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

# **get**
> object get($security_profile_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SecurityProfileApi();
$security_profile_id = "security_profile_id_example"; // string | ID of the security profile.

try {
    $result = $api_instance->get($security_profile_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityProfileApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_profile_id** | **string**| ID of the security profile. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

