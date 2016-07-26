# SWGCategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGCategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**delete**](SWGCategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**deleteAssignment**](SWGCategoryApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**deleteProductAssignment**](SWGCategoryApi.md#deleteproductassignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**get**](SWGCategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**list**](SWGCategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**listAssignments**](SWGCategoryApi.md#listassignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**listChildren**](SWGCategoryApi.md#listchildren) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**listProductAssignments**](SWGCategoryApi.md#listproductassignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**patch**](SWGCategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**saveAssignment**](SWGCategoryApi.md#saveassignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**saveProductAssignment**](SWGCategoryApi.md#saveproductassignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**update**](SWGCategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


# **create**
```objc
-(NSNumber*) createWithBuyerID: (NSString*) buyerID
    category: (SWGCategory*) category
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGCategory* category = [[SWGCategory alloc] init]; // 

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance createWithBuyerID:buyerID
              category:category
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **category** | [**SWGCategory***](SWGCategory*.md)|  | 

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
    categoryID: (NSString*) categoryID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* categoryID = @"categoryID_example"; // ID of the category.

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance deleteWithBuyerID:buyerID
              categoryID:categoryID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 

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
    categoryID: (NSString*) categoryID
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
NSString* categoryID = @"categoryID_example"; // ID of the category.
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance deleteAssignmentWithBuyerID:buyerID
              categoryID:categoryID
              userID:userID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->deleteAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 
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

# **deleteProductAssignment**
```objc
-(NSNumber*) deleteProductAssignmentWithBuyerID: (NSString*) buyerID
    categoryID: (NSString*) categoryID
    productID: (NSString*) productID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* categoryID = @"categoryID_example"; // ID of the category.
NSString* productID = @"productID_example"; // ID of the product.

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance deleteProductAssignmentWithBuyerID:buyerID
              categoryID:categoryID
              productID:productID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->deleteProductAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 
 **productID** | **NSString***| ID of the product. | 

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
    categoryID: (NSString*) categoryID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* categoryID = @"categoryID_example"; // ID of the category.

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance getWithBuyerID:buyerID
              categoryID:categoryID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 

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
    parentID: (NSString*) parentID
    depth: (NSString*) depth
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
NSString* parentID = @"parentID_example"; // ID of the parent. (optional)
NSString* depth = @"depth_example"; // Depth of the category. (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance listWithBuyerID:buyerID
              parentID:parentID
              depth:depth
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
                            NSLog(@"Error calling SWGCategoryApi->list: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **parentID** | **NSString***| ID of the parent. | [optional] 
 **depth** | **NSString***| Depth of the category. | [optional] 
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
    categoryID: (NSString*) categoryID
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
NSString* categoryID = @"categoryID_example"; // ID of the category. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* level = @"level_example"; // Level of the category. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance listAssignmentsWithBuyerID:buyerID
              categoryID:categoryID
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
                            NSLog(@"Error calling SWGCategoryApi->listAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **level** | **NSString***| Level of the category. | [optional] 
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

# **listChildren**
```objc
-(NSNumber*) listChildrenWithBuyerID: (NSString*) buyerID
    parentID: (NSString*) parentID
    search: (NSString*) search
    depth: (NSString*) depth
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
NSString* parentID = @"parentID_example"; // ID of the parent.
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* depth = @"depth_example"; // Depth of the category. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance listChildrenWithBuyerID:buyerID
              parentID:parentID
              search:search
              depth:depth
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->listChildren: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **parentID** | **NSString***| ID of the parent. | 
 **search** | **NSString***| Word or phrase to search for. | [optional] 
 **depth** | **NSString***| Depth of the category. | [optional] 
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

# **listProductAssignments**
```objc
-(NSNumber*) listProductAssignmentsWithBuyerID: (NSString*) buyerID
    categoryID: (NSString*) categoryID
    productID: (NSString*) productID
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
NSString* categoryID = @"categoryID_example"; // ID of the category. (optional)
NSString* productID = @"productID_example"; // ID of the product. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance listProductAssignmentsWithBuyerID:buyerID
              categoryID:categoryID
              productID:productID
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->listProductAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | [optional] 
 **productID** | **NSString***| ID of the product. | [optional] 
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
    categoryID: (NSString*) categoryID
    category: (SWGCategory*) category
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* categoryID = @"categoryID_example"; // ID of the category.
SWGCategory* category = [[SWGCategory alloc] init]; // 

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance patchWithBuyerID:buyerID
              categoryID:categoryID
              category:category
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 
 **category** | [**SWGCategory***](SWGCategory*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **saveAssignment**
```objc
-(NSNumber*) saveAssignmentWithBuyerID: (NSString*) buyerID
    categoryAssignment: (SWGCategoryAssignment*) categoryAssignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGCategoryAssignment* categoryAssignment = [[SWGCategoryAssignment alloc] init]; // 

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance saveAssignmentWithBuyerID:buyerID
              categoryAssignment:categoryAssignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->saveAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryAssignment** | [**SWGCategoryAssignment***](SWGCategoryAssignment*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **saveProductAssignment**
```objc
-(NSNumber*) saveProductAssignmentWithBuyerID: (NSString*) buyerID
    productAssignment: (SWGCategoryProductAssignment*) productAssignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
SWGCategoryProductAssignment* productAssignment = [[SWGCategoryProductAssignment alloc] init]; // 

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance saveProductAssignmentWithBuyerID:buyerID
              productAssignment:productAssignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->saveProductAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **productAssignment** | [**SWGCategoryProductAssignment***](SWGCategoryProductAssignment*.md)|  | 

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
    categoryID: (NSString*) categoryID
    category: (SWGCategory*) category
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* categoryID = @"categoryID_example"; // ID of the category.
SWGCategory* category = [[SWGCategory alloc] init]; // 

SWGCategoryApi*apiInstance = [[SWGCategoryApi alloc] init];

[apiInstance updateWithBuyerID:buyerID
              categoryID:categoryID
              category:category
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoryApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **categoryID** | **NSString***| ID of the category. | 
 **category** | [**SWGCategory***](SWGCategory*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

