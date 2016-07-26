# OrderCloud.Api.PasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ResetPassword**](PasswordResetApi.md#resetpassword) | **PUT** /password/reset/{verificationCode} | 
[**SendVerificationCode**](PasswordResetApi.md#sendverificationcode) | **POST** /password/reset | 


<a name="resetpassword"></a>
# **ResetPassword**
> void ResetPassword (string verificationCode, PasswordReset passwordReset)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ResetPasswordExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PasswordResetApi();
            var verificationCode = verificationCode_example;  // string | Verification code of the forgotten password.
            var passwordReset = new PasswordReset(); // PasswordReset | 

            try
            {
                apiInstance.ResetPassword(verificationCode, passwordReset);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PasswordResetApi.ResetPassword: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationCode** | **string**| Verification code of the forgotten password. | 
 **passwordReset** | [**PasswordReset**](PasswordReset.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="sendverificationcode"></a>
# **SendVerificationCode**
> void SendVerificationCode (PasswordResetRequest passwordResetRequest)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SendVerificationCodeExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PasswordResetApi();
            var passwordResetRequest = new PasswordResetRequest(); // PasswordResetRequest | 

            try
            {
                apiInstance.SendVerificationCode(passwordResetRequest);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PasswordResetApi.SendVerificationCode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordResetRequest** | [**PasswordResetRequest**](PasswordResetRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

