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
    public interface IPromotionApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promo"></param>
        /// <returns>Object</returns>
        Object Create (Promotion promo);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <returns></returns>
        void Delete (string promotionID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <returns></returns>
        void DeleteAssignment (string promotionID, string buyerID, string userID, string userGroupID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <returns>Object</returns>
        Object Get (string promotionID);
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
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="level">Level of the promotion.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListAssignments (string buyerID, string promotionID, string userID, string userGroupID, string level, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="partialPromotion"></param>
        /// <returns>Object</returns>
        Object Patch (string promotionID, Promotion partialPromotion);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment (PromotionAssignment assignment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="promo"></param>
        /// <returns>Object</returns>
        Object Update (string promotionID, Promotion promo);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PromotionApi : IPromotionApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PromotionApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PromotionApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PromotionApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PromotionApi(String basePath)
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
        /// <param name="promo"></param> 
        /// <returns>Object</returns>            
        public Object Create (Promotion promo)
        {
            
            // verify the required parameter 'promo' is set
            if (promo == null) throw new ApiException(400, "Missing required parameter 'promo' when calling Create");
            
    
            var path = "/promotions";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(promo); // http body (model) parameter
    
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
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <returns></returns>            
        public void Delete (string promotionID)
        {
            
            // verify the required parameter 'promotionID' is set
            if (promotionID == null) throw new ApiException(400, "Missing required parameter 'promotionID' when calling Delete");
            
    
            var path = "/promotions/{promotionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "promotionID" + "}", ApiClient.ParameterToString(promotionID));
    
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
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <returns></returns>            
        public void DeleteAssignment (string promotionID, string buyerID, string userID, string userGroupID)
        {
            
            // verify the required parameter 'promotionID' is set
            if (promotionID == null) throw new ApiException(400, "Missing required parameter 'promotionID' when calling DeleteAssignment");
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling DeleteAssignment");
            
    
            var path = "/promotions/{promotionID}/assignments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "promotionID" + "}", ApiClient.ParameterToString(promotionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (buyerID != null) queryParams.Add("buyerID", ApiClient.ParameterToString(buyerID)); // query parameter
 if (userID != null) queryParams.Add("userID", ApiClient.ParameterToString(userID)); // query parameter
 if (userGroupID != null) queryParams.Add("userGroupID", ApiClient.ParameterToString(userGroupID)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAssignment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAssignment: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <returns>Object</returns>            
        public Object Get (string promotionID)
        {
            
            // verify the required parameter 'promotionID' is set
            if (promotionID == null) throw new ApiException(400, "Missing required parameter 'promotionID' when calling Get");
            
    
            var path = "/promotions/{promotionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "promotionID" + "}", ApiClient.ParameterToString(promotionID));
    
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
            
    
            var path = "/promotions";
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
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <param name="level">Level of the promotion.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListAssignments (string buyerID, string promotionID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling ListAssignments");
            
    
            var path = "/promotions/assignments";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (buyerID != null) queryParams.Add("buyerID", ApiClient.ParameterToString(buyerID)); // query parameter
 if (promotionID != null) queryParams.Add("promotionID", ApiClient.ParameterToString(promotionID)); // query parameter
 if (userID != null) queryParams.Add("userID", ApiClient.ParameterToString(userID)); // query parameter
 if (userGroupID != null) queryParams.Add("userGroupID", ApiClient.ParameterToString(userGroupID)); // query parameter
 if (level != null) queryParams.Add("level", ApiClient.ParameterToString(level)); // query parameter
 if (page != null) queryParams.Add("page", ApiClient.ParameterToString(page)); // query parameter
 if (pageSize != null) queryParams.Add("pageSize", ApiClient.ParameterToString(pageSize)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ListAssignments: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListAssignments: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <param name="partialPromotion"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string promotionID, Promotion partialPromotion)
        {
            
            // verify the required parameter 'promotionID' is set
            if (promotionID == null) throw new ApiException(400, "Missing required parameter 'promotionID' when calling Patch");
            
            // verify the required parameter 'partialPromotion' is set
            if (partialPromotion == null) throw new ApiException(400, "Missing required parameter 'partialPromotion' when calling Patch");
            
    
            var path = "/promotions/{promotionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "promotionID" + "}", ApiClient.ParameterToString(promotionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(partialPromotion); // http body (model) parameter
    
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
        /// <param name="assignment"></param> 
        /// <returns></returns>            
        public void SaveAssignment (PromotionAssignment assignment)
        {
            
            // verify the required parameter 'assignment' is set
            if (assignment == null) throw new ApiException(400, "Missing required parameter 'assignment' when calling SaveAssignment");
            
    
            var path = "/promotions/assignments";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(assignment); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SaveAssignment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SaveAssignment: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="promotionID">ID of the promotion.</param> 
        /// <param name="promo"></param> 
        /// <returns>Object</returns>            
        public Object Update (string promotionID, Promotion promo)
        {
            
            // verify the required parameter 'promotionID' is set
            if (promotionID == null) throw new ApiException(400, "Missing required parameter 'promotionID' when calling Update");
            
            // verify the required parameter 'promo' is set
            if (promo == null) throw new ApiException(400, "Missing required parameter 'promo' when calling Update");
            
    
            var path = "/promotions/{promotionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "promotionID" + "}", ApiClient.ParameterToString(promotionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(promo); // http body (model) parameter
    
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
