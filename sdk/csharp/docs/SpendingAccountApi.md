# OrderCloud.Api.SpendingAccountApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
[**Delete**](SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**DeleteAssignment**](SpendingAccountApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
[**Get**](SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**List**](SpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
[**ListAssignments**](SpendingAccountApi.md#listassignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
[**Patch**](SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
[**SaveAssignment**](SpendingAccountApi.md#saveassignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
[**Update**](SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 


<a name="create"></a>
# **Create**
> Object Create (string buyerID, SpendingAccount spendingAccount)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class CreateExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccount = new SpendingAccount(); // SpendingAccount | 

            try
            {
                Object result = apiInstance.Create(buyerID, spendingAccount);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="delete"></a>
# **Delete**
> void Delete (string buyerID, string spendingAccountID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class DeleteExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account.

            try
            {
                apiInstance.Delete(buyerID, spendingAccountID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.Delete: " + e.Message );
            }
        }
    }
}
```

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

<a name="deleteassignment"></a>
# **DeleteAssignment**
> void DeleteAssignment (string buyerID, string spendingAccountID, string userID = null, string userGroupID = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class DeleteAssignmentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account.
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 

            try
            {
                apiInstance.DeleteAssignment(buyerID, spendingAccountID, userID, userGroupID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.DeleteAssignment: " + e.Message );
            }
        }
    }
}
```

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

<a name="get"></a>
# **Get**
> Object Get (string buyerID, string spendingAccountID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class GetExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account.

            try
            {
                Object result = apiInstance.Get(buyerID, spendingAccountID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="list"></a>
# **List**
> Object List (string buyerID, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.List(buyerID, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.List: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **searchOn** | **string**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **string**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **int?**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int?**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listassignments"></a>
# **ListAssignments**
> Object ListAssignments (string buyerID, string spendingAccountID = null, string userID = null, string userGroupID = null, string level = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListAssignmentsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account. (optional) 
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 
            var level = level_example;  // string | Level of the spending account. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListAssignments(buyerID, spendingAccountID, userID, userGroupID, level, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.ListAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the spending account. | [optional] 
 **page** | **int?**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **int?**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patch"></a>
# **Patch**
> Object Patch (string buyerID, string spendingAccountID, SpendingAccount spendingAccount)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class PatchExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account.
            var spendingAccount = new SpendingAccount(); // SpendingAccount | 

            try
            {
                Object result = apiInstance.Patch(buyerID, spendingAccountID, spendingAccount);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="saveassignment"></a>
# **SaveAssignment**
> void SaveAssignment (string buyerID, SpendingAccountAssignment assignment)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SaveAssignmentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var assignment = new SpendingAccountAssignment(); // SpendingAccountAssignment | 

            try
            {
                apiInstance.SaveAssignment(buyerID, assignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.SaveAssignment: " + e.Message );
            }
        }
    }
}
```

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

<a name="update"></a>
# **Update**
> Object Update (string buyerID, string spendingAccountID, SpendingAccount spendingAccount)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class UpdateExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpendingAccountApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var spendingAccountID = spendingAccountID_example;  // string | ID of the spending account.
            var spendingAccount = new SpendingAccount(); // SpendingAccount | 

            try
            {
                Object result = apiInstance.Update(buyerID, spendingAccountID, spendingAccount);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpendingAccountApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **spendingAccountID** | **string**| ID of the spending account. | 
 **spendingAccount** | [**SpendingAccount**](SpendingAccount.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

