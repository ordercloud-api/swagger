# OrderCloud.PaymentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
[**create_transaction**](PaymentApi.md#create_transaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
[**delete**](PaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**delete_transaction**](PaymentApi.md#delete_transaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**get**](PaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**list**](PaymentApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
[**patch**](PaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patch_transaction**](PaymentApi.md#patch_transaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**update**](PaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**update_transaction**](PaymentApi.md#update_transaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 


# **create**
> object create(buyer_id, order_id, payment)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment = OrderCloud.Payment() # Payment | 

try: 
    response = PaymentApi.create(buyer_id, order_id, payment)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transaction**
> object create_transaction(buyer_id, order_id, payment_id, transaction)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
transaction = OrderCloud.PaymentTransaction() # PaymentTransaction | 

try: 
    response = PaymentApi.create_transaction(buyer_id, order_id, payment_id, transaction)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->create_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, order_id, payment_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.

try: 
    PaymentApi.delete(buyer_id, order_id, payment_id)
except ApiException as e:
    print("Exception when calling PaymentApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_transaction**
> delete_transaction(buyer_id, order_id, payment_id, transaction_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
transaction_id = 'transaction_id_example' # str | ID of the transaction.

try: 
    PaymentApi.delete_transaction(buyer_id, order_id, payment_id, transaction_id)
except ApiException as e:
    print("Exception when calling PaymentApi->delete_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **transaction_id** | **str**| ID of the transaction. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> object get(buyer_id, order_id, payment_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.

try: 
    response = PaymentApi.get(buyer_id, order_id, payment_id)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = PaymentApi.list(buyer_id, order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->list: %s\n" % e)
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
> object patch(buyer_id, order_id, payment_id, partial_payment)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
partial_payment = OrderCloud.Payment() # Payment | 

try: 
    response = PaymentApi.patch(buyer_id, order_id, payment_id, partial_payment)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->patch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **partial_payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_transaction**
> object patch_transaction(buyer_id, order_id, payment_id, transaction_id, partial_transaction)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
transaction_id = 'transaction_id_example' # str | ID of the transaction.
partial_transaction = OrderCloud.PaymentTransaction() # PaymentTransaction | 

try: 
    response = PaymentApi.patch_transaction(buyer_id, order_id, payment_id, transaction_id, partial_transaction)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->patch_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **transaction_id** | **str**| ID of the transaction. | 
 **partial_transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id, order_id, payment_id, payment)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
payment = OrderCloud.Payment() # Payment | 

try: 
    response = PaymentApi.update(buyer_id, order_id, payment_id, payment)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **payment** | [**Payment**](Payment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_transaction**
> object update_transaction(buyer_id, order_id, payment_id, transaction_id, transaction)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PaymentApi = OrderCloud.PaymentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
order_id = 'order_id_example' # str | ID of the order.
payment_id = 'payment_id_example' # str | ID of the payment.
transaction_id = 'transaction_id_example' # str | ID of the transaction.
transaction = OrderCloud.PaymentTransaction() # PaymentTransaction | 

try: 
    response = PaymentApi.update_transaction(buyer_id, order_id, payment_id, transaction_id, transaction)
    print(response)
except ApiException as e:
    print("Exception when calling PaymentApi->update_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **order_id** | **str**| ID of the order. | 
 **payment_id** | **str**| ID of the payment. | 
 **transaction_id** | **str**| ID of the transaction. | 
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

