# OrderCloud.ProductApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ProductApi.md#create) | **POST** /products | 
[**delete**](ProductApi.md#delete) | **DELETE** /products/{productID} | 
[**delete_assignment**](ProductApi.md#delete_assignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
[**generate_variants**](ProductApi.md#generate_variants) | **POST** /products/{productID}/variants/generate | 
[**get**](ProductApi.md#get) | **GET** /products/{productID} | 
[**get_inventory**](ProductApi.md#get_inventory) | **GET** /products/{productID}/inventory | 
[**get_variant**](ProductApi.md#get_variant) | **GET** /products/{productID}/variants/{variantID} | 
[**get_variant_inventory**](ProductApi.md#get_variant_inventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
[**list**](ProductApi.md#list) | **GET** /products | 
[**list_assignments**](ProductApi.md#list_assignments) | **GET** /products/assignments | 
[**list_inventory**](ProductApi.md#list_inventory) | **GET** /products/inventory | 
[**list_variant_inventory**](ProductApi.md#list_variant_inventory) | **GET** /products/{productID}/variants/inventory | 
[**list_variants**](ProductApi.md#list_variants) | **GET** /products/{productID}/variants | 
[**patch**](ProductApi.md#patch) | **PATCH** /products/{productID} | 
[**patch_variant**](ProductApi.md#patch_variant) | **PATCH** /products/{productID}/variants/{variantID} | 
[**save_assignment**](ProductApi.md#save_assignment) | **POST** /products/assignments | 
[**update**](ProductApi.md#update) | **PUT** /products/{productID} | 
[**update_inventory**](ProductApi.md#update_inventory) | **PUT** /products/{productID}/inventory/{inventory} | 
[**update_variant**](ProductApi.md#update_variant) | **PUT** /products/{productID}/variants/{variantID} | 
[**update_variant_inventory**](ProductApi.md#update_variant_inventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 


# **create**
> object create(product)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product = OrderCloud.Product() # Product | 

try: 
    api_response = api_instance.create(product)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.delete(product_id)
except ApiException as e:
    print "Exception when calling ProductApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id, product_id, user_id=user_id, user_group_id=user_group_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
product_id = 'product_id_example' # str | ID of the product.
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)

try: 
    api_instance.delete_assignment(buyer_id, product_id, user_id=user_id, user_group_id=user_group_id)
except ApiException as e:
    print "Exception when calling ProductApi->delete_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **product_id** | **str**| ID of the product. | 
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

# **generate_variants**
> object generate_variants(product_id, overwrite_existing=overwrite_existing)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
overwrite_existing = true # bool | Overwrite existing of the product. (optional)

try: 
    api_response = api_instance.generate_variants(product_id, overwrite_existing=overwrite_existing)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->generate_variants: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **overwrite_existing** | **bool**| Overwrite existing of the product. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> get(product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.get(product_id)
except ApiException as e:
    print "Exception when calling ProductApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_inventory**
> object get_inventory(product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_response = api_instance.get_inventory(product_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->get_inventory: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variant**
> object get_variant(product_id, variant_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
variant_id = 'variant_id_example' # str | ID of the variant.

try: 
    api_response = api_instance.get_variant(product_id, variant_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->get_variant: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **variant_id** | **str**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variant_inventory**
> object get_variant_inventory(product_id, variant_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
variant_id = 'variant_id_example' # str | ID of the variant.

try: 
    api_response = api_instance.get_variant_inventory(product_id, variant_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->get_variant_inventory: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **variant_id** | **str**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(product, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product = OrderCloud.Product() # Product | 
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(product, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)|  | 
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
> object list_assignments(product_id=product_id, buyer_id=buyer_id, user_id=user_id, user_group_id=user_group_id, level=level, price_schedule_id=price_schedule_id, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product. (optional)
buyer_id = 'buyer_id_example' # str | ID of the buyer. (optional)
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)
level = 'level_example' # str | Level of the product. (optional)
price_schedule_id = 'price_schedule_id_example' # str | ID of the price schedule. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_assignments(product_id=product_id, buyer_id=buyer_id, user_id=user_id, user_group_id=user_group_id, level=level, price_schedule_id=price_schedule_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->list_assignments: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | [optional] 
 **buyer_id** | **str**| ID of the buyer. | [optional] 
 **user_id** | **str**| ID of the user. | [optional] 
 **user_group_id** | **str**| ID of the user group. | [optional] 
 **level** | **str**| Level of the product. | [optional] 
 **price_schedule_id** | **str**| ID of the price schedule. | [optional] 
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

# **list_inventory**
> object list_inventory(search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_inventory(search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->list_inventory: %s\n" % e
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

# **list_variant_inventory**
> object list_variant_inventory(product_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_variant_inventory(product_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->list_variant_inventory: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
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

# **list_variants**
> object list_variants(product_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list_variants(product_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->list_variants: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
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
> patch(product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.patch(product_id)
except ApiException as e:
    print "Exception when calling ProductApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_variant**
> object patch_variant(product_id, variant_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
variant_id = 'variant_id_example' # str | ID of the variant.

try: 
    api_response = api_instance.patch_variant(product_id, variant_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->patch_variant: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **variant_id** | **str**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment()



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()

try: 
    api_instance.save_assignment()
except ApiException as e:
    print "Exception when calling ProductApi->save_assignment: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(product_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.

try: 
    api_instance.update(product_id)
except ApiException as e:
    print "Exception when calling ProductApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_inventory**
> object update_inventory(product_id, inventory)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
inventory = 56 # int | Inventory of the product.

try: 
    api_response = api_instance.update_inventory(product_id, inventory)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->update_inventory: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **inventory** | **int**| Inventory of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_variant**
> object update_variant(product_id, variant_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
variant_id = 'variant_id_example' # str | ID of the variant.

try: 
    api_response = api_instance.update_variant(product_id, variant_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->update_variant: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **variant_id** | **str**| ID of the variant. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_variant_inventory**
> object update_variant_inventory(product_id, variant_id, inventory)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ProductApi()
product_id = 'product_id_example' # str | ID of the product.
variant_id = 'variant_id_example' # str | ID of the variant.
inventory = 56 # int | Inventory of the product.

try: 
    api_response = api_instance.update_variant_inventory(product_id, variant_id, inventory)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ProductApi->update_variant_inventory: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| ID of the product. | 
 **variant_id** | **str**| ID of the variant. | 
 **inventory** | **int**| Inventory of the product. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

