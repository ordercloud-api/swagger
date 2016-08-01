# OrderCloud.OrderApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_promotion**](OrderApi.md#add_promotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**list_approvals**](OrderApi.md#list_approvals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**list_eligible_approvers**](OrderApi.md#list_eligible_approvers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**list_incoming**](OrderApi.md#list_incoming) | **GET** /orders/incoming | 
[**list_outgoing**](OrderApi.md#list_outgoing) | **GET** /orders/outgoing | 
[**list_promotions**](OrderApi.md#list_promotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**patch_billing_address**](OrderApi.md#patch_billing_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**patch_shipping_address**](OrderApi.md#patch_shipping_address) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**remove_promotion**](OrderApi.md#remove_promotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**set_billing_address**](OrderApi.md#set_billing_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**set_shipping_address**](OrderApi.md#set_shipping_address) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**transfer_temp_user_order**](OrderApi.md#transfer_temp_user_order) | **PUT** /buyers/{buyerID}/orders | 
[**update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


# **add_promotion**
> object add_promotion(buyer_id, order_id, promo_code)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
promo_code = 'promo_code_example' # str | Promo code of the order.

try: 
    response = OrderApi.add_promotion(buyer_id, order_id, promo_code)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->add_promotion: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **promo_code** | **str**| Promo code of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **approve**
> object approve(buyer_id, order_id, comments=comments)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
comments = 'comments_example' # str | Comments to be saved with the order approval. (optional)

try: 
    response = OrderApi.approve(buyer_id, order_id, comments=comments)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->approve: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **comments** | **str**| Comments to be saved with the order approval. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel**
> object cancel(buyer_id, order_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.

try: 
    response = OrderApi.cancel(buyer_id, order_id)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> object create(buyer_id, order)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order = OrderCloud.Order() # Order | 

try: 
    response = OrderApi.create(buyer_id, order)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **decline**
> object decline(buyer_id, order_id, comments=comments)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
comments = 'comments_example' # str | Comments to be saved with the order denial. (optional)

try: 
    response = OrderApi.decline(buyer_id, order_id, comments=comments)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->decline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **comments** | **str**| Comments to be saved with the order denial. | [optional] 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, order_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.

try: 
    OrderApi.delete(buyer_id, order_id)
except ApiException as e:
    print("Exception when calling OrderApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id, order_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.

try: 
    response = OrderApi.get(buyer_id, order_id)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_approvals**
> object list_approvals(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = OrderApi.list_approvals(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->list_approvals: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
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

# **list_eligible_approvers**
> object list_eligible_approvers(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = OrderApi.list_eligible_approvers(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->list_eligible_approvers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
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

# **list_incoming**
> object list_incoming(buyer_id=buyer_id, _from=_from, to=to, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer. (optional)
_from = '_from_example' # str | Lower bound of date range that the order was submitted. (optional)
to = 'to_example' # str | Upper bound of date range that the order was submitted. (optional)
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = OrderApi.list_incoming(buyer_id=buyer_id, _from=_from, to=to, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->list_incoming: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | [optional] 
 **_from** | **str**| Lower bound of date range that the order was submitted. | [optional] 
 **to** | **str**| Upper bound of date range that the order was submitted. | [optional] 
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

# **list_outgoing**
> object list_outgoing(buyer_id=buyer_id, _from=_from, to=to, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer. (optional)
_from = '_from_example' # str | Lower bound of date range that the order was created. (optional)
to = 'to_example' # str | Upper bound of date range that the order was created. (optional)
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = OrderApi.list_outgoing(buyer_id=buyer_id, _from=_from, to=to, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->list_outgoing: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | [optional] 
 **_from** | **str**| Lower bound of date range that the order was created. | [optional] 
 **to** | **str**| Upper bound of date range that the order was created. | [optional] 
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

# **list_promotions**
> object list_promotions(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = OrderApi.list_promotions(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->list_promotions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
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
> object patch(buyer_id, order_id, partial_order)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
partial_order = OrderCloud.Order() # Order | 

try: 
    response = OrderApi.patch(buyer_id, order_id, partial_order)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->patch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **partial_order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_billing_address**
> object patch_billing_address(buyer_id, order_id, address)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
address = OrderCloud.Address() # Address | 

try: 
    response = OrderApi.patch_billing_address(buyer_id, order_id, address)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->patch_billing_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_shipping_address**
> object patch_shipping_address(buyer_id, order_id, address)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
address = OrderCloud.Address() # Address | 

try: 
    response = OrderApi.patch_shipping_address(buyer_id, order_id, address)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->patch_shipping_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_promotion**
> object remove_promotion(buyer_id, order_id, promo_code)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
promo_code = 'promo_code_example' # str | Promo code of the order.

try: 
    response = OrderApi.remove_promotion(buyer_id, order_id, promo_code)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->remove_promotion: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **promo_code** | **str**| Promo code of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_billing_address**
> object set_billing_address(buyer_id, order_id, address)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
address = OrderCloud.Address() # Address | 

try: 
    response = OrderApi.set_billing_address(buyer_id, order_id, address)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->set_billing_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_shipping_address**
> object set_shipping_address(buyer_id, order_id, address)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
address = OrderCloud.Address() # Address | 

try: 
    response = OrderApi.set_shipping_address(buyer_id, order_id, address)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->set_shipping_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ship**
> object ship(buyer_id, order_id, shipment)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
shipment = OrderCloud.Shipment() # Shipment | 

try: 
    response = OrderApi.ship(buyer_id, order_id, shipment)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->ship: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit**
> object submit(buyer_id, order_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.

try: 
    response = OrderApi.submit(buyer_id, order_id)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->submit: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transfer_temp_user_order**
> transfer_temp_user_order(buyer_id, temp_user_token)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
temp_user_token = 'temp_user_token_example' # str | Temp user token of the order.

try: 
    OrderApi.transfer_temp_user_order(buyer_id, temp_user_token)
except ApiException as e:
    print("Exception when calling OrderApi->transfer_temp_user_order: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **temp_user_token** | **str**| Temp user token of the order. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id, order_id, order)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
OrderApi = OrderCloud.OrderApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
order = OrderCloud.Order() # Order | 

try: 
    response = OrderApi.update(buyer_id, order_id, order)
    print(response)
except ApiException as e:
    print("Exception when calling OrderApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

