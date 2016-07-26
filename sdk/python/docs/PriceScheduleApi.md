# OrderCloud.PriceScheduleApi

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
> object create(price_schedule)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule = OrderCloud.PriceSchedule() # PriceSchedule | 

try: 
    api_response = api_instance.create(price_schedule)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->create: %s\n" % e
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
> delete(price_schedule_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.

try: 
    api_instance.delete(price_schedule_id)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_price_break**
> delete_price_break(price_schedule_id, quantity)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.
quantity = 56 # int | Quantity of the price schedule.

try: 
    api_instance.delete_price_break(price_schedule_id, quantity)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->delete_price_break: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 
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
> object get(price_schedule_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.

try: 
    api_response = api_instance.get(price_schedule_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **str**| Word or phrase to search for. | [optional] 
 **search_on** | **str**| Comma-delimited list of fields to search on. | [optional] 
 **sort_by** | **str**| Comma-delimited list of fields to sort by. | [optional] 
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
> object patch(price_schedule_id, price_schedule)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.
price_schedule = OrderCloud.PriceSchedule() # PriceSchedule | 

try: 
    api_response = api_instance.patch(price_schedule_id, price_schedule)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 
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
> object save_price_break(price_schedule_id, price_break)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.
price_break = OrderCloud.PriceBreak() # PriceBreak | 

try: 
    api_response = api_instance.save_price_break(price_schedule_id, price_break)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->save_price_break: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 
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
> object update(price_schedule_id, price_schedule)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.PriceScheduleApi()
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule.
price_schedule = OrderCloud.PriceSchedule() # PriceSchedule | 

try: 
    api_response = api_instance.update(price_schedule_id, price_schedule)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling PriceScheduleApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **price_schedule_id** | **str**| ID of the price schedule. | 
 **price_schedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

