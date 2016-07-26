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
    public interface IPaymentApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="payment"></param>
        /// <returns>Object</returns>
        Object Create (string buyerID, string orderID, Payment payment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transaction"></param>
        /// <returns>Object</returns>
        Object CreateTransaction (string buyerID, string orderID, string paymentID, PaymentTransaction transaction);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <returns></returns>
        void Delete (string buyerID, string orderID, string paymentID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <returns></returns>
        void DeleteTransaction (string buyerID, string orderID, string paymentID, string transactionID);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <returns>Object</returns>
        Object Get (string buyerID, string orderID, string paymentID);
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
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="partialPayment"></param>
        /// <returns>Object</returns>
        Object Patch (string buyerID, string orderID, string paymentID, Payment partialPayment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <param name="partialTransaction"></param>
        /// <returns>Object</returns>
        Object PatchTransaction (string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction partialTransaction);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="payment"></param>
        /// <returns>Object</returns>
        Object Update (string buyerID, string orderID, string paymentID, Payment payment);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <param name="transaction"></param>
        /// <returns>Object</returns>
        Object UpdateTransaction (string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction transaction);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PaymentApi : IPaymentApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PaymentApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PaymentApi(String basePath)
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
        /// <param name="payment"></param> 
        /// <returns>Object</returns>            
        public Object Create (string buyerID, string orderID, Payment payment)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Create");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Create");
            
            // verify the required parameter 'payment' is set
            if (payment == null) throw new ApiException(400, "Missing required parameter 'payment' when calling Create");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(payment); // http body (model) parameter
    
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
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="transaction"></param> 
        /// <returns>Object</returns>            
        public Object CreateTransaction (string buyerID, string orderID, string paymentID, PaymentTransaction transaction)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling CreateTransaction");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling CreateTransaction");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling CreateTransaction");
            
            // verify the required parameter 'transaction' is set
            if (transaction == null) throw new ApiException(400, "Missing required parameter 'transaction' when calling CreateTransaction");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(transaction); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateTransaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateTransaction: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="paymentID">ID of the payment.</param> 
        /// <returns></returns>            
        public void Delete (string buyerID, string orderID, string paymentID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Delete");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Delete");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling Delete");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
    
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
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="transactionID">ID of the transaction.</param> 
        /// <returns></returns>            
        public void DeleteTransaction (string buyerID, string orderID, string paymentID, string transactionID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling DeleteTransaction");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling DeleteTransaction");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling DeleteTransaction");
            
            // verify the required parameter 'transactionID' is set
            if (transactionID == null) throw new ApiException(400, "Missing required parameter 'transactionID' when calling DeleteTransaction");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
path = path.Replace("{" + "transactionID" + "}", ApiClient.ParameterToString(transactionID));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteTransaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteTransaction: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="paymentID">ID of the payment.</param> 
        /// <returns>Object</returns>            
        public Object Get (string buyerID, string orderID, string paymentID)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Get");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Get");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling Get");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
    
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
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments";
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
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="partialPayment"></param> 
        /// <returns>Object</returns>            
        public Object Patch (string buyerID, string orderID, string paymentID, Payment partialPayment)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Patch");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Patch");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling Patch");
            
            // verify the required parameter 'partialPayment' is set
            if (partialPayment == null) throw new ApiException(400, "Missing required parameter 'partialPayment' when calling Patch");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(partialPayment); // http body (model) parameter
    
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
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="transactionID">ID of the transaction.</param> 
        /// <param name="partialTransaction"></param> 
        /// <returns>Object</returns>            
        public Object PatchTransaction (string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction partialTransaction)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling PatchTransaction");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling PatchTransaction");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling PatchTransaction");
            
            // verify the required parameter 'transactionID' is set
            if (transactionID == null) throw new ApiException(400, "Missing required parameter 'transactionID' when calling PatchTransaction");
            
            // verify the required parameter 'partialTransaction' is set
            if (partialTransaction == null) throw new ApiException(400, "Missing required parameter 'partialTransaction' when calling PatchTransaction");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
path = path.Replace("{" + "transactionID" + "}", ApiClient.ParameterToString(transactionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(partialTransaction); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchTransaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchTransaction: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="payment"></param> 
        /// <returns>Object</returns>            
        public Object Update (string buyerID, string orderID, string paymentID, Payment payment)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling Update");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling Update");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling Update");
            
            // verify the required parameter 'payment' is set
            if (payment == null) throw new ApiException(400, "Missing required parameter 'payment' when calling Update");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(payment); // http body (model) parameter
    
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
        /// <param name="buyerID">ID of the buyer.</param> 
        /// <param name="orderID">ID of the order.</param> 
        /// <param name="paymentID">ID of the payment.</param> 
        /// <param name="transactionID">ID of the transaction.</param> 
        /// <param name="transaction"></param> 
        /// <returns>Object</returns>            
        public Object UpdateTransaction (string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction transaction)
        {
            
            // verify the required parameter 'buyerID' is set
            if (buyerID == null) throw new ApiException(400, "Missing required parameter 'buyerID' when calling UpdateTransaction");
            
            // verify the required parameter 'orderID' is set
            if (orderID == null) throw new ApiException(400, "Missing required parameter 'orderID' when calling UpdateTransaction");
            
            // verify the required parameter 'paymentID' is set
            if (paymentID == null) throw new ApiException(400, "Missing required parameter 'paymentID' when calling UpdateTransaction");
            
            // verify the required parameter 'transactionID' is set
            if (transactionID == null) throw new ApiException(400, "Missing required parameter 'transactionID' when calling UpdateTransaction");
            
            // verify the required parameter 'transaction' is set
            if (transaction == null) throw new ApiException(400, "Missing required parameter 'transaction' when calling UpdateTransaction");
            
    
            var path = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "buyerID" + "}", ApiClient.ParameterToString(buyerID));
path = path.Replace("{" + "orderID" + "}", ApiClient.ParameterToString(orderID));
path = path.Replace("{" + "paymentID" + "}", ApiClient.ParameterToString(paymentID));
path = path.Replace("{" + "transactionID" + "}", ApiClient.ParameterToString(transactionID));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(transaction); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateTransaction: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateTransaction: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Object) ApiClient.Deserialize(response.Content, typeof(Object), response.Headers);
        }
    
    }
}
