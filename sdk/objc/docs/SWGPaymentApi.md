# SWGPaymentApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGPaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
[**createTransaction**](SWGPaymentApi.md#createtransaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
[**delete**](SWGPaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**deleteTransaction**](SWGPaymentApi.md#deletetransaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**get**](SWGPaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**list**](SWGPaymentApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
[**patch**](SWGPaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**patchTransaction**](SWGPaymentApi.md#patchtransaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
[**update**](SWGPaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
[**updateTransaction**](SWGPaymentApi.md#updatetransaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    payment: (SWGPayment*) payment
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
SWGPayment* payment = [[SWGPayment alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              orderID:orderID
              payment:payment
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **payment** | [**SWGPayment***](SWGPayment*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTransaction**
```objc
-(NSNumber*) createTransactionWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    transaction: (SWGPaymentTransaction*) transaction
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
SWGPaymentTransaction* transaction = [[SWGPaymentTransaction alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance createTransactionWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              transaction:transaction
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->createTransaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **transaction** | [**SWGPaymentTransaction***](SWGPaymentTransaction*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
```objc
-(NSNumber*) deleteWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteTransaction**
```objc
-(NSNumber*) deleteTransactionWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    transactionID: (NSString*) transactionID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
NSString* transactionID = @"transactionID_example"; // ID of the transaction.

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance deleteTransactionWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              transactionID:transactionID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->deleteTransaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **transactionID** | **NSString***| ID of the transaction. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
```objc
-(NSNumber*) getWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list**
```objc
-(NSNumber*) listWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    search: (NSString*) search
    searchOn: (NSString*) searchOn
    sortBy: (NSString*) sortBy
    page: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance listWithBuyerID:buyerID
              orderID:orderID
              search:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->list: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **search** | **NSString***| Word or phrase to search for. | [optional] 
 **searchOn** | **NSString***| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **NSString***| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **NSNumber***| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **NSNumber***| Number of results to return per page. Default: 20, max: 100. | [optional] 

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
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    partialPayment: (SWGPayment*) partialPayment
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
SWGPayment* partialPayment = [[SWGPayment alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              partialPayment:partialPayment
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **partialPayment** | [**SWGPayment***](SWGPayment*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchTransaction**
```objc
-(NSNumber*) patchTransactionWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    transactionID: (NSString*) transactionID
    partialTransaction: (SWGPaymentTransaction*) partialTransaction
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
NSString* transactionID = @"transactionID_example"; // ID of the transaction.
SWGPaymentTransaction* partialTransaction = [[SWGPaymentTransaction alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance patchTransactionWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              transactionID:transactionID
              partialTransaction:partialTransaction
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->patchTransaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **transactionID** | **NSString***| ID of the transaction. | 
 **partialTransaction** | [**SWGPaymentTransaction***](SWGPaymentTransaction*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update**
```objc
-(NSNumber*) updateWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    payment: (SWGPayment*) payment
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
SWGPayment* payment = [[SWGPayment alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              payment:payment
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **payment** | [**SWGPayment***](SWGPayment*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateTransaction**
```objc
-(NSNumber*) updateTransactionWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    paymentID: (NSString*) paymentID
    transactionID: (NSString*) transactionID
    transaction: (SWGPaymentTransaction*) transaction
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* paymentID = @"paymentID_example"; // ID of the payment.
NSString* transactionID = @"transactionID_example"; // ID of the transaction.
SWGPaymentTransaction* transaction = [[SWGPaymentTransaction alloc] init]; // 

SWGPaymentApi*apiInstance = [[SWGPaymentApi alloc] init];

[apiInstance updateTransactionWithBuyerID:buyerID
              orderID:orderID
              paymentID:paymentID
              transactionID:transactionID
              transaction:transaction
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPaymentApi->updateTransaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **paymentID** | **NSString***| ID of the payment. | 
 **transactionID** | **NSString***| ID of the transaction. | 
 **transaction** | [**SWGPaymentTransaction***](SWGPaymentTransaction*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

