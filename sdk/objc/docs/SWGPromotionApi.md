# SWGPromotionApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SWGPromotionApi.md#create) | **POST** /promotions | 
[**delete**](SWGPromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**deleteAssignment**](SWGPromotionApi.md#deleteassignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**get**](SWGPromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**list**](SWGPromotionApi.md#list) | **GET** /promotions | 
[**listAssignments**](SWGPromotionApi.md#listassignments) | **GET** /promotions/assignments | 
[**patch**](SWGPromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**saveAssignment**](SWGPromotionApi.md#saveassignment) | **POST** /promotions/assignments | 
[**update**](SWGPromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


# **create**
```objc
-(NSNumber*) createWithPromo: (SWGPromotion*) promo
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGPromotion* promo = [[SWGPromotion alloc] init]; // 

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance createWithPromo:promo
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->create: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**SWGPromotion***](SWGPromotion*.md)|  | 

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
-(NSNumber*) deleteWithPromotionID: (NSString*) promotionID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance deleteWithPromotionID:promotionID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->delete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **NSString***| ID of the promotion. | 

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
-(NSNumber*) deleteAssignmentWithPromotionID: (NSString*) promotionID
    buyerID: (NSString*) buyerID
    userID: (NSString*) userID
    userGroupID: (NSString*) userGroupID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.
NSString* buyerID = @"buyerID_example"; // ID of the buyer.
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance deleteAssignmentWithPromotionID:promotionID
              buyerID:buyerID
              userID:userID
              userGroupID:userGroupID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->deleteAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **NSString***| ID of the promotion. | 
 **buyerID** | **NSString***| ID of the buyer. | 
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
-(NSNumber*) getWithPromotionID: (NSString*) promotionID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance getWithPromotionID:promotionID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->get: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **NSString***| ID of the promotion. | 

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

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

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
                            NSLog(@"Error calling SWGPromotionApi->list: %@", error);
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
-(NSNumber*) listAssignmentsWithBuyerID: (NSString*) buyerID
    promotionID: (NSString*) promotionID
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
NSString* promotionID = @"promotionID_example"; // ID of the promotion. (optional)
NSString* userID = @"userID_example"; // ID of the user. (optional)
NSString* userGroupID = @"userGroupID_example"; // ID of the user group. (optional)
NSString* level = @"level_example"; // Level of the promotion. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance listAssignmentsWithBuyerID:buyerID
              promotionID:promotionID
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
                            NSLog(@"Error calling SWGPromotionApi->listAssignments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **NSString***| ID of the buyer. | 
 **promotionID** | **NSString***| ID of the promotion. | [optional] 
 **userID** | **NSString***| ID of the user. | [optional] 
 **userGroupID** | **NSString***| ID of the user group. | [optional] 
 **level** | **NSString***| Level of the promotion. | [optional] 
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
-(NSNumber*) patchWithPromotionID: (NSString*) promotionID
    partialPromotion: (SWGPromotion*) partialPromotion
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.
SWGPromotion* partialPromotion = [[SWGPromotion alloc] init]; // 

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance patchWithPromotionID:promotionID
              partialPromotion:partialPromotion
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->patch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **NSString***| ID of the promotion. | 
 **partialPromotion** | [**SWGPromotion***](SWGPromotion*.md)|  | 

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
-(NSNumber*) saveAssignmentWithAssignment: (SWGPromotionAssignment*) assignment
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGPromotionAssignment* assignment = [[SWGPromotionAssignment alloc] init]; // 

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance saveAssignmentWithAssignment:assignment
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->saveAssignment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**SWGPromotionAssignment***](SWGPromotionAssignment*.md)|  | 

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
-(NSNumber*) updateWithPromotionID: (NSString*) promotionID
    promo: (SWGPromotion*) promo
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.
SWGPromotion* promo = [[SWGPromotion alloc] init]; // 

SWGPromotionApi*apiInstance = [[SWGPromotionApi alloc] init];

[apiInstance updateWithPromotionID:promotionID
              promo:promo
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPromotionApi->update: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **NSString***| ID of the promotion. | 
 **promo** | [**SWGPromotion***](SWGPromotion*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

