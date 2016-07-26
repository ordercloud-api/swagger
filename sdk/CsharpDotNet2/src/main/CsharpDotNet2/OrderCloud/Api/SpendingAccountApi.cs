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
    public interface ISpendingAccountApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Create (string buyerID, SpendingAccount spendingAccount);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <returns></returns>
        void Delete (string buyerID, string spendingAccountID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <returns></returns>
        void DeleteAssignment (string buyerID, string spendingAccountID, string userID, string userGroupID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <returns>Object</returns>
        Object Get (string buyerID, string spendingAccountID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object List (string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="level">Level of the spending account.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListAssignments (string buyerID, string spendingAccountID, string userID, string userGroupID, string level, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Patch (string buyerID, string spendingAccountID, SpendingAccount spendingAccount);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment (string buyerID, SpendingAccountAssignment assignment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Update (string buyerID, string spendingAccountID, SpendingAccount spendingAccount);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SpendingAccountApi : ISpendingAccountApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SpendingAccountApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SpendingAccountApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SpendingAccountApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SpendingAccountApi(String basePath)
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
        /// <param name="spendingAccount"></param> 
        /// <returns>Object</returns>            
        public Object Create (string buyerID, SpendingAccount spendingAccount)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Create");
            
            // verify the required parameter 'spendingAccount' is set
            if (spendingAccount == null) throw new ApiException(400, "Missing required parameter 'spendingAccount' when calling Create");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spendingAccount); // http body (model) parameter
    
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
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <returns></returns>            
        public void Delete (string buyerID, string spendingAccountID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Delete");
            
            // verify the required parameter 'spendingAccountID' is set
            if (spendingAccountID == null) throw new ApiException(400, "Missing required parameter 'spendingAccountID' when calling Delete");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "spendingAccountID" + "}", ApiClient.ParameterToString(spendingAccountID));
    
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
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <returns></returns>            
        public void DeleteAssignment (string buyerID, string spendingAccountID, string userID, string userGroupID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling DeleteAssignment");
            
            // verify the required parameter 'spendingAccountID' is set
            if (spendingAccountID == null) throw new ApiException(400, "Missing required parameter 'spendingAccountID' when calling DeleteAssignment");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "spendingAccountID" + "}", ApiClient.ParameterToString(spendingAccountID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
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
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <returns>Object</returns>            
        public Object Get (string buyerID, string spendingAccountID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Get");
            
            // verify the required parameter 'spendingAccountID' is set
            if (spendingAccountID == null) throw new ApiException(400, "Missing required parameter 'spendingAccountID' when calling Get");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "spendingAccountID" + "}", ApiClient.ParameterToString(spendingAccountID));
    
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
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object List (string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling List");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
    
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
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <param name="level">Level of the spending account.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListAssignments (string buyerID, string spendingAccountID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling ListAssignments");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/assignments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (spendingAccountID != null) queryParams.Add("spendingAccountID", ApiClient.ParameterToString(spendingAccountID)); // query parameter
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
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <param name="spendingAccount"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string buyerID, string spendingAccountID, SpendingAccount spendingAccount)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Patch");
            
            // verify the required parameter 'spendingAccountID' is set
            if (spendingAccountID == null) throw new ApiException(400, "Missing required parameter 'spendingAccountID' when calling Patch");
            
            // verify the required parameter 'spendingAccount' is set
            if (spendingAccount == null) throw new ApiException(400, "Missing required parameter 'spendingAccount' when calling Patch");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "spendingAccountID" + "}", ApiClient.ParameterToString(spendingAccountID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spendingAccount); // http body (model) parameter
    
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
        /// <param name="assignment"></param> 
        /// <returns></returns>            
        public void SaveAssignment (string buyerID, SpendingAccountAssignment assignment)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling SaveAssignment");
            
            // verify the required parameter 'assignment' is set
            if (assignment == null) throw new ApiException(400, "Missing required parameter 'assignment' when calling SaveAssignment");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/assignments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
    
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
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="spendingAccountID">ID of the spending account.</param> 
        /// <param name="spendingAccount"></param> 
        /// <returns>Object</returns>            
        public Object Update (string buyerID, string spendingAccountID, SpendingAccount spendingAccount)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Update");
            
            // verify the required parameter 'spendingAccountID' is set
            if (spendingAccountID == null) throw new ApiException(400, "Missing required parameter 'spendingAccountID' when calling Update");
            
            // verify the required parameter 'spendingAccount' is set
            if (spendingAccount == null) throw new ApiException(400, "Missing required parameter 'spendingAccount' when calling Update");
            
    
            var path = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "spendingAccountID" + "}", ApiClient.ParameterToString(spendingAccountID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spendingAccount); // http body (model) parameter
    
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
