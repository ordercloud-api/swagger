# \SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](SpendingAccountApi.md#Create) | **Post** /buyers/{buyerID}/spendingaccounts | 
[**Delete**](SpendingAccountApi.md#Delete) | **Delete** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**DeleteAssignment**](SpendingAccountApi.md#DeleteAssignment) | **Delete** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**Get**](SpendingAccountApi.md#Get) | **Get** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**List**](SpendingAccountApi.md#List) | **Get** /buyers/{buyerID}/spendingaccounts | 
[**ListAssignments**](SpendingAccountApi.md#ListAssignments) | **Get** /buyers/{buyerID}/spendingaccounts/assignments | 
[**Patch**](SpendingAccountApi.md#Patch) | **Patch** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**SaveAssignment**](SpendingAccountApi.md#SaveAssignment) | **Post** /buyers/{buyerID}/spendingaccounts/assignments | 
[**Update**](SpendingAccountApi.md#Update) | **Put** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


# **Create**
> Object Create($buyerID, $spendingAccount)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Delete**
> Delete($buyerID, $spendingAccountID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteAssignment**
> DeleteAssignment($buyerID, $spendingAccountID, $userID, $userGroupID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Get**
> Object Get($buyerID, $spendingAccountID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 

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

# **ListAssignments**
> Object ListAssignments($buyerID, $spendingAccountID, $userID, $userGroupID, $level, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the spending account. | [optional] 
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
> Object Patch($buyerID, $spendingAccountID, $spendingAccount)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SaveAssignment**
> SaveAssignment($buyerID, $assignment)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **assignment** | [**SpendingAccountAssignment**](SpendingAccountAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Update**
> Object Update($buyerID, $spendingAccountID, $spendingAccount)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

