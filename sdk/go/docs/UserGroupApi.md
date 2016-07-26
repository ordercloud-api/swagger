# \UserGroupApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](UserGroupApi.md#Create) | **Post** /buyers/{buyerID}/usergroups | 
[**Delete**](UserGroupApi.md#Delete) | **Delete** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**DeleteUserAssignment**](UserGroupApi.md#DeleteUserAssignment) | **Delete** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
[**Get**](UserGroupApi.md#Get) | **Get** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**List**](UserGroupApi.md#List) | **Get** /buyers/{buyerID}/usergroups | 
[**ListUserAssignments**](UserGroupApi.md#ListUserAssignments) | **Get** /buyers/{buyerID}/usergroups/assignments | 
[**Patch**](UserGroupApi.md#Patch) | **Patch** /buyers/{buyerID}/usergroups/{userGroupID} | 
[**SaveUserAssignment**](UserGroupApi.md#SaveUserAssignment) | **Post** /buyers/{buyerID}/usergroups/assignments | 
[**Update**](UserGroupApi.md#Update) | **Put** /buyers/{buyerID}/usergroups/{userGroupID} | 


# **Create**
> Object Create($buyerID, $group)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Delete**
> Delete($buyerID, $userGroupID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteUserAssignment**
> DeleteUserAssignment($buyerID, $userGroupID, $userID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | 
 **userID** | **string**| ID of the user. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Get**
> Object Get($buyerID, $userGroupID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | 

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

# **ListUserAssignments**
> Object ListUserAssignments($buyerID, $userGroupID, $userID, $page, $pageSize)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
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
> Patch($buyerID, $userGroupID, $group)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SaveUserAssignment**
> SaveUserAssignment($buyerID, $userGroupAssignment)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupAssignment** | [**UserGroupAssignment**](UserGroupAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **Update**
> Object Update($buyerID, $userGroupID, $group)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **userGroupID** | **string**| ID of the user group. | 
 **group** | [**UserGroup**](UserGroup.md)|  | 

### Return type

[**Object**](object.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

