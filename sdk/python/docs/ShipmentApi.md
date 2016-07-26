# OrderCloud.ShipmentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
[**delete**](ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
[**delete_item**](ShipmentApi.md#delete_item) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
[**get**](ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
[**list**](ShipmentApi.md#list) | **GET** /buyers/{buyerID}/shipments | 
[**patch**](ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
[**save_item**](ShipmentApi.md#save_item) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
[**update**](ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 


# **create**
> object create(buyer_id, shipment)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment = OrderCloud.Shipment() # Shipment | 

try: 
    api_response = api_instance.create(buyer_id, shipment)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ShipmentApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, shipment_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.

try: 
    api_instance.delete(buyer_id, shipment_id)
except ApiException as e:
    print "Exception when calling ShipmentApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_item**
> object delete_item(buyer_id, shipment_id, order_id, line_item_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.
order_id = 'order_id_example' # str | ID of the order.
line_item_id = 'line_item_id_example' # str | ID of the line item.

try: 
    api_response = api_instance.delete_item(buyer_id, shipment_id, order_id, line_item_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ShipmentApi->delete_item: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 
 **order_id** | **str**| ID of the order. | 
 **line_item_id** | **str**| ID of the line item. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> get(buyer_id, shipment_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.

try: 
    api_instance.get(buyer_id, shipment_id)
except ApiException as e:
    print "Exception when calling ShipmentApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id, shipment, order_id=order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment = OrderCloud.Shipment() # Shipment | 
order_id = 'order_id_example' # str | ID of the order. (optional)
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(buyer_id, shipment, order_id=order_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ShipmentApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 
 **order_id** | **str**| ID of the order. | [optional] 
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
> patch(buyer_id, shipment_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.

try: 
    api_instance.patch(buyer_id, shipment_id)
except ApiException as e:
    print "Exception when calling ShipmentApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_item**
> object save_item(buyer_id, shipment_id, item)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.
item = OrderCloud.ShipmentItem() # ShipmentItem | 

try: 
    api_response = api_instance.save_item(buyer_id, shipment_id, item)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ShipmentApi->save_item: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 
 **item** | [**ShipmentItem**](ShipmentItem.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(buyer_id, shipment_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.ShipmentApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
shipment_id = 'shipment_id_example' # str | ID of the shipment.

try: 
    api_instance.update(buyer_id, shipment_id)
except ApiException as e:
    print "Exception when calling ShipmentApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **shipment_id** | **str**| ID of the shipment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

