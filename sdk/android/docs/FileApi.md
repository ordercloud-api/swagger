# FileApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](FileApi.md#get) | **GET** /files/{fileID} | 
[**list**](FileApi.md#list) | **GET** /files | 
[**postFileData**](FileApi.md#postFileData) | **POST** /files | 


<a name="get"></a>
# **get**
> Object get(fileID)



### Example
```java
// Import classes:
//import io.swagger.client.api.FileApi;

FileApi apiInstance = new FileApi();
String fileID = "fileID_example"; // String | ID of the file.
try {
    Object result = apiInstance.get(fileID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| ID of the file. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.api.FileApi;

FileApi apiInstance = new FileApi();
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page of results to return. Default: 1 | [optional]
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postFileData"></a>
# **postFileData**
> Object postFileData(filename)



### Example
```java
// Import classes:
//import io.swagger.client.api.FileApi;

FileApi apiInstance = new FileApi();
String filename = "filename_example"; // String | Filename of the file.
try {
    Object result = apiInstance.postFileData(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#postFileData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| Filename of the file. | [optional]

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

