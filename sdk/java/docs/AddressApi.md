# AddressApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AddressApi.md#create) | **POST** /buyers/{buyerID}/addresses | 
[**delete**](AddressApi.md#delete) | **DELETE** /buyers/{buyerID}/addresses/{addressID} | 
[**deleteAssignment**](AddressApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/addresses/{addressID}/assignments | 
[**get**](AddressApi.md#get) | **GET** /buyers/{buyerID}/addresses/{addressID} | 
[**list**](AddressApi.md#list) | **GET** /buyers/{buyerID}/addresses | 
[**listAssignments**](AddressApi.md#listAssignments) | **GET** /buyers/{buyerID}/addresses/assignments | 
[**patch**](AddressApi.md#patch) | **PATCH** /buyers/{buyerID}/addresses/{addressID} | 
[**saveAssignment**](AddressApi.md#saveAssignment) | **POST** /buyers/{buyerID}/addresses/assignments | 
[**update**](AddressApi.md#update) | **PUT** /buyers/{buyerID}/addresses/{addressID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.create(buyerID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, addressID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
try {
    apiInstance.delete(buyerID, addressID);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAssignment"></a>
# **deleteAssignment**
> deleteAssignment(buyerID, addressID, userID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.deleteAssignment(buyerID, addressID, userID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#deleteAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. |
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
> Object get(buyerID, addressID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
try {
    Object result = apiInstance.get(buyerID, addressID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. |

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
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
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
    System.err.println("Exception when calling AddressApi#list");
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
> Object listAssignments(buyerID, addressID, userID, userGroupID, level, isShipping, isBilling, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String level = "level_example"; // String | Level of the address.
Boolean isShipping = true; // Boolean | Is shipping of the address.
Boolean isBilling = true; // Boolean | Is billing of the address.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAssignments(buyerID, addressID, userID, userGroupID, level, isShipping, isBilling, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#listAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. | [optional]
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]
 **level** | **String**| Level of the address. | [optional]
 **isShipping** | **Boolean**| Is shipping of the address. | [optional]
 **isBilling** | **Boolean**| Is billing of the address. | [optional]
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
> Object patch(buyerID, addressID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.patch(buyerID, addressID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. |
 **address** | [**Address**](Address.md)|  |

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
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
AddressAssignment assignment = new AddressAssignment(); // AddressAssignment | 
try {
    apiInstance.saveAssignment(buyerID, assignment);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#saveAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **assignment** | [**AddressAssignment**](AddressAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, addressID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String addressID = "addressID_example"; // String | ID of the address.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.update(buyerID, addressID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **addressID** | **String**| ID of the address. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

