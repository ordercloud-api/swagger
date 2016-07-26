# PriceScheduleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PriceScheduleApi.md#create) | **POST** /priceschedules | 
[**delete**](PriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**deletePriceBreak**](PriceScheduleApi.md#deletePriceBreak) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**list**](PriceScheduleApi.md#list) | **GET** /priceschedules | 
[**patch**](PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**savePriceBreak**](PriceScheduleApi.md#savePriceBreak) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


<a name="create"></a>
# **create**
> Object create(priceSchedule)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
PriceSchedule priceSchedule = new PriceSchedule(); // PriceSchedule | 
try {
    Object result = apiInstance.create(priceSchedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(priceScheduleID)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
try {
    apiInstance.delete(priceScheduleID);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePriceBreak"></a>
# **deletePriceBreak**
> deletePriceBreak(priceScheduleID, quantity)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
Integer quantity = 56; // Integer | Quantity of the price schedule.
try {
    apiInstance.deletePriceBreak(priceScheduleID, quantity);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#deletePriceBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |
 **quantity** | **Integer**| Quantity of the price schedule. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(priceScheduleID)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
try {
    Object result = apiInstance.get(priceScheduleID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |

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
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#list");
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
> Object patch(priceScheduleID, priceSchedule)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
PriceSchedule priceSchedule = new PriceSchedule(); // PriceSchedule | 
try {
    Object result = apiInstance.patch(priceScheduleID, priceSchedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="savePriceBreak"></a>
# **savePriceBreak**
> Object savePriceBreak(priceScheduleID, priceBreak)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
PriceBreak priceBreak = new PriceBreak(); // PriceBreak | 
try {
    Object result = apiInstance.savePriceBreak(priceScheduleID, priceBreak);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#savePriceBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |
 **priceBreak** | [**PriceBreak**](PriceBreak.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(priceScheduleID, priceSchedule)



### Example
```java
// Import classes:
//import io.swagger.client.api.PriceScheduleApi;

PriceScheduleApi apiInstance = new PriceScheduleApi();
String priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.
PriceSchedule priceSchedule = new PriceSchedule(); // PriceSchedule | 
try {
    Object result = apiInstance.update(priceScheduleID, priceSchedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PriceScheduleApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. |
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

