# SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**delete**](SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**deleteAssignment**](SpendingAccountApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**get**](SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**list**](SpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**listAssignments**](SpendingAccountApi.md#listAssignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**patch**](SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**saveAssignment**](SpendingAccountApi.md#saveAssignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**update**](SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, spendingAccount)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
SpendingAccount spendingAccount = new SpendingAccount(); // SpendingAccount | 
try {
    Object result = apiInstance.create(buyerID, spendingAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, spendingAccountID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
try {
    apiInstance.delete(buyerID, spendingAccountID);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAssignment"></a>
# **deleteAssignment**
> deleteAssignment(buyerID, spendingAccountID, userID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.deleteAssignment(buyerID, spendingAccountID, userID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#deleteAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. |
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, spendingAccountID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
try {
    Object result = apiInstance.get(buyerID, spendingAccountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(buyerID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(buyerID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **search** | **String**| Word or phrase to search for. | [optional]
 **searchOn** | **String**| Comma-delimited list of fields to search on. | [optional]
 **sortBy** | **String**| Comma-delimited list of fields to sort by. | [optional]
 **page** | **Integer**| Page of results to return. Default: 1 | [optional]
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listAssignments"></a>
# **listAssignments**
> Object listAssignments(buyerID, spendingAccountID, userID, userGroupID, level, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String level = "level_example"; // String | Level of the spending account.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAssignments(buyerID, spendingAccountID, userID, userGroupID, level, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#listAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. | [optional]
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]
 **level** | **String**| Level of the spending account. | [optional]
 **page** | **Integer**| Page of results to return. Default: 1 | [optional]
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patch"></a>
# **patch**
> Object patch(buyerID, spendingAccountID, spendingAccount)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
SpendingAccount spendingAccount = new SpendingAccount(); // SpendingAccount | 
try {
    Object result = apiInstance.patch(buyerID, spendingAccountID, spendingAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. |
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveAssignment"></a>
# **saveAssignment**
> saveAssignment(buyerID, assignment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
SpendingAccountAssignment assignment = new SpendingAccountAssignment(); // SpendingAccountAssignment | 
try {
    apiInstance.saveAssignment(buyerID, assignment);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#saveAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **assignment** | [**SpendingAccountAssignment**](SpendingAccountAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, spendingAccountID, spendingAccount)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpendingAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpendingAccountApi apiInstance = new SpendingAccountApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String spendingAccountID = "spendingAccountID_example"; // String | ID of the spending account.
SpendingAccount spendingAccount = new SpendingAccount(); // SpendingAccount | 
try {
    Object result = apiInstance.update(buyerID, spendingAccountID, spendingAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpendingAccountApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **spendingAccountID** | **String**| ID of the spending account. |
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

