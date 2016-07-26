# SWGSpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGSpecApi.md#create) | **POST** /specs | 
[**createOption**](SWGSpecApi.md#createoption) | **POST** /specs/{specID}/options | 
[**delete**](SWGSpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**deleteOption**](SWGSpecApi.md#deleteoption) | **DELETE** /specs/{specID}/options/{optionID} | 
[**deleteProductAssignment**](SWGSpecApi.md#deleteproductassignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**get**](SWGSpecApi.md#get) | **GET** /specs/{specID} | 
[**getOption**](SWGSpecApi.md#getoption) | **GET** /specs/{specID}/options/{optionID} | 
[**list**](SWGSpecApi.md#list) | **GET** /specs | 
[**listOptions**](SWGSpecApi.md#listoptions) | **GET** /specs/{specID}/options | 
[**listProductAssignments**](SWGSpecApi.md#listproductassignments) | **GET** /specs/productassignments | 
[**patch**](SWGSpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**patchOption**](SWGSpecApi.md#patchoption) | **PATCH** /specs/{specID}/options/{optionID} | 
[**saveProductAssignment**](SWGSpecApi.md#saveproductassignment) | **POST** /specs/productassignments | 
[**update**](SWGSpecApi.md#update) | **PUT** /specs/{specID} | 
[**updateOption**](SWGSpecApi.md#updateoption) | **PUT** /specs/{specID}/options/{optionID} | 


# **create**
```objc
-(NSNumber*) createWithSpec: (SWGSpec*) spec
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGSpec* spec = [[SWGSpec alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance createWithSpec:spec
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**SWGSpec***](SWGSpec*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createOption**
```objc
-(NSNumber*) createOptionWithSpecID: (NSString*) specID
    option: (SWGSpecOption*) option
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
SWGSpecOption* option = [[SWGSpecOption alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance createOptionWithSpecID:specID
              option:option
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->createOption: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **option** | [**SWGSpecOption***](SWGSpecOption*.md)|  | 

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
-(NSNumber*) deleteWithSpecID: (NSString*) specID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance deleteWithSpecID:specID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteOption**
```objc
-(NSNumber*) deleteOptionWithSpecID: (NSString*) specID
    optionID: (NSString*) optionID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
NSString* optionID = @"optionID_example"; // ID of the option.

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance deleteOptionWithSpecID:specID
              optionID:optionID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->deleteOption: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **optionID** | **NSString***| ID of the option. | 

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
-(NSNumber*) deleteProductAssignmentWithSpecID: (NSString*) specID
    productID: (NSString*) productID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
NSString* productID = @"productID_example"; // ID of the product.

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance deleteProductAssignmentWithSpecID:specID
              productID:productID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->deleteProductAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
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
-(NSNumber*) getWithSpecID: (NSString*) specID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance getWithSpecID:specID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOption**
```objc
-(NSNumber*) getOptionWithSpecID: (NSString*) specID
    optionID: (NSString*) optionID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
NSString* optionID = @"optionID_example"; // ID of the option.

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance getOptionWithSpecID:specID
              optionID:optionID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->getOption: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **optionID** | **NSString***| ID of the option. | 

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

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

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
                            NSLog(@"Error calling SWGSpecApi->list: %@", error);
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

# **listOptions**
```objc
-(NSNumber*) listOptionsWithSpecID: (NSString*) specID
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


NSString* specID = @"specID_example"; // ID of the spec.
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance listOptionsWithSpecID:specID
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
                            NSLog(@"Error calling SWGSpecApi->listOptions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
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

# **listProductAssignments**
```objc
-(NSNumber*) listProductAssignmentsWithSpecID: (NSString*) specID
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


NSString* specID = @"specID_example"; // ID of the spec. (optional)
NSString* productID = @"productID_example"; // ID of the product. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance listProductAssignmentsWithSpecID:specID
              productID:productID
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->listProductAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | [optional] 
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
-(NSNumber*) patchWithSpecID: (NSString*) specID
    spec: (SWGSpec*) spec
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
SWGSpec* spec = [[SWGSpec alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance patchWithSpecID:specID
              spec:spec
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **spec** | [**SWGSpec***](SWGSpec*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchOption**
```objc
-(NSNumber*) patchOptionWithSpecID: (NSString*) specID
    optionID: (NSString*) optionID
    option: (SWGSpecOption*) option
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
NSString* optionID = @"optionID_example"; // ID of the option.
SWGSpecOption* option = [[SWGSpecOption alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance patchOptionWithSpecID:specID
              optionID:optionID
              option:option
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->patchOption: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **optionID** | **NSString***| ID of the option. | 
 **option** | [**SWGSpecOption***](SWGSpecOption*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **saveProductAssignment**
```objc
-(NSNumber*) saveProductAssignmentWithProductAssignment: (SWGSpecProductAssignment*) productAssignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGSpecProductAssignment* productAssignment = [[SWGSpecProductAssignment alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance saveProductAssignmentWithProductAssignment:productAssignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->saveProductAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAssignment** | [**SWGSpecProductAssignment***](SWGSpecProductAssignment*.md)|  | 

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
-(NSNumber*) updateWithSpecID: (NSString*) specID
    spec: (SWGSpec*) spec
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
SWGSpec* spec = [[SWGSpec alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance updateWithSpecID:specID
              spec:spec
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **spec** | [**SWGSpec***](SWGSpec*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateOption**
```objc
-(NSNumber*) updateOptionWithSpecID: (NSString*) specID
    optionID: (NSString*) optionID
    option: (SWGSpecOption*) option
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* specID = @"specID_example"; // ID of the spec.
NSString* optionID = @"optionID_example"; // ID of the option.
SWGSpecOption* option = [[SWGSpecOption alloc] init]; // 

SWGSpecApi*apiInstance = [[SWGSpecApi alloc] init];

[apiInstance updateOptionWithSpecID:specID
              optionID:optionID
              option:option
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSpecApi->updateOption: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **NSString***| ID of the spec. | 
 **optionID** | **NSString***| ID of the option. | 
 **option** | [**SWGSpecOption***](SWGSpecOption*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

