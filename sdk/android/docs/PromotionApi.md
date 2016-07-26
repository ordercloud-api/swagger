# PromotionApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PromotionApi.md#create) | **POST** /promotions | 
[**delete**](PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**deleteAssignment**](PromotionApi.md#deleteAssignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**get**](PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**list**](PromotionApi.md#list) | **GET** /promotions | 
[**listAssignments**](PromotionApi.md#listAssignments) | **GET** /promotions/assignments | 
[**patch**](PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**saveAssignment**](PromotionApi.md#saveAssignment) | **POST** /promotions/assignments | 
[**update**](PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


<a name="create"></a>
# **create**
> Object create(promo)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
Promotion promo = new Promotion(); // Promotion | 
try {
    Object result = apiInstance.create(promo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**Promotion**](Promotion.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(promotionID)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
try {
    apiInstance.delete(promotionID);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **String**| ID of the promotion. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAssignment"></a>
# **deleteAssignment**
> deleteAssignment(promotionID, buyerID, userID, userGroupID)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
String buyerID = "buyerID_example"; // String | ID of the buyer.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
try {
    apiInstance.deleteAssignment(promotionID, buyerID, userID, userGroupID);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#deleteAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **String**| ID of the promotion. |
 **buyerID** | **String**| ID of the buyer. |
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
> Object get(promotionID)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
try {
    Object result = apiInstance.get(promotionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#get");
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

<a name="list"></a>
# **list**
> Object list(search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#list");
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

<a name="listAssignments"></a>
# **listAssignments**
> Object listAssignments(buyerID, promotionID, userID, userGroupID, level, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String promotionID = "promotionID_example"; // String | ID of the promotion.
String userID = "userID_example"; // String | ID of the user.
String userGroupID = "userGroupID_example"; // String | ID of the user group.
String level = "level_example"; // String | Level of the promotion.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.listAssignments(buyerID, promotionID, userID, userGroupID, level, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#listAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **promotionID** | **String**| ID of the promotion. | [optional]
 **userID** | **String**| ID of the user. | [optional]
 **userGroupID** | **String**| ID of the user group. | [optional]
 **level** | **String**| Level of the promotion. | [optional]
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
> Object patch(promotionID, partialPromotion)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
Promotion partialPromotion = new Promotion(); // Promotion | 
try {
    Object result = apiInstance.patch(promotionID, partialPromotion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **String**| ID of the promotion. |
 **partialPromotion** | [**Promotion**](Promotion.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="saveAssignment"></a>
# **saveAssignment**
> saveAssignment(assignment)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
PromotionAssignment assignment = new PromotionAssignment(); // PromotionAssignment | 
try {
    apiInstance.saveAssignment(assignment);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#saveAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**PromotionAssignment**](PromotionAssignment.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(promotionID, promo)



### Example
```java
// Import classes:
//import io.swagger.client.api.PromotionApi;

PromotionApi apiInstance = new PromotionApi();
String promotionID = "promotionID_example"; // String | ID of the promotion.
Promotion promo = new Promotion(); // Promotion | 
try {
    Object result = apiInstance.update(promotionID, promo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **String**| ID of the promotion. |
 **promo** | [**Promotion**](Promotion.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

