# SWGUserGroupApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGUserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
[**delete**](SWGUserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**deleteUserAssignment**](SWGUserGroupApi.md#deleteuserassignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**get**](SWGUserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**list**](SWGUserGroupApi.md#list) | **GET** /buyers/{buyerID}/usergroups | 
[**listUserAssignments**](SWGUserGroupApi.md#listuserassignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
[**patch**](SWGUserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**saveUserAssignment**](SWGUserGroupApi.md#saveuserassignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
[**update**](SWGUserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    group: (SWGUserGroup*) group
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGUserGroup* group = [[SWGUserGroup alloc] init]; // 

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              group:group
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **group** | [**SWGUserGroup***](SWGUserGroup*.md)|  | 

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
    userGroupID: (NSString*) userGroupID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userGroupID = @"userGroupID_example"; // ID of the user group.

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteUserAssignment**
```objc
-(NSNumber*) deleteUserAssignmentWithBuyerID: (NSString*) buyerID
    userGroupID: (NSString*) userGroupID
    userID: (NSString*) userID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userGroupID = @"userGroupID_example"; // ID of the user group.
NSString* userID = @"userID_example"; // ID of the user.

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance deleteUserAssignmentWithBuyerID:buyerID
              userGroupID:userGroupID
              userID:userID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->deleteUserAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | 
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
-(NSNumber*) getWithBuyerID: (NSString*) buyerID
    userGroupID: (NSString*) userGroupID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userGroupID = @"userGroupID_example"; // ID of the user group.

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              userGroupID:userGroupID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | 

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

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

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
                            NSLog(@"Error calling SWGUserGroupApi->list: %@", error);
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

# **listUserAssignments**
```objc
-(NSNumber*) listUserAssignmentsWithBuyerID: (NSString*) buyerID
    userGroupID: (NSString*) userGroupID
    userID: (NSString*) userID
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
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance listUserAssignmentsWithBuyerID:buyerID
              userGroupID:userGroupID
              userID:userID
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->listUserAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
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
    userGroupID: (NSString*) userGroupID
    group: (SWGUserGroup*) group
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userGroupID = @"userGroupID_example"; // ID of the user group.
SWGUserGroup* group = [[SWGUserGroup alloc] init]; // 

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              userGroupID:userGroupID
              group:group
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | 
 **group** | [**SWGUserGroup***](SWGUserGroup*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **saveUserAssignment**
```objc
-(NSNumber*) saveUserAssignmentWithBuyerID: (NSString*) buyerID
    userGroupAssignment: (SWGUserGroupAssignment*) userGroupAssignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGUserGroupAssignment* userGroupAssignment = [[SWGUserGroupAssignment alloc] init]; // 

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance saveUserAssignmentWithBuyerID:buyerID
              userGroupAssignment:userGroupAssignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->saveUserAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupAssignment** | [**SWGUserGroupAssignment***](SWGUserGroupAssignment*.md)|  | 

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
    userGroupID: (NSString*) userGroupID
    group: (SWGUserGroup*) group
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userGroupID = @"userGroupID_example"; // ID of the user group.
SWGUserGroup* group = [[SWGUserGroup alloc] init]; // 

SWGUserGroupApi*apiInstance = [[SWGUserGroupApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              userGroupID:userGroupID
              group:group
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUserGroupApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **userGroupID** | **NSString***| ID of the user group. | 
 **group** | [**SWGUserGroup***](SWGUserGroup*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

