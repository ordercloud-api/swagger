# \MeApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateAddress**](MeApi.md#CreateAddress) | **Post** /me/addresses | 
[**CreateCreditCard**](MeApi.md#CreateCreditCard) | **Post** /me/creditcards | 
[**DeleteAddress**](MeApi.md#DeleteAddress) | **Delete** /me/addresses/{addressID} | 
[**DeleteCreditCard**](MeApi.md#DeleteCreditCard) | **Delete** /me/creditcards/{creditcardID} | 
[**Get**](MeApi.md#Get) | **Get** /me | 
[**GetAddress**](MeApi.md#GetAddress) | **Get** /me/addresses/{addressID} | 
[**GetCreditCard**](MeApi.md#GetCreditCard) | **Get** /me/creditcards/{creditcardID} | 
[**GetOrder**](MeApi.md#GetOrder) | **Get** /me/orders/{orderID} | 
[**GetProduct**](MeApi.md#GetProduct) | **Get** /me/products/{productID} | 
[**GetPromotion**](MeApi.md#GetPromotion) | **Get** /me/promotions/{promotionID} | 
[**GetSpec**](MeApi.md#GetSpec) | **Get** /me/products/{productID}/specs/{specID} | 
[**ListAddresses**](MeApi.md#ListAddresses) | **Get** /me/addresses | 
[**ListCategories**](MeApi.md#ListCategories) | **Get** /me/categories | 
[**ListCostCenters**](MeApi.md#ListCostCenters) | **Get** /me/costcenters | 
[**ListCreditCards**](MeApi.md#ListCreditCards) | **Get** /me/creditcards | 
[**ListIncomingOrders**](MeApi.md#ListIncomingOrders) | **Get** /me/orders/incoming | 
[**ListOutgoingOrders**](MeApi.md#ListOutgoingOrders) | **Get** /me/orders/outgoing | 
[**ListProducts**](MeApi.md#ListProducts) | **Get** /me/products | 
[**ListPromotions**](MeApi.md#ListPromotions) | **Get** /me/promotions | 
[**ListSpecs**](MeApi.md#ListSpecs) | **Get** /me/products/{productID}/specs | 
[**ListSubcategories**](MeApi.md#ListSubcategories) | **Get** /me/categories/{parentID}/categories | 
[**ListUserGroups**](MeApi.md#ListUserGroups) | **Get** /me/usergroups | 
[**Patch**](MeApi.md#Patch) | **Patch** /me | 
[**PatchAddress**](MeApi.md#PatchAddress) | **Patch** /me/addresses/{addressID} | 
[**PatchCreditCard**](MeApi.md#PatchCreditCard) | **Patch** /me/creditcards/{creditcardID} | 
[**Update**](MeApi.md#Update) | **Put** /me | 
[**UpdateAddress**](MeApi.md#UpdateAddress) | **Put** /me/addresses/{addressID} | 
[**UpdateCreditCard**](MeApi.md#UpdateCreditCard) | **Put** /me/creditcards/{creditcardID} | 


# **CreateAddress**
> Object CreateAddress($address)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**BuyerAddress**](BuyerAddress.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateCreditCard**
> Object CreateCreditCard($creditCard)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteAddress**
> DeleteAddress($addressID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **string**| ID of the address. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCreditCard**
> DeleteCreditCard($creditcardID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **string**| ID of the creditcard. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Get**
> Object Get()




### Parameters
This endpoint does not need any parameter.

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAddress**
> Object GetAddress($addressID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **string**| ID of the address. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCreditCard**
> Object GetCreditCard($creditcardID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **string**| ID of the creditcard. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetOrder**
> Object GetOrder($orderID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **string**| ID of the order. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetProduct**
> Object GetProduct($productID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **string**| ID of the product. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPromotion**
> Object GetPromotion($promotionID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetSpec**
> Object GetSpec($productID, $specID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **string**| ID of the product. | 
 **specID** | **string**| ID of the spec. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListAddresses**
> Object ListAddresses($search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListCategories**
> Object ListCategories($depth, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **string**| Depth of the category. | [optional] 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListCostCenters**
> Object ListCostCenters($search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListCreditCards**
> Object ListCreditCards($search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListIncomingOrders**
> Object ListIncomingOrders($from, $to, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **to** | **string**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListOutgoingOrders**
> Object ListOutgoingOrders($from, $to, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **to** | **string**| Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). | [optional] 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListProducts**
> Object ListProducts($categoryID, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryID** | **string**| ID of the category. | [optional] 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListPromotions**
> Object ListPromotions($search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListSpecs**
> Object ListSpecs($productID, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productID** | **string**| ID of the product. | 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListSubcategories**
> Object ListSubcategories($parentID, $depth, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentID** | **string**| ID of the parent. | 
 **depth** | **string**| Depth of the category. | [optional] 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListUserGroups**
> Object ListUserGroups($search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int32**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int32**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Patch**
> Object Patch($user)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PatchAddress**
> PatchAddress($addressID, $address)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **string**| ID of the address. | 
 **address** | [**BuyerAddress**](BuyerAddress.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PatchCreditCard**
> PatchCreditCard($creditcardID, $creditCard)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **string**| ID of the creditcard. | 
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Update**
> Object Update($user)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateAddress**
> Object UpdateAddress($addressID, $address)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressID** | **string**| ID of the address. | 
 **address** | [**BuyerAddress**](BuyerAddress.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCreditCard**
> Object UpdateCreditCard($creditcardID, $creditCard)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardID** | **string**| ID of the creditcard. | 
 **creditCard** | [**BuyerCreditCard**](BuyerCreditCard.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

