# Swagger\Client\PasswordResetApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetPassword**](PasswordResetApi.md#resetPassword) | **PUT** /password/reset/{verificationCode} | 
[**sendVerificationCode**](PasswordResetApi.md#sendVerificationCode) | **POST** /password/reset | 


# **resetPassword**
> resetPassword($verification_code, $password_reset)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PasswordResetApi();
$verification_code = "verification_code_example"; // string | Verification code of the forgotten password.
$password_reset = new \Swagger\Client\Model\PasswordReset(); // \Swagger\Client\Model\PasswordReset | 

try {
    $api_instance->resetPassword($verification_code, $password_reset);
} catch (Exception $e) {
    echo 'Exception when calling PasswordResetApi->resetPassword: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verification_code** | **string**| Verification code of the forgotten password. |
 **password_reset** | [**\Swagger\Client\Model\PasswordReset**](../Model/\Swagger\Client\Model\PasswordReset.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **sendVerificationCode**
> sendVerificationCode($password_reset_request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: auth
Swagger\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$api_instance = new Swagger\Client\Api\PasswordResetApi();
$password_reset_request = new \Swagger\Client\Model\PasswordResetRequest(); // \Swagger\Client\Model\PasswordResetRequest | 

try {
    $api_instance->sendVerificationCode($password_reset_request);
} catch (Exception $e) {
    echo 'Exception when calling PasswordResetApi->sendVerificationCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password_reset_request** | [**\Swagger\Client\Model\PasswordResetRequest**](../Model/\Swagger\Client\Model\PasswordResetRequest.md)|  |

### Return type

void (empty response body)

### Authorization

[auth](../../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

