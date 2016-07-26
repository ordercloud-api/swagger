# UserGroupApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
[**delete**](UserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**deleteUserAssignment**](UserGroupApi.md#deleteUserAssignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**get**](UserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**list**](UserGroupApi.md#list) | **GET** /buyers/{buyerID}/usergroups | 
[**listUserAssignments**](UserGroupApi.md#listUserAssignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
[**patch**](UserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**saveUserAssignment**](UserGroupApi.md#saveUserAssignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
[**update**](UserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, group)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
UserGroup group = new UserGroup(); // UserGroup | 
try {
    Object result = apiInstance.create(buyerID, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **group** | [**UserGroup**](UserGroup.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.delete(buyerID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserAssignment"></a>
# **deleteUserAssignment**
> deleteUserAssignment(buyerID, userGroupID, userID)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String userID = "userID_example"; // String | ID of the user.
try {
    apiInstance.deleteUserAssignment(buyerID, userGroupID, userID);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. |
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
> Object get(buyerID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    Object result = apiInstance.get(buyerID, userGroupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. |

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
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
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
    System.err.println("Exception when calling UserGroupApi#list");
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

<a name="listUserAssignments"></a>
# **listUserAssignments**
> Object listUserAssignments(buyerID, userGroupID, userID, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String userID = "userID_example"; // String | ID of the user.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listUserAssignments(buyerID, userGroupID, userID, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#listUserAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. | [optional]
 **userID** | **String**| ID of the user. | [optional]
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
> patch(buyerID, userGroupID, group)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
UserGroup group = new UserGroup(); // UserGroup | 
try {
    apiInstance.patch(buyerID, userGroupID, group);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. |
 **group** | [**UserGroup**](UserGroup.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveUserAssignment"></a>
# **saveUserAssignment**
> saveUserAssignment(buyerID, userGroupAssignment)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
UserGroupAssignment userGroupAssignment = new UserGroupAssignment(); // UserGroupAssignment | 
try {
    apiInstance.saveUserAssignment(buyerID, userGroupAssignment);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#saveUserAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupAssignment** | [**UserGroupAssignment**](UserGroupAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, userGroupID, group)



### Example
```java
// Import classes:
//import io.swagger.client.api.UserGroupApi;

UserGroupApi apiInstance = new UserGroupApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
UserGroup group = new UserGroup(); // UserGroup | 
try {
    Object result = apiInstance.update(buyerID, userGroupID, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **userGroupID** | **String**| ID of the user group. |
 **group** | [**UserGroup**](UserGroup.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

