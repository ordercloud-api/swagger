# CategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**deleteAssignment**](CategoryApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**deleteProductAssignment**](CategoryApi.md#deleteProductAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**list**](CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**listAssignments**](CategoryApi.md#listAssignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**listChildren**](CategoryApi.md#listChildren) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**listProductAssignments**](CategoryApi.md#listProductAssignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**saveAssignment**](CategoryApi.md#saveAssignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**saveProductAssignment**](CategoryApi.md#saveProductAssignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, category)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
Category category = new Category(); // Category | 
try {
    Object result = apiInstance.create(buyerID, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **category** | [**Category**](Category.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, categoryID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
try {
    apiInstance.delete(buyerID, categoryID);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAssignment"></a>
# **deleteAssignment**
> deleteAssignment(buyerID, categoryID, userID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.deleteAssignment(buyerID, categoryID, userID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#deleteAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProductAssignment"></a>
# **deleteProductAssignment**
> deleteProductAssignment(buyerID, categoryID, productID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
String productID = "productID_example"; // String | ID of the product.
try {
    apiInstance.deleteProductAssignment(buyerID, categoryID, productID);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#deleteProductAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |
 **productID** | **String**| ID of the product. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, categoryID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
try {
    Object result = apiInstance.get(buyerID, categoryID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(buyerID, parentID, depth, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String parentID = "parentID_example"; // String | ID of the parent.
String depth = "depth_example"; // String | Depth of the category.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(buyerID, parentID, depth, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **parentID** | **String**| ID of the parent. | [optional]
 **depth** | **String**| Depth of the category. | [optional]
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
> Object listAssignments(buyerID, categoryID, userID, userGroupID, level, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String level = "level_example"; // String | Level of the category.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAssignments(buyerID, categoryID, userID, userGroupID, level, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#listAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. | [optional]
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]
 **level** | **String**| Level of the category. | [optional]
 **page** | **Integer**| Page of results to return. Default: 1 | [optional]
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listChildren"></a>
# **listChildren**
> Object listChildren(buyerID, parentID, search, depth, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String parentID = "parentID_example"; // String | ID of the parent.
String search = "search_example"; // String | Word or phrase to search for.
String depth = "depth_example"; // String | Depth of the category.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listChildren(buyerID, parentID, search, depth, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#listChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **parentID** | **String**| ID of the parent. |
 **search** | **String**| Word or phrase to search for. | [optional]
 **depth** | **String**| Depth of the category. | [optional]
 **page** | **Integer**| Page of results to return. Default: 1 | [optional]
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listProductAssignments"></a>
# **listProductAssignments**
> Object listProductAssignments(buyerID, categoryID, productID, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
String productID = "productID_example"; // String | ID of the product.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listProductAssignments(buyerID, categoryID, productID, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#listProductAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. | [optional]
 **productID** | **String**| ID of the product. | [optional]
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
> patch(buyerID, categoryID, category)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
Category category = new Category(); // Category | 
try {
    apiInstance.patch(buyerID, categoryID, category);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |
 **category** | [**Category**](Category.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveAssignment"></a>
# **saveAssignment**
> saveAssignment(buyerID, categoryAssignment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
CategoryAssignment categoryAssignment = new CategoryAssignment(); // CategoryAssignment | 
try {
    apiInstance.saveAssignment(buyerID, categoryAssignment);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#saveAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryAssignment** | [**CategoryAssignment**](CategoryAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveProductAssignment"></a>
# **saveProductAssignment**
> saveProductAssignment(buyerID, productAssignment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
CategoryProductAssignment productAssignment = new CategoryProductAssignment(); // CategoryProductAssignment | 
try {
    apiInstance.saveProductAssignment(buyerID, productAssignment);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#saveProductAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **productAssignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, categoryID, category)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

CategoryApi apiInstance = new CategoryApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String categoryID = "categoryID_example"; // String | ID of the category.
Category category = new Category(); // Category | 
try {
    Object result = apiInstance.update(buyerID, categoryID, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **categoryID** | **String**| ID of the category. |
 **category** | [**Category**](Category.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

