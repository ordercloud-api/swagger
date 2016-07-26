# WWW::SwaggerClient::OrderApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::OrderApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_promotion**](OrderApi.md#add_promotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**list_approvals**](OrderApi.md#list_approvals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**list_eligible_approvers**](OrderApi.md#list_eligible_approvers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**list_incoming**](OrderApi.md#list_incoming) | **GET** /orders/incoming | 
[**list_outgoing**](OrderApi.md#list_outgoing) | **GET** /orders/outgoing | 
[**list_promotions**](OrderApi.md#list_promotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**patch_billing_address**](OrderApi.md#patch_billing_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**patch_shipping_address**](OrderApi.md#patch_shipping_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**remove_promotion**](OrderApi.md#remove_promotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**set_billing_address**](OrderApi.md#set_billing_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**set_shipping_address**](OrderApi.md#set_shipping_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**transfer_temp_user_order**](OrderApi.md#transfer_temp_user_order) | **PUT** /buyers/{buyerID}/orders | 
[**update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


# **add_promotion**
> object add_promotion(buyer_id => $buyer_id, order_id => $order_id, promo_code => $promo_code)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $promo_code = 'promo_code_example'; # string | Promo code of the order.

eval { 
    my $result = $api_instance->add_promotion(buyer_id => $buyer_id, order_id => $order_id, promo_code => $promo_code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->add_promotion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **promo_code** | **string**| Promo code of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **approve**
> object approve(buyer_id => $buyer_id, order_id => $order_id, comments => $comments)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $comments = 'comments_example'; # string | Comments to be saved with the order approval.

eval { 
    my $result = $api_instance->approve(buyer_id => $buyer_id, order_id => $order_id, comments => $comments);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->approve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **comments** | **string**| Comments to be saved with the order approval. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel**
> object cancel(buyer_id => $buyer_id, order_id => $order_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.

eval { 
    my $result = $api_instance->cancel(buyer_id => $buyer_id, order_id => $order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->cancel: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> object create(buyer_id => $buyer_id, order => $order)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order = WWW::SwaggerClient::Object::Order->new(); # Order | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **decline**
> object decline(buyer_id => $buyer_id, order_id => $order_id, comments => $comments)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $comments = 'comments_example'; # string | Comments to be saved with the order denial.

eval { 
    my $result = $api_instance->decline(buyer_id => $buyer_id, order_id => $order_id, comments => $comments);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->decline: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **comments** | **string**| Comments to be saved with the order denial. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, order_id => $order_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, order_id => $order_id);
};
if ($@) {
    warn "Exception when calling OrderApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id, order_id => $order_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, order_id => $order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_approvals**
> object list_approvals(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_approvals(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->list_approvals: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
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

# **list_eligible_approvers**
> object list_eligible_approvers(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_eligible_approvers(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->list_eligible_approvers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
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

# **list_incoming**
> object list_incoming(buyer_id => $buyer_id, from => $from, to => $to, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $from = 'from_example'; # string | Lower bound of date range that the order was submitted.
my $to = 'to_example'; # string | Upper bound of date range that the order was submitted.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_incoming(buyer_id => $buyer_id, from => $from, to => $to, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->list_incoming: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | [optional] 
 **from** | **string**| Lower bound of date range that the order was submitted. | [optional] 
 **to** | **string**| Upper bound of date range that the order was submitted. | [optional] 
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

# **list_outgoing**
> object list_outgoing(buyer_id => $buyer_id, from => $from, to => $to, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $from = 'from_example'; # string | Lower bound of date range that the order was created.
my $to = 'to_example'; # string | Upper bound of date range that the order was created.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_outgoing(buyer_id => $buyer_id, from => $from, to => $to, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->list_outgoing: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | [optional] 
 **from** | **string**| Lower bound of date range that the order was created. | [optional] 
 **to** | **string**| Upper bound of date range that the order was created. | [optional] 
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

# **list_promotions**
> object list_promotions(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list_promotions(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->list_promotions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
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
> object patch(buyer_id => $buyer_id, order_id => $order_id, partial_order => $partial_order)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $partial_order = WWW::SwaggerClient::Object::Order->new(); # Order | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, order_id => $order_id, partial_order => $partial_order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **partial_order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_billing_address**
> object patch_billing_address(buyer_id => $buyer_id, order_id => $order_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->patch_billing_address(buyer_id => $buyer_id, order_id => $order_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->patch_billing_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_shipping_address**
> object patch_shipping_address(buyer_id => $buyer_id, order_id => $order_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->patch_shipping_address(buyer_id => $buyer_id, order_id => $order_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->patch_shipping_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_promotion**
> object remove_promotion(buyer_id => $buyer_id, order_id => $order_id, promo_code => $promo_code)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $promo_code = 'promo_code_example'; # string | Promo code of the order.

eval { 
    my $result = $api_instance->remove_promotion(buyer_id => $buyer_id, order_id => $order_id, promo_code => $promo_code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->remove_promotion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **promo_code** | **string**| Promo code of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_billing_address**
> object set_billing_address(buyer_id => $buyer_id, order_id => $order_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->set_billing_address(buyer_id => $buyer_id, order_id => $order_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->set_billing_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_shipping_address**
> object set_shipping_address(buyer_id => $buyer_id, order_id => $order_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->set_shipping_address(buyer_id => $buyer_id, order_id => $order_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->set_shipping_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ship**
> object ship(buyer_id => $buyer_id, order_id => $order_id, shipment => $shipment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $shipment = WWW::SwaggerClient::Object::Shipment->new(); # Shipment | 

eval { 
    my $result = $api_instance->ship(buyer_id => $buyer_id, order_id => $order_id, shipment => $shipment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->ship: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit**
> object submit(buyer_id => $buyer_id, order_id => $order_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.

eval { 
    my $result = $api_instance->submit(buyer_id => $buyer_id, order_id => $order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->submit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transfer_temp_user_order**
> transfer_temp_user_order(buyer_id => $buyer_id, temp_user_token => $temp_user_token)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $temp_user_token = 'temp_user_token_example'; # string | Temp user token of the order.

eval { 
    $api_instance->transfer_temp_user_order(buyer_id => $buyer_id, temp_user_token => $temp_user_token);
};
if ($@) {
    warn "Exception when calling OrderApi->transfer_temp_user_order: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **temp_user_token** | **string**| Temp user token of the order. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, order_id => $order_id, order => $order)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::OrderApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $order = WWW::SwaggerClient::Object::Order->new(); # Order | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, order_id => $order_id, order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

