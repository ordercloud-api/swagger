# WWW::SwaggerClient::ProductApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ProductApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ProductApi.md#create) | **POST** /products | 
[**delete**](ProductApi.md#delete) | **DELETE** /products/{productID} | 
[**delete_assignment**](ProductApi.md#delete_assignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
[**generate_variants**](ProductApi.md#generate_variants) | **POST** /products/{productID}/variants/generate | 
[**get**](ProductApi.md#get) | **GET** /products/{productID} | 
[**get_inventory**](ProductApi.md#get_inventory) | **GET** /products/{productID}/inventory | 
[**get_variant**](ProductApi.md#get_variant) | **GET** /products/{productID}/variants/{variantID} | 
[**get_variant_inventory**](ProductApi.md#get_variant_inventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
[**list**](ProductApi.md#list) | **GET** /products | 
[**list_assignments**](ProductApi.md#list_assignments) | **GET** /products/assignments | 
[**list_inventory**](ProductApi.md#list_inventory) | **GET** /products/inventory | 
[**list_variant_inventory**](ProductApi.md#list_variant_inventory) | **GET** /products/{productID}/variants/inventory | 
[**list_variants**](ProductApi.md#list_variants) | **GET** /products/{productID}/variants | 
[**patch**](ProductApi.md#patch) | **PATCH** /products/{productID} | 
[**patch_variant**](ProductApi.md#patch_variant) | **PATCH** /products/{productID}/variants/{variantID} | 
[**save_assignment**](ProductApi.md#save_assignment) | **POST** /products/assignments | 
[**update**](ProductApi.md#update) | **PUT** /products/{productID} | 
[**update_inventory**](ProductApi.md#update_inventory) | **PUT** /products/{productID}/inventory/{inventory} | 
[**update_variant**](ProductApi.md#update_variant) | **PUT** /products/{productID}/variants/{variantID} | 
[**update_variant_inventory**](ProductApi.md#update_variant_inventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 


# **create**
> object create(product => $product)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product = WWW::SwaggerClient::Object::Product->new(); # Product | 

eval { 
    my $result = $api_instance->create(product => $product);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(product_id => $product_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.

eval { 
    $api_instance->delete(product_id => $product_id);
};
if ($@) {
    warn "Exception when calling ProductApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id => $buyer_id, product_id => $product_id, user_id => $user_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $product_id = 'product_id_example'; # string | ID of the product.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete_assignment(buyer_id => $buyer_id, product_id => $product_id, user_id => $user_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling ProductApi->delete_assignment: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_variants**
> object generate_variants(product_id => $product_id, overwrite_existing => $overwrite_existing)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $overwrite_existing = 1; # boolean | Overwrite existing of the product.

eval { 
    my $result = $api_instance->generate_variants(product_id => $product_id, overwrite_existing => $overwrite_existing);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->generate_variants: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **overwrite_existing** | **boolean**| Overwrite existing of the product. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(product_id => $product_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.

eval { 
    my $result = $api_instance->get(product_id => $product_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_inventory**
> object get_inventory(product_id => $product_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.

eval { 
    my $result = $api_instance->get_inventory(product_id => $product_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->get_inventory: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variant**
> object get_variant(product_id => $product_id, variant_id => $variant_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $variant_id = 'variant_id_example'; # string | ID of the variant.

eval { 
    my $result = $api_instance->get_variant(product_id => $product_id, variant_id => $variant_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->get_variant: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **variant_id** | **string**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variant_inventory**
> object get_variant_inventory(product_id => $product_id, variant_id => $variant_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $variant_id = 'variant_id_example'; # string | ID of the variant.

eval { 
    my $result = $api_instance->get_variant_inventory(product_id => $product_id, variant_id => $variant_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->get_variant_inventory: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **variant_id** | **string**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->list: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_assignments**
> object list_assignments(product_id => $product_id, buyer_id => $buyer_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, price_schedule_id => $price_schedule_id, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $level = 'level_example'; # string | Level of the product.
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_assignments(product_id => $product_id, buyer_id => $buyer_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, price_schedule_id => $price_schedule_id, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->list_assignments: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_inventory**
> object list_inventory(search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_inventory(search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->list_inventory: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_variant_inventory**
> object list_variant_inventory(product_id => $product_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_variant_inventory(product_id => $product_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->list_variant_inventory: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_variants**
> object list_variants(product_id => $product_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_variants(product_id => $product_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->list_variants: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch**
> patch(product_id => $product_id, product => $product)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $product = WWW::SwaggerClient::Object::Product->new(); # Product | 

eval { 
    $api_instance->patch(product_id => $product_id, product => $product);
};
if ($@) {
    warn "Exception when calling ProductApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **product** | [**Product**](Product.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_variant**
> object patch_variant(product_id => $product_id, variant_id => $variant_id, variant => $variant)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $variant_id = 'variant_id_example'; # string | ID of the variant.
my $variant = WWW::SwaggerClient::Object::Variant->new(); # Variant | 

eval { 
    my $result = $api_instance->patch_variant(product_id => $product_id, variant_id => $variant_id, variant => $variant);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->patch_variant: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **variant_id** | **string**| ID of the variant. | 
 **variant** | [**Variant**](Variant.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(product_assignment => $product_assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_assignment = WWW::SwaggerClient::Object::ProductAssignment->new(); # ProductAssignment | 

eval { 
    $api_instance->save_assignment(product_assignment => $product_assignment);
};
if ($@) {
    warn "Exception when calling ProductApi->save_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**ProductAssignment**](ProductAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(product_id => $product_id, product => $product)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $product = WWW::SwaggerClient::Object::Product->new(); # Product | 

eval { 
    my $result = $api_instance->update(product_id => $product_id, product => $product);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **product** | [**Product**](Product.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_inventory**
> object update_inventory(product_id => $product_id, inventory => $inventory)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $inventory = 56; # int | Inventory of the product.

eval { 
    my $result = $api_instance->update_inventory(product_id => $product_id, inventory => $inventory);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->update_inventory: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **inventory** | **int**| Inventory of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_variant**
> object update_variant(product_id => $product_id, variant_id => $variant_id, variant => $variant)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $variant_id = 'variant_id_example'; # string | ID of the variant.
my $variant = WWW::SwaggerClient::Object::Variant->new(); # Variant | 

eval { 
    my $result = $api_instance->update_variant(product_id => $product_id, variant_id => $variant_id, variant => $variant);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->update_variant: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the product. | 
 **variant_id** | **string**| ID of the variant. | 
 **variant** | [**Variant**](Variant.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_variant_inventory**
> object update_variant_inventory(product_id => $product_id, variant_id => $variant_id, inventory => $inventory)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ProductApi->new();
my $product_id = 'product_id_example'; # string | ID of the product.
my $variant_id = 'variant_id_example'; # string | ID of the variant.
my $inventory = 56; # int | Inventory of the product.

eval { 
    my $result = $api_instance->update_variant_inventory(product_id => $product_id, variant_id => $variant_id, inventory => $inventory);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductApi->update_variant_inventory: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

