# WWW::SwaggerClient::PriceScheduleApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::PriceScheduleApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PriceScheduleApi.md#create) | **POST** /priceschedules | 
[**delete**](PriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**delete_price_break**](PriceScheduleApi.md#delete_price_break) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**list**](PriceScheduleApi.md#list) | **GET** /priceschedules | 
[**patch**](PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**save_price_break**](PriceScheduleApi.md#save_price_break) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


# **create**
> object create(price_schedule => $price_schedule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule = WWW::SwaggerClient::Object::PriceSchedule->new(); # PriceSchedule | 

eval { 
    my $result = $api_instance->create(price_schedule => $price_schedule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(price_schedule_id => $price_schedule_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.

eval { 
    $api_instance->delete(price_schedule_id => $price_schedule_id);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_price_break**
> delete_price_break(price_schedule_id => $price_schedule_id, quantity => $quantity)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.
my $quantity = 56; # int | Quantity of the price schedule.

eval { 
    $api_instance->delete_price_break(price_schedule_id => $price_schedule_id, quantity => $quantity);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->delete_price_break: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 
 **quantity** | **int**| Quantity of the price schedule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(price_schedule_id => $price_schedule_id)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.

eval { 
    my $result = $api_instance->get(price_schedule_id => $price_schedule_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 

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

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
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
    warn "Exception when calling PriceScheduleApi->list: $@\n";
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
> object patch(price_schedule_id => $price_schedule_id, price_schedule => $price_schedule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.
my $price_schedule = WWW::SwaggerClient::Object::PriceSchedule->new(); # PriceSchedule | 

eval { 
    my $result = $api_instance->patch(price_schedule_id => $price_schedule_id, price_schedule => $price_schedule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_price_break**
> object save_price_break(price_schedule_id => $price_schedule_id, price_break => $price_break)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.
my $price_break = WWW::SwaggerClient::Object::PriceBreak->new(); # PriceBreak | 

eval { 
    my $result = $api_instance->save_price_break(price_schedule_id => $price_schedule_id, price_break => $price_break);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->save_price_break: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 
 **price_break** | [**PriceBreak**](PriceBreak.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(price_schedule_id => $price_schedule_id, price_schedule => $price_schedule)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PriceScheduleApi->new();
my $price_schedule_id = 'price_schedule_id_example'; # string | ID of the price schedule.
my $price_schedule = WWW::SwaggerClient::Object::PriceSchedule->new(); # PriceSchedule | 

eval { 
    my $result = $api_instance->update(price_schedule_id => $price_schedule_id, price_schedule => $price_schedule);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PriceScheduleApi->update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **string**| ID of the price schedule. | 
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

