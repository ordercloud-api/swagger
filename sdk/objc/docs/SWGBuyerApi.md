# SWGBuyerApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGBuyerApi.md#create) | **POST** /buyers | 
[**delete**](SWGBuyerApi.md#delete) | **DELETE** /buyers/{buyerID} | 
[**get**](SWGBuyerApi.md#get) | **GET** /buyers/{buyerID} | 
[**list**](SWGBuyerApi.md#list) | **GET** /buyers | 
[**update**](SWGBuyerApi.md#update) | **PUT** /buyers/{buyerID} | 


# **create**
```objc
-(NSNumber*) createWithCompany: (SWGBuyer*) company
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGBuyer* company = [[SWGBuyer alloc] init]; // 

SWGBuyerApi*apiInstance = [[SWGBuyerApi alloc] init];

[apiInstance createWithCompany:company
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBuyerApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**SWGBuyer***](SWGBuyer*.md)|  | 

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
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.

SWGBuyerApi*apiInstance = [[SWGBuyerApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGBuyerApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 

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
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.

SWGBuyerApi*apiInstance = [[SWGBuyerApi alloc] init];

[apiInstance getWithBuyerID:buyerID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBuyerApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 

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
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGBuyerApi*apiInstance = [[SWGBuyerApi alloc] init];

[apiInstance listWithSearch:search
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBuyerApi->list: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **NSString***| Word or phrase to search for. | [optional] 
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

# **update**
```objc
-(NSNumber*) updateWithBuyerID: (NSString*) buyerID
    company: (SWGBuyer*) company
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGBuyer* company = [[SWGBuyer alloc] init]; // 

SWGBuyerApi*apiInstance = [[SWGBuyerApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              company:company
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBuyerApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **company** | [**SWGBuyer***](SWGBuyer*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

