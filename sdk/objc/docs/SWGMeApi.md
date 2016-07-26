# SWGMeApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddress**](SWGMeApi.md#createaddress) | **POST** /me/addresses | 
[**createCreditCard**](SWGMeApi.md#createcreditcard) | **POST** /me/creditcards | 
[**deleteAddress**](SWGMeApi.md#deleteaddress) | **DELETE** /me/addresses/{addressID} | 
[**deleteCreditCard**](SWGMeApi.md#deletecreditcard) | **DELETE** /me/creditcards/{creditcardID} | 
[**get**](SWGMeApi.md#get) | **GET** /me | 
[**getAddress**](SWGMeApi.md#getaddress) | **GET** /me/addresses/{addressID} | 
[**getCreditCard**](SWGMeApi.md#getcreditcard) | **GET** /me/creditcards/{creditcardID} | 
[**getOrder**](SWGMeApi.md#getorder) | **GET** /me/orders/{orderID} | 
[**getProduct**](SWGMeApi.md#getproduct) | **GET** /me/products/{productID} | 
[**getPromotion**](SWGMeApi.md#getpromotion) | **GET** /me/promotions/{promotionID} | 
[**getSpec**](SWGMeApi.md#getspec) | **GET** /me/products/{productID}/specs/{specID} | 
[**listAddresses**](SWGMeApi.md#listaddresses) | **GET** /me/addresses | 
[**listCategories**](SWGMeApi.md#listcategories) | **GET** /me/categories | 
[**listCostCenters**](SWGMeApi.md#listcostcenters) | **GET** /me/costcenters | 
[**listCreditCards**](SWGMeApi.md#listcreditcards) | **GET** /me/creditcards | 
[**listIncomingOrders**](SWGMeApi.md#listincomingorders) | **GET** /me/orders/incoming | 
[**listOutgoingOrders**](SWGMeApi.md#listoutgoingorders) | **GET** /me/orders/outgoing | 
[**listProducts**](SWGMeApi.md#listproducts) | **GET** /me/products | 
[**listPromotions**](SWGMeApi.md#listpromotions) | **GET** /me/promotions | 
[**listSpecs**](SWGMeApi.md#listspecs) | **GET** /me/products/{productID}/specs | 
[**listSubcategories**](SWGMeApi.md#listsubcategories) | **GET** /me/categories/{parentID}/categories | 
[**listUserGroups**](SWGMeApi.md#listusergroups) | **GET** /me/usergroups | 
[**patch**](SWGMeApi.md#patch) | **PATCH** /me | 
[**patchAddress**](SWGMeApi.md#patchaddress) | **PATCH** /me/addresses/{addressID} | 
[**patchCreditCard**](SWGMeApi.md#patchcreditcard) | **PATCH** /me/creditcards/{creditcardID} | 
[**update**](SWGMeApi.md#update) | **PUT** /me | 
[**updateAddress**](SWGMeApi.md#updateaddress) | **PUT** /me/addresses/{addressID} | 
[**updateCreditCard**](SWGMeApi.md#updatecreditcard) | **PUT** /me/creditcards/{creditcardID} | 


# **createAddress**
```objc
-(NSNumber*) createAddressWithAddress: (SWGBuyerAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGBuyerAddress* address = [[SWGBuyerAddress alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance createAddressWithAddress:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->createAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**SWGBuyerAddress***](SWGBuyerAddress*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCreditCard**
```objc
-(NSNumber*) createCreditCardWithCreditCard: (SWGBuyerCreditCard*) creditCard
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGBuyerCreditCard* creditCard = [[SWGBuyerCreditCard alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance createCreditCardWithCreditCard:creditCard
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->createCreditCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditCard** | [**SWGBuyerCreditCard***](SWGBuyerCreditCard*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAddress**
```objc
-(NSNumber*) deleteAddressWithAddressID: (NSString*) addressID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* addressID = @"addressID_example"; // ID of the address.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance deleteAddressWithAddressID:addressID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->deleteAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **NSString***| ID of the address. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteCreditCard**
```objc
-(NSNumber*) deleteCreditCardWithCreditcardID: (NSString*) creditcardID
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* creditcardID = @"creditcardID_example"; // ID of the creditcard.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance deleteCreditCardWithCreditcardID:creditcardID
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->deleteCreditCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **NSString***| ID of the creditcard. | 

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
-(NSNumber*) getWithCompletionHandler: 
        (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getWithCompletionHandler: 
          ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->get: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAddress**
```objc
-(NSNumber*) getAddressWithAddressID: (NSString*) addressID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* addressID = @"addressID_example"; // ID of the address.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getAddressWithAddressID:addressID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **NSString***| ID of the address. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCreditCard**
```objc
-(NSNumber*) getCreditCardWithCreditcardID: (NSString*) creditcardID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* creditcardID = @"creditcardID_example"; // ID of the creditcard.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getCreditCardWithCreditcardID:creditcardID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getCreditCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **NSString***| ID of the creditcard. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrder**
```objc
-(NSNumber*) getOrderWithOrderID: (NSString*) orderID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* orderID = @"orderID_example"; // ID of the order.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getOrderWithOrderID:orderID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getOrder: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **NSString***| ID of the order. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProduct**
```objc
-(NSNumber*) getProductWithProductID: (NSString*) productID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getProductWithProductID:productID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getProduct: %@", error);
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

# **getPromotion**
```objc
-(NSNumber*) getPromotionWithPromotionID: (NSString*) promotionID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionID = @"promotionID_example"; // ID of the promotion.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getPromotionWithPromotionID:promotionID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getPromotion: %@", error);
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

# **getSpec**
```objc
-(NSNumber*) getSpecWithProductID: (NSString*) productID
    specID: (NSString*) specID
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* productID = @"productID_example"; // ID of the product.
NSString* specID = @"specID_example"; // ID of the spec.

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance getSpecWithProductID:productID
              specID:specID
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->getSpec: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **NSString***| ID of the product. | 
 **specID** | **NSString***| ID of the spec. | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listAddresses**
```objc
-(NSNumber*) listAddressesWithSearch: (NSString*) search
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listAddressesWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->listAddresses: %@", error);
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

# **listCategories**
```objc
-(NSNumber*) listCategoriesWithDepth: (NSString*) depth
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


NSString* depth = @"depth_example"; // Depth of the category. (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listCategoriesWithDepth:depth
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
                            NSLog(@"Error calling SWGMeApi->listCategories: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **listCostCenters**
```objc
-(NSNumber*) listCostCentersWithSearch: (NSString*) search
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listCostCentersWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->listCostCenters: %@", error);
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

# **listCreditCards**
```objc
-(NSNumber*) listCreditCardsWithSearch: (NSString*) search
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listCreditCardsWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->listCreditCards: %@", error);
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

# **listIncomingOrders**
```objc
-(NSNumber*) listIncomingOrdersWithFrom: (NSString*) from
    to: (NSString*) to
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


NSString* from = @"from_example"; // Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)
NSString* to = @"to_example"; // Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listIncomingOrdersWithFrom:from
              to:to
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
                            NSLog(@"Error calling SWGMeApi->listIncomingOrders: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **to** | **NSString***| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
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

# **listOutgoingOrders**
```objc
-(NSNumber*) listOutgoingOrdersWithFrom: (NSString*) from
    to: (NSString*) to
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


NSString* from = @"from_example"; // Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)
NSString* to = @"to_example"; // Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listOutgoingOrdersWithFrom:from
              to:to
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
                            NSLog(@"Error calling SWGMeApi->listOutgoingOrders: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **to** | **NSString***| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
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

# **listProducts**
```objc
-(NSNumber*) listProductsWithCategoryID: (NSString*) categoryID
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


NSString* categoryID = @"categoryID_example"; // ID of the category. (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listProductsWithCategoryID:categoryID
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
                            NSLog(@"Error calling SWGMeApi->listProducts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryID** | **NSString***| ID of the category. | [optional] 
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

# **listPromotions**
```objc
-(NSNumber*) listPromotionsWithSearch: (NSString*) search
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listPromotionsWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->listPromotions: %@", error);
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

# **listSpecs**
```objc
-(NSNumber*) listSpecsWithProductID: (NSString*) productID
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listSpecsWithProductID:productID
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
                            NSLog(@"Error calling SWGMeApi->listSpecs: %@", error);
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

# **listSubcategories**
```objc
-(NSNumber*) listSubcategoriesWithParentID: (NSString*) parentID
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


NSString* parentID = @"parentID_example"; // ID of the parent.
NSString* depth = @"depth_example"; // Depth of the category. (optional)
NSString* search = @"search_example"; // Word or phrase to search for. (optional)
NSString* searchOn = @"searchOn_example"; // Comma-delimited list of fields to search on. (optional)
NSString* sortBy = @"sortBy_example"; // Comma-delimited list of fields to sort by. (optional)
NSNumber* page = @56; // Page of results to return. Default: 1 (optional)
NSNumber* pageSize = @56; // Number of results to return per page. Default: 20, max: 100. (optional)

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listSubcategoriesWithParentID:parentID
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
                            NSLog(@"Error calling SWGMeApi->listSubcategories: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentID** | **NSString***| ID of the parent. | 
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

# **listUserGroups**
```objc
-(NSNumber*) listUserGroupsWithSearch: (NSString*) search
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

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance listUserGroupsWithSearch:search
              searchOn:searchOn
              sortBy:sortBy
              page:page
              pageSize:pageSize
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->listUserGroups: %@", error);
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
-(NSNumber*) patchWithUser: (SWGUser*) user
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGUser* user = [[SWGUser alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance patchWithUser:user
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->patch: %@", error);
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

# **patchAddress**
```objc
-(NSNumber*) patchAddressWithAddressID: (NSString*) addressID
    address: (SWGBuyerAddress*) address
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* addressID = @"addressID_example"; // ID of the address.
SWGBuyerAddress* address = [[SWGBuyerAddress alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance patchAddressWithAddressID:addressID
              address:address
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->patchAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **NSString***| ID of the address. | 
 **address** | [**SWGBuyerAddress***](SWGBuyerAddress*.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchCreditCard**
```objc
-(NSNumber*) patchCreditCardWithCreditcardID: (NSString*) creditcardID
    creditCard: (SWGBuyerCreditCard*) creditCard
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* creditcardID = @"creditcardID_example"; // ID of the creditcard.
SWGBuyerCreditCard* creditCard = [[SWGBuyerCreditCard alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance patchCreditCardWithCreditcardID:creditcardID
              creditCard:creditCard
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->patchCreditCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **NSString***| ID of the creditcard. | 
 **creditCard** | [**SWGBuyerCreditCard***](SWGBuyerCreditCard*.md)|  | 

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
-(NSNumber*) updateWithUser: (SWGUser*) user
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


SWGUser* user = [[SWGUser alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance updateWithUser:user
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->update: %@", error);
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

# **updateAddress**
```objc
-(NSNumber*) updateAddressWithAddressID: (NSString*) addressID
    address: (SWGBuyerAddress*) address
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* addressID = @"addressID_example"; // ID of the address.
SWGBuyerAddress* address = [[SWGBuyerAddress alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance updateAddressWithAddressID:addressID
              address:address
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->updateAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **NSString***| ID of the address. | 
 **address** | [**SWGBuyerAddress***](SWGBuyerAddress*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateCreditCard**
```objc
-(NSNumber*) updateCreditCardWithCreditcardID: (NSString*) creditcardID
    creditCard: (SWGBuyerCreditCard*) creditCard
        completionHandler: (void (^)(NSObject* output, NSError* error)) handler;
```



### Example 
```objc
SWGConfiguration *apiConfig = [SWGConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: auth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* creditcardID = @"creditcardID_example"; // ID of the creditcard.
SWGBuyerCreditCard* creditCard = [[SWGBuyerCreditCard alloc] init]; // 

SWGMeApi*apiInstance = [[SWGMeApi alloc] init];

[apiInstance updateCreditCardWithCreditcardID:creditcardID
              creditCard:creditCard
          completionHandler: ^(NSObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGMeApi->updateCreditCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **NSString***| ID of the creditcard. | 
 **creditCard** | [**SWGBuyerCreditCard***](SWGBuyerCreditCard*.md)|  | 

### Return type

**NSObject***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

