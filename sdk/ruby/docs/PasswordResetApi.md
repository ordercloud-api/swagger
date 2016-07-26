# SwaggerClient::PasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_password**](PasswordResetApi.md#reset_password) | **PUT** /password/reset/{verificationCode} | 
[**send_verification_code**](PasswordResetApi.md#send_verification_code) | **POST** /password/reset | 


# **reset_password**
> reset_password(verification_code, password_reset)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PasswordResetApi.new

verification_code = "verification_code_example" # String | Verification code of the forgotten password.

password_reset = SwaggerClient::PasswordReset.new # PasswordReset | 


begin
  api_instance.reset_password(verification_code, password_reset)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PasswordResetApi->reset_password: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verification_code** | **String**| Verification code of the forgotten password. | 
 **password_reset** | [**PasswordReset**](PasswordReset.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **send_verification_code**
> send_verification_code(password_reset_request)



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure OAuth2 access token for authorization: auth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::PasswordResetApi.new

password_reset_request = SwaggerClient::PasswordResetRequest.new # PasswordResetRequest | 


begin
  api_instance.send_verification_code(password_reset_request)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PasswordResetApi->send_verification_code: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password_reset_request** | [**PasswordResetRequest**](PasswordResetRequest.md)|  | 

### Return type

nil (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



