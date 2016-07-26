# SWGSpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGSpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**delete**](SWGSpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**deleteAssignment**](SWGSpendingAccountApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**get**](SWGSpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**list**](SWGSpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**listAssignments**](SWGSpendingAccountApi.md#listassignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**patch**](SWGSpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**saveAssignment**](SWGSpendingAccountApi.md#saveassignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**update**](SWGSpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    spendingAccount: (SWGSpendingAccount*) spendingAccount
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGSpendingAccount* spendingAccount = [[SWGSpendingAccount alloc] init]; // 

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              spendingAccount:spendingAccount
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccount** | [**SWGSpendingAccount***](SWGSpendingAccount*.md)|  | 

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
    spendingAccountID: (NSString*) spendingAccountID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account.

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | 

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
    spendingAccountID: (NSString*) spendingAccountID
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
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account.
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance deleteAssignmentWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
              userID:userID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->deleteAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | 
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
    spendingAccountID: (NSString*) spendingAccountID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account.

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | 

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

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

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
                            NSLog(@"Error calling SWGSpendingAccountApi->list: %@", error);
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
    spendingAccountID: (NSString*) spendingAccountID
    userID: (NSString*) userID
    userGroupID: (NSString*) userGroupID
    level: (NSString*) level
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
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* level = @"level_example"; // Level of the spending account. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance listAssignmentsWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
              userID:userID
              userGroupID:userGroupID
              level:level
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->listAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **level** | **NSString***| Level of the spending account. | [optional] 
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
    spendingAccountID: (NSString*) spendingAccountID
    spendingAccount: (SWGSpendingAccount*) spendingAccount
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account.
SWGSpendingAccount* spendingAccount = [[SWGSpendingAccount alloc] init]; // 

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
              spendingAccount:spendingAccount
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | 
 **spendingAccount** | [**SWGSpendingAccount***](SWGSpendingAccount*.md)|  | 

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
    assignment: (SWGSpendingAccountAssignment*) assignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGSpendingAccountAssignment* assignment = [[SWGSpendingAccountAssignment alloc] init]; // 

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance saveAssignmentWithBuyerID:buyerID
              assignment:assignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->saveAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **assignment** | [**SWGSpendingAccountAssignment***](SWGSpendingAccountAssignment*.md)|  | 

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
    spendingAccountID: (NSString*) spendingAccountID
    spendingAccount: (SWGSpendingAccount*) spendingAccount
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* spendingAccountID = @"spendingAccountID_example"; // ID of the spending account.
SWGSpendingAccount* spendingAccount = [[SWGSpendingAccount alloc] init]; // 

SWGSpendingAccountApi*apiInstance = [[SWGSpendingAccountApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              spendingAccountID:spendingAccountID
              spendingAccount:spendingAccount
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpendingAccountApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **spendingAccountID** | **NSString***| ID of the spending account. | 
 **spendingAccount** | [**SWGSpendingAccount***](SWGSpendingAccount*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

