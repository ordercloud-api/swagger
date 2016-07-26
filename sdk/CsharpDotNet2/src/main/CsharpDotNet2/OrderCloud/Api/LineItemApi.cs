using System;
using System.Collections.Generic;
using RestSharp;
using OrderCloud.Client;
using OrderCloud.Model;

namespace OrderCloud.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILineItemApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItem"></param>
        /// <returns>Object</returns>
        Object Create (string buyerID, string orderID, LineItem lineItem);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <returns></returns>
        void Delete (string buyerID, string orderID, string lineItemID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <returns>Object</returns>
        Object Get (string buyerID, string orderID, string lineItemID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object List (string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="partialLineItem"></param>
        /// <returns>Object</returns>
        Object Patch (string buyerID, string orderID, string lineItemID, LineItem partialLineItem);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object PatchShippingAddress (string buyerID, string orderID, string lineItemID, Address address);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object SetShippingAddress (string buyerID, string orderID, string lineItemID, Address address);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="lineItem"></param>
        /// <returns>Object</returns>
        Object Update (string buyerID, string orderID, string lineItemID, LineItem lineItem);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class LineItemApi : ILineItemApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LineItemApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public LineItemApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="LineItemApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LineItemApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItem"></param> 
        /// <returns>Object</returns>            
        public Object Create (string buyerID, string orderID, LineItem lineItem)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Create");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Create");
            
            // verify the required parameter 'lineItem' is set
            if (lineItem == null) throw new ApiException(400, "Missing required parameter 'lineItem' when calling Create");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(lineItem); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Create: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Create: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <returns></returns>            
        public void Delete (string buyerID, string orderID, string lineItemID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Delete");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Delete");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling Delete");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Delete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Delete: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <returns>Object</returns>            
        public Object Get (string buyerID, string orderID, string lineItemID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Get");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Get");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling Get");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Get: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Get: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object List (string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling List");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling List");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (search != null) queryParams.Add("search", ApiClient.ParameterToString(search)); // query parameter
 if (searchOn != null) queryParams.Add("searchOn", ApiClient.ParameterToString(searchOn)); // query parameter
 if (sortBy != null) queryParams.Add("sortBy", ApiClient.ParameterToString(sortBy)); // query parameter
 if (page != null) queryParams.Add("page", ApiClient.ParameterToString(page)); // query parameter
 if (pageSize != null) queryParams.Add("pageSize", ApiClient.ParameterToString(pageSize)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling List: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling List: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <param name="partialLineItem"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string buyerID, string orderID, string lineItemID, LineItem partialLineItem)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Patch");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Patch");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling Patch");
            
            // verify the required parameter 'partialLineItem' is set
            if (partialLineItem == null) throw new ApiException(400, "Missing required parameter 'partialLineItem' when calling Patch");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(partialLineItem); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Patch: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Patch: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <param name="address"></param> 
        /// <returns>Object</returns>            
        public Object PatchShippingAddress (string buyerID, string orderID, string lineItemID, Address address)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling PatchShippingAddress");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling PatchShippingAddress");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling PatchShippingAddress");
            
            // verify the required parameter 'address' is set
            if (address == null) throw new ApiException(400, "Missing required parameter 'address' when calling PatchShippingAddress");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(address); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchShippingAddress: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchShippingAddress: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <param name="address"></param> 
        /// <returns>Object</returns>            
        public Object SetShippingAddress (string buyerID, string orderID, string lineItemID, Address address)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling SetShippingAddress");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling SetShippingAddress");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling SetShippingAddress");
            
            // verify the required parameter 'address' is set
            if (address == null) throw new ApiException(400, "Missing required parameter 'address' when calling SetShippingAddress");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(address); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SetShippingAddress: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SetShippingAddress: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="lineItemID">ID of the line item.</param> 
        /// <param name="lineItem"></param> 
        /// <returns>Object</returns>            
        public Object Update (string buyerID, string orderID, string lineItemID, LineItem lineItem)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Update");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Update");
            
            // verify the required parameter 'lineItemID' is set
            if (lineItemID == null) throw new ApiException(400, "Missing required parameter 'lineItemID' when calling Update");
            
            // verify the required parameter 'lineItem' is set
            if (lineItem == null) throw new ApiException(400, "Missing required parameter 'lineItem' when calling Update");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "lineItemID" + "}", ApiClient.ParameterToString(lineItemID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(lineItem); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Update: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Update: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
    }
}
