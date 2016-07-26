# WWW::SwaggerClient::PasswordResetApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::PasswordResetApi;
```

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_password**](PasswordResetApi.md#reset_password) | **PUT** /password/reset/{verificationCode} | 
[**send_verification_code**](PasswordResetApi.md#send_verification_code) | **POST** /password/reset | 


# **reset_password**
> reset_password(verification_code => $verification_code, password_reset => $password_reset)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PasswordResetApi->new();
my $verification_code = 'verification_code_example'; # string | Verification code of the forgotten password.
my $password_reset = WWW::SwaggerClient::Object::PasswordReset->new(); # PasswordReset | 

eval { 
    $api_instance->reset_password(verification_code => $verification_code, password_reset => $password_reset);
};
if ($@) {
    warn "Exception when calling PasswordResetApi->reset_password: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verification_code** | **string**| Verification code of the forgotten password. | 
 **password_reset** | [**PasswordReset**](PasswordReset.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_verification_code**
> send_verification_code(password_reset_request => $password_reset_request)



### Example 
```perl
use Data::Dumper;

# Configure OAuth2 access token for authorization: auth
$WWW::SwaggerClient::Configuration::access_token = 'YOUR_ACCESS_TOKEN';

my $api_instance = WWW::SwaggerClient::PasswordResetApi->new();
my $password_reset_request = WWW::SwaggerClient::Object::PasswordResetRequest->new(); # PasswordResetRequest | 

eval { 
    $api_instance->send_verification_code(password_reset_request => $password_reset_request);
};
if ($@) {
    warn "Exception when calling PasswordResetApi->send_verification_code: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password_reset_request** | [**PasswordResetRequest**](PasswordResetRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

