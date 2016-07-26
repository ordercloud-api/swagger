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
    public interface IPasswordResetApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="verificationCode">Verification code of the forgotten password.</param>
        /// <param name="passwordReset"></param>
        /// <returns></returns>
        void ResetPassword (string verificationCode, PasswordReset passwordReset);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="passwordResetRequest"></param>
        /// <returns></returns>
        void SendVerificationCode (PasswordResetRequest passwordResetRequest);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PasswordResetApi : IPasswordResetApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PasswordResetApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PasswordResetApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PasswordResetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PasswordResetApi(String basePath)
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
        /// <param name="verificationCode">Verification code of the forgotten password.</param> 
        /// <param name="passwordReset"></param> 
        /// <returns></returns>            
        public void ResetPassword (string verificationCode, PasswordReset passwordReset)
        {
            
            // verify the required parameter 'verificationCode' is set
            if (verificationCode == null) throw new ApiException(400, "Missing required parameter 'verificationCode' when calling ResetPassword");
            
            // verify the required parameter 'passwordReset' is set
            if (passwordReset == null) throw new ApiException(400, "Missing required parameter 'passwordReset' when calling ResetPassword");
            
    
            var path = "/password/reset/{verificationCode}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "verificationCode" + "}", ApiClient.ParameterToString(verificationCode));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(passwordReset); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ResetPassword: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ResetPassword: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="passwordResetRequest"></param> 
        /// <returns></returns>            
        public void SendVerificationCode (PasswordResetRequest passwordResetRequest)
        {
            
            // verify the required parameter 'passwordResetRequest' is set
            if (passwordResetRequest == null) throw new ApiException(400, "Missing required parameter 'passwordResetRequest' when calling SendVerificationCode");
            
    
            var path = "/password/reset";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(passwordResetRequest); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "auth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SendVerificationCode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SendVerificationCode: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
