# WWW::SwaggerClient::ApprovalRuleApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ApprovalRuleApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ApprovalRuleApi.md#create) | **POST** /buyers/{buyerID}/approvalrules | 
[**delete**](ApprovalRuleApi.md#delete) | **DELETE** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**get**](ApprovalRuleApi.md#get) | **GET** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**list**](ApprovalRuleApi.md#list) | **GET** /buyers/{buyerID}/approvalrules | 
[**patch**](ApprovalRuleApi.md#patch) | **PATCH** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**update**](ApprovalRuleApi.md#update) | **PUT** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 


# **create**
> object create(buyer_id => $buyer_id, approval_rule => $approval_rule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $approval_rule = WWW::SwaggerClient::Object::ApprovalRule->new(); # ApprovalRule | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, approval_rule => $approval_rule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApprovalRuleApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $approval_rule_id = 'approval_rule_id_example'; # string | ID of the approval rule.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id);
};
if ($@) {
    warn "Exception when calling ApprovalRuleApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **approval_rule_id** | **string**| ID of the approval rule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $approval_rule_id = 'approval_rule_id_example'; # string | ID of the approval rule.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApprovalRuleApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **approval_rule_id** | **string**| ID of the approval rule. | 

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

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
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
    warn "Exception when calling ApprovalRuleApi->list: $@\n";
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

# **patch**
> object patch(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id, partial_approval_rule => $partial_approval_rule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $approval_rule_id = 'approval_rule_id_example'; # string | ID of the approval rule.
my $partial_approval_rule = WWW::SwaggerClient::Object::ApprovalRule->new(); # ApprovalRule | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id, partial_approval_rule => $partial_approval_rule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApprovalRuleApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **approval_rule_id** | **string**| ID of the approval rule. | 
 **partial_approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id, approval_rule => $approval_rule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ApprovalRuleApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $approval_rule_id = 'approval_rule_id_example'; # string | ID of the approval rule.
my $approval_rule = WWW::SwaggerClient::Object::ApprovalRule->new(); # ApprovalRule | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, approval_rule_id => $approval_rule_id, approval_rule => $approval_rule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApprovalRuleApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **approval_rule_id** | **string**| ID of the approval rule. | 
 **approval_rule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

