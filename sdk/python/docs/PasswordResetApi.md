# OrderCloud.PasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_password**](PasswordResetApi.md#reset_password) | **PUT** /password/reset/{verificationCode} | 
[**send_verification_code**](PasswordResetApi.md#send_verification_code) | **POST** /password/reset | 


# **reset_password**
> reset_password(verification_code, password_reset)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PasswordResetApi = OrderCloud.PasswordResetApi()
verification_code = 'verification_code_example' # str | Verification code of the forgotten password.
password_reset = OrderCloud.PasswordReset() # PasswordReset | 

try: 
    PasswordResetApi.reset_password(verification_code, password_reset)
except ApiException as e:
    print("Exception when calling PasswordResetApi->reset_password: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verification_code** | **str**| Verification code of the forgotten password. | 
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
> send_verification_code(password_reset_request)



### Example 
```python
import OrderCloud as oc
from OrderCloud.rest import ApiException
# Assuming you've already acquired and set an acess_token (see the Getting Started guide)

# create an instance of the API class
PasswordResetApi = OrderCloud.PasswordResetApi()
password_reset_request = OrderCloud.PasswordResetRequest() # PasswordResetRequest | 

try: 
    PasswordResetApi.send_verification_code(password_reset_request)
except ApiException as e:
    print("Exception when calling PasswordResetApi->send_verification_code: %s\n" % e)
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

