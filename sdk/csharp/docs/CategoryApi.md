# OrderCloud.Api.CategoryApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
[**Delete**](CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
[**DeleteAssignment**](CategoryApi.md#deleteassignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
[**DeleteProductAssignment**](CategoryApi.md#deleteproductassignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
[**Get**](CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
[**List**](CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
[**ListAssignments**](CategoryApi.md#listassignments) | **GET** /buyers/{buyerID}/categories/assignments | 
[**ListChildren**](CategoryApi.md#listchildren) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
[**ListProductAssignments**](CategoryApi.md#listproductassignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
[**Patch**](CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
[**SaveAssignment**](CategoryApi.md#saveassignment) | **POST** /buyers/{buyerID}/categories/assignments | 
[**SaveProductAssignment**](CategoryApi.md#saveproductassignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
[**Update**](CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 


<a name="create"></a>
# **Create**
> Object Create (string buyerID, Category category)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var category = new Category(); // Category | 

            try
            {
                Object result = apiInstance.Create(buyerID, category);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **category** | [**Category**](Category.md)|  | 

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
> void Delete (string buyerID, string categoryID)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.

            try
            {
                apiInstance.Delete(buyerID, categoryID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.Delete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 

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
> void DeleteAssignment (string buyerID, string categoryID, string userID = null, string userGroupID = null)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 

            try
            {
                apiInstance.DeleteAssignment(buyerID, categoryID, userID, userGroupID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.DeleteAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 
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

<a name="deleteproductassignment"></a>
# **DeleteProductAssignment**
> void DeleteProductAssignment (string buyerID, string categoryID, string productID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class DeleteProductAssignmentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.
            var productID = productID_example;  // string | ID of the product.

            try
            {
                apiInstance.DeleteProductAssignment(buyerID, categoryID, productID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.DeleteProductAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 
 **productID** | **string**| ID of the product. | 

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
> Object Get (string buyerID, string categoryID)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.

            try
            {
                Object result = apiInstance.Get(buyerID, categoryID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 

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
> Object List (string buyerID, string parentID = null, string depth = null, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var parentID = parentID_example;  // string | ID of the parent. (optional) 
            var depth = depth_example;  // string | Depth of the category. (optional) 
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.List(buyerID, parentID, depth, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.List: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **parentID** | **string**| ID of the parent. | [optional] 
 **depth** | **string**| Depth of the category. | [optional] 
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
> Object ListAssignments (string buyerID, string categoryID = null, string userID = null, string userGroupID = null, string level = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category. (optional) 
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 
            var level = level_example;  // string | Level of the category. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListAssignments(buyerID, categoryID, userID, userGroupID, level, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.ListAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the category. | [optional] 
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

<a name="listchildren"></a>
# **ListChildren**
> Object ListChildren (string buyerID, string parentID, string search = null, string depth = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListChildrenExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var parentID = parentID_example;  // string | ID of the parent.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var depth = depth_example;  // string | Depth of the category. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListChildren(buyerID, parentID, search, depth, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.ListChildren: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **parentID** | **string**| ID of the parent. | 
 **search** | **string**| Word or phrase to search for. | [optional] 
 **depth** | **string**| Depth of the category. | [optional] 
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

<a name="listproductassignments"></a>
# **ListProductAssignments**
> Object ListProductAssignments (string buyerID, string categoryID = null, string productID = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListProductAssignmentsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category. (optional) 
            var productID = productID_example;  // string | ID of the product. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListProductAssignments(buyerID, categoryID, productID, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.ListProductAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | [optional] 
 **productID** | **string**| ID of the product. | [optional] 
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
> void Patch (string buyerID, string categoryID, Category category)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.
            var category = new Category(); // Category | 

            try
            {
                apiInstance.Patch(buyerID, categoryID, category);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="saveassignment"></a>
# **SaveAssignment**
> void SaveAssignment (string buyerID, CategoryAssignment categoryAssignment)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryAssignment = new CategoryAssignment(); // CategoryAssignment | 

            try
            {
                apiInstance.SaveAssignment(buyerID, categoryAssignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.SaveAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryAssignment** | [**CategoryAssignment**](CategoryAssignment.md)|  | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="saveproductassignment"></a>
# **SaveProductAssignment**
> void SaveProductAssignment (string buyerID, CategoryProductAssignment productAssignment)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SaveProductAssignmentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var productAssignment = new CategoryProductAssignment(); // CategoryProductAssignment | 

            try
            {
                apiInstance.SaveProductAssignment(buyerID, productAssignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.SaveProductAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **productAssignment** | [**CategoryProductAssignment**](CategoryProductAssignment.md)|  | 

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
> Object Update (string buyerID, string categoryID, Category category)



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

            var apiInstance = new CategoryApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var categoryID = categoryID_example;  // string | ID of the category.
            var category = new Category(); // Category | 

            try
            {
                Object result = apiInstance.Update(buyerID, categoryID, category);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoryApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **categoryID** | **string**| ID of the category. | 
 **category** | [**Category**](Category.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

