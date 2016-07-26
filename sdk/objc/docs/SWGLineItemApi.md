# SWGLineItemApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGLineItemApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**delete**](SWGLineItemApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**get**](SWGLineItemApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**list**](SWGLineItemApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**patch**](SWGLineItemApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**patchShippingAddress**](SWGLineItemApi.md#patchshippingaddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**setShippingAddress**](SWGLineItemApi.md#setshippingaddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**update**](SWGLineItemApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    lineItem: (SWGLineItem*) lineItem
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
SWGLineItem* lineItem = [[SWGLineItem alloc] init]; // 

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              orderID:orderID
              lineItem:lineItem
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItem** | [**SWGLineItem***](SWGLineItem*.md)|  | 

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
    lineItemID: (NSString*) lineItemID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 

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
    lineItemID: (NSString*) lineItemID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 

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

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

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
                            NSLog(@"Error calling SWGLineItemApi->list: %@", error);
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
    lineItemID: (NSString*) lineItemID
    partialLineItem: (SWGLineItem*) partialLineItem
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.
SWGLineItem* partialLineItem = [[SWGLineItem alloc] init]; // 

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
              partialLineItem:partialLineItem
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 
 **partialLineItem** | [**SWGLineItem***](SWGLineItem*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchShippingAddress**
```objc
-(NSNumber*) patchShippingAddressWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    lineItemID: (NSString*) lineItemID
    address: (SWGAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.
SWGAddress* address = [[SWGAddress alloc] init]; // 

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance patchShippingAddressWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->patchShippingAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 
 **address** | [**SWGAddress***](SWGAddress*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **setShippingAddress**
```objc
-(NSNumber*) setShippingAddressWithBuyerID: (NSString*) buyerID
    orderID: (NSString*) orderID
    lineItemID: (NSString*) lineItemID
    address: (SWGAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.
SWGAddress* address = [[SWGAddress alloc] init]; // 

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance setShippingAddressWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->setShippingAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 
 **address** | [**SWGAddress***](SWGAddress*.md)|  | 

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
    lineItemID: (NSString*) lineItemID
    lineItem: (SWGLineItem*) lineItem
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* orderID = @"orderID_example"; // ID of the order.
NSString* lineItemID = @"lineItemID_example"; // ID of the line item.
SWGLineItem* lineItem = [[SWGLineItem alloc] init]; // 

SWGLineItemApi*apiInstance = [[SWGLineItemApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              orderID:orderID
              lineItemID:lineItemID
              lineItem:lineItem
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLineItemApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **orderID** | **NSString***| ID of the order. | 
 **lineItemID** | **NSString***| ID of the line item. | 
 **lineItem** | [**SWGLineItem***](SWGLineItem*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

