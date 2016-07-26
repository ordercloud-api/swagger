# SWGPasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetPassword**](SWGPasswordResetApi.md#resetpassword) | **PUT** /password/reset/{verificationCode} | 
[**sendVerificationCode**](SWGPasswordResetApi.md#sendverificationcode) | **POST** /password/reset | 


# **resetPassword**
```objc
-(NSNumber*) resetPasswordWithVerificationCode: (NSString*) verificationCode
    passwordReset: (SWGPasswordReset*) passwordReset
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* verificationCode = @"verificationCode_example"; // Verification code of the forgotten password.
SWGPasswordReset* passwordReset = [[SWGPasswordReset alloc] init]; // 

SWGPasswordResetApi*apiInstance = [[SWGPasswordResetApi alloc] init];

[apiInstance resetPasswordWithVerificationCode:verificationCode
              passwordReset:passwordReset
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPasswordResetApi->resetPassword: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationCode** | **NSString***| Verification code of the forgotten password. | 
 **passwordReset** | [**SWGPasswordReset***](SWGPasswordReset*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendVerificationCode**
```objc
-(NSNumber*) sendVerificationCodeWithPasswordResetRequest: (SWGPasswordResetRequest*) passwordResetRequest
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGPasswordResetRequest* passwordResetRequest = [[SWGPasswordResetRequest alloc] init]; // 

SWGPasswordResetApi*apiInstance = [[SWGPasswordResetApi alloc] init];

[apiInstance sendVerificationCodeWithPasswordResetRequest:passwordResetRequest
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPasswordResetApi->sendVerificationCode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordResetRequest** | [**SWGPasswordResetRequest***](SWGPasswordResetRequest*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

