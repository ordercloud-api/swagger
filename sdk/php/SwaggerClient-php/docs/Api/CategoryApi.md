# Swagger\Client\CategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](CategoryApi.md#callList) | **GET** /buyers/{buyerID}/categories | 
[**create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**deleteAssignment**](CategoryApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**deleteProductAssignment**](CategoryApi.md#deleteProductAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**listAssignments**](CategoryApi.md#listAssignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**listChildren**](CategoryApi.md#listChildren) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**listProductAssignments**](CategoryApi.md#listProductAssignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**saveAssignment**](CategoryApi.md#saveAssignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**saveProductAssignment**](CategoryApi.md#saveProductAssignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


# **callList**
> object callList($buyer_id, $parent_id, $depth, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$parent_id = "parent_id_example"; // string | ID of the parent.
$depth = "depth_example"; // string | Depth of the category.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($buyer_id, $parent_id, $depth, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->callList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **parent_id** | **string**| ID of the parent. | [optional]
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

# **create**
> object create($buyer_id, $category)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category = new \Swagger\Client\Model\Category(); // \Swagger\Client\Model\Category | 

try {
    $result = $api_instance->create($buyer_id, $category);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category** | [**\Swagger\Client\Model\Category**](../Model/\Swagger\Client\Model\Category.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($buyer_id, $category_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.

try {
    $api_instance->delete($buyer_id, $category_id);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($buyer_id, $category_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($buyer_id, $category_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |
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

# **deleteProductAssignment**
> deleteProductAssignment($buyer_id, $category_id, $product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$product_id = "product_id_example"; // string | ID of the product.

try {
    $api_instance->deleteProductAssignment($buyer_id, $category_id, $product_id);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->deleteProductAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |
 **product_id** | **string**| ID of the product. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($buyer_id, $category_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.

try {
    $result = $api_instance->get($buyer_id, $category_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAssignments**
> object listAssignments($buyer_id, $category_id, $user_id, $user_group_id, $level, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the category.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($buyer_id, $category_id, $user_id, $user_group_id, $level, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the category. | [optional]
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

# **listChildren**
> object listChildren($buyer_id, $parent_id, $search, $depth, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$parent_id = "parent_id_example"; // string | ID of the parent.
$search = "search_example"; // string | Word or phrase to search for.
$depth = "depth_example"; // string | Depth of the category.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listChildren($buyer_id, $parent_id, $search, $depth, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->listChildren: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **parent_id** | **string**| ID of the parent. |
 **search** | **string**| Word or phrase to search for. | [optional]
 **depth** | **string**| Depth of the category. | [optional]
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

# **listProductAssignments**
> object listProductAssignments($buyer_id, $category_id, $product_id, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$product_id = "product_id_example"; // string | ID of the product.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listProductAssignments($buyer_id, $category_id, $product_id, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->listProductAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. | [optional]
 **product_id** | **string**| ID of the product. | [optional]
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
> patch($buyer_id, $category_id, $category)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$category = new \Swagger\Client\Model\Category(); // \Swagger\Client\Model\Category | 

try {
    $api_instance->patch($buyer_id, $category_id, $category);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |
 **category** | [**\Swagger\Client\Model\Category**](../Model/\Swagger\Client\Model\Category.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveAssignment**
> saveAssignment($buyer_id, $category_assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_assignment = new \Swagger\Client\Model\CategoryAssignment(); // \Swagger\Client\Model\CategoryAssignment | 

try {
    $api_instance->saveAssignment($buyer_id, $category_assignment);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_assignment** | [**\Swagger\Client\Model\CategoryAssignment**](../Model/\Swagger\Client\Model\CategoryAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveProductAssignment**
> saveProductAssignment($buyer_id, $product_assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$product_assignment = new \Swagger\Client\Model\CategoryProductAssignment(); // \Swagger\Client\Model\CategoryProductAssignment | 

try {
    $api_instance->saveProductAssignment($buyer_id, $product_assignment);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->saveProductAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **product_assignment** | [**\Swagger\Client\Model\CategoryProductAssignment**](../Model/\Swagger\Client\Model\CategoryProductAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($buyer_id, $category_id, $category)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\CategoryApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$category_id = "category_id_example"; // string | ID of the category.
$category = new \Swagger\Client\Model\Category(); // \Swagger\Client\Model\Category | 

try {
    $result = $api_instance->update($buyer_id, $category_id, $category);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CategoryApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **category_id** | **string**| ID of the category. |
 **category** | [**\Swagger\Client\Model\Category**](../Model/\Swagger\Client\Model\Category.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

