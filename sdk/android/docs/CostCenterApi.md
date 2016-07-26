# CostCenterApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CostCenterApi.md#create) | **POST** /buyers/{buyerID}/costcenters | 
[**delete**](CostCenterApi.md#delete) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**deleteAssignment**](CostCenterApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID}/assignments | 
[**get**](CostCenterApi.md#get) | **GET** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**list**](CostCenterApi.md#list) | **GET** /buyers/{buyerID}/costcenters | 
[**listAssignments**](CostCenterApi.md#listAssignments) | **GET** /buyers/{buyerID}/costcenters/assignments | 
[**patch**](CostCenterApi.md#patch) | **PATCH** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**saveAssignment**](CostCenterApi.md#saveAssignment) | **POST** /buyers/{buyerID}/costcenters/assignments | 
[**update**](CostCenterApi.md#update) | **PUT** /buyers/{buyerID}/costcenters/{costCenterID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, costCenter)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
CostCenter costCenter = new CostCenter(); // CostCenter | 
try {
    Object result = apiInstance.create(buyerID, costCenter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenter** | [**CostCenter**](CostCenter.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, costCenterID)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
try {
    apiInstance.delete(buyerID, costCenterID);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAssignment"></a>
# **deleteAssignment**
> deleteAssignment(buyerID, costCenterID, userID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.deleteAssignment(buyerID, costCenterID, userID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#deleteAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. |
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
> Object get(buyerID, costCenterID)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
try {
    Object result = apiInstance.get(buyerID, costCenterID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. |

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
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
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
    System.err.println("Exception when calling CostCenterApi#list");
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
> Object listAssignments(buyerID, costCenterID, userID, userGroupID, level, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String level = "level_example"; // String | Level of the cost center.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAssignments(buyerID, costCenterID, userID, userGroupID, level, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#listAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. | [optional]
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]
 **level** | **String**| Level of the cost center. | [optional]
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
> Object patch(buyerID, costCenterID, costCenter)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
CostCenter costCenter = new CostCenter(); // CostCenter | 
try {
    Object result = apiInstance.patch(buyerID, costCenterID, costCenter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. |
 **costCenter** | [**CostCenter**](CostCenter.md)|  |

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
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
CostCenterAssignment assignment = new CostCenterAssignment(); // CostCenterAssignment | 
try {
    apiInstance.saveAssignment(buyerID, assignment);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#saveAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **assignment** | [**CostCenterAssignment**](CostCenterAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, costCenterID, costCenter)



### Example
```java
// Import classes:
//import io.swagger.client.api.CostCenterApi;

CostCenterApi apiInstance = new CostCenterApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String costCenterID = "costCenterID_example"; // String | ID of the cost center.
CostCenter costCenter = new CostCenter(); // CostCenter | 
try {
    Object result = apiInstance.update(buyerID, costCenterID, costCenter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostCenterApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **costCenterID** | **String**| ID of the cost center. |
 **costCenter** | [**CostCenter**](CostCenter.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

