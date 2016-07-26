# PasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetPassword**](PasswordResetApi.md#resetPassword) | **PUT** /password/reset/{verificationCode} | 
[**sendVerificationCode**](PasswordResetApi.md#sendVerificationCode) | **POST** /password/reset | 


<a name="resetPassword"></a>
# **resetPassword**
> resetPassword(verificationCode, passwordReset)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PasswordResetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PasswordResetApi apiInstance = new PasswordResetApi();
String verificationCode = "verificationCode_example"; // String | Verification code of the forgotten password.
PasswordReset passwordReset = new PasswordReset(); // PasswordReset | 
try {
    apiInstance.resetPassword(verificationCode, passwordReset);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordResetApi#resetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationCode** | **String**| Verification code of the forgotten password. |
 **passwordReset** | [**PasswordReset**](PasswordReset.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendVerificationCode"></a>
# **sendVerificationCode**
> sendVerificationCode(passwordResetRequest)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PasswordResetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

PasswordResetApi apiInstance = new PasswordResetApi();
PasswordResetRequest passwordResetRequest = new PasswordResetRequest(); // PasswordResetRequest | 
try {
    apiInstance.sendVerificationCode(passwordResetRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling PasswordResetApi#sendVerificationCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordResetRequest** | [**PasswordResetRequest**](PasswordResetRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

