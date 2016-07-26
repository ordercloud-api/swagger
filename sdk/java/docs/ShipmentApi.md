# ShipmentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
[**delete**](ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
[**deleteItem**](ShipmentApi.md#deleteItem) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
[**get**](ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
[**list**](ShipmentApi.md#list) | **GET** /buyers/{buyerID}/shipments | 
[**patch**](ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
[**saveItem**](ShipmentApi.md#saveItem) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
[**update**](ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, shipment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
Shipment shipment = new Shipment(); // Shipment | 
try {
    Object result = apiInstance.create(buyerID, shipment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipment** | [**Shipment**](Shipment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, shipmentID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
try {
    apiInstance.delete(buyerID, shipmentID);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteItem"></a>
# **deleteItem**
> Object deleteItem(buyerID, shipmentID, orderID, lineItemID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
String orderID = "orderID_example"; // String | ID of the order.
String lineItemID = "lineItemID_example"; // String | ID of the line item.
try {
    Object result = apiInstance.deleteItem(buyerID, shipmentID, orderID, lineItemID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |
 **orderID** | **String**| ID of the order. |
 **lineItemID** | **String**| ID of the line item. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, shipmentID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
try {
    Object result = apiInstance.get(buyerID, shipmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |

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
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
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
    System.err.println("Exception when calling ShipmentApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **orderID** | **String**| ID of the order. | [optional]
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
> Object patch(buyerID, shipmentID, shipment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
Shipment shipment = new Shipment(); // Shipment | 
try {
    Object result = apiInstance.patch(buyerID, shipmentID, shipment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |
 **shipment** | [**Shipment**](Shipment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveItem"></a>
# **saveItem**
> Object saveItem(buyerID, shipmentID, item)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
ShipmentItem item = new ShipmentItem(); // ShipmentItem | 
try {
    Object result = apiInstance.saveItem(buyerID, shipmentID, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#saveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |
 **item** | [**ShipmentItem**](ShipmentItem.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, shipmentID, shipment)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ShipmentApi apiInstance = new ShipmentApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String shipmentID = "shipmentID_example"; // String | ID of the shipment.
Shipment shipment = new Shipment(); // Shipment | 
try {
    Object result = apiInstance.update(buyerID, shipmentID, shipment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **shipmentID** | **String**| ID of the shipment. |
 **shipment** | [**Shipment**](Shipment.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

