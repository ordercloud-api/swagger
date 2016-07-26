# \LineItemApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](LineItemApi.md#Create) | **Post** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**Delete**](LineItemApi.md#Delete) | **Delete** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**Get**](LineItemApi.md#Get) | **Get** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**List**](LineItemApi.md#List) | **Get** /buyers/{buyerID}/orders/{orderID}/lineitems | 
[**Patch**](LineItemApi.md#Patch) | **Patch** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
[**PatchShippingAddress**](LineItemApi.md#PatchShippingAddress) | **Patch** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**SetShippingAddress**](LineItemApi.md#SetShippingAddress) | **Put** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
[**Update**](LineItemApi.md#Update) | **Put** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 


# **Create**
> Object Create($buyerID, $orderID, $lineItem)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItem** | [**LineItem**](LineItem.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Delete**
> Delete($buyerID, $orderID, $lineItemID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Get**
> Object Get($buyerID, $orderID, $lineItemID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **List**
> Object List($buyerID, $orderID, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
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
> Object Patch($buyerID, $orderID, $lineItemID, $partialLineItem)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 
 **partialLineItem** | [**LineItem**](LineItem.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PatchShippingAddress**
> Object PatchShippingAddress($buyerID, $orderID, $lineItemID, $address)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SetShippingAddress**
> Object SetShippingAddress($buyerID, $orderID, $lineItemID, $address)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Update**
> Object Update($buyerID, $orderID, $lineItemID, $lineItem)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **lineItemID** | **string**| ID of the line item. | 
 **lineItem** | [**LineItem**](LineItem.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

