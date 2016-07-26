# OrderCloud.Api.SpecApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](SpecApi.md#create) | **POST** /specs | 
[**CreateOption**](SpecApi.md#createoption) | **POST** /specs/{specID}/options | 
[**Delete**](SpecApi.md#delete) | **DELETE** /specs/{specID} | 
[**DeleteOption**](SpecApi.md#deleteoption) | **DELETE** /specs/{specID}/options/{optionID} | 
[**DeleteProductAssignment**](SpecApi.md#deleteproductassignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
[**Get**](SpecApi.md#get) | **GET** /specs/{specID} | 
[**GetOption**](SpecApi.md#getoption) | **GET** /specs/{specID}/options/{optionID} | 
[**List**](SpecApi.md#list) | **GET** /specs | 
[**ListOptions**](SpecApi.md#listoptions) | **GET** /specs/{specID}/options | 
[**ListProductAssignments**](SpecApi.md#listproductassignments) | **GET** /specs/productassignments | 
[**Patch**](SpecApi.md#patch) | **PATCH** /specs/{specID} | 
[**PatchOption**](SpecApi.md#patchoption) | **PATCH** /specs/{specID}/options/{optionID} | 
[**SaveProductAssignment**](SpecApi.md#saveproductassignment) | **POST** /specs/productassignments | 
[**Update**](SpecApi.md#update) | **PUT** /specs/{specID} | 
[**UpdateOption**](SpecApi.md#updateoption) | **PUT** /specs/{specID}/options/{optionID} | 


<a name="create"></a>
# **Create**
> Object Create (Spec spec)



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

            var apiInstance = new SpecApi();
            var spec = new Spec(); // Spec | 

            try
            {
                Object result = apiInstance.Create(spec);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createoption"></a>
# **CreateOption**
> Object CreateOption (string specID, SpecOption option)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class CreateOptionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var option = new SpecOption(); // SpecOption | 

            try
            {
                Object result = apiInstance.CreateOption(specID, option);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.CreateOption: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

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
> void Delete (string specID)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.

            try
            {
                apiInstance.Delete(specID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.Delete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 

### Return type

void (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteoption"></a>
# **DeleteOption**
> void DeleteOption (string specID, string optionID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class DeleteOptionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var optionID = optionID_example;  // string | ID of the option.

            try
            {
                apiInstance.DeleteOption(specID, optionID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.DeleteOption: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **optionID** | **string**| ID of the option. | 

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
> void DeleteProductAssignment (string specID, string productID)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var productID = productID_example;  // string | ID of the product.

            try
            {
                apiInstance.DeleteProductAssignment(specID, productID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.DeleteProductAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
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
> Object Get (string specID)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.

            try
            {
                Object result = apiInstance.Get(specID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getoption"></a>
# **GetOption**
> Object GetOption (string specID, string optionID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class GetOptionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var optionID = optionID_example;  // string | ID of the option.

            try
            {
                Object result = apiInstance.GetOption(specID, optionID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.GetOption: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **optionID** | **string**| ID of the option. | 

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
> Object List (string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new SpecApi();
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.List(search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.List: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="listoptions"></a>
# **ListOptions**
> Object ListOptions (string specID, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListOptionsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListOptions(specID, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.ListOptions: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
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

<a name="listproductassignments"></a>
# **ListProductAssignments**
> Object ListProductAssignments (string specID = null, string productID = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec. (optional) 
            var productID = productID_example;  // string | ID of the product. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListProductAssignments(specID, productID, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.ListProductAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | [optional] 
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
> Object Patch (string specID, Spec spec)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var spec = new Spec(); // Spec | 

            try
            {
                Object result = apiInstance.Patch(specID, spec);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchoption"></a>
# **PatchOption**
> Object PatchOption (string specID, string optionID, SpecOption option)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class PatchOptionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var optionID = optionID_example;  // string | ID of the option.
            var option = new SpecOption(); // SpecOption | 

            try
            {
                Object result = apiInstance.PatchOption(specID, optionID, option);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.PatchOption: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **optionID** | **string**| ID of the option. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="saveproductassignment"></a>
# **SaveProductAssignment**
> void SaveProductAssignment (SpecProductAssignment productAssignment)



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

            var apiInstance = new SpecApi();
            var productAssignment = new SpecProductAssignment(); // SpecProductAssignment | 

            try
            {
                apiInstance.SaveProductAssignment(productAssignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.SaveProductAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAssignment** | [**SpecProductAssignment**](SpecProductAssignment.md)|  | 

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
> Object Update (string specID, Spec spec)



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

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var spec = new Spec(); // Spec | 

            try
            {
                Object result = apiInstance.Update(specID, spec);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **spec** | [**Spec**](Spec.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateoption"></a>
# **UpdateOption**
> Object UpdateOption (string specID, string optionID, SpecOption option)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class UpdateOptionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SpecApi();
            var specID = specID_example;  // string | ID of the spec.
            var optionID = optionID_example;  // string | ID of the option.
            var option = new SpecOption(); // SpecOption | 

            try
            {
                Object result = apiInstance.UpdateOption(specID, optionID, option);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SpecApi.UpdateOption: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **string**| ID of the spec. | 
 **optionID** | **string**| ID of the option. | 
 **option** | [**SpecOption**](SpecOption.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

