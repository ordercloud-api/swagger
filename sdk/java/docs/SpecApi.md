# SpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SpecApi.md#create) | **POST** /specs | 
[**createOption**](SpecApi.md#createOption) | **POST** /specs/{specID}/options | 
[**delete**](SpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**deleteOption**](SpecApi.md#deleteOption) | **DELETE** /specs/{specID}/options/{optionID} | 
[**deleteProductAssignment**](SpecApi.md#deleteProductAssignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**get**](SpecApi.md#get) | **GET** /specs/{specID} | 
[**getOption**](SpecApi.md#getOption) | **GET** /specs/{specID}/options/{optionID} | 
[**list**](SpecApi.md#list) | **GET** /specs | 
[**listOptions**](SpecApi.md#listOptions) | **GET** /specs/{specID}/options | 
[**listProductAssignments**](SpecApi.md#listProductAssignments) | **GET** /specs/productassignments | 
[**patch**](SpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**patchOption**](SpecApi.md#patchOption) | **PATCH** /specs/{specID}/options/{optionID} | 
[**saveProductAssignment**](SpecApi.md#saveProductAssignment) | **POST** /specs/productassignments | 
[**update**](SpecApi.md#update) | **PUT** /specs/{specID} | 
[**updateOption**](SpecApi.md#updateOption) | **PUT** /specs/{specID}/options/{optionID} | 


<a name="create"></a>
# **create**
> Object create(spec)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
Spec spec = new Spec(); // Spec | 
try {
    Object result = apiInstance.create(spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createOption"></a>
# **createOption**
> Object createOption(specID, option)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
SpecOption option = new SpecOption(); // SpecOption | 
try {
    Object result = apiInstance.createOption(specID, option);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#createOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **option** | [**SpecOption**](SpecOption.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(specID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
try {
    apiInstance.delete(specID);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteOption"></a>
# **deleteOption**
> deleteOption(specID, optionID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String optionID = "optionID_example"; // String | ID of the option.
try {
    apiInstance.deleteOption(specID, optionID);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#deleteOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **optionID** | **String**| ID of the option. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProductAssignment"></a>
# **deleteProductAssignment**
> deleteProductAssignment(specID, productID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String productID = "productID_example"; // String | ID of the product.
try {
    apiInstance.deleteProductAssignment(specID, productID);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#deleteProductAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
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
> Object get(specID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
try {
    Object result = apiInstance.get(specID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOption"></a>
# **getOption**
> Object getOption(specID, optionID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String optionID = "optionID_example"; // String | ID of the option.
try {
    Object result = apiInstance.getOption(specID, optionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#getOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **optionID** | **String**| ID of the option. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="listOptions"></a>
# **listOptions**
> Object listOptions(specID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listOptions(specID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#listOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
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

<a name="listProductAssignments"></a>
# **listProductAssignments**
> Object listProductAssignments(specID, productID, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String productID = "productID_example"; // String | ID of the product.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listProductAssignments(specID, productID, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#listProductAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. | [optional]
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
> Object patch(specID, spec)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
Spec spec = new Spec(); // Spec | 
try {
    Object result = apiInstance.patch(specID, spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **spec** | [**Spec**](Spec.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchOption"></a>
# **patchOption**
> Object patchOption(specID, optionID, option)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String optionID = "optionID_example"; // String | ID of the option.
SpecOption option = new SpecOption(); // SpecOption | 
try {
    Object result = apiInstance.patchOption(specID, optionID, option);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#patchOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **optionID** | **String**| ID of the option. |
 **option** | [**SpecOption**](SpecOption.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveProductAssignment"></a>
# **saveProductAssignment**
> saveProductAssignment(productAssignment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
SpecProductAssignment productAssignment = new SpecProductAssignment(); // SpecProductAssignment | 
try {
    apiInstance.saveProductAssignment(productAssignment);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#saveProductAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAssignment** | [**SpecProductAssignment**](SpecProductAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(specID, spec)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
Spec spec = new Spec(); // Spec | 
try {
    Object result = apiInstance.update(specID, spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **spec** | [**Spec**](Spec.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateOption"></a>
# **updateOption**
> Object updateOption(specID, optionID, option)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpecApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

SpecApi apiInstance = new SpecApi();
String specID = "specID_example"; // String | ID of the spec.
String optionID = "optionID_example"; // String | ID of the option.
SpecOption option = new SpecOption(); // SpecOption | 
try {
    Object result = apiInstance.updateOption(specID, optionID, option);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpecApi#updateOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **String**| ID of the spec. |
 **optionID** | **String**| ID of the option. |
 **option** | [**SpecOption**](SpecOption.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

