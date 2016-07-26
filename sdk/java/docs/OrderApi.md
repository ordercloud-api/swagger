# OrderApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPromotion**](OrderApi.md#addPromotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**listApprovals**](OrderApi.md#listApprovals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**listEligibleApprovers**](OrderApi.md#listEligibleApprovers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**listIncoming**](OrderApi.md#listIncoming) | **GET** /orders/incoming | 
[**listOutgoing**](OrderApi.md#listOutgoing) | **GET** /orders/outgoing | 
[**listPromotions**](OrderApi.md#listPromotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**patchBillingAddress**](OrderApi.md#patchBillingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**patchShippingAddress**](OrderApi.md#patchShippingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**removePromotion**](OrderApi.md#removePromotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**setBillingAddress**](OrderApi.md#setBillingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**setShippingAddress**](OrderApi.md#setShippingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**transferTempUserOrder**](OrderApi.md#transferTempUserOrder) | **PUT** /buyers/{buyerID}/orders | 
[**update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


<a name="addPromotion"></a>
# **addPromotion**
> Object addPromotion(buyerID, orderID, promoCode)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String promoCode = "promoCode_example"; // String | Promo code of the order.
try {
    Object result = apiInstance.addPromotion(buyerID, orderID, promoCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#addPromotion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **promoCode** | **String**| Promo code of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="approve"></a>
# **approve**
> Object approve(buyerID, orderID, comments)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String comments = "comments_example"; // String | Comments to be saved with the order approval.
try {
    Object result = apiInstance.approve(buyerID, orderID, comments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#approve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **comments** | **String**| Comments to be saved with the order approval. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancel"></a>
# **cancel**
> Object cancel(buyerID, orderID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
try {
    Object result = apiInstance.cancel(buyerID, orderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create"></a>
# **create**
> Object create(buyerID, order)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
Order order = new Order(); // Order | 
try {
    Object result = apiInstance.create(buyerID, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **order** | [**Order**](Order.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="decline"></a>
# **decline**
> Object decline(buyerID, orderID, comments)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String comments = "comments_example"; // String | Comments to be saved with the order denial.
try {
    Object result = apiInstance.decline(buyerID, orderID, comments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#decline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **comments** | **String**| Comments to be saved with the order denial. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, orderID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
try {
    apiInstance.delete(buyerID, orderID);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, orderID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
try {
    Object result = apiInstance.get(buyerID, orderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listApprovals"></a>
# **listApprovals**
> Object listApprovals(buyerID, orderID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listApprovals(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#listApprovals");
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

<a name="listEligibleApprovers"></a>
# **listEligibleApprovers**
> Object listEligibleApprovers(buyerID, orderID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listEligibleApprovers(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#listEligibleApprovers");
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

<a name="listIncoming"></a>
# **listIncoming**
> Object listIncoming(buyerID, from, to, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String from = "from_example"; // String | Lower bound of date range that the order was submitted.
String to = "to_example"; // String | Upper bound of date range that the order was submitted.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listIncoming(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#listIncoming");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | [optional]
 **from** | **String**| Lower bound of date range that the order was submitted. | [optional]
 **to** | **String**| Upper bound of date range that the order was submitted. | [optional]
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

<a name="listOutgoing"></a>
# **listOutgoing**
> Object listOutgoing(buyerID, from, to, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String from = "from_example"; // String | Lower bound of date range that the order was created.
String to = "to_example"; // String | Upper bound of date range that the order was created.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listOutgoing(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#listOutgoing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | [optional]
 **from** | **String**| Lower bound of date range that the order was created. | [optional]
 **to** | **String**| Upper bound of date range that the order was created. | [optional]
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

<a name="listPromotions"></a>
# **listPromotions**
> Object listPromotions(buyerID, orderID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listPromotions(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#listPromotions");
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
> Object patch(buyerID, orderID, partialOrder)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Order partialOrder = new Order(); // Order | 
try {
    Object result = apiInstance.patch(buyerID, orderID, partialOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **partialOrder** | [**Order**](Order.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchBillingAddress"></a>
# **patchBillingAddress**
> Object patchBillingAddress(buyerID, orderID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.patchBillingAddress(buyerID, orderID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#patchBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchShippingAddress"></a>
# **patchShippingAddress**
> Object patchShippingAddress(buyerID, orderID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.patchShippingAddress(buyerID, orderID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#patchShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removePromotion"></a>
# **removePromotion**
> Object removePromotion(buyerID, orderID, promoCode)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String promoCode = "promoCode_example"; // String | Promo code of the order.
try {
    Object result = apiInstance.removePromotion(buyerID, orderID, promoCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#removePromotion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **promoCode** | **String**| Promo code of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setBillingAddress"></a>
# **setBillingAddress**
> Object setBillingAddress(buyerID, orderID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.setBillingAddress(buyerID, orderID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
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
> Object setShippingAddress(buyerID, orderID, address)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Address address = new Address(); // Address | 
try {
    Object result = apiInstance.setShippingAddress(buyerID, orderID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **address** | [**Address**](Address.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ship"></a>
# **ship**
> Object ship(buyerID, orderID, shipment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Shipment shipment = new Shipment(); // Shipment | 
try {
    Object result = apiInstance.ship(buyerID, orderID, shipment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#ship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **shipment** | [**Shipment**](Shipment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="submit"></a>
# **submit**
> Object submit(buyerID, orderID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
try {
    Object result = apiInstance.submit(buyerID, orderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#submit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="transferTempUserOrder"></a>
# **transferTempUserOrder**
> transferTempUserOrder(buyerID, tempUserToken)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String tempUserToken = "tempUserToken_example"; // String | Temp user token of the order.
try {
    apiInstance.transferTempUserOrder(buyerID, tempUserToken);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#transferTempUserOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **tempUserToken** | **String**| Temp user token of the order. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, orderID, order)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Order order = new Order(); // Order | 
try {
    Object result = apiInstance.update(buyerID, orderID, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **order** | [**Order**](Order.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

