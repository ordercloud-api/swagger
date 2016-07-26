# SWGPriceScheduleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGPriceScheduleApi.md#create) | **POST** /priceschedules | 
[**delete**](SWGPriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**deletePriceBreak**](SWGPriceScheduleApi.md#deletepricebreak) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](SWGPriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**list**](SWGPriceScheduleApi.md#list) | **GET** /priceschedules | 
[**patch**](SWGPriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**savePriceBreak**](SWGPriceScheduleApi.md#savepricebreak) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](SWGPriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


# **create**
```objc
-(NSNumber*) createWithPriceSchedule: (SWGPriceSchedule*) priceSchedule
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGPriceSchedule* priceSchedule = [[SWGPriceSchedule alloc] init]; // 

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance createWithPriceSchedule:priceSchedule
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceSchedule** | [**SWGPriceSchedule***](SWGPriceSchedule*.md)|  | 

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
-(NSNumber*) deleteWithPriceScheduleID: (NSString*) priceScheduleID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance deleteWithPriceScheduleID:priceScheduleID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deletePriceBreak**
```objc
-(NSNumber*) deletePriceBreakWithPriceScheduleID: (NSString*) priceScheduleID
    quantity: (NSNumber*) quantity
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.
NSNumber* quantity = @56; // Quantity of the price schedule.

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance deletePriceBreakWithPriceScheduleID:priceScheduleID
              quantity:quantity
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->deletePriceBreak: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 
 **quantity** | **NSNumber***| Quantity of the price schedule. | 

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
-(NSNumber*) getWithPriceScheduleID: (NSString*) priceScheduleID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance getWithPriceScheduleID:priceScheduleID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 

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
-(NSNumber*) listWithSearch: (NSString*) search
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


NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance listWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->list: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
-(NSNumber*) patchWithPriceScheduleID: (NSString*) priceScheduleID
    priceSchedule: (SWGPriceSchedule*) priceSchedule
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.
SWGPriceSchedule* priceSchedule = [[SWGPriceSchedule alloc] init]; // 

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance patchWithPriceScheduleID:priceScheduleID
              priceSchedule:priceSchedule
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 
 **priceSchedule** | [**SWGPriceSchedule***](SWGPriceSchedule*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **savePriceBreak**
```objc
-(NSNumber*) savePriceBreakWithPriceScheduleID: (NSString*) priceScheduleID
    priceBreak: (SWGPriceBreak*) priceBreak
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.
SWGPriceBreak* priceBreak = [[SWGPriceBreak alloc] init]; // 

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance savePriceBreakWithPriceScheduleID:priceScheduleID
              priceBreak:priceBreak
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->savePriceBreak: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 
 **priceBreak** | [**SWGPriceBreak***](SWGPriceBreak*.md)|  | 

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
-(NSNumber*) updateWithPriceScheduleID: (NSString*) priceScheduleID
    priceSchedule: (SWGPriceSchedule*) priceSchedule
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule.
SWGPriceSchedule* priceSchedule = [[SWGPriceSchedule alloc] init]; // 

SWGPriceScheduleApi*apiInstance = [[SWGPriceScheduleApi alloc] init];

[apiInstance updateWithPriceScheduleID:priceScheduleID
              priceSchedule:priceSchedule
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPriceScheduleApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **NSString***| ID of the price schedule. | 
 **priceSchedule** | [**SWGPriceSchedule***](SWGPriceSchedule*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

