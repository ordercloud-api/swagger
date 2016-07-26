# \ApprovalRuleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](ApprovalRuleApi.md#Create) | **Post** /buyers/{buyerID}/approvalrules | 
[**Delete**](ApprovalRuleApi.md#Delete) | **Delete** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**Get**](ApprovalRuleApi.md#Get) | **Get** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**List**](ApprovalRuleApi.md#List) | **Get** /buyers/{buyerID}/approvalrules | 
[**Patch**](ApprovalRuleApi.md#Patch) | **Patch** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
[**Update**](ApprovalRuleApi.md#Update) | **Put** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 


# **Create**
> Object Create($buyerID, $approvalRule)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **approvalRule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Delete**
> Delete($buyerID, $approvalRuleID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **approvalRuleID** | **string**| ID of the approval rule. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Get**
> Object Get($buyerID, $approvalRuleID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **approvalRuleID** | **string**| ID of the approval rule. | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **List**
> Object List($buyerID, $search, $searchOn, $sortBy, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
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
> Object Patch($buyerID, $approvalRuleID, $partialApprovalRule)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **approvalRuleID** | **string**| ID of the approval rule. | 
 **partialApprovalRule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Update**
> Object Update($buyerID, $approvalRuleID, $approvalRule)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **approvalRuleID** | **string**| ID of the approval rule. | 
 **approvalRule** | [**ApprovalRule**](ApprovalRule.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

