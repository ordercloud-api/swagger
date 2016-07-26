# WWW::SwaggerClient::CreditCardApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CreditCardApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CreditCardApi.md#create) | **POST** /buyers/{buyerID}/creditcards | 
[**delete**](CreditCardApi.md#delete) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**delete_assignment**](CreditCardApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID}/assignments | 
[**get**](CreditCardApi.md#get) | **GET** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**list**](CreditCardApi.md#list) | **GET** /buyers/{buyerID}/creditcards | 
[**list_assignments**](CreditCardApi.md#list_assignments) | **GET** /buyers/{buyerID}/creditcards/assignments | 
[**patch**](CreditCardApi.md#patch) | **PATCH** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**save_assignment**](CreditCardApi.md#save_assignment) | **POST** /buyers/{buyerID}/creditcards/assignments | 
[**update**](CreditCardApi.md#update) | **PUT** /buyers/{buyerID}/creditcards/{creditCardID} | 


# **create**
> object create(buyer_id => $buyer_id, card => $card)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $card = WWW::SwaggerClient::Object::CreditCard->new(); # CreditCard | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, card => $card);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CreditCardApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, credit_card_id => $credit_card_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, credit_card_id => $credit_card_id);
};
if ($@) {
    warn "Exception when calling CreditCardApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id => $buyer_id, credit_card_id => $credit_card_id, user_id => $user_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete_assignment(buyer_id => $buyer_id, credit_card_id => $credit_card_id, user_id => $user_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling CreditCardApi->delete_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | 
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
> object get(buyer_id => $buyer_id, credit_card_id => $credit_card_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, credit_card_id => $credit_card_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CreditCardApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | 

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

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
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
    warn "Exception when calling CreditCardApi->list: $@\n";
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
> object list_assignments(buyer_id => $buyer_id, credit_card_id => $credit_card_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $level = 'level_example'; # string | Level of the credit card.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_assignments(buyer_id => $buyer_id, credit_card_id => $credit_card_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CreditCardApi->list_assignments: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | [optional] 
 **user_id** | **string**| ID of the user. | [optional] 
 **user_group_id** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the credit card. | [optional] 
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
> object patch(buyer_id => $buyer_id, credit_card_id => $credit_card_id, card => $card)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.
my $card = WWW::SwaggerClient::Object::CreditCard->new(); # CreditCard | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, credit_card_id => $credit_card_id, card => $card);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CreditCardApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

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

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $assignment = WWW::SwaggerClient::Object::CreditCardAssignment->new(); # CreditCardAssignment | 

eval { 
    $api_instance->save_assignment(buyer_id => $buyer_id, assignment => $assignment);
};
if ($@) {
    warn "Exception when calling CreditCardApi->save_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **assignment** | [**CreditCardAssignment**](CreditCardAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, credit_card_id => $credit_card_id, card => $card)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::CreditCardApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $credit_card_id = 'credit_card_id_example'; # string | ID of the credit card.
my $card = WWW::SwaggerClient::Object::CreditCard->new(); # CreditCard | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, credit_card_id => $credit_card_id, card => $card);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CreditCardApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **credit_card_id** | **string**| ID of the credit card. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

