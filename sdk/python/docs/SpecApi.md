# OrderCloud.SpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpecApi.md#create) | **POST** /specs | 
[**create_option**](SpecApi.md#create_option) | **POST** /specs/{specID}/options | 
[**delete**](SpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**delete_option**](SpecApi.md#delete_option) | **DELETE** /specs/{specID}/options/{optionID} | 
[**delete_product_assignment**](SpecApi.md#delete_product_assignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**get**](SpecApi.md#get) | **GET** /specs/{specID} | 
[**get_option**](SpecApi.md#get_option) | **GET** /specs/{specID}/options/{optionID} | 
[**list**](SpecApi.md#list) | **GET** /specs | 
[**list_options**](SpecApi.md#list_options) | **GET** /specs/{specID}/options | 
[**list_product_assignments**](SpecApi.md#list_product_assignments) | **GET** /specs/productassignments | 
[**patch**](SpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**patch_option**](SpecApi.md#patch_option) | **PATCH** /specs/{specID}/options/{optionID} | 
[**save_product_assignment**](SpecApi.md#save_product_assignment) | **POST** /specs/productassignments | 
[**update**](SpecApi.md#update) | **PUT** /specs/{specID} | 
[**update_option**](SpecApi.md#update_option) | **PUT** /specs/{specID}/options/{optionID} | 


# **create**
> object create(spec)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec = OrderCloud.Spec() # Spec | 

try: 
    api_response = api_instance.create(spec)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SpecApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_option**
> object create_option(spec_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.

try: 
    api_response = api_instance.create_option(spec_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SpecApi->create_option: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(spec_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.

try: 
    api_instance.delete(spec_id)
except ApiException as e:
    print "Exception when calling SpecApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_option**
> delete_option(spec_id, option_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
option_id = 'option_id_example' # str | ID of the option.

try: 
    api_instance.delete_option(spec_id, option_id)
except ApiException as e:
    print "Exception when calling SpecApi->delete_option: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
 **option_id** | **str**| ID of the option. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_product_assignment**
> delete_product_assignment(spec_id, product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.delete_product_assignment(spec_id, product_id)
except ApiException as e:
    print "Exception when calling SpecApi->delete_product_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
 **product_id** | **str**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> get(spec_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.

try: 
    api_instance.get(spec_id)
except ApiException as e:
    print "Exception when calling SpecApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_option**
> get_option(spec_id, option_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
option_id = 'option_id_example' # str | ID of the option.

try: 
    api_instance.get_option(spec_id, option_id)
except ApiException as e:
    print "Exception when calling SpecApi->get_option: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
 **option_id** | **str**| ID of the option. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(spec, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec = OrderCloud.Spec() # Spec | 
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(spec, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SpecApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)|  | 
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

# **list_options**
> object list_options(spec_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_options(spec_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SpecApi->list_options: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
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

# **list_product_assignments**
> list_product_assignments(product_assignment, spec_id=spec_id, product_id=product_id, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
product_assignment = OrderCloud.SpecProductAssignment() # SpecProductAssignment | 
spec_id = 'spec_id_example' # str | ID of the spec. (optional)
product_id = 'product_id_example' # str | ID of the product. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_instance.list_product_assignments(product_assignment, spec_id=spec_id, product_id=product_id, page=page, page_size=page_size)
except ApiException as e:
    print "Exception when calling SpecApi->list_product_assignments: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**SpecProductAssignment**](SpecProductAssignment.md)|  | 
 **spec_id** | **str**| ID of the spec. | [optional] 
 **product_id** | **str**| ID of the product. | [optional] 
 **page** | **int**| Page of results to return. Default: 1 | [optional] 
 **page_size** | **int**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch**
> patch(spec_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.

try: 
    api_instance.patch(spec_id)
except ApiException as e:
    print "Exception when calling SpecApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_option**
> patch_option(spec_id, option_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
option_id = 'option_id_example' # str | ID of the option.

try: 
    api_instance.patch_option(spec_id, option_id)
except ApiException as e:
    print "Exception when calling SpecApi->patch_option: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
 **option_id** | **str**| ID of the option. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_product_assignment**
> save_product_assignment(product_assignment)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
product_assignment = OrderCloud.SpecProductAssignment() # SpecProductAssignment | 

try: 
    api_instance.save_product_assignment(product_assignment)
except ApiException as e:
    print "Exception when calling SpecApi->save_product_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_assignment** | [**SpecProductAssignment**](SpecProductAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(spec_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.

try: 
    api_instance.update(spec_id)
except ApiException as e:
    print "Exception when calling SpecApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_option**
> update_option(spec_id, option_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.SpecApi()
spec_id = 'spec_id_example' # str | ID of the spec.
option_id = 'option_id_example' # str | ID of the option.

try: 
    api_instance.update_option(spec_id, option_id)
except ApiException as e:
    print "Exception when calling SpecApi->update_option: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec_id** | **str**| ID of the spec. | 
 **option_id** | **str**| ID of the option. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

