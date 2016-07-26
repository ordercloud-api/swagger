# OrderCloud.Api.OrderApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddPromotion**](OrderApi.md#addpromotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**Approve**](OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
[**Cancel**](OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
[**Create**](OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
[**Decline**](OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
[**Delete**](OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
[**Get**](OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
[**ListApprovals**](OrderApi.md#listapprovals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
[**ListEligibleApprovers**](OrderApi.md#listeligibleapprovers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
[**ListIncoming**](OrderApi.md#listincoming) | **GET** /orders/incoming | 
[**ListOutgoing**](OrderApi.md#listoutgoing) | **GET** /orders/outgoing | 
[**ListPromotions**](OrderApi.md#listpromotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
[**Patch**](OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
[**PatchBillingAddress**](OrderApi.md#patchbillingaddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
[**PatchShippingAddress**](OrderApi.md#patchshippingaddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**RemovePromotion**](OrderApi.md#removepromotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
[**SetBillingAddress**](OrderApi.md#setbillingaddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
[**SetShippingAddress**](OrderApi.md#setshippingaddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
[**Ship**](OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
[**Submit**](OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
[**TransferTempUserOrder**](OrderApi.md#transfertempuserorder) | **PUT** /buyers/{buyerID}/orders | 
[**Update**](OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 


<a name="addpromotion"></a>
# **AddPromotion**
> Object AddPromotion (string buyerID, string orderID, string promoCode)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class AddPromotionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var promoCode = promoCode_example;  // string | Promo code of the order.

            try
            {
                Object result = apiInstance.AddPromotion(buyerID, orderID, promoCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.AddPromotion: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **promoCode** | **string**| Promo code of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="approve"></a>
# **Approve**
> Object Approve (string buyerID, string orderID, string comments = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ApproveExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var comments = comments_example;  // string | Comments to be saved with the order approval. (optional) 

            try
            {
                Object result = apiInstance.Approve(buyerID, orderID, comments);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Approve: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **comments** | **string**| Comments to be saved with the order approval. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cancel"></a>
# **Cancel**
> Object Cancel (string buyerID, string orderID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class CancelExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.

            try
            {
                Object result = apiInstance.Cancel(buyerID, orderID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Cancel: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="create"></a>
# **Create**
> Object Create (string buyerID, Order order)



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

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var order = new Order(); // Order | 

            try
            {
                Object result = apiInstance.Create(buyerID, order);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Create: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="decline"></a>
# **Decline**
> Object Decline (string buyerID, string orderID, string comments = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class DeclineExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var comments = comments_example;  // string | Comments to be saved with the order denial. (optional) 

            try
            {
                Object result = apiInstance.Decline(buyerID, orderID, comments);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Decline: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **comments** | **string**| Comments to be saved with the order denial. | [optional] 

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
> void Delete (string buyerID, string orderID)



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

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.

            try
            {
                apiInstance.Delete(buyerID, orderID);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Delete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 

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
> Object Get (string buyerID, string orderID)



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

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.

            try
            {
                Object result = apiInstance.Get(buyerID, orderID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Get: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listapprovals"></a>
# **ListApprovals**
> Object ListApprovals (string buyerID, string orderID, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListApprovalsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListApprovals(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.ListApprovals: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
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

<a name="listeligibleapprovers"></a>
# **ListEligibleApprovers**
> Object ListEligibleApprovers (string buyerID, string orderID, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListEligibleApproversExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListEligibleApprovers(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.ListEligibleApprovers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
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

<a name="listincoming"></a>
# **ListIncoming**
> Object ListIncoming (string buyerID = null, string from = null, string to = null, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListIncomingExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer. (optional) 
            var from = from_example;  // string | Lower bound of date range that the order was submitted. (optional) 
            var to = to_example;  // string | Upper bound of date range that the order was submitted. (optional) 
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListIncoming(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.ListIncoming: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | [optional] 
 **from** | **string**| Lower bound of date range that the order was submitted. | [optional] 
 **to** | **string**| Upper bound of date range that the order was submitted. | [optional] 
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

<a name="listoutgoing"></a>
# **ListOutgoing**
> Object ListOutgoing (string buyerID = null, string from = null, string to = null, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListOutgoingExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer. (optional) 
            var from = from_example;  // string | Lower bound of date range that the order was created. (optional) 
            var to = to_example;  // string | Upper bound of date range that the order was created. (optional) 
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListOutgoing(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.ListOutgoing: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | [optional] 
 **from** | **string**| Lower bound of date range that the order was created. | [optional] 
 **to** | **string**| Upper bound of date range that the order was created. | [optional] 
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

<a name="listpromotions"></a>
# **ListPromotions**
> Object ListPromotions (string buyerID, string orderID, string search = null, string searchOn = null, string sortBy = null, int? page = null, int? pageSize = null)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ListPromotionsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var search = search_example;  // string | Word or phrase to search for. (optional) 
            var searchOn = searchOn_example;  // string | Comma-delimited list of fields to search on. (optional) 
            var sortBy = sortBy_example;  // string | Comma-delimited list of fields to sort by. (optional) 
            var page = 56;  // int? | Page of results to return. Default: 1 (optional) 
            var pageSize = 56;  // int? | Number of results to return per page. Default: 20, max: 100. (optional) 

            try
            {
                Object result = apiInstance.ListPromotions(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.ListPromotions: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
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

<a name="patch"></a>
# **Patch**
> Object Patch (string buyerID, string orderID, Order partialOrder)



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

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var partialOrder = new Order(); // Order | 

            try
            {
                Object result = apiInstance.Patch(buyerID, orderID, partialOrder);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Patch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **partialOrder** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchbillingaddress"></a>
# **PatchBillingAddress**
> Object PatchBillingAddress (string buyerID, string orderID, Address address)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class PatchBillingAddressExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var address = new Address(); // Address | 

            try
            {
                Object result = apiInstance.PatchBillingAddress(buyerID, orderID, address);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.PatchBillingAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchshippingaddress"></a>
# **PatchShippingAddress**
> Object PatchShippingAddress (string buyerID, string orderID, Address address)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class PatchShippingAddressExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var address = new Address(); // Address | 

            try
            {
                Object result = apiInstance.PatchShippingAddress(buyerID, orderID, address);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.PatchShippingAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="removepromotion"></a>
# **RemovePromotion**
> Object RemovePromotion (string buyerID, string orderID, string promoCode)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class RemovePromotionExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var promoCode = promoCode_example;  // string | Promo code of the order.

            try
            {
                Object result = apiInstance.RemovePromotion(buyerID, orderID, promoCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.RemovePromotion: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **promoCode** | **string**| Promo code of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="setbillingaddress"></a>
# **SetBillingAddress**
> Object SetBillingAddress (string buyerID, string orderID, Address address)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SetBillingAddressExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var address = new Address(); // Address | 

            try
            {
                Object result = apiInstance.SetBillingAddress(buyerID, orderID, address);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.SetBillingAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="setshippingaddress"></a>
# **SetShippingAddress**
> Object SetShippingAddress (string buyerID, string orderID, Address address)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SetShippingAddressExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var address = new Address(); // Address | 

            try
            {
                Object result = apiInstance.SetShippingAddress(buyerID, orderID, address);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.SetShippingAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **address** | [**Address**](Address.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="ship"></a>
# **Ship**
> Object Ship (string buyerID, string orderID, Shipment shipment)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class ShipExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var shipment = new Shipment(); // Shipment | 

            try
            {
                Object result = apiInstance.Ship(buyerID, orderID, shipment);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Ship: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **shipment** | [**Shipment**](Shipment.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submit"></a>
# **Submit**
> Object Submit (string buyerID, string orderID)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class SubmitExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.

            try
            {
                Object result = apiInstance.Submit(buyerID, orderID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Submit: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="transfertempuserorder"></a>
# **TransferTempUserOrder**
> void TransferTempUserOrder (string buyerID, string tempUserToken)



### Example
```csharp
using System;
using System.Diagnostics;
using OrderCloud.Api;
using OrderCloud.Client;
using OrderCloud.Model;

namespace Example
{
    public class TransferTempUserOrderExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: auth
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var tempUserToken = tempUserToken_example;  // string | Temp user token of the order.

            try
            {
                apiInstance.TransferTempUserOrder(buyerID, tempUserToken);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.TransferTempUserOrder: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **tempUserToken** | **string**| Temp user token of the order. | 

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
> Object Update (string buyerID, string orderID, Order order)



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

            var apiInstance = new OrderApi();
            var buyerID = buyerID_example;  // string | ID of the buyer.
            var orderID = orderID_example;  // string | ID of the order.
            var order = new Order(); // Order | 

            try
            {
                Object result = apiInstance.Update(buyerID, orderID, order);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderApi.Update: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **string**| ID of the buyer. | 
 **orderID** | **string**| ID of the order. | 
 **order** | [**Order**](Order.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

