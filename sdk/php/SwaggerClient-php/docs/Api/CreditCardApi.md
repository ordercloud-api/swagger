# Swagger\Client\CreditCardApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](CreditCardApi.md#callList) | **GET** /buyers/{buyerID}/creditcards | 
[**create**](CreditCardApi.md#create) | **POST** /buyers/{buyerID}/creditcards | 
[**delete**](CreditCardApi.md#delete) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**deleteAssignment**](CreditCardApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID}/assignments | 
[**get**](CreditCardApi.md#get) | **GET** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**listAssignments**](CreditCardApi.md#listAssignments) | **GET** /buyers/{buyerID}/creditcards/assignments | 
[**patch**](CreditCardApi.md#patch) | **PATCH** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**saveAssignment**](CreditCardApi.md#saveAssignment) | **POST** /buyers/{buyerID}/creditcards/assignments | 
[**update**](CreditCardApi.md#update) | **PUT** /buyers/{buyerID}/creditcards/{creditCardID} | 


# **callList**
> object callList($buyer_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
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
    echo 'Exception when calling CreditCardApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($buyer_id, $card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$card = new \Swagger\Client\Model\CreditCard(); // \Swagger\Client\Model\CreditCard | 

try {
    $result = $api_instance->create($buyer_id, $card);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **card** | [**\Swagger\Client\Model\CreditCard**](../Model/\Swagger\Client\Model\CreditCard.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $credit_card_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.

try {
    $api_instance->delete($buyer_id, $credit_card_id);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($buyer_id, $credit_card_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($buyer_id, $credit_card_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. |
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
> object get($buyer_id, $credit_card_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.

try {
    $result = $api_instance->get($buyer_id, $credit_card_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAssignments**
> object listAssignments($buyer_id, $credit_card_id, $user_id, $user_group_id, $level, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the credit card.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($buyer_id, $credit_card_id, $user_id, $user_group_id, $level, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the credit card. | [optional]
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
> object patch($buyer_id, $credit_card_id, $card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.
$card = new \Swagger\Client\Model\CreditCard(); // \Swagger\Client\Model\CreditCard | 

try {
    $result = $api_instance->patch($buyer_id, $credit_card_id, $card);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. |
 **card** | [**\Swagger\Client\Model\CreditCard**](../Model/\Swagger\Client\Model\CreditCard.md)|  |

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

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$assignment = new \Swagger\Client\Model\CreditCardAssignment(); // \Swagger\Client\Model\CreditCardAssignment | 

try {
    $api_instance->saveAssignment($buyer_id, $assignment);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **assignment** | [**\Swagger\Client\Model\CreditCardAssignment**](../Model/\Swagger\Client\Model\CreditCardAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $credit_card_id, $card)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CreditCardApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$credit_card_id = "credit_card_id_example"; // string | ID of the credit card.
$card = new \Swagger\Client\Model\CreditCard(); // \Swagger\Client\Model\CreditCard | 

try {
    $result = $api_instance->update($buyer_id, $credit_card_id, $card);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CreditCardApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **credit_card_id** | **string**| ID of the credit card. |
 **card** | [**\Swagger\Client\Model\CreditCard**](../Model/\Swagger\Client\Model\CreditCard.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

