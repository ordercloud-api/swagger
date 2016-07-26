# OrderCloud.Api.CostCenterApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](CostCenterApi.md#create) | **POST** /buyers/{buyerID}/costcenters | 
[**Delete**](CostCenterApi.md#delete) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**DeleteAssignment**](CostCenterApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID}/assignments | 
[**Get**](CostCenterApi.md#get) | **GET** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**List**](CostCenterApi.md#list) | **GET** /buyers/{buyerID}/costcenters | 
[**ListAssignments**](CostCenterApi.md#listassignments) | **GET** /buyers/{buyerID}/costcenters/assignments | 
[**Patch**](CostCenterApi.md#patch) | **PATCH** /buyers/{buyerID}/costcenters/{costCenterID} | 
[**SaveAssignment**](CostCenterApi.md#saveassignment) | **POST** /buyers/{buyerID}/costcenters/assignments | 
[**Update**](CostCenterApi.md#update) | **PUT** /buyers/{buyerID}/costcenters/{costCenterID} | 


<a name="create"></a>
# **Create**
> Object Create (string buyerID, CostCenter costCenter)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenter = new CostCenter(); // CostCenter | 

            try
            {
                Object result = apiInstance.Create(buyerID, costCenter);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenter** | [**CostCenter**](CostCenter.md)|  | 

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
> void Delete (string buyerID, string costCenterID)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center.

            try
            {
                apiInstance.Delete(buyerID, costCenterID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.Delete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | 

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
> void DeleteAssignment (string buyerID, string costCenterID, string userID = null, string userGroupID = null)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center.
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 

            try
            {
                apiInstance.DeleteAssignment(buyerID, costCenterID, userID, userGroupID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.DeleteAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | 
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
> Object Get (string buyerID, string costCenterID)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center.

            try
            {
                Object result = apiInstance.Get(buyerID, costCenterID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | 

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

            var apiInstance = new CostCenterApi();
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
                Debug.Print("Exception when calling CostCenterApi.List: " + e.Message );
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
> Object ListAssignments (string buyerID, string costCenterID = null, string userID = null, string userGroupID = null, string level = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center. (optional) 
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 
            var level = level_example;  // string | Level of the cost center. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListAssignments(buyerID, costCenterID, userID, userGroupID, level, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.ListAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the cost center. | [optional] 
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
> Object Patch (string buyerID, string costCenterID, CostCenter costCenter)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center.
            var costCenter = new CostCenter(); // CostCenter | 

            try
            {
                Object result = apiInstance.Patch(buyerID, costCenterID, costCenter);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | 
 **costCenter** | [**CostCenter**](CostCenter.md)|  | 

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
> void SaveAssignment (string buyerID, CostCenterAssignment assignment)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var assignment = new CostCenterAssignment(); // CostCenterAssignment | 

            try
            {
                apiInstance.SaveAssignment(buyerID, assignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.SaveAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **assignment** | [**CostCenterAssignment**](CostCenterAssignment.md)|  | 

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
> Object Update (string buyerID, string costCenterID, CostCenter costCenter)



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

            var apiInstance = new CostCenterApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var costCenterID = costCenterID_example;  // string | ID of the cost center.
            var costCenter = new CostCenter(); // CostCenter | 

            try
            {
                Object result = apiInstance.Update(buyerID, costCenterID, costCenter);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CostCenterApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **costCenterID** | **string**| ID of the cost center. | 
 **costCenter** | [**CostCenter**](CostCenter.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

