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
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
FileApi = OrderCloud.FileApi()
file_id = 'file_id_example' # str | ID of the file.

try: 
    response = FileApi.get(file_id)
    print(response)
except ApiException as e:
    print("Exception when calling FileApi->get: %s\n" % e)
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
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
FileApi = OrderCloud.FileApi()
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = FileApi.list(page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling FileApi->list: %s\n" % e)
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
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
FileApi = OrderCloud.FileApi()
filename = 'filename_example' # str | Filename of the file. (optional)

try: 
    response = FileApi.post_file_data(filename=filename)
    print(response)
except ApiException as e:
    print("Exception when calling FileApi->post_file_data: %s\n" % e)
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

