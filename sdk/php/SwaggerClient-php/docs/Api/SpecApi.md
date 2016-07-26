# Swagger\Client\SpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callList**](SpecApi.md#callList) | **GET** /specs | 
[**create**](SpecApi.md#create) | **POST** /specs | 
[**createOption**](SpecApi.md#createOption) | **POST** /specs/{specID}/options | 
[**delete**](SpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**deleteOption**](SpecApi.md#deleteOption) | **DELETE** /specs/{specID}/options/{optionID} | 
[**deleteProductAssignment**](SpecApi.md#deleteProductAssignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**get**](SpecApi.md#get) | **GET** /specs/{specID} | 
[**getOption**](SpecApi.md#getOption) | **GET** /specs/{specID}/options/{optionID} | 
[**listOptions**](SpecApi.md#listOptions) | **GET** /specs/{specID}/options | 
[**listProductAssignments**](SpecApi.md#listProductAssignments) | **GET** /specs/productassignments | 
[**patch**](SpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**patchOption**](SpecApi.md#patchOption) | **PATCH** /specs/{specID}/options/{optionID} | 
[**saveProductAssignment**](SpecApi.md#saveProductAssignment) | **POST** /specs/productassignments | 
[**update**](SpecApi.md#update) | **PUT** /specs/{specID} | 
[**updateOption**](SpecApi.md#updateOption) | **PUT** /specs/{specID}/options/{optionID} | 


# **callList**
> object callList($search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->callList($search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->callList: ', $e->getMessage(), PHP_EOL;
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
> object create($spec)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec = new \Swagger\Client\Model\Spec(); // \Swagger\Client\Model\Spec | 

try {
    $result = $api_instance->create($spec);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->create: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**\Swagger\Client\Model\Spec**](../Model/\Swagger\Client\Model\Spec.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOption**
> object createOption($spec_id, $option)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$option = new \Swagger\Client\Model\SpecOption(); // \Swagger\Client\Model\SpecOption | 

try {
    $result = $api_instance->createOption($spec_id, $option);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->createOption: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **option** | [**\Swagger\Client\Model\SpecOption**](../Model/\Swagger\Client\Model\SpecOption.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **delete**
> delete($spec_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.

try {
    $api_instance->delete($spec_id);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->delete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOption**
> deleteOption($spec_id, $option_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$option_id = "option_id_example"; // string | ID of the option.

try {
    $api_instance->deleteOption($spec_id, $option_id);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->deleteOption: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **option_id** | **string**| ID of the option. |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteProductAssignment**
> deleteProductAssignment($spec_id, $product_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$product_id = "product_id_example"; // string | ID of the product.

try {
    $api_instance->deleteProductAssignment($spec_id, $product_id);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->deleteProductAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
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
> object get($spec_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.

try {
    $result = $api_instance->get($spec_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->get: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOption**
> object getOption($spec_id, $option_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$option_id = "option_id_example"; // string | ID of the option.

try {
    $result = $api_instance->getOption($spec_id, $option_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->getOption: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **option_id** | **string**| ID of the option. |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listOptions**
> object listOptions($spec_id, $search, $search_on, $sort_by, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$search = "search_example"; // string | Word or phrase to search for.
$search_on = "search_on_example"; // string | Comma-delimited list of fields to search on.
$sort_by = "sort_by_example"; // string | Comma-delimited list of fields to sort by.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listOptions($spec_id, $search, $search_on, $sort_by, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->listOptions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
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

# **listProductAssignments**
> object listProductAssignments($spec_id, $product_id, $page, $page_size)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$product_id = "product_id_example"; // string | ID of the product.
$page = 56; // int | Page of results to return. Default: 1
$page_size = 56; // int | Number of results to return per page. Default: 20, max: 100.

try {
    $result = $api_instance->listProductAssignments($spec_id, $product_id, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->listProductAssignments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. | [optional]
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
> object patch($spec_id, $spec)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$spec = new \Swagger\Client\Model\Spec(); // \Swagger\Client\Model\Spec | 

try {
    $result = $api_instance->patch($spec_id, $spec);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->patch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **spec** | [**\Swagger\Client\Model\Spec**](../Model/\Swagger\Client\Model\Spec.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchOption**
> object patchOption($spec_id, $option_id, $option)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$option_id = "option_id_example"; // string | ID of the option.
$option = new \Swagger\Client\Model\SpecOption(); // \Swagger\Client\Model\SpecOption | 

try {
    $result = $api_instance->patchOption($spec_id, $option_id, $option);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->patchOption: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **option_id** | **string**| ID of the option. |
 **option** | [**\Swagger\Client\Model\SpecOption**](../Model/\Swagger\Client\Model\SpecOption.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **saveProductAssignment**
> saveProductAssignment($product_assignment)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$product_assignment = new \Swagger\Client\Model\SpecProductAssignment(); // \Swagger\Client\Model\SpecProductAssignment | 

try {
    $api_instance->saveProductAssignment($product_assignment);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->saveProductAssignment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**\Swagger\Client\Model\SpecProductAssignment**](../Model/\Swagger\Client\Model\SpecProductAssignment.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **update**
> object update($spec_id, $spec)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$spec = new \Swagger\Client\Model\Spec(); // \Swagger\Client\Model\Spec | 

try {
    $result = $api_instance->update($spec_id, $spec);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->update: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **spec** | [**\Swagger\Client\Model\Spec**](../Model/\Swagger\Client\Model\Spec.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOption**
> object updateOption($spec_id, $option_id, $option)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\SpecApi();
$spec_id = "spec_id_example"; // string | ID of the spec.
$option_id = "option_id_example"; // string | ID of the option.
$option = new \Swagger\Client\Model\SpecOption(); // \Swagger\Client\Model\SpecOption | 

try {
    $result = $api_instance->updateOption($spec_id, $option_id, $option);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SpecApi->updateOption: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **string**| ID of the spec. |
 **option_id** | **string**| ID of the option. |
 **option** | [**\Swagger\Client\Model\SpecOption**](../Model/\Swagger\Client\Model\SpecOption.md)|  |

### Return type

**object**

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

