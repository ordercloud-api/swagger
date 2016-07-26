# OrderCloud.FileApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](FileApi.md#get) | **GET** /files/{fileID} | 
[**list**](FileApi.md#list) | **GET** /files | 
[**post_file_data**](FileApi.md#post_file_data) | **POST** /files | 


# **get**
> object get(file_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.FileApi()
file_id = 'file_id_example' # str | ID of the file.

try: 
    api_response = api_instance.get(file_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling FileApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **str**| ID of the file. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.FileApi()
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling FileApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **post_file_data**
> object post_file_data(filename=filename)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.FileApi()
filename = 'filename_example' # str | Filename of the file. (optional)

try: 
    api_response = api_instance.post_file_data(filename=filename)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling FileApi->post_file_data: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **str**| Filename of the file. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

