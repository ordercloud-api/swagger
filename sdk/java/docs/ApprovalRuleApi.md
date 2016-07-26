# ApprovalRuleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ApprovalRuleApi.md#create) | **POST** /buyers/{buyerID}/approvalrules | 
[**delete**](ApprovalRuleApi.md#delete) | **DELETE** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**get**](ApprovalRuleApi.md#get) | **GET** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**list**](ApprovalRuleApi.md#list) | **GET** /buyers/{buyerID}/approvalrules | 
[**patch**](ApprovalRuleApi.md#patch) | **PATCH** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**update**](ApprovalRuleApi.md#update) | **PUT** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 


<a name="create"></a>
# **create**
> Object create(buyerID, approvalRule)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
ApprovalRule approvalRule = new ApprovalRule(); // ApprovalRule | 
try {
    Object result = apiInstance.create(buyerID, approvalRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **approvalRule** | [**ApprovalRule**](ApprovalRule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(buyerID, approvalRuleID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String approvalRuleID = "approvalRuleID_example"; // String | ID of the approval rule.
try {
    apiInstance.delete(buyerID, approvalRuleID);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **approvalRuleID** | **String**| ID of the approval rule. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(buyerID, approvalRuleID)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String approvalRuleID = "approvalRuleID_example"; // String | ID of the approval rule.
try {
    Object result = apiInstance.get(buyerID, approvalRuleID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **approvalRuleID** | **String**| ID of the approval rule. |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(buyerID, search, searchOn, sortBy, page, pageSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String search = "search_example"; // String | Word or phrase to search for.
String searchOn = "searchOn_example"; // String | Comma-delimited list of fields to search on.
String sortBy = "sortBy_example"; // String | Comma-delimited list of fields to sort by.
Integer page = 56; // Integer | Page of results to return. Default: 1
Integer pageSize = 56; // Integer | Number of results to return per page. Default: 20, max: 100.
try {
    Object result = apiInstance.list(buyerID, search, searchOn, sortBy, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
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
> Object patch(buyerID, approvalRuleID, partialApprovalRule)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String approvalRuleID = "approvalRuleID_example"; // String | ID of the approval rule.
ApprovalRule partialApprovalRule = new ApprovalRule(); // ApprovalRule | 
try {
    Object result = apiInstance.patch(buyerID, approvalRuleID, partialApprovalRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **approvalRuleID** | **String**| ID of the approval rule. |
 **partialApprovalRule** | [**ApprovalRule**](ApprovalRule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(buyerID, approvalRuleID, approvalRule)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApprovalRuleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ApprovalRuleApi apiInstance = new ApprovalRuleApi();
String buyerID = "buyerID_example"; // String | ID of the buyer.
String approvalRuleID = "approvalRuleID_example"; // String | ID of the approval rule.
ApprovalRule approvalRule = new ApprovalRule(); // ApprovalRule | 
try {
    Object result = apiInstance.update(buyerID, approvalRuleID, approvalRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalRuleApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. |
 **approvalRuleID** | **String**| ID of the approval rule. |
 **approvalRule** | [**ApprovalRule**](ApprovalRule.md)|  |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

