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
    public interface IProductApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="product"></param>
        /// <returns>Object</returns>
        Object Create (Product product);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <returns></returns>
        void Delete (string productID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <returns></returns>
        void DeleteAssignment (string buyerID, string productID, string userID, string userGroupID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="overwriteExisting">Overwrite existing of the product.</param>
        /// <returns>Object</returns>
        Object GenerateVariants (string productID, bool? overwriteExisting);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <returns>Object</returns>
        Object Get (string productID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <returns>Object</returns>
        Object GetInventory (string productID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <returns>Object</returns>
        Object GetVariant (string productID, string variantID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <returns>Object</returns>
        Object GetVariantInventory (string productID, string variantID);
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
        /// <param name="productID">ID of the product.</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="level">Level of the product.</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListAssignments (string productID, string buyerID, string userID, string userGroupID, string level, string priceScheduleID, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListInventory (string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListVariantInventory (string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="search">Word or phrase to search for.</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param>
        /// <param name="page">Page of results to return. Default: 1</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param>
        /// <returns>Object</returns>
        Object ListVariants (string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="product"></param>
        /// <returns></returns>
        void Patch (string productID, Product product);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="variant"></param>
        /// <returns>Object</returns>
        Object PatchVariant (string productID, string variantID, Variant variant);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productAssignment"></param>
        /// <returns></returns>
        void SaveAssignment (ProductAssignment productAssignment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="product"></param>
        /// <returns>Object</returns>
        Object Update (string productID, Product product);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="inventory">Inventory of the product.</param>
        /// <returns>Object</returns>
        Object UpdateInventory (string productID, int? inventory);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="variant"></param>
        /// <returns>Object</returns>
        Object UpdateVariant (string productID, string variantID, Variant variant);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="inventory">Inventory of the product.</param>
        /// <returns>Object</returns>
        Object UpdateVariantInventory (string productID, string variantID, int? inventory);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ProductApi : IProductApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ProductApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProductApi(String basePath)
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
        /// <param name="product"></param> 
        /// <returns>Object</returns>            
        public Object Create (Product product)
        {
            
            // verify the required parameter 'product' is set
            if (product == null) throw new ApiException(400, "Missing required parameter 'product' when calling Create");
            
    
            var path = "/products";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(product); // http body (model) parameter
    
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
        /// <param name="productID">ID of the product.</param> 
        /// <returns></returns>            
        public void Delete (string productID)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling Delete");
            
    
            var path = "/products/{productID}";
            path = path.Replace("{format}", "json");
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
                throw new ApiException ((int)response.StatusCode, "Error calling Delete: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Delete: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="productID">ID of the product.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <returns></returns>            
        public void DeleteAssignment (string buyerID, string productID, string userID, string userGroupID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling DeleteAssignment");
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling DeleteAssignment");
            
    
            var path = "/products/{productID}/assignments/{buyerID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
        /// <param name="productID">ID of the product.</param> 
        /// <param name="overwriteExisting">Overwrite existing of the product.</param> 
        /// <returns>Object</returns>            
        public Object GenerateVariants (string productID, bool? overwriteExisting)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling GenerateVariants");
            
    
            var path = "/products/{productID}/variants/generate";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (overwriteExisting != null) queryParams.Add("overwriteExisting", ApiClient.ParameterToString(overwriteExisting)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GenerateVariants: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GenerateVariants: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <returns>Object</returns>            
        public Object Get (string productID)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling Get");
            
    
            var path = "/products/{productID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
        /// <param name="productID">ID of the product.</param> 
        /// <returns>Object</returns>            
        public Object GetInventory (string productID)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling GetInventory");
            
    
            var path = "/products/{productID}/inventory";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetInventory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="variantID">ID of the variant.</param> 
        /// <returns>Object</returns>            
        public Object GetVariant (string productID, string variantID)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling GetVariant");
            
            // verify the required parameter 'variantID' is set
            if (variantID == null) throw new ApiException(400, "Missing required parameter 'variantID' when calling GetVariant");
            
    
            var path = "/products/{productID}/variants/{variantID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "variantID" + "}", ApiClient.ParameterToString(variantID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetVariant: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVariant: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="variantID">ID of the variant.</param> 
        /// <returns>Object</returns>            
        public Object GetVariantInventory (string productID, string variantID)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling GetVariantInventory");
            
            // verify the required parameter 'variantID' is set
            if (variantID == null) throw new ApiException(400, "Missing required parameter 'variantID' when calling GetVariantInventory");
            
    
            var path = "/products/{productID}/variants/inventory/{variantID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "variantID" + "}", ApiClient.ParameterToString(variantID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetVariantInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVariantInventory: " + response.ErrorMessage, response.ErrorMessage);
    
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
            
    
            var path = "/products";
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
        /// <param name="productID">ID of the product.</param> 
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="userID">ID of the user.</param> 
        /// <param name="userGroupID">ID of the user group.</param> 
        /// <param name="level">Level of the product.</param> 
        /// <param name="priceScheduleID">ID of the price schedule.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListAssignments (string productID, string buyerID, string userID, string userGroupID, string level, string priceScheduleID, int? page, int? pageSize)
        {
            
    
            var path = "/products/assignments";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (productID != null) queryParams.Add("productID", ApiClient.ParameterToString(productID)); // query parameter
 if (buyerID != null) queryParams.Add("buyerID", ApiClient.ParameterToString(buyerID)); // query parameter
 if (userID != null) queryParams.Add("userID", ApiClient.ParameterToString(userID)); // query parameter
 if (userGroupID != null) queryParams.Add("userGroupID", ApiClient.ParameterToString(userGroupID)); // query parameter
 if (level != null) queryParams.Add("level", ApiClient.ParameterToString(level)); // query parameter
 if (priceScheduleID != null) queryParams.Add("priceScheduleID", ApiClient.ParameterToString(priceScheduleID)); // query parameter
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
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListInventory (string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
    
            var path = "/products/inventory";
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListInventory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListVariantInventory (string productID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling ListVariantInventory");
            
    
            var path = "/products/{productID}/variants/inventory";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListVariantInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListVariantInventory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="search">Word or phrase to search for.</param> 
        /// <param name="searchOn">Comma-delimited list of fields to search on.</param> 
        /// <param name="sortBy">Comma-delimited list of fields to sort by.</param> 
        /// <param name="page">Page of results to return. Default: 1</param> 
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100.</param> 
        /// <returns>Object</returns>            
        public Object ListVariants (string productID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling ListVariants");
            
    
            var path = "/products/{productID}/variants";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListVariants: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListVariants: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="product"></param> 
        /// <returns></returns>            
        public void Patch (string productID, Product product)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling Patch");
            
            // verify the required parameter 'product' is set
            if (product == null) throw new ApiException(400, "Missing required parameter 'product' when calling Patch");
            
    
            var path = "/products/{productID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(product); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Patch: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Patch: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="variantID">ID of the variant.</param> 
        /// <param name="variant"></param> 
        /// <returns>Object</returns>            
        public Object PatchVariant (string productID, string variantID, Variant variant)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling PatchVariant");
            
            // verify the required parameter 'variantID' is set
            if (variantID == null) throw new ApiException(400, "Missing required parameter 'variantID' when calling PatchVariant");
            
            // verify the required parameter 'variant' is set
            if (variant == null) throw new ApiException(400, "Missing required parameter 'variant' when calling PatchVariant");
            
    
            var path = "/products/{productID}/variants/{variantID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "variantID" + "}", ApiClient.ParameterToString(variantID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(variant); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchVariant: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchVariant: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productAssignment"></param> 
        /// <returns></returns>            
        public void SaveAssignment (ProductAssignment productAssignment)
        {
            
            // verify the required parameter 'productAssignment' is set
            if (productAssignment == null) throw new ApiException(400, "Missing required parameter 'productAssignment' when calling SaveAssignment");
            
    
            var path = "/products/assignments";
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
                throw new ApiException ((int)response.StatusCode, "Error calling SaveAssignment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SaveAssignment: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="product"></param> 
        /// <returns>Object</returns>            
        public Object Update (string productID, Product product)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling Update");
            
            // verify the required parameter 'product' is set
            if (product == null) throw new ApiException(400, "Missing required parameter 'product' when calling Update");
            
    
            var path = "/products/{productID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(product); // http body (model) parameter
    
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
        /// <param name="productID">ID of the product.</param> 
        /// <param name="inventory">Inventory of the product.</param> 
        /// <returns>Object</returns>            
        public Object UpdateInventory (string productID, int? inventory)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling UpdateInventory");
            
            // verify the required parameter 'inventory' is set
            if (inventory == null) throw new ApiException(400, "Missing required parameter 'inventory' when calling UpdateInventory");
            
    
            var path = "/products/{productID}/inventory/{inventory}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "inventory" + "}", ApiClient.ParameterToString(inventory));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateInventory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="variantID">ID of the variant.</param> 
        /// <param name="variant"></param> 
        /// <returns>Object</returns>            
        public Object UpdateVariant (string productID, string variantID, Variant variant)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling UpdateVariant");
            
            // verify the required parameter 'variantID' is set
            if (variantID == null) throw new ApiException(400, "Missing required parameter 'variantID' when calling UpdateVariant");
            
            // verify the required parameter 'variant' is set
            if (variant == null) throw new ApiException(400, "Missing required parameter 'variant' when calling UpdateVariant");
            
    
            var path = "/products/{productID}/variants/{variantID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "variantID" + "}", ApiClient.ParameterToString(variantID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(variant); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateVariant: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateVariant: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="productID">ID of the product.</param> 
        /// <param name="variantID">ID of the variant.</param> 
        /// <param name="inventory">Inventory of the product.</param> 
        /// <returns>Object</returns>            
        public Object UpdateVariantInventory (string productID, string variantID, int? inventory)
        {
            
            // verify the required parameter 'productID' is set
            if (productID == null) throw new ApiException(400, "Missing required parameter 'productID' when calling UpdateVariantInventory");
            
            // verify the required parameter 'variantID' is set
            if (variantID == null) throw new ApiException(400, "Missing required parameter 'variantID' when calling UpdateVariantInventory");
            
            // verify the required parameter 'inventory' is set
            if (inventory == null) throw new ApiException(400, "Missing required parameter 'inventory' when calling UpdateVariantInventory");
            
    
            var path = "/products/{productID}/variants/inventory/{variantID}/{inventory}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "productID" + "}", ApiClient.ParameterToString(productID));
path = path.Replace("{" + "variantID" + "}", ApiClient.ParameterToString(variantID));
path = path.Replace("{" + "inventory" + "}", ApiClient.ParameterToString(inventory));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateVariantInventory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateVariantInventory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
    }
}
