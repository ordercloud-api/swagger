# OrderCloud.SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**delete**](SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**delete_assignment**](SpendingAccountApi.md#delete_assignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**get**](SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**list**](SpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**list_assignments**](SpendingAccountApi.md#list_assignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**patch**](SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**save_assignment**](SpendingAccountApi.md#save_assignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**update**](SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


# **create**
> object create(buyer_id, spending_account)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account = OrderCloud.SpendingAccount() # SpendingAccount | 

try: 
    response = SpendingAccountApi.create(buyer_id, spending_account)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete(buyer_id, spending_account_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account.

try: 
    SpendingAccountApi.delete(buyer_id, spending_account_id)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_assignment**
> delete_assignment(buyer_id, spending_account_id, user_id=user_id, user_group_id=user_group_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account.
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)

try: 
    SpendingAccountApi.delete_assignment(buyer_id, spending_account_id, user_id=user_id, user_group_id=user_group_id)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->delete_assignment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | 
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
> object get(buyer_id, spending_account_id)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account.

try: 
    response = SpendingAccountApi.get(buyer_id, spending_account_id)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
> object list(buyer_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
search = 'search_example' # str | Word or phrase to search for. (optional)
search_on = 'search_on_example' # str | Comma-delimited list of fields to search on. (optional)
sort_by = 'sort_by_example' # str | Comma-delimited list of fields to sort by. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = SpendingAccountApi.list(buyer_id, search=search, search_on=search_on, sort_by=sort_by, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
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
> object list_assignments(buyer_id, spending_account_id=spending_account_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account. (optional)
user_id = 'user_id_example' # str | ID of the user. (optional)
user_group_id = 'user_group_id_example' # str | ID of the user group. (optional)
level = 'level_example' # str | Level of the spending account. (optional)
page = 56 # int | Page of results to return. Default: 1 (optional)
page_size = 56 # int | Number of results to return per page. Default: 20, max: 100. (optional)

try: 
    response = SpendingAccountApi.list_assignments(buyer_id, spending_account_id=spending_account_id, user_id=user_id, user_group_id=user_group_id, level=level, page=page, page_size=page_size)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->list_assignments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | [optional] 
 **user_id** | **str**| ID of the user. | [optional] 
 **user_group_id** | **str**| ID of the user group. | [optional] 
 **level** | **str**| Level of the spending account. | [optional] 
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
> object patch(buyer_id, spending_account_id, spending_account)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account.
spending_account = OrderCloud.SpendingAccount() # SpendingAccount | 

try: 
    response = SpendingAccountApi.patch(buyer_id, spending_account_id, spending_account)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->patch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**object**

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
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
assignment = OrderCloud.SpendingAccountAssignment() # SpendingAccountAssignment | 

try: 
    SpendingAccountApi.save_assignment(buyer_id, assignment)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->save_assignment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **assignment** | [**SpendingAccountAssignment**](SpendingAccountAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
> object update(buyer_id, spending_account_id, spending_account)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
SpendingAccountApi = OrderCloud.SpendingAccountApi()
buyer_id = 'buyer_id_example' # str | ID of the buyer.
spending_account_id = 'spending_account_id_example' # str | ID of the spending account.
spending_account = OrderCloud.SpendingAccount() # SpendingAccount | 

try: 
    response = SpendingAccountApi.update(buyer_id, spending_account_id, spending_account)
    print(response)
except ApiException as e:
    print("Exception when calling SpendingAccountApi->update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyer_id** | **str**| ID of the buyer. | 
 **spending_account_id** | **str**| ID of the spending account. | 
 **spending_account** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

