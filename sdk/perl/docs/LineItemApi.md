# WWW::SwaggerClient::LineItemApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::LineItemApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](LineItemApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**delete**](LineItemApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**get**](LineItemApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**list**](LineItemApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**patch**](LineItemApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**patch_shipping_address**](LineItemApi.md#patch_shipping_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**set_shipping_address**](LineItemApi.md#set_shipping_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**update**](LineItemApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 


# **create**
> object create(buyer_id => $buyer_id, order_id => $order_id, line_item => $line_item)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item = WWW::SwaggerClient::Object::LineItem->new(); # LineItem | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, order_id => $order_id, line_item => $line_item);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item** | [**LineItem**](LineItem.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id);
};
if ($@) {
    warn "Exception when calling LineItemApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $search = 'search_example'; # string | Word or phrase to search for.
my $search_on = 'search_on_example'; # string | Comma-delimited list of fields to search on.
my $sort_by = 'sort_by_example'; # string | Comma-delimited list of fields to sort by.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(buyer_id => $buyer_id, order_id => $order_id, search => $search, search_on => $search_on, sort_by => $sort_by, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->list: $@\n";
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
> object patch(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, partial_line_item => $partial_line_item)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.
my $partial_line_item = WWW::SwaggerClient::Object::LineItem->new(); # LineItem | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, partial_line_item => $partial_line_item);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 
 **partial_line_item** | [**LineItem**](LineItem.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_shipping_address**
> object patch_shipping_address(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->patch_shipping_address(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->patch_shipping_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 
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
> object set_shipping_address(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, address => $address)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.
my $address = WWW::SwaggerClient::Object::Address->new(); # Address | 

eval { 
    my $result = $api_instance->set_shipping_address(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, address => $address);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->set_shipping_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, line_item => $line_item)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::LineItemApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.
my $line_item = WWW::SwaggerClient::Object::LineItem->new(); # LineItem | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, order_id => $order_id, line_item_id => $line_item_id, line_item => $line_item);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LineItemApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | 
 **line_item_id** | **string**| ID of the line item. | 
 **line_item** | [**LineItem**](LineItem.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

