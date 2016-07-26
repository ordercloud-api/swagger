# WWW::SwaggerClient::AdminUserApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AdminUserApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AdminUserApi.md#create) | **POST** /adminusers | 
[**delete**](AdminUserApi.md#delete) | **DELETE** /adminusers/{userID} | 
[**get**](AdminUserApi.md#get) | **GET** /adminusers/{userID} | 
[**list**](AdminUserApi.md#list) | **GET** /adminusers | 
[**patch**](AdminUserApi.md#patch) | **PATCH** /adminusers/{userID} | 
[**update**](AdminUserApi.md#update) | **PUT** /adminusers/{userID} | 


# **create**
> object create(user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    my $result = $api_instance->create(user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminUserApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(user_id => $user_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
my $user_id = 'user_id_example'; # string | ID of the user.

eval { 
    $api_instance->delete(user_id => $user_id);
};
if ($@) {
    warn "Exception when calling AdminUserApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(user_id => $user_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
my $user_id = 'user_id_example'; # string | ID of the user.

eval { 
    my $result = $api_instance->get(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminUserApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| ID of the user. | 

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

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
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
    warn "Exception when calling AdminUserApi->list: $@\n";
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

# **patch**
> patch(user_id => $user_id, user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
my $user_id = 'user_id_example'; # string | ID of the user.
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    $api_instance->patch(user_id => $user_id, user => $user);
};
if ($@) {
    warn "Exception when calling AdminUserApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| ID of the user. | 
 **user** | [**User**](User.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(user_id => $user_id, user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::AdminUserApi->new();
my $user_id = 'user_id_example'; # string | ID of the user.
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    my $result = $api_instance->update(user_id => $user_id, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminUserApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| ID of the user. | 
 **user** | [**User**](User.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

