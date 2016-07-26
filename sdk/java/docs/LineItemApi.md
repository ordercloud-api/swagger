# LineItemApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](LineItemApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**delete**](LineItemApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**get**](LineItemApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**list**](LineItemApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**patch**](LineItemApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**patchShippingAddress**](LineItemApi.md#patchShippingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**setShippingAddress**](LineItemApi.md#setShippingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**update**](LineItemApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, orderID, lineItem)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
LineItem lineItem = new LineItem(); // LineItem | 
try {
    Object result = apiInstance.create(buyerID, orderID, lineItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItem** | [**LineItem**](LineItem.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, orderID, lineItemID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
try {
    apiInstance.delete(buyerID, orderID, lineItemID);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, orderID, lineItemID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
try {
    Object result = apiInstance.get(buyerID, orderID, lineItemID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(buyerID, orderID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
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
> Object patch(buyerID, orderID, lineItemID, partialLineItem)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
LineItem partialLineItem = new LineItem(); // LineItem | 
try {
    Object result = apiInstance.patch(buyerID, orderID, lineItemID, partialLineItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |
 **partialLineItem** | [**LineItem**](LineItem.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchShippingAddress"></a>
# **patchShippingAddress**
> Object patchShippingAddress(buyerID, orderID, lineItemID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.patchShippingAddress(buyerID, orderID, lineItemID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#patchShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setShippingAddress"></a>
# **setShippingAddress**
> Object setShippingAddress(buyerID, orderID, lineItemID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.setShippingAddress(buyerID, orderID, lineItemID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#setShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, orderID, lineItemID, lineItem)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LineItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

LineItemApi apiInstance = new LineItemApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
LineItem lineItem = new LineItem(); // LineItem | 
try {
    Object result = apiInstance.update(buyerID, orderID, lineItemID, lineItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LineItemApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |
 **lineItem** | [**LineItem**](LineItem.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

