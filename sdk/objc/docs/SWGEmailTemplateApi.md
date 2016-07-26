# SWGEmailTemplateApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](SWGEmailTemplateApi.md#get) | **GET** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**patch**](SWGEmailTemplateApi.md#patch) | **PATCH** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**resetToDefault**](SWGEmailTemplateApi.md#resettodefault) | **DELETE** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**update**](SWGEmailTemplateApi.md#update) | **PUT** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 


# **get**
```objc
-(NSNumber*) getWithBuyerID: (NSString*) buyerID
    emailTemplateType: (NSString*) emailTemplateType
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* emailTemplateType = @"emailTemplateType_example"; // Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.

SWGEmailTemplateApi*apiInstance = [[SWGEmailTemplateApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              emailTemplateType:emailTemplateType
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGEmailTemplateApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **emailTemplateType** | **NSString***| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch**
```objc
-(NSNumber*) patchWithBuyerID: (NSString*) buyerID
    emailTemplateType: (NSString*) emailTemplateType
    emailTemplate: (SWGEmailTemplate*) emailTemplate
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* emailTemplateType = @"emailTemplateType_example"; // Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.
SWGEmailTemplate* emailTemplate = [[SWGEmailTemplate alloc] init]; // 

SWGEmailTemplateApi*apiInstance = [[SWGEmailTemplateApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              emailTemplateType:emailTemplateType
              emailTemplate:emailTemplate
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGEmailTemplateApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **emailTemplateType** | **NSString***| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 
 **emailTemplate** | [**SWGEmailTemplate***](SWGEmailTemplate*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resetToDefault**
```objc
-(NSNumber*) resetToDefaultWithBuyerID: (NSString*) buyerID
    emailTemplateType: (NSString*) emailTemplateType
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* emailTemplateType = @"emailTemplateType_example"; // Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.

SWGEmailTemplateApi*apiInstance = [[SWGEmailTemplateApi alloc] init];

[apiInstance resetToDefaultWithBuyerID:buyerID
              emailTemplateType:emailTemplateType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGEmailTemplateApi->resetToDefault: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **emailTemplateType** | **NSString***| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
```objc
-(NSNumber*) updateWithBuyerID: (NSString*) buyerID
    emailTemplateType: (NSString*) emailTemplateType
    emailTemplate: (SWGEmailTemplate*) emailTemplate
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* emailTemplateType = @"emailTemplateType_example"; // Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.
SWGEmailTemplate* emailTemplate = [[SWGEmailTemplate alloc] init]; // 

SWGEmailTemplateApi*apiInstance = [[SWGEmailTemplateApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              emailTemplateType:emailTemplateType
              emailTemplate:emailTemplate
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGEmailTemplateApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **emailTemplateType** | **NSString***| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 
 **emailTemplate** | [**SWGEmailTemplate***](SWGEmailTemplate*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

