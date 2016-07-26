# SWGAdminUserApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGAdminUserApi.md#create) | **POST** /adminusers | 
[**delete**](SWGAdminUserApi.md#delete) | **DELETE** /adminusers/{userID} | 
[**get**](SWGAdminUserApi.md#get) | **GET** /adminusers/{userID} | 
[**list**](SWGAdminUserApi.md#list) | **GET** /adminusers | 
[**patch**](SWGAdminUserApi.md#patch) | **PATCH** /adminusers/{userID} | 
[**update**](SWGAdminUserApi.md#update) | **PUT** /adminusers/{userID} | 


# **create**
```objc
-(NSNumber*) createWithUser: (SWGUser*) user
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGUser* user = [[SWGUser alloc] init]; // 

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

[apiInstance createWithUser:user
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAdminUserApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**SWGUser***](SWGUser*.md)|  | 

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
-(NSNumber*) deleteWithUserID: (NSString*) userID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* userID = @"userID_example"; // ID of the user.

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

[apiInstance deleteWithUserID:userID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAdminUserApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **NSString***| ID of the user. | 

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
-(NSNumber*) getWithUserID: (NSString*) userID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* userID = @"userID_example"; // ID of the user.

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

[apiInstance getWithUserID:userID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAdminUserApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **NSString***| ID of the user. | 

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

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

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
                            NSLog(@"Error calling SWGAdminUserApi->list: %@", error);
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
-(NSNumber*) patchWithUserID: (NSString*) userID
    user: (SWGUser*) user
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* userID = @"userID_example"; // ID of the user.
SWGUser* user = [[SWGUser alloc] init]; // 

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

[apiInstance patchWithUserID:userID
              user:user
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAdminUserApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **NSString***| ID of the user. | 
 **user** | [**SWGUser***](SWGUser*.md)|  | 

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
-(NSNumber*) updateWithUserID: (NSString*) userID
    user: (SWGUser*) user
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* userID = @"userID_example"; // ID of the user.
SWGUser* user = [[SWGUser alloc] init]; // 

SWGAdminUserApi*apiInstance = [[SWGAdminUserApi alloc] init];

[apiInstance updateWithUserID:userID
              user:user
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAdminUserApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **NSString***| ID of the user. | 
 **user** | [**SWGUser***](SWGUser*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

