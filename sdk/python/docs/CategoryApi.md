# OrderCloud.CategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**delete_assignment**](CategoryApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**delete_product_assignment**](CategoryApi.md#delete_product_assignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**list**](CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**list_assignments**](CategoryApi.md#list_assignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**list_children**](CategoryApi.md#list_children) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**list_product_assignments**](CategoryApi.md#list_product_assignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**save_assignment**](CategoryApi.md#save_assignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**save_product_assignment**](CategoryApi.md#save_product_assignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


# **create**
> object create(buyer_id, category)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category = OrderCloud.Category() # Category | 

try: 
    api_response = api_instance.create(buyer_id, category)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CategoryApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, category_id, category)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
category = OrderCloud.Category() # Category | 

try: 
    api_instance.delete(buyer_id, category_id, category)
except ApiException as e:
    print "Exception when calling CategoryApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id, category_id, user_id=user_id, user_group_id=user_group_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)

try: 
    api_instance.delete_assignment(buyer_id, category_id, user_id=user_id, user_group_id=user_group_id)
except ApiException as e:
    print "Exception when calling CategoryApi->delete_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
 **user_id** | **str**| ID of the user. | [optional] 
 **user_group_id** | **str**| ID of the user group. | [optional] 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_product_assignment**
> delete_product_assignment(buyer_id, category_id, product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.delete_product_assignment(buyer_id, category_id, product_id)
except ApiException as e:
    print "Exception when calling CategoryApi->delete_product_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
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
> get(buyer_id, category_id, category)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
category = OrderCloud.Category() # Category | 

try: 
    api_instance.get(buyer_id, category_id, category)
except ApiException as e:
    print "Exception when calling CategoryApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id, category, parent_id=parent_id, depth=depth, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category = OrderCloud.Category() # Category | 
parent_id = 'parent_id_example' # str | ID of the parent. (optional)
depth = 'depth_example' # str | Depth of the category. (optional)
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(buyer_id, category, parent_id=parent_id, depth=depth, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CategoryApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category** | [**Category**](Category.md)|  | 
 **parent_id** | **str**| ID of the parent. | [optional] 
 **depth** | **str**| Depth of the category. | [optional] 
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

# **list_assignments**
> list_assignments(buyer_id, category_assignment, category_id=category_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_assignment = OrderCloud.CategoryAssignment() # CategoryAssignment | 
category_id = 'category_id_example' # str | ID of the category. (optional)
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)
level = 'level_example' # str | Level of the category. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_instance.list_assignments(buyer_id, category_assignment, category_id=category_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)
except ApiException as e:
    print "Exception when calling CategoryApi->list_assignments: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_assignment** | [**CategoryAssignment**](CategoryAssignment.md)|  | 
 **category_id** | **str**| ID of the category. | [optional] 
 **user_id** | **str**| ID of the user. | [optional] 
 **user_group_id** | **str**| ID of the user group. | [optional] 
 **level** | **str**| Level of the category. | [optional] 
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

# **list_children**
> object list_children(buyer_id, parent_id, search=search, depth=depth, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
parent_id = 'parent_id_example' # str | ID of the parent.
search = 'search_example' # str | Word or phrase to search for. (optional)
depth = 'depth_example' # str | Depth of the category. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_children(buyer_id, parent_id, search=search, depth=depth, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CategoryApi->list_children: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **parent_id** | **str**| ID of the parent. | 
 **search** | **str**| Word or phrase to search for. | [optional] 
 **depth** | **str**| Depth of the category. | [optional] 
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
> list_product_assignments(buyer_id, product_assignment, category_id=category_id, product_id=product_id, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
product_assignment = OrderCloud.CategoryProductAssignment() # CategoryProductAssignment | 
category_id = 'category_id_example' # str | ID of the category. (optional)
product_id = 'product_id_example' # str | ID of the product. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_instance.list_product_assignments(buyer_id, product_assignment, category_id=category_id, product_id=product_id, page=page, page_size=page_size)
except ApiException as e:
    print "Exception when calling CategoryApi->list_product_assignments: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **product_assignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  | 
 **category_id** | **str**| ID of the category. | [optional] 
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
> patch(buyer_id, category_id, category)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
category = OrderCloud.Category() # Category | 

try: 
    api_instance.patch(buyer_id, category_id, category)
except ApiException as e:
    print "Exception when calling CategoryApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(buyer_id, category_assignment)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_assignment = OrderCloud.CategoryAssignment() # CategoryAssignment | 

try: 
    api_instance.save_assignment(buyer_id, category_assignment)
except ApiException as e:
    print "Exception when calling CategoryApi->save_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_assignment** | [**CategoryAssignment**](CategoryAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_product_assignment**
> save_product_assignment(buyer_id, product_assignment)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
product_assignment = OrderCloud.CategoryProductAssignment() # CategoryProductAssignment | 

try: 
    api_instance.save_product_assignment(buyer_id, product_assignment)
except ApiException as e:
    print "Exception when calling CategoryApi->save_product_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **product_assignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(buyer_id, category_id, category)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CategoryApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
category_id = 'category_id_example' # str | ID of the category.
category = OrderCloud.Category() # Category | 

try: 
    api_instance.update(buyer_id, category_id, category)
except ApiException as e:
    print "Exception when calling CategoryApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **category_id** | **str**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

