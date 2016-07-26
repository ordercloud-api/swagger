# OrderCloud.Api.PromotionApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Create**](PromotionApi.md#create) | **POST** /promotions | 
[**Delete**](PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
[**DeleteAssignment**](PromotionApi.md#deleteassignment) | **DELETE** /promotions/{promotionID}/assignments | 
[**Get**](PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
[**List**](PromotionApi.md#list) | **GET** /promotions | 
[**ListAssignments**](PromotionApi.md#listassignments) | **GET** /promotions/assignments | 
[**Patch**](PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
[**SaveAssignment**](PromotionApi.md#saveassignment) | **POST** /promotions/assignments | 
[**Update**](PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 


<a name="create"></a>
# **Create**
> Object Create (Promotion promo)



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

            var apiInstance = new PromotionApi();
            var promo = new Promotion(); // Promotion | 

            try
            {
                Object result = apiInstance.Create(promo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promo** | [**Promotion**](Promotion.md)|  | 

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
> void Delete (string promotionID)



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

            var apiInstance = new PromotionApi();
            var promotionID = promotionID_example;  // string | ID of the promotion.

            try
            {
                apiInstance.Delete(promotionID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.Delete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 

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
> void DeleteAssignment (string promotionID, string buyerID, string userID = null, string userGroupID = null)



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

            var apiInstance = new PromotionApi();
            var promotionID = promotionID_example;  // string | ID of the promotion.
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 

            try
            {
                apiInstance.DeleteAssignment(promotionID, buyerID, userID, userGroupID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.DeleteAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 
 **buyerID** | **string**| ID of the buyer. | 
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
> Object Get (string promotionID)



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

            var apiInstance = new PromotionApi();
            var promotionID = promotionID_example;  // string | ID of the promotion.

            try
            {
                Object result = apiInstance.Get(promotionID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 

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

            var apiInstance = new PromotionApi();
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
                Debug.Print("Exception when calling PromotionApi.List: " + e.Message );
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

<a name="listassignments"></a>
# **ListAssignments**
> Object ListAssignments (string buyerID, string promotionID = null, string userID = null, string userGroupID = null, string level = null, int? page = null, int? pageSize = null)



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

            var apiInstance = new PromotionApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var promotionID = promotionID_example;  // string | ID of the promotion. (optional) 
            var userID = userID_example;  // string | ID of the user. (optional) 
            var userGroupID = userGroupID_example;  // string | ID of the user group. (optional) 
            var level = level_example;  // string | Level of the promotion. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListAssignments(buyerID, promotionID, userID, userGroupID, level, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.ListAssignments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **promotionID** | **string**| ID of the promotion. | [optional] 
 **userID** | **string**| ID of the user. | [optional] 
 **userGroupID** | **string**| ID of the user group. | [optional] 
 **level** | **string**| Level of the promotion. | [optional] 
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
> Object Patch (string promotionID, Promotion partialPromotion)



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

            var apiInstance = new PromotionApi();
            var promotionID = promotionID_example;  // string | ID of the promotion.
            var partialPromotion = new Promotion(); // Promotion | 

            try
            {
                Object result = apiInstance.Patch(promotionID, partialPromotion);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 
 **partialPromotion** | [**Promotion**](Promotion.md)|  | 

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
> void SaveAssignment (PromotionAssignment assignment)



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

            var apiInstance = new PromotionApi();
            var assignment = new PromotionAssignment(); // PromotionAssignment | 

            try
            {
                apiInstance.SaveAssignment(assignment);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.SaveAssignment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignment** | [**PromotionAssignment**](PromotionAssignment.md)|  | 

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
> Object Update (string promotionID, Promotion promo)



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

            var apiInstance = new PromotionApi();
            var promotionID = promotionID_example;  // string | ID of the promotion.
            var promo = new Promotion(); // Promotion | 

            try
            {
                Object result = apiInstance.Update(promotionID, promo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PromotionApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionID** | **string**| ID of the promotion. | 
 **promo** | [**Promotion**](Promotion.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

