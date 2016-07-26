# PaymentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
[**createTransaction**](PaymentApi.md#createTransaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
[**delete**](PaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**deleteTransaction**](PaymentApi.md#deleteTransaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**get**](PaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**list**](PaymentApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
[**patch**](PaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patchTransaction**](PaymentApi.md#patchTransaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**update**](PaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**updateTransaction**](PaymentApi.md#updateTransaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, orderID, payment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
Payment payment = new Payment(); // Payment | 
try {
    Object result = apiInstance.create(buyerID, orderID, payment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **payment** | [**Payment**](Payment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createTransaction"></a>
# **createTransaction**
> Object createTransaction(buyerID, orderID, paymentID, transaction)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
PaymentTransaction transaction = new PaymentTransaction(); // PaymentTransaction | 
try {
    Object result = apiInstance.createTransaction(buyerID, orderID, paymentID, transaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#createTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, orderID, paymentID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
try {
    apiInstance.delete(buyerID, orderID, paymentID);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTransaction"></a>
# **deleteTransaction**
> deleteTransaction(buyerID, orderID, paymentID, transactionID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
String transactionID = "transactionID_example"; // String | ID of the transaction.
try {
    apiInstance.deleteTransaction(buyerID, orderID, paymentID, transactionID);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#deleteTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **transactionID** | **String**| ID of the transaction. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, orderID, paymentID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
try {
    Object result = apiInstance.get(buyerID, orderID, paymentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |

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
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
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
    System.err.println("Exception when calling PaymentApi#list");
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
> Object patch(buyerID, orderID, paymentID, partialPayment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
Payment partialPayment = new Payment(); // Payment | 
try {
    Object result = apiInstance.patch(buyerID, orderID, paymentID, partialPayment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **partialPayment** | [**Payment**](Payment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchTransaction"></a>
# **patchTransaction**
> Object patchTransaction(buyerID, orderID, paymentID, transactionID, partialTransaction)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
String transactionID = "transactionID_example"; // String | ID of the transaction.
PaymentTransaction partialTransaction = new PaymentTransaction(); // PaymentTransaction | 
try {
    Object result = apiInstance.patchTransaction(buyerID, orderID, paymentID, transactionID, partialTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#patchTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **transactionID** | **String**| ID of the transaction. |
 **partialTransaction** | [**PaymentTransaction**](PaymentTransaction.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, orderID, paymentID, payment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
Payment payment = new Payment(); // Payment | 
try {
    Object result = apiInstance.update(buyerID, orderID, paymentID, payment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **payment** | [**Payment**](Payment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTransaction"></a>
# **updateTransaction**
> Object updateTransaction(buyerID, orderID, paymentID, transactionID, transaction)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PaymentApi apiInstance = new PaymentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String orderID = "orderID_example"; // String | ID of the order.
String paymentID = "paymentID_example"; // String | ID of the payment.
String transactionID = "transactionID_example"; // String | ID of the transaction.
PaymentTransaction transaction = new PaymentTransaction(); // PaymentTransaction | 
try {
    Object result = apiInstance.updateTransaction(buyerID, orderID, paymentID, transactionID, transaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#updateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. |
 **paymentID** | **String**| ID of the payment. |
 **transactionID** | **String**| ID of the transaction. |
 **transaction** | [**PaymentTransaction**](PaymentTransaction.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

