# WWW::SwaggerClient::BuyerApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::BuyerApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](BuyerApi.md#create) | **POST** /buyers | 
[**delete**](BuyerApi.md#delete) | **DELETE** /buyers/{buyerID} | 
[**get**](BuyerApi.md#get) | **GET** /buyers/{buyerID} | 
[**list**](BuyerApi.md#list) | **GET** /buyers | 
[**update**](BuyerApi.md#update) | **PUT** /buyers/{buyerID} | 


# **create**
> object create(company => $company)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::BuyerApi->new();
my $company = WWW::SwaggerClient::Object::Buyer->new(); # Buyer | 

eval { 
    my $result = $api_instance->create(company => $company);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BuyerApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**Buyer**](Buyer.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id => $buyer_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::BuyerApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.

eval { 
    $api_instance->delete(buyer_id => $buyer_id);
};
if ($@) {
    warn "Exception when calling BuyerApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id => $buyer_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::BuyerApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.

eval { 
    my $result = $api_instance->get(buyer_id => $buyer_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BuyerApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(search => $search, page => $page, page_size => $page_size)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::BuyerApi->new();
my $search = 'search_example'; # string | Word or phrase to search for.
my $page = 56; # int | Page of results to return. Default: 1
my $page_size = 56; # int | Number of results to return per page. Default: 20, max: 100.

eval { 
    my $result = $api_instance->list(search => $search, page => $page, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BuyerApi->list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
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

# **update**
> object update(buyer_id => $buyer_id, company => $company)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::BuyerApi->new();
my $buyer_id = 'buyer_id_example'; # string | ID of the buyer.
my $company = WWW::SwaggerClient::Object::Buyer->new(); # Buyer | 

eval { 
    my $result = $api_instance->update(buyer_id => $buyer_id, company => $company);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BuyerApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **string**| ID of the buyer. | 
 **company** | [**Buyer**](Buyer.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

