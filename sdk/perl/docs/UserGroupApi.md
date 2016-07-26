# WWW::SwaggerClient::UserGroupApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::UserGroupApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
[**delete**](UserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**delete_user_assignment**](UserGroupApi.md#delete_user_assignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**get**](UserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**list**](UserGroupApi.md#list) | **GET** /buyers/{buyerID}/usergroups | 
[**list_user_assignments**](UserGroupApi.md#list_user_assignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
[**patch**](UserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**save_user_assignment**](UserGroupApi.md#save_user_assignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
[**update**](UserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


# **create**
> object create(buyer_id => $buyer_id, group => $group)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $group = WWW::SwaggerClient::Object::UserGroup->new(); # UserGroup | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, group => $group);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserGroupApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling UserGroupApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_user_assignment**
> delete_user_assignment(buyer_id => $buyer_id, user_group_id => $user_group_id, user_id => $user_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $user_id = 'user_id_example'; # string | ID of the user.

eval { 
    $api_instance->delete_user_assignment(buyer_id => $buyer_id, user_group_id => $user_group_id, user_id => $user_id);
};
if ($@) {
    warn "Exception when calling UserGroupApi->delete_user_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | 
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
> object get(buyer_id => $buyer_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, user_group_id => $user_group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserGroupApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | 

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

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
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
    warn "Exception when calling UserGroupApi->list: $@\n";
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

# **list_user_assignments**
> object list_user_assignments(buyer_id => $buyer_id, user_group_id => $user_group_id, user_id => $user_id, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $user_id = 'user_id_example'; # string | ID of the user.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_user_assignments(buyer_id => $buyer_id, user_group_id => $user_group_id, user_id => $user_id, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserGroupApi->list_user_assignments: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | [optional] 
 **user_id** | **string**| ID of the user. | [optional] 
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
> patch(buyer_id => $buyer_id, user_group_id => $user_group_id, group => $group)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $group = WWW::SwaggerClient::Object::UserGroup->new(); # UserGroup | 

eval { 
    $api_instance->patch(buyer_id => $buyer_id, user_group_id => $user_group_id, group => $group);
};
if ($@) {
    warn "Exception when calling UserGroupApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_user_assignment**
> save_user_assignment(buyer_id => $buyer_id, user_group_assignment => $user_group_assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_assignment = WWW::SwaggerClient::Object::UserGroupAssignment->new(); # UserGroupAssignment | 

eval { 
    $api_instance->save_user_assignment(buyer_id => $buyer_id, user_group_assignment => $user_group_assignment);
};
if ($@) {
    warn "Exception when calling UserGroupApi->save_user_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_assignment** | [**UserGroupAssignment**](UserGroupAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, user_group_id => $user_group_id, group => $group)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::UserGroupApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $group = WWW::SwaggerClient::Object::UserGroup->new(); # UserGroup | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, user_group_id => $user_group_id, group => $group);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserGroupApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **user_group_id** | **string**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

