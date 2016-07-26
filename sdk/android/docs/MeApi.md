# MeApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddress**](MeApi.md#createAddress) | **POST** /me/addresses | 
[**createCreditCard**](MeApi.md#createCreditCard) | **POST** /me/creditcards | 
[**deleteAddress**](MeApi.md#deleteAddress) | **DELETE** /me/addresses/{addressID} | 
[**deleteCreditCard**](MeApi.md#deleteCreditCard) | **DELETE** /me/creditcards/{creditcardID} | 
[**get**](MeApi.md#get) | **GET** /me | 
[**getAddress**](MeApi.md#getAddress) | **GET** /me/addresses/{addressID} | 
[**getCreditCard**](MeApi.md#getCreditCard) | **GET** /me/creditcards/{creditcardID} | 
[**getOrder**](MeApi.md#getOrder) | **GET** /me/orders/{orderID} | 
[**getProduct**](MeApi.md#getProduct) | **GET** /me/products/{productID} | 
[**getPromotion**](MeApi.md#getPromotion) | **GET** /me/promotions/{promotionID} | 
[**getSpec**](MeApi.md#getSpec) | **GET** /me/products/{productID}/specs/{specID} | 
[**listAddresses**](MeApi.md#listAddresses) | **GET** /me/addresses | 
[**listCategories**](MeApi.md#listCategories) | **GET** /me/categories | 
[**listCostCenters**](MeApi.md#listCostCenters) | **GET** /me/costcenters | 
[**listCreditCards**](MeApi.md#listCreditCards) | **GET** /me/creditcards | 
[**listIncomingOrders**](MeApi.md#listIncomingOrders) | **GET** /me/orders/incoming | 
[**listOutgoingOrders**](MeApi.md#listOutgoingOrders) | **GET** /me/orders/outgoing | 
[**listProducts**](MeApi.md#listProducts) | **GET** /me/products | 
[**listPromotions**](MeApi.md#listPromotions) | **GET** /me/promotions | 
[**listSpecs**](MeApi.md#listSpecs) | **GET** /me/products/{productID}/specs | 
[**listSubcategories**](MeApi.md#listSubcategories) | **GET** /me/categories/{parentID}/categories | 
[**listUserGroups**](MeApi.md#listUserGroups) | **GET** /me/usergroups | 
[**patch**](MeApi.md#patch) | **PATCH** /me | 
[**patchAddress**](MeApi.md#patchAddress) | **PATCH** /me/addresses/{addressID} | 
[**patchCreditCard**](MeApi.md#patchCreditCard) | **PATCH** /me/creditcards/{creditcardID} | 
[**update**](MeApi.md#update) | **PUT** /me | 
[**updateAddress**](MeApi.md#updateAddress) | **PUT** /me/addresses/{addressID} | 
[**updateCreditCard**](MeApi.md#updateCreditCard) | **PUT** /me/creditcards/{creditcardID} | 


<a name="createAddress"></a>
# **createAddress**
> Object createAddress(address)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
BuyerAddress address = new BuyerAddress(); // BuyerAddress | 
try {
    Object result = apiInstance.createAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#createAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**BuyerAddress**](BuyerAddress.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createCreditCard"></a>
# **createCreditCard**
> Object createCreditCard(creditCard)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
BuyerCreditCard creditCard = new BuyerCreditCard(); // BuyerCreditCard | 
try {
    Object result = apiInstance.createCreditCard(creditCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#createCreditCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAddress"></a>
# **deleteAddress**
> deleteAddress(addressID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String addressID = "addressID_example"; // String | ID of the address.
try {
    apiInstance.deleteAddress(addressID);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#deleteAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **String**| ID of the address. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCreditCard"></a>
# **deleteCreditCard**
> deleteCreditCard(creditcardID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String creditcardID = "creditcardID_example"; // String | ID of the creditcard.
try {
    apiInstance.deleteCreditCard(creditcardID);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#deleteCreditCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **String**| ID of the creditcard. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get()



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
try {
    Object result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAddress"></a>
# **getAddress**
> Object getAddress(addressID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String addressID = "addressID_example"; // String | ID of the address.
try {
    Object result = apiInstance.getAddress(addressID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **String**| ID of the address. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreditCard"></a>
# **getCreditCard**
> Object getCreditCard(creditcardID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String creditcardID = "creditcardID_example"; // String | ID of the creditcard.
try {
    Object result = apiInstance.getCreditCard(creditcardID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getCreditCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **String**| ID of the creditcard. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrder"></a>
# **getOrder**
> Object getOrder(orderID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String orderID = "orderID_example"; // String | ID of the order.
try {
    Object result = apiInstance.getOrder(orderID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**| ID of the order. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProduct"></a>
# **getProduct**
> Object getProduct(productID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String productID = "productID_example"; // String | ID of the product.
try {
    Object result = apiInstance.getProduct(productID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **String**| ID of the product. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPromotion"></a>
# **getPromotion**
> Object getPromotion(promotionID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
try {
    Object result = apiInstance.getPromotion(promotionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getPromotion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **String**| ID of the promotion. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSpec"></a>
# **getSpec**
> Object getSpec(productID, specID)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String productID = "productID_example"; // String | ID of the product.
String specID = "specID_example"; // String | ID of the spec.
try {
    Object result = apiInstance.getSpec(productID, specID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#getSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **String**| ID of the product. |
 **specID** | **String**| ID of the spec. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listAddresses"></a>
# **listAddresses**
> Object listAddresses(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAddresses(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listAddresses");
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

<a name="listCategories"></a>
# **listCategories**
> Object listCategories(depth, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String depth = "depth_example"; // String | Depth of the category.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listCategories(depth, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="listCostCenters"></a>
# **listCostCenters**
> Object listCostCenters(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listCostCenters(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listCostCenters");
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

<a name="listCreditCards"></a>
# **listCreditCards**
> Object listCreditCards(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listCreditCards(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listCreditCards");
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

<a name="listIncomingOrders"></a>
# **listIncomingOrders**
> Object listIncomingOrders(from, to, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String from = "from_example"; // String | Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).
String to = "to_example"; // String | Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listIncomingOrders(from, to, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listIncomingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
 **to** | **String**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
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

<a name="listOutgoingOrders"></a>
# **listOutgoingOrders**
> Object listOutgoingOrders(from, to, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String from = "from_example"; // String | Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).
String to = "to_example"; // String | Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listOutgoingOrders(from, to, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listOutgoingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
 **to** | **String**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional]
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

<a name="listProducts"></a>
# **listProducts**
> Object listProducts(categoryID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String categoryID = "categoryID_example"; // String | ID of the category.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listProducts(categoryID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryID** | **String**| ID of the category. | [optional]
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
> Object listPromotions(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listPromotions(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listPromotions");
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

<a name="listSpecs"></a>
# **listSpecs**
> Object listSpecs(productID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String productID = "productID_example"; // String | ID of the product.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listSpecs(productID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listSpecs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **String**| ID of the product. |
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

<a name="listSubcategories"></a>
# **listSubcategories**
> Object listSubcategories(parentID, depth, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String parentID = "parentID_example"; // String | ID of the parent.
String depth = "depth_example"; // String | Depth of the category.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listSubcategories(parentID, depth, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listSubcategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentID** | **String**| ID of the parent. |
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

<a name="listUserGroups"></a>
# **listUserGroups**
> Object listUserGroups(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listUserGroups(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#listUserGroups");
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

<a name="patch"></a>
# **patch**
> Object patch(user)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
User user = new User(); // User | 
try {
    Object result = apiInstance.patch(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchAddress"></a>
# **patchAddress**
> patchAddress(addressID, address)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String addressID = "addressID_example"; // String | ID of the address.
BuyerAddress address = new BuyerAddress(); // BuyerAddress | 
try {
    apiInstance.patchAddress(addressID, address);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#patchAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **String**| ID of the address. |
 **address** | [**BuyerAddress**](BuyerAddress.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchCreditCard"></a>
# **patchCreditCard**
> patchCreditCard(creditcardID, creditCard)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String creditcardID = "creditcardID_example"; // String | ID of the creditcard.
BuyerCreditCard creditCard = new BuyerCreditCard(); // BuyerCreditCard | 
try {
    apiInstance.patchCreditCard(creditcardID, creditCard);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#patchCreditCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **String**| ID of the creditcard. |
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(user)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
User user = new User(); // User | 
try {
    Object result = apiInstance.update(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAddress"></a>
# **updateAddress**
> Object updateAddress(addressID, address)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String addressID = "addressID_example"; // String | ID of the address.
BuyerAddress address = new BuyerAddress(); // BuyerAddress | 
try {
    Object result = apiInstance.updateAddress(addressID, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#updateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **String**| ID of the address. |
 **address** | [**BuyerAddress**](BuyerAddress.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCreditCard"></a>
# **updateCreditCard**
> Object updateCreditCard(creditcardID, creditCard)



### Example
```java
// Import classes:
//import io.swagger.client.api.MeApi;

MeApi apiInstance = new MeApi();
String creditcardID = "creditcardID_example"; // String | ID of the creditcard.
BuyerCreditCard creditCard = new BuyerCreditCard(); // BuyerCreditCard | 
try {
    Object result = apiInstance.updateCreditCard(creditcardID, creditCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeApi#updateCreditCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **String**| ID of the creditcard. |
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

