# UserApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserApi.md#create) | **POST** /buyers/{buyerID}/users | 
[**delete**](UserApi.md#delete) | **DELETE** /buyers/{buyerID}/users/{userID} | 
[**get**](UserApi.md#get) | **GET** /buyers/{buyerID}/users/{userID} | 
[**getAccessToken**](UserApi.md#getAccessToken) | **POST** /buyers/{buyerID}/users/{userID}/accesstoken | 
[**list**](UserApi.md#list) | **GET** /buyers/{buyerID}/users | 
[**patch**](UserApi.md#patch) | **PATCH** /buyers/{buyerID}/users/{userID} | 
[**update**](UserApi.md#update) | **PUT** /buyers/{buyerID}/users/{userID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
User user = new User(); // User | 
try {
    Object result = apiInstance.create(buyerID, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **user** | [**User**](User.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, userID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
try {
    apiInstance.delete(buyerID, userID);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userID** | **String**| ID of the user. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, userID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
try {
    Object result = apiInstance.get(buyerID, userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userID** | **String**| ID of the user. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccessToken"></a>
# **getAccessToken**
> Object getAccessToken(buyerID, userID, tokenRequest)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
ImpersonateTokenRequest tokenRequest = new ImpersonateTokenRequest(); // ImpersonateTokenRequest | 
try {
    Object result = apiInstance.getAccessToken(buyerID, userID, tokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userID** | **String**| ID of the user. |
 **tokenRequest** | [**ImpersonateTokenRequest**](ImpersonateTokenRequest.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(buyerID, userGroupID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(buyerID, userGroupID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. | [optional]
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

<a name="patch"></a>
# **patch**
> patch(buyerID, userID, user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
User user = new User(); // User | 
try {
    apiInstance.patch(buyerID, userID, user);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userID** | **String**| ID of the user. |
 **user** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, userID, user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
User user = new User(); // User | 
try {
    Object result = apiInstance.update(buyerID, userID, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userID** | **String**| ID of the user. |
 **user** | [**User**](User.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

