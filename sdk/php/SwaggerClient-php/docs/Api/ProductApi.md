# Swagger\Client\ProductApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](ProductApi.md#callList) | **GET** /products | 
[**create**](ProductApi.md#create) | **POST** /products | 
[**delete**](ProductApi.md#delete) | **DELETE** /products/{productID} | 
[**deleteAssignment**](ProductApi.md#deleteAssignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
[**generateVariants**](ProductApi.md#generateVariants) | **POST** /products/{productID}/variants/generate | 
[**get**](ProductApi.md#get) | **GET** /products/{productID} | 
[**getInventory**](ProductApi.md#getInventory) | **GET** /products/{productID}/inventory | 
[**getVariant**](ProductApi.md#getVariant) | **GET** /products/{productID}/variants/{variantID} | 
[**getVariantInventory**](ProductApi.md#getVariantInventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
[**listAssignments**](ProductApi.md#listAssignments) | **GET** /products/assignments | 
[**listInventory**](ProductApi.md#listInventory) | **GET** /products/inventory | 
[**listVariantInventory**](ProductApi.md#listVariantInventory) | **GET** /products/{productID}/variants/inventory | 
[**listVariants**](ProductApi.md#listVariants) | **GET** /products/{productID}/variants | 
[**patch**](ProductApi.md#patch) | **PATCH** /products/{productID} | 
[**patchVariant**](ProductApi.md#patchVariant) | **PATCH** /products/{productID}/variants/{variantID} | 
[**saveAssignment**](ProductApi.md#saveAssignment) | **POST** /products/assignments | 
[**update**](ProductApi.md#update) | **PUT** /products/{productID} | 
[**updateInventory**](ProductApi.md#updateInventory) | **PUT** /products/{productID}/inventory/{inventory} | 
[**updateVariant**](ProductApi.md#updateVariant) | **PUT** /products/{productID}/variants/{variantID} | 
[**updateVariantInventory**](ProductApi.md#updateVariantInventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 


# **callList**
> object callList($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($product)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product = new \Swagger\Client\Model\Product(); // \Swagger\Client\Model\Product | 

try {
    $result = $api_instance->create($product);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**\Swagger\Client\Model\Product**](../Model/\Swagger\Client\Model\Product.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.

try {
    $api_instance->delete($product_id);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAssignment**
> deleteAssignment($buyer_id, $product_id, $user_id, $user_group_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$product_id = "product_id_example"; // string | ID of the product.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.

try {
    $api_instance->deleteAssignment($buyer_id, $product_id, $user_id, $user_group_id);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->deleteAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. |
 **product_id** | **string**| ID of the product. |
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

# **generateVariants**
> object generateVariants($product_id, $overwrite_existing)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$overwrite_existing = true; // bool | Overwrite existing of the product.

try {
    $result = $api_instance->generateVariants($product_id, $overwrite_existing);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->generateVariants: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **overwrite_existing** | **bool**| Overwrite existing of the product. | [optional]

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **get**
> object get($product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.

try {
    $result = $api_instance->get($product_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInventory**
> object getInventory($product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.

try {
    $result = $api_instance->getInventory($product_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->getInventory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVariant**
> object getVariant($product_id, $variant_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$variant_id = "variant_id_example"; // string | ID of the variant.

try {
    $result = $api_instance->getVariant($product_id, $variant_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->getVariant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **variant_id** | **string**| ID of the variant. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVariantInventory**
> object getVariantInventory($product_id, $variant_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$variant_id = "variant_id_example"; // string | ID of the variant.

try {
    $result = $api_instance->getVariantInventory($product_id, $variant_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->getVariantInventory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **variant_id** | **string**| ID of the variant. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAssignments**
> object listAssignments($product_id, $buyer_id, $user_id, $user_group_id, $level, $price_schedule_id, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$buyer_id = "buyer_id_example"; // string | ID of the buyer.
$user_id = "user_id_example"; // string | ID of the user.
$user_group_id = "user_group_id_example"; // string | ID of the user group.
$level = "level_example"; // string | Level of the product.
$price_schedule_id = "price_schedule_id_example"; // string | ID of the price schedule.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listAssignments($product_id, $buyer_id, $user_id, $user_group_id, $level, $price_schedule_id, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->listAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | [optional]
 **buyer_id** | **string**| ID of the buyer. | [optional]
 **user_id** | **string**| ID of the user. | [optional]
 **user_group_id** | **string**| ID of the user group. | [optional]
 **level** | **string**| Level of the product. | [optional]
 **price_schedule_id** | **string**| ID of the price schedule. | [optional]
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

# **listInventory**
> object listInventory($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listInventory($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->listInventory: ', $e->getMessage(), PHP_EOL;
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

# **listVariantInventory**
> object listVariantInventory($product_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listVariantInventory($product_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->listVariantInventory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
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

# **listVariants**
> object listVariants($product_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listVariants($product_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->listVariants: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
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

# **patch**
> patch($product_id, $product)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$product = new \Swagger\Client\Model\Product(); // \Swagger\Client\Model\Product | 

try {
    $api_instance->patch($product_id, $product);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **product** | [**\Swagger\Client\Model\Product**](../Model/\Swagger\Client\Model\Product.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchVariant**
> object patchVariant($product_id, $variant_id, $variant)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$variant_id = "variant_id_example"; // string | ID of the variant.
$variant = new \Swagger\Client\Model\Variant(); // \Swagger\Client\Model\Variant | 

try {
    $result = $api_instance->patchVariant($product_id, $variant_id, $variant);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->patchVariant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **variant_id** | **string**| ID of the variant. |
 **variant** | [**\Swagger\Client\Model\Variant**](../Model/\Swagger\Client\Model\Variant.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveAssignment**
> saveAssignment($product_assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_assignment = new \Swagger\Client\Model\ProductAssignment(); // \Swagger\Client\Model\ProductAssignment | 

try {
    $api_instance->saveAssignment($product_assignment);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->saveAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**\Swagger\Client\Model\ProductAssignment**](../Model/\Swagger\Client\Model\ProductAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($product_id, $product)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$product = new \Swagger\Client\Model\Product(); // \Swagger\Client\Model\Product | 

try {
    $result = $api_instance->update($product_id, $product);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **product** | [**\Swagger\Client\Model\Product**](../Model/\Swagger\Client\Model\Product.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInventory**
> object updateInventory($product_id, $inventory)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$inventory = 56; // int | Inventory of the product.

try {
    $result = $api_instance->updateInventory($product_id, $inventory);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->updateInventory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **inventory** | **int**| Inventory of the product. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateVariant**
> object updateVariant($product_id, $variant_id, $variant)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$variant_id = "variant_id_example"; // string | ID of the variant.
$variant = new \Swagger\Client\Model\Variant(); // \Swagger\Client\Model\Variant | 

try {
    $result = $api_instance->updateVariant($product_id, $variant_id, $variant);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->updateVariant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **variant_id** | **string**| ID of the variant. |
 **variant** | [**\Swagger\Client\Model\Variant**](../Model/\Swagger\Client\Model\Variant.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateVariantInventory**
> object updateVariantInventory($product_id, $variant_id, $inventory)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\ProductApi();
$product_id = "product_id_example"; // string | ID of the product.
$variant_id = "variant_id_example"; // string | ID of the variant.
$inventory = 56; // int | Inventory of the product.

try {
    $result = $api_instance->updateVariantInventory($product_id, $variant_id, $inventory);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->updateVariantInventory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. |
 **variant_id** | **string**| ID of the variant. |
 **inventory** | **int**| Inventory of the product. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

