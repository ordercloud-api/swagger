# SWGAddressApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGAddressApi.md#create) | **POST** /buyers/{buyerID}/addresses | 
[**delete**](SWGAddressApi.md#delete) | **DELETE** /buyers/{buyerID}/addresses/{addressID} | 
[**deleteAssignment**](SWGAddressApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/addresses/{addressID}/assignments | 
[**get**](SWGAddressApi.md#get) | **GET** /buyers/{buyerID}/addresses/{addressID} | 
[**list**](SWGAddressApi.md#list) | **GET** /buyers/{buyerID}/addresses | 
[**listAssignments**](SWGAddressApi.md#listassignments) | **GET** /buyers/{buyerID}/addresses/assignments | 
[**patch**](SWGAddressApi.md#patch) | **PATCH** /buyers/{buyerID}/addresses/{addressID} | 
[**saveAssignment**](SWGAddressApi.md#saveassignment) | **POST** /buyers/{buyerID}/addresses/assignments | 
[**update**](SWGAddressApi.md#update) | **PUT** /buyers/{buyerID}/addresses/{addressID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    address: (SWGAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGAddress* address = [[SWGAddress alloc] init]; // 

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **address** | [**SWGAddress***](SWGAddress*.md)|  | 

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
    addressID: (NSString*) addressID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* addressID = @"addressID_example"; // ID of the address.

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              addressID:addressID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAssignment**
```objc
-(NSNumber*) deleteAssignmentWithBuyerID: (NSString*) buyerID
    addressID: (NSString*) addressID
    userID: (NSString*) userID
    userGroupID: (NSString*) userGroupID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* addressID = @"addressID_example"; // ID of the address.
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance deleteAssignmentWithBuyerID:buyerID
              addressID:addressID
              userID:userID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->deleteAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 

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
    addressID: (NSString*) addressID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* addressID = @"addressID_example"; // ID of the address.

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              addressID:addressID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | 

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
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance listWithBuyerID:buyerID
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
                            NSLog(@"Error calling SWGAddressApi->list: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
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

# **listAssignments**
```objc
-(NSNumber*) listAssignmentsWithBuyerID: (NSString*) buyerID
    addressID: (NSString*) addressID
    userID: (NSString*) userID
    userGroupID: (NSString*) userGroupID
    level: (NSString*) level
    isShipping: (NSNumber*) isShipping
    isBilling: (NSNumber*) isBilling
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
NSString* addressID = @"addressID_example"; // ID of the address. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* level = @"level_example"; // Level of the address. (optional)
NSNumber* isShipping = @true; // Is shipping of the address. (optional)
NSNumber* isBilling = @true; // Is billing of the address. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance listAssignmentsWithBuyerID:buyerID
              addressID:addressID
              userID:userID
              userGroupID:userGroupID
              level:level
              isShipping:isShipping
              isBilling:isBilling
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->listAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **level** | **NSString***| Level of the address. | [optional] 
 **isShipping** | **NSNumber***| Is shipping of the address. | [optional] 
 **isBilling** | **NSNumber***| Is billing of the address. | [optional] 
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
    addressID: (NSString*) addressID
    address: (SWGAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* addressID = @"addressID_example"; // ID of the address.
SWGAddress* address = [[SWGAddress alloc] init]; // 

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              addressID:addressID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | 
 **address** | [**SWGAddress***](SWGAddress*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **saveAssignment**
```objc
-(NSNumber*) saveAssignmentWithBuyerID: (NSString*) buyerID
    assignment: (SWGAddressAssignment*) assignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGAddressAssignment* assignment = [[SWGAddressAssignment alloc] init]; // 

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance saveAssignmentWithBuyerID:buyerID
              assignment:assignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->saveAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **assignment** | [**SWGAddressAssignment***](SWGAddressAssignment*.md)|  | 

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
    addressID: (NSString*) addressID
    address: (SWGAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* addressID = @"addressID_example"; // ID of the address.
SWGAddress* address = [[SWGAddress alloc] init]; // 

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              addressID:addressID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **addressID** | **NSString***| ID of the address. | 
 **address** | [**SWGAddress***](SWGAddress*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

