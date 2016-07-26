# OrderCloud.CreditCardApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CreditCardApi.md#create) | **POST** /buyers/{buyerID}/creditcards | 
[**delete**](CreditCardApi.md#delete) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**delete_assignment**](CreditCardApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID}/assignments | 
[**get**](CreditCardApi.md#get) | **GET** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**list**](CreditCardApi.md#list) | **GET** /buyers/{buyerID}/creditcards | 
[**list_assignments**](CreditCardApi.md#list_assignments) | **GET** /buyers/{buyerID}/creditcards/assignments | 
[**patch**](CreditCardApi.md#patch) | **PATCH** /buyers/{buyerID}/creditcards/{creditCardID} | 
[**save_assignment**](CreditCardApi.md#save_assignment) | **POST** /buyers/{buyerID}/creditcards/assignments | 
[**update**](CreditCardApi.md#update) | **PUT** /buyers/{buyerID}/creditcards/{creditCardID} | 


# **create**
> object create(buyer_id, card)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
card = OrderCloud.CreditCard() # CreditCard | 

try: 
    api_response = api_instance.create(buyer_id, card)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CreditCardApi->create: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, credit_card_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
credit_card_id = 'credit_card_id_example' # str | ID of the credit card.

try: 
    api_instance.delete(buyer_id, credit_card_id)
except ApiException as e:
    print "Exception when calling CreditCardApi->delete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **credit_card_id** | **str**| ID of the credit card. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id, credit_card_id, user_id=user_id, user_group_id=user_group_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
credit_card_id = 'credit_card_id_example' # str | ID of the credit card.
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)

try: 
    api_instance.delete_assignment(buyer_id, credit_card_id, user_id=user_id, user_group_id=user_group_id)
except ApiException as e:
    print "Exception when calling CreditCardApi->delete_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **credit_card_id** | **str**| ID of the credit card. | 
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

# **get**
> get(buyer_id, credit_card_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
credit_card_id = 'credit_card_id_example' # str | ID of the credit card.

try: 
    api_instance.get(buyer_id, credit_card_id)
except ApiException as e:
    print "Exception when calling CreditCardApi->get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **credit_card_id** | **str**| ID of the credit card. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id, card, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
card = OrderCloud.CreditCard() # CreditCard | 
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_response = api_instance.list(buyer_id, card, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CreditCardApi->list: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **card** | [**CreditCard**](CreditCard.md)|  | 
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
> list_assignments(buyer_id, assignment, credit_card_id=credit_card_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
assignment = OrderCloud.CreditCardAssignment() # CreditCardAssignment | 
credit_card_id = 'credit_card_id_example' # str | ID of the credit card. (optional)
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)
level = 'level_example' # str | Level of the credit card. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    api_instance.list_assignments(buyer_id, assignment, credit_card_id=credit_card_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)
except ApiException as e:
    print "Exception when calling CreditCardApi->list_assignments: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **assignment** | [**CreditCardAssignment**](CreditCardAssignment.md)|  | 
 **credit_card_id** | **str**| ID of the credit card. | [optional] 
 **user_id** | **str**| ID of the user. | [optional] 
 **user_group_id** | **str**| ID of the user group. | [optional] 
 **level** | **str**| Level of the credit card. | [optional] 
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
> patch(buyer_id, credit_card_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
credit_card_id = 'credit_card_id_example' # str | ID of the credit card.

try: 
    api_instance.patch(buyer_id, credit_card_id)
except ApiException as e:
    print "Exception when calling CreditCardApi->patch: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **credit_card_id** | **str**| ID of the credit card. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_assignment**
> save_assignment(buyer_id, assignment)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
assignment = OrderCloud.CreditCardAssignment() # CreditCardAssignment | 

try: 
    api_instance.save_assignment(buyer_id, assignment)
except ApiException as e:
    print "Exception when calling CreditCardApi->save_assignment: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **assignment** | [**CreditCardAssignment**](CreditCardAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> update(buyer_id, credit_card_id)



### Example 
```python
import time
import OrderCloud
from OrderCloud.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: auth
OrderCloud.configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = OrderCloud.CreditCardApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
credit_card_id = 'credit_card_id_example' # str | ID of the credit card.

try: 
    api_instance.update(buyer_id, credit_card_id)
except ApiException as e:
    print "Exception when calling CreditCardApi->update: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **credit_card_id** | **str**| ID of the credit card. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

