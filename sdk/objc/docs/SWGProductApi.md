# SWGProductApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGProductApi.md#create) | **POST** /products | 
[**delete**](SWGProductApi.md#delete) | **DELETE** /products/{productID} | 
[**deleteAssignment**](SWGProductApi.md#deleteassignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
[**generateVariants**](SWGProductApi.md#generatevariants) | **POST** /products/{productID}/variants/generate | 
[**get**](SWGProductApi.md#get) | **GET** /products/{productID} | 
[**getInventory**](SWGProductApi.md#getinventory) | **GET** /products/{productID}/inventory | 
[**getVariant**](SWGProductApi.md#getvariant) | **GET** /products/{productID}/variants/{variantID} | 
[**getVariantInventory**](SWGProductApi.md#getvariantinventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
[**list**](SWGProductApi.md#list) | **GET** /products | 
[**listAssignments**](SWGProductApi.md#listassignments) | **GET** /products/assignments | 
[**listInventory**](SWGProductApi.md#listinventory) | **GET** /products/inventory | 
[**listVariantInventory**](SWGProductApi.md#listvariantinventory) | **GET** /products/{productID}/variants/inventory | 
[**listVariants**](SWGProductApi.md#listvariants) | **GET** /products/{productID}/variants | 
[**patch**](SWGProductApi.md#patch) | **PATCH** /products/{productID} | 
[**patchVariant**](SWGProductApi.md#patchvariant) | **PATCH** /products/{productID}/variants/{variantID} | 
[**saveAssignment**](SWGProductApi.md#saveassignment) | **POST** /products/assignments | 
[**update**](SWGProductApi.md#update) | **PUT** /products/{productID} | 
[**updateInventory**](SWGProductApi.md#updateinventory) | **PUT** /products/{productID}/inventory/{inventory} | 
[**updateVariant**](SWGProductApi.md#updatevariant) | **PUT** /products/{productID}/variants/{variantID} | 
[**updateVariantInventory**](SWGProductApi.md#updatevariantinventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 


# **create**
```objc
-(NSNumber*) createWithProduct: (SWGProduct*) product
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGProduct* product = [[SWGProduct alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance createWithProduct:product
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**SWGProduct***](SWGProduct*.md)|  | 

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
-(NSNumber*) deleteWithProductID: (NSString*) productID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance deleteWithProductID:productID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 

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
    productID: (NSString*) productID
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
NSString* productID = @"productID_example"; // ID of the product.
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance deleteAssignmentWithBuyerID:buyerID
              productID:productID
              userID:userID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->deleteAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **productID** | **NSString***| ID of the product. | 
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

# **generateVariants**
```objc
-(NSNumber*) generateVariantsWithProductID: (NSString*) productID
    overwriteExisting: (NSNumber*) overwriteExisting
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSNumber* overwriteExisting = @true; // Overwrite existing of the product. (optional)

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance generateVariantsWithProductID:productID
              overwriteExisting:overwriteExisting
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->generateVariants: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **overwriteExisting** | **NSNumber***| Overwrite existing of the product. | [optional] 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
```objc
-(NSNumber*) getWithProductID: (NSString*) productID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance getWithProductID:productID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInventory**
```objc
-(NSNumber*) getInventoryWithProductID: (NSString*) productID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance getInventoryWithProductID:productID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->getInventory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVariant**
```objc
-(NSNumber*) getVariantWithProductID: (NSString*) productID
    variantID: (NSString*) variantID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* variantID = @"variantID_example"; // ID of the variant.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance getVariantWithProductID:productID
              variantID:variantID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->getVariant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **variantID** | **NSString***| ID of the variant. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVariantInventory**
```objc
-(NSNumber*) getVariantInventoryWithProductID: (NSString*) productID
    variantID: (NSString*) variantID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* variantID = @"variantID_example"; // ID of the variant.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance getVariantInventoryWithProductID:productID
              variantID:variantID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->getVariantInventory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **variantID** | **NSString***| ID of the variant. | 

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

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

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
                            NSLog(@"Error calling SWGProductApi->list: %@", error);
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

# **listAssignments**
```objc
-(NSNumber*) listAssignmentsWithProductID: (NSString*) productID
    buyerID: (NSString*) buyerID
    userID: (NSString*) userID
    userGroupID: (NSString*) userGroupID
    level: (NSString*) level
    priceScheduleID: (NSString*) priceScheduleID
    page: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product. (optional)
NSString* buyerID = @"buyerID_example"; // ID of the buyer. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* level = @"level_example"; // Level of the product. (optional)
NSString* priceScheduleID = @"priceScheduleID_example"; // ID of the price schedule. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance listAssignmentsWithProductID:productID
              buyerID:buyerID
              userID:userID
              userGroupID:userGroupID
              level:level
              priceScheduleID:priceScheduleID
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->listAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | [optional] 
 **buyerID** | **NSString***| ID of the buyer. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **level** | **NSString***| Level of the product. | [optional] 
 **priceScheduleID** | **NSString***| ID of the price schedule. | [optional] 
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

# **listInventory**
```objc
-(NSNumber*) listInventoryWithSearch: (NSString*) search
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

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance listInventoryWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->listInventory: %@", error);
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

# **listVariantInventory**
```objc
-(NSNumber*) listVariantInventoryWithProductID: (NSString*) productID
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


NSString* productID = @"productID_example"; // ID of the product.
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance listVariantInventoryWithProductID:productID
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
                            NSLog(@"Error calling SWGProductApi->listVariantInventory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
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

# **listVariants**
```objc
-(NSNumber*) listVariantsWithProductID: (NSString*) productID
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


NSString* productID = @"productID_example"; // ID of the product.
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance listVariantsWithProductID:productID
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
                            NSLog(@"Error calling SWGProductApi->listVariants: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
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
-(NSNumber*) patchWithProductID: (NSString*) productID
    product: (SWGProduct*) product
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
SWGProduct* product = [[SWGProduct alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance patchWithProductID:productID
              product:product
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **product** | [**SWGProduct***](SWGProduct*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchVariant**
```objc
-(NSNumber*) patchVariantWithProductID: (NSString*) productID
    variantID: (NSString*) variantID
    variant: (SWGVariant*) variant
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* variantID = @"variantID_example"; // ID of the variant.
SWGVariant* variant = [[SWGVariant alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance patchVariantWithProductID:productID
              variantID:variantID
              variant:variant
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->patchVariant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **variantID** | **NSString***| ID of the variant. | 
 **variant** | [**SWGVariant***](SWGVariant*.md)|  | 

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
-(NSNumber*) saveAssignmentWithProductAssignment: (SWGProductAssignment*) productAssignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGProductAssignment* productAssignment = [[SWGProductAssignment alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance saveAssignmentWithProductAssignment:productAssignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->saveAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAssignment** | [**SWGProductAssignment***](SWGProductAssignment*.md)|  | 

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
-(NSNumber*) updateWithProductID: (NSString*) productID
    product: (SWGProduct*) product
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
SWGProduct* product = [[SWGProduct alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance updateWithProductID:productID
              product:product
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **product** | [**SWGProduct***](SWGProduct*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateInventory**
```objc
-(NSNumber*) updateInventoryWithProductID: (NSString*) productID
    inventory: (NSNumber*) inventory
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSNumber* inventory = @56; // Inventory of the product.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance updateInventoryWithProductID:productID
              inventory:inventory
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->updateInventory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **inventory** | **NSNumber***| Inventory of the product. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateVariant**
```objc
-(NSNumber*) updateVariantWithProductID: (NSString*) productID
    variantID: (NSString*) variantID
    variant: (SWGVariant*) variant
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* variantID = @"variantID_example"; // ID of the variant.
SWGVariant* variant = [[SWGVariant alloc] init]; // 

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance updateVariantWithProductID:productID
              variantID:variantID
              variant:variant
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->updateVariant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **variantID** | **NSString***| ID of the variant. | 
 **variant** | [**SWGVariant***](SWGVariant*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateVariantInventory**
```objc
-(NSNumber*) updateVariantInventoryWithProductID: (NSString*) productID
    variantID: (NSString*) variantID
    inventory: (NSNumber*) inventory
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* variantID = @"variantID_example"; // ID of the variant.
NSNumber* inventory = @56; // Inventory of the product.

SWGProductApi*apiInstance = [[SWGProductApi alloc] init];

[apiInstance updateVariantInventoryWithProductID:productID
              variantID:variantID
              inventory:inventory
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGProductApi->updateVariantInventory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **variantID** | **NSString***| ID of the variant. | 
 **inventory** | **NSNumber***| Inventory of the product. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

