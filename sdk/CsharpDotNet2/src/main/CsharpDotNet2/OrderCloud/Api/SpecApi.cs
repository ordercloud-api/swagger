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
    public interface ISpecApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Create (Spec spec);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object CreateOption (string specID, SpecOption option);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <returns></returns>
        void Delete (string specID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <returns></returns>
        void DeleteOption (string specID, string optionID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns></returns>
        void DeleteProductAssignment (string specID, string productID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <returns>Object</returns>
        Object Get (string specID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <returns>Object</returns>
        Object GetOption (string specID, string optionID);
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
        /// <param name="specID">ID of the spec.</param>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListOptions (string specID, string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListProductAssignments (string specID, string productID, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Patch (string specID, Spec spec);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object PatchOption (string specID, string optionID, SpecOption option);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productAssignment"></param>
        /// <returns></returns>
        void SaveProductAssignment (SpecProductAssignment productAssignment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Update (string specID, Spec spec);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object UpdateOption (string specID, string optionID, SpecOption option);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SpecApi : ISpecApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SpecApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SpecApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SpecApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SpecApi(String basePath)
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
        /// <param name="spec"></param> 
        /// <returns>Object</returns>            
        public Object Create (Spec spec)
        {
            
            // verify the required parameter 'spec' is set
            if (spec == null) throw new ApiException(400, "Missing required parameter 'spec' when calling Create");
            
    
            var path = "/specs";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spec); // http body (model) parameter
    
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
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="option"></param> 
        /// <returns>Object</returns>            
        public Object CreateOption (string specID, SpecOption option)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling CreateOption");
            
            // verify the required parameter 'option' is set
            if (option == null) throw new ApiException(400, "Missing required parameter 'option' when calling CreateOption");
            
    
            var path = "/specs/{specID}/options";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(option); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateOption: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateOption: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <returns></returns>            
        public void Delete (string specID)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling Delete");
            
    
            var path = "/specs/{specID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
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
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="optionID">ID of the option.</param> 
        /// <returns></returns>            
        public void DeleteOption (string specID, string optionID)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling DeleteOption");
            
            // verify the required parameter 'optionID' is set
            if (optionID == null) throw new ApiException(400, "Missing required parameter 'optionID' when calling DeleteOption");
            
    
            var path = "/specs/{specID}/options/{optionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
path = path.Replace("{" + "optionID" + "}", ApiClient.ParameterToString(optionID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteOption: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteOption: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="productID">ID of the product.</param> 
        /// <returns></returns>            
        public void DeleteProductAssignment (string specID, string productID)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling DeleteProductAssignment");
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling DeleteProductAssignment");
            
    
            var path = "/specs/{specID}/productassignments/{productID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteProductAssignment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteProductAssignment: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <returns>Object</returns>            
        public Object Get (string specID)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling Get");
            
    
            var path = "/specs/{specID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
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
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="optionID">ID of the option.</param> 
        /// <returns>Object</returns>            
        public Object GetOption (string specID, string optionID)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling GetOption");
            
            // verify the required parameter 'optionID' is set
            if (optionID == null) throw new ApiException(400, "Missing required parameter 'optionID' when calling GetOption");
            
    
            var path = "/specs/{specID}/options/{optionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
path = path.Replace("{" + "optionID" + "}", ApiClient.ParameterToString(optionID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetOption: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOption: " + response.ErrorMessage, response.ErrorMessage);
    
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
            
    
            var path = "/specs";
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
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListOptions (string specID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling ListOptions");
            
    
            var path = "/specs/{specID}/options";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListOptions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListOptions: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="productID">ID of the product.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListProductAssignments (string specID, string productID, int? page, int? pageSize)
        {
            
    
            var path = "/specs/productassignments";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (specID != null) queryParams.Add("specID", ApiClient.ParameterToString(specID)); // query parameter
 if (productID != null) queryParams.Add("productID", ApiClient.ParameterToString(productID)); // query parameter
 if (page != null) queryParams.Add("page", ApiClient.ParameterToString(page)); // query parameter
 if (pageSize != null) queryParams.Add("pageSize", ApiClient.ParameterToString(pageSize)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ListProductAssignments: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListProductAssignments: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="spec"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string specID, Spec spec)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling Patch");
            
            // verify the required parameter 'spec' is set
            if (spec == null) throw new ApiException(400, "Missing required parameter 'spec' when calling Patch");
            
    
            var path = "/specs/{specID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spec); // http body (model) parameter
    
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
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="optionID">ID of the option.</param> 
        /// <param name="option"></param> 
        /// <returns>Object</returns>            
        public Object PatchOption (string specID, string optionID, SpecOption option)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling PatchOption");
            
            // verify the required parameter 'optionID' is set
            if (optionID == null) throw new ApiException(400, "Missing required parameter 'optionID' when calling PatchOption");
            
            // verify the required parameter 'option' is set
            if (option == null) throw new ApiException(400, "Missing required parameter 'option' when calling PatchOption");
            
    
            var path = "/specs/{specID}/options/{optionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
path = path.Replace("{" + "optionID" + "}", ApiClient.ParameterToString(optionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(option); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchOption: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchOption: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productAssignment"></param> 
        /// <returns></returns>            
        public void SaveProductAssignment (SpecProductAssignment productAssignment)
        {
            
            // verify the required parameter 'productAssignment' is set
            if (productAssignment == null) throw new ApiException(400, "Missing required parameter 'productAssignment' when calling SaveProductAssignment");
            
    
            var path = "/specs/productassignments";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(productAssignment); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SaveProductAssignment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SaveProductAssignment: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="spec"></param> 
        /// <returns>Object</returns>            
        public Object Update (string specID, Spec spec)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling Update");
            
            // verify the required parameter 'spec' is set
            if (spec == null) throw new ApiException(400, "Missing required parameter 'spec' when calling Update");
            
    
            var path = "/specs/{specID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(spec); // http body (model) parameter
    
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
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="specID">ID of the spec.</param> 
        /// <param name="optionID">ID of the option.</param> 
        /// <param name="option"></param> 
        /// <returns>Object</returns>            
        public Object UpdateOption (string specID, string optionID, SpecOption option)
        {
            
            // verify the required parameter 'specID' is set
            if (specID == null) throw new ApiException(400, "Missing required parameter 'specID' when calling UpdateOption");
            
            // verify the required parameter 'optionID' is set
            if (optionID == null) throw new ApiException(400, "Missing required parameter 'optionID' when calling UpdateOption");
            
            // verify the required parameter 'option' is set
            if (option == null) throw new ApiException(400, "Missing required parameter 'option' when calling UpdateOption");
            
    
            var path = "/specs/{specID}/options/{optionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "specID" + "}", ApiClient.ParameterToString(specID));
path = path.Replace("{" + "optionID" + "}", ApiClient.ParameterToString(optionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(option); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateOption: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateOption: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
    }
}
