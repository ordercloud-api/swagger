# WWW::SwaggerClient::CategoryApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CategoryApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**delete_assignment**](CategoryApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**delete_product_assignment**](CategoryApi.md#delete_product_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**list**](CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**list_assignments**](CategoryApi.md#list_assignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**list_children**](CategoryApi.md#list_children) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**list_product_assignments**](CategoryApi.md#list_product_assignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**save_assignment**](CategoryApi.md#save_assignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**save_product_assignment**](CategoryApi.md#save_product_assignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


# **create**
> object create(buyer_id => $buyer_id, category => $category)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category = WWW::SwaggerClient::Object::Category->new(); # Category | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, category => $category);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, category_id => $category_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, category_id => $category_id);
};
if ($@) {
    warn "Exception when calling CategoryApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category_id** | **string**| ID of the category. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id => $buyer_id, category_id => $category_id, user_id => $user_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete_assignment(buyer_id => $buyer_id, category_id => $category_id, user_id => $user_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling CategoryApi->delete_assignment: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_product_assignment**
> delete_product_assignment(buyer_id => $buyer_id, category_id => $category_id, product_id => $product_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $product_id = 'product_id_example'; # string | ID of the product.

eval { 
    $api_instance->delete_product_assignment(buyer_id => $buyer_id, category_id => $category_id, product_id => $product_id);
};
if ($@) {
    warn "Exception when calling CategoryApi->delete_product_assignment: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id, category_id => $category_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, category_id => $category_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category_id** | **string**| ID of the category. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id => $buyer_id, parent_id => $parent_id, depth => $depth, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $parent_id = 'parent_id_example'; # string | ID of the parent.
my $depth = 'depth_example'; # string | Depth of the category.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(buyer_id => $buyer_id, parent_id => $parent_id, depth => $depth, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->list: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_assignments**
> object list_assignments(buyer_id => $buyer_id, category_id => $category_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $level = 'level_example'; # string | Level of the category.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_assignments(buyer_id => $buyer_id, category_id => $category_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->list_assignments: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_children**
> object list_children(buyer_id => $buyer_id, parent_id => $parent_id, search => $search, depth => $depth, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $parent_id = 'parent_id_example'; # string | ID of the parent.
my $search = 'search_example'; # string | Word or phrase to search for.
my $depth = 'depth_example'; # string | Depth of the category.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_children(buyer_id => $buyer_id, parent_id => $parent_id, search => $search, depth => $depth, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->list_children: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_product_assignments**
> object list_product_assignments(buyer_id => $buyer_id, category_id => $category_id, product_id => $product_id, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $product_id = 'product_id_example'; # string | ID of the product.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_product_assignments(buyer_id => $buyer_id, category_id => $category_id, product_id => $product_id, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->list_product_assignments: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch**
> patch(buyer_id => $buyer_id, category_id => $category_id, category => $category)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $category = WWW::SwaggerClient::Object::Category->new(); # Category | 

eval { 
    $api_instance->patch(buyer_id => $buyer_id, category_id => $category_id, category => $category);
};
if ($@) {
    warn "Exception when calling CategoryApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category_id** | **string**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(buyer_id => $buyer_id, category_assignment => $category_assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_assignment = WWW::SwaggerClient::Object::CategoryAssignment->new(); # CategoryAssignment | 

eval { 
    $api_instance->save_assignment(buyer_id => $buyer_id, category_assignment => $category_assignment);
};
if ($@) {
    warn "Exception when calling CategoryApi->save_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category_assignment** | [**CategoryAssignment**](CategoryAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_product_assignment**
> save_product_assignment(buyer_id => $buyer_id, product_assignment => $product_assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $product_assignment = WWW::SwaggerClient::Object::CategoryProductAssignment->new(); # CategoryProductAssignment | 

eval { 
    $api_instance->save_product_assignment(buyer_id => $buyer_id, product_assignment => $product_assignment);
};
if ($@) {
    warn "Exception when calling CategoryApi->save_product_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **product_assignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, category_id => $category_id, category => $category)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CategoryApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $category_id = 'category_id_example'; # string | ID of the category.
my $category = WWW::SwaggerClient::Object::Category->new(); # Category | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, category_id => $category_id, category => $category);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoryApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **category_id** | **string**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

