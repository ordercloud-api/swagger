# WWW::SwaggerClient::ShipmentApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ShipmentApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
[**delete**](ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
[**delete_item**](ShipmentApi.md#delete_item) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
[**get**](ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
[**list**](ShipmentApi.md#list) | **GET** /buyers/{buyerID}/shipments | 
[**patch**](ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
[**save_item**](ShipmentApi.md#save_item) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
[**update**](ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 


# **create**
> object create(buyer_id => $buyer_id, shipment => $shipment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment = WWW::SwaggerClient::Object::Shipment->new(); # Shipment | 

eval { 
    my $result = $api_instance->create(buyer_id => $buyer_id, shipment => $shipment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id, shipment_id => $shipment_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.

eval { 
    $api_instance->delete(buyer_id => $buyer_id, shipment_id => $shipment_id);
};
if ($@) {
    warn "Exception when calling ShipmentApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item**
> object delete_item(buyer_id => $buyer_id, shipment_id => $shipment_id, order_id => $order_id, line_item_id => $line_item_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.
my $order_id = 'order_id_example'; # string | ID of the order.
my $line_item_id = 'line_item_id_example'; # string | ID of the line item.

eval { 
    my $result = $api_instance->delete_item(buyer_id => $buyer_id, shipment_id => $shipment_id, order_id => $order_id, line_item_id => $line_item_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->delete_item: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 
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

# **get**
> object get(buyer_id => $buyer_id, shipment_id => $shipment_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id, shipment_id => $shipment_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 

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

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
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
    warn "Exception when calling ShipmentApi->list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **order_id** | **string**| ID of the order. | [optional] 
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
> object patch(buyer_id => $buyer_id, shipment_id => $shipment_id, shipment => $shipment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.
my $shipment = WWW::SwaggerClient::Object::Shipment->new(); # Shipment | 

eval { 
    my $result = $api_instance->patch(buyer_id => $buyer_id, shipment_id => $shipment_id, shipment => $shipment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_item**
> object save_item(buyer_id => $buyer_id, shipment_id => $shipment_id, item => $item)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.
my $item = WWW::SwaggerClient::Object::ShipmentItem->new(); # ShipmentItem | 

eval { 
    my $result = $api_instance->save_item(buyer_id => $buyer_id, shipment_id => $shipment_id, item => $item);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->save_item: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 
 **item** | [**ShipmentItem**](ShipmentItem.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id => $buyer_id, shipment_id => $shipment_id, shipment => $shipment)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::ShipmentApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $shipment_id = 'shipment_id_example'; # string | ID of the shipment.
my $shipment = WWW::SwaggerClient::Object::Shipment->new(); # Shipment | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, shipment_id => $shipment_id, shipment => $shipment);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ShipmentApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **shipment_id** | **string**| ID of the shipment. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

