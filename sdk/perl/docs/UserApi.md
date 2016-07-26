# WWW::SwaggerClient::UserApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::UserApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserApi.md#create) | **POST** /buyers/{buyerID}/users | 
[**delete**](UserApi.md#delete) | **DELETE** /buyers/{buyerID}/users/{userID} | 
[**get**](UserApi.md#get) | **GET** /buyers/{buyerID}/users/{userID} | 
[**get_access_token**](UserApi.md#get_access_token) | **POST** /buyers/{buyerID}/users/{userID}/accesstoken | 
[**list**](UserApi.md#list) | **GET** /buyers/{buyerID}/users | 
[**patch**](UserApi.md#patch) | **PATCH** /buyers/{buyerID}/users/{userID} | 
[**update**](UserApi.md#update) | **PUT** /buyers/{buyerID}/users/{userID} | 


# **create**
> object create(buyer_id => $buyer_id, user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
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
> delete(buyer_id => $buyer_id, user_id => $user_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, user_id => $user_id);
};
if ($@) {
    warn "Exception when calling UserApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
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
> object get(buyer_id => $buyer_id, user_id => $user_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_id** | **string**| ID of the user. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_access_token**
> object get_access_token(buyer_id => $buyer_id, user_id => $user_id, token_request => $token_request)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.
my $token_request = WWW::SwaggerClient::Object::ImpersonateTokenRequest->new(); # ImpersonateTokenRequest | 

eval { 
    my $result = $api_instance->get_access_token(buyer_id => $buyer_id, user_id => $user_id, token_request => $token_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserApi->get_access_token: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_id** | **string**| ID of the user. | 
 **token_request** | [**ImpersonateTokenRequest**](ImpersonateTokenRequest.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id => $buyer_id, user_group_id => $user_group_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(buyer_id => $buyer_id, user_group_id => $user_group_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserApi->list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | [optional] 
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
> patch(buyer_id => $buyer_id, user_id => $user_id, user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    $api_instance->patch(buyer_id => $buyer_id, user_id => $user_id, user => $user);
};
if ($@) {
    warn "Exception when calling UserApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
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
> object update(buyer_id => $buyer_id, user_id => $user_id, user => $user)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user = WWW::SwaggerClient::Object::User->new(); # User | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, user_id => $user_id, user => $user);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
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

