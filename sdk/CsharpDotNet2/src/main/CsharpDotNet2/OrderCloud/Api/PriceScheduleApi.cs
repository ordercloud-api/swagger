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
    public interface IPriceScheduleApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Create (PriceSchedule priceSchedule);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <returns></returns>
        void Delete (string priceScheduleID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="quantity">Quantity of the price schedule.</param>
        /// <returns></returns>
        void DeletePriceBreak (string priceScheduleID, int? quantity);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <returns>Object</returns>
        Object Get (string priceScheduleID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object List (string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Patch (string priceScheduleID, PriceSchedule priceSchedule);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceBreak"></param>
        /// <returns>Object</returns>
        Object SavePriceBreak (string priceScheduleID, PriceBreak priceBreak);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Update (string priceScheduleID, PriceSchedule priceSchedule);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PriceScheduleApi : IPriceScheduleApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceScheduleApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PriceScheduleApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceScheduleApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PriceScheduleApi(String basePath)
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
        /// <param name="priceSchedule"></param> 
        /// <returns>Object</returns>            
        public Object Create (PriceSchedule priceSchedule)
        {
            
            // verify the required parameter 'priceSchedule' is set
            if (priceSchedule == null) throw new ApiException(400, "Missing required parameter 'priceSchedule' when calling Create");
            
    
            var path = "/priceschedules";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(priceSchedule); // http body (model) parameter
    
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
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <returns></returns>            
        public void Delete (string priceScheduleID)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling Delete");
            
    
            var path = "/priceschedules/{priceScheduleID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
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
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <param name="quantity">Quantity of the price schedule.</param> 
        /// <returns></returns>            
        public void DeletePriceBreak (string priceScheduleID, int? quantity)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling DeletePriceBreak");
            
            // verify the required parameter 'quantity' is set
            if (quantity == null) throw new ApiException(400, "Missing required parameter 'quantity' when calling DeletePriceBreak");
            
    
            var path = "/priceschedules/{priceScheduleID}/PriceBreaks";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (quantity != null) queryParams.Add("quantity", ApiClient.ParameterToString(quantity)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePriceBreak: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePriceBreak: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <returns>Object</returns>            
        public Object Get (string priceScheduleID)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling Get");
            
    
            var path = "/priceschedules/{priceScheduleID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
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
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object List (string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
    
            var path = "/priceschedules";
            path = path.Replace("{format}", "json");
                
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
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <param name="priceSchedule"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string priceScheduleID, PriceSchedule priceSchedule)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling Patch");
            
            // verify the required parameter 'priceSchedule' is set
            if (priceSchedule == null) throw new ApiException(400, "Missing required parameter 'priceSchedule' when calling Patch");
            
    
            var path = "/priceschedules/{priceScheduleID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(priceSchedule); // http body (model) parameter
    
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
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <param name="priceBreak"></param> 
        /// <returns>Object</returns>            
        public Object SavePriceBreak (string priceScheduleID, PriceBreak priceBreak)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling SavePriceBreak");
            
            // verify the required parameter 'priceBreak' is set
            if (priceBreak == null) throw new ApiException(400, "Missing required parameter 'priceBreak' when calling SavePriceBreak");
            
    
            var path = "/priceschedules/{priceScheduleID}/PriceBreaks";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(priceBreak); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SavePriceBreak: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SavePriceBreak: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <param name="priceSchedule"></param> 
        /// <returns>Object</returns>            
        public Object Update (string priceScheduleID, PriceSchedule priceSchedule)
        {
            
            // verify the required parameter 'priceScheduleID' is set
            if (priceScheduleID == null) throw new ApiException(400, "Missing required parameter 'priceScheduleID' when calling Update");
            
            // verify the required parameter 'priceSchedule' is set
            if (priceSchedule == null) throw new ApiException(400, "Missing required parameter 'priceSchedule' when calling Update");
            
    
            var path = "/priceschedules/{priceScheduleID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "priceScheduleID" + "}", ApiClient.ParameterToString(priceScheduleID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(priceSchedule); // http body (model) parameter
    
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
