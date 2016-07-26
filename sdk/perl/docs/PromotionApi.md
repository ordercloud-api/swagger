# WWW::SwaggerClient::PromotionApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::PromotionApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PromotionApi.md#create) | **POST** /promotions | 
[**delete**](PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**delete_assignment**](PromotionApi.md#delete_assignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**get**](PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**list**](PromotionApi.md#list) | **GET** /promotions | 
[**list_assignments**](PromotionApi.md#list_assignments) | **GET** /promotions/assignments | 
[**patch**](PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**save_assignment**](PromotionApi.md#save_assignment) | **POST** /promotions/assignments | 
[**update**](PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


# **create**
> object create(promo => $promo)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promo = WWW::SwaggerClient::Object::Promotion->new(); # Promotion | 

eval { 
    my $result = $api_instance->create(promo => $promo);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**Promotion**](Promotion.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(promotion_id => $promotion_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.

eval { 
    $api_instance->delete(promotion_id => $promotion_id);
};
if ($@) {
    warn "Exception when calling PromotionApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(promotion_id => $promotion_id, buyer_id => $buyer_id, user_id => $user_id, user_group_id => $user_group_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.

eval { 
    $api_instance->delete_assignment(promotion_id => $promotion_id, buyer_id => $buyer_id, user_id => $user_id, user_group_id => $user_group_id);
};
if ($@) {
    warn "Exception when calling PromotionApi->delete_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. | 
 **buyer_id** | **string**| ID of the buyer. | 
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
> object get(promotion_id => $promotion_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.

eval { 
    my $result = $api_instance->get(promotion_id => $promotion_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. | 

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

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
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
    warn "Exception when calling PromotionApi->list: $@\n";
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
> object list_assignments(buyer_id => $buyer_id, promotion_id => $promotion_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.
my $user_id = 'user_id_example'; # string | ID of the user.
my $user_group_id = 'user_group_id_example'; # string | ID of the user group.
my $level = 'level_example'; # string | Level of the promotion.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_assignments(buyer_id => $buyer_id, promotion_id => $promotion_id, user_id => $user_id, user_group_id => $user_group_id, level => $level, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionApi->list_assignments: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **promotion_id** | **string**| ID of the promotion. | [optional] 
 **user_id** | **string**| ID of the user. | [optional] 
 **user_group_id** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the promotion. | [optional] 
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
> object patch(promotion_id => $promotion_id, partial_promotion => $partial_promotion)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.
my $partial_promotion = WWW::SwaggerClient::Object::Promotion->new(); # Promotion | 

eval { 
    my $result = $api_instance->patch(promotion_id => $promotion_id, partial_promotion => $partial_promotion);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. | 
 **partial_promotion** | [**Promotion**](Promotion.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(assignment => $assignment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $assignment = WWW::SwaggerClient::Object::PromotionAssignment->new(); # PromotionAssignment | 

eval { 
    $api_instance->save_assignment(assignment => $assignment);
};
if ($@) {
    warn "Exception when calling PromotionApi->save_assignment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**PromotionAssignment**](PromotionAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(promotion_id => $promotion_id, promo => $promo)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PromotionApi->new();
my $promotion_id = 'promotion_id_example'; # string | ID of the promotion.
my $promo = WWW::SwaggerClient::Object::Promotion->new(); # Promotion | 

eval { 
    my $result = $api_instance->update(promotion_id => $promotion_id, promo => $promo);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **string**| ID of the promotion. | 
 **promo** | [**Promotion**](Promotion.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

