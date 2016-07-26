# WWW::SwaggerClient::AddressApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AddressApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AddressApi.md#create) | **POST** /buyers/{buyerID}/addresses | 
[**delete**](AddressApi.md#delete) | **DELETE** /buyers/{buyerID}/addresses/{addressID} | 
[**delete_assignment**](AddressApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/addresses/{addressID}/assignments | 
[**get**](AddressApi.md#get) | **GET** /buyers/{buyerID}/addresses/{addressID} | 
[**list**](AddressApi.md#list) | **GET** /buyers/{buyerID}/addresses | 
[**list_assignments**](AddressApi.md#list_assignments) | **GET** /buyers/{buyerID}/addresses/assignments | 
[**patch**](AddressApi.md#patch) | **PATCH** /buyers/{buyerID}/addresses/{addressID} | 
[**save_assignment**](AddressApi.md#save_assignment) | **POST** /buyers/{buyerID}/addresses/assignments | 
[**update**](AddressApi.md#update) | **PUT** /buyers/{buyerID}/addresses/{addressID} | 


# **create**
> object create(buyer_id => $buyer_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, address_id => $address_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, address_id => $address_id);
};
if ($@) {
    warn "Exception when calling AddressApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id => $buyer_id, address_id => $address_id, user_id => $user_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete_assignment(buyer_id => $buyer_id, address_id => $address_id, user_id => $user_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling AddressApi->delete_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | 
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

# **get**
> object get(buyer_id => $buyer_id, address_id => $address_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, address_id => $address_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id => $buyer_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(buyer_id => $buyer_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->list: $@\n";
}
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

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_assignments**
> object list_assignments(buyer_id => $buyer_id, address_id => $address_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, is_shipping => $is_shipping, is_billing => $is_billing, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $level = 'level_example'; # string | Level of the address.
my $is_shipping = 1; # boolean | Is shipping of the address.
my $is_billing = 1; # boolean | Is billing of the address.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_assignments(buyer_id => $buyer_id, address_id => $address_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, is_shipping => $is_shipping, is_billing => $is_billing, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->list_assignments: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | [optional] 
 **user_id** | **string**| ID of the user. | [optional] 
 **user_group_id** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the address. | [optional] 
 **is_shipping** | **boolean**| Is shipping of the address. | [optional] 
 **is_billing** | **boolean**| Is billing of the address. | [optional] 
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
> object patch(buyer_id => $buyer_id, address_id => $address_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, address_id => $address_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(buyer_id => $buyer_id, assignment => $assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $assignment = WWW::SwaggerClient::Object::AddressAssignment->new(); # AddressAssignment | 

eval { 
    $api_instance->save_assignment(buyer_id => $buyer_id, assignment => $assignment);
};
if ($@) {
    warn "Exception when calling AddressApi->save_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **assignment** | [**AddressAssignment**](AddressAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, address_id => $address_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $address_id = 'address_id_example'; # string | ID of the address.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, address_id => $address_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **address_id** | **string**| ID of the address. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

