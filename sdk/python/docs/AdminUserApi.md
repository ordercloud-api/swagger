# OrderCloud.AdminUserApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AdminUserApi.md#create) | **POST** /adminusers | 
[**delete**](AdminUserApi.md#delete) | **DELETE** /adminusers/{userID} | 
[**get**](AdminUserApi.md#get) | **GET** /adminusers/{userID} | 
[**list**](AdminUserApi.md#list) | **GET** /adminusers | 
[**patch**](AdminUserApi.md#patch) | **PATCH** /adminusers/{userID} | 
[**update**](AdminUserApi.md#update) | **PUT** /adminusers/{userID} | 


# **create**
> object create(user)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user = OrderCloud.User() # User | 

try: 
    api_response = api_instance.create(user)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AdminUserApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(user_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user_id = 'user_id_example' # str | ID of the user.

try: 
    api_instance.delete(user_id)
except ApiException as e:
    print "Exception when calling AdminUserApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> get(user_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user_id = 'user_id_example' # str | ID of the user.

try: 
    api_instance.get(user_id)
except ApiException as e:
    print "Exception when calling AdminUserApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(user, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user = OrderCloud.User() # User | 
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(user, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AdminUserApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 
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
> patch(user_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user_id = 'user_id_example' # str | ID of the user.

try: 
    api_instance.patch(user_id)
except ApiException as e:
    print "Exception when calling AdminUserApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(user_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.AdminUserApi()
user_id = 'user_id_example' # str | ID of the user.

try: 
    api_instance.update(user_id)
except ApiException as e:
    print "Exception when calling AdminUserApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

