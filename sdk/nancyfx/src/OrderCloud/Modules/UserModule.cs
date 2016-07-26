using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using OrderCloud.v1.Models;
using OrderCloud.v1.Utils;
using NodaTime;

namespace OrderCloud.v1.Modules
{ 

    /// <summary>
    /// Module processing requests of User domain.
    /// </summary>
    public sealed class UserModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public UserModule(UserService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/users"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var user = this.Bind<User>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Create'");
                
                return service.Create(Context, buyerID, user);
            };

            Delete["/buyers/{buyerID}/users/{userID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, userID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/users/{userID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, userID);
            };

            Post["/buyers/{buyerID}/users/{userID}/accesstoken"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                var tokenRequest = this.Bind<ImpersonateTokenRequest>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'GetAccessToken'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'GetAccessToken'");
                
                Preconditions.IsNotNull(tokenRequest, "Required parameter: 'tokenRequest' is missing at 'GetAccessToken'");
                
                return service.GetAccessToken(Context, buyerID, userID, tokenRequest);
            };

            Get["/buyers/{buyerID}/users"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'List'");
                
                return service.List(Context, buyerID, userGroupID, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/buyers/{buyerID}/users/{userID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                var user = this.Bind<User>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Patch'");
                
                service.Patch(Context, buyerID, userID, user);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/users/{userID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                var user = this.Bind<User>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Update'");
                
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Update'");
                
                return service.Update(Context, buyerID, userID, user);
            };
        }
    }

    /// <summary>
    /// Service handling User requests.
    /// </summary>
    public interface UserService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string userID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string userID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="tokenRequest"></param>
        /// <returns>Object</returns>
        Object GetAccessToken(NancyContext context, string buyerID, string userID, ImpersonateTokenRequest tokenRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string buyerID, string userGroupID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="user"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string buyerID, string userID, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string userID, User user);
    }

    /// <summary>
    /// Abstraction of UserService.
    /// </summary>
    public abstract class AbstractUserService: UserService
    {
        public virtual Object Create(NancyContext context, string buyerID, User user)
        {
            return Create(buyerID, user);
        }

        public virtual void Delete(NancyContext context, string buyerID, string userID)
        {
            Delete(buyerID, userID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string userID)
        {
            return Get(buyerID, userID);
        }

        public virtual Object GetAccessToken(NancyContext context, string buyerID, string userID, ImpersonateTokenRequest tokenRequest)
        {
            return GetAccessToken(buyerID, userID, tokenRequest);
        }

        public virtual Object List(NancyContext context, string buyerID, string userGroupID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, userGroupID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual void Patch(NancyContext context, string buyerID, string userID, User user)
        {
            Patch(buyerID, userID, user);
        }

        public virtual Object Update(NancyContext context, string buyerID, string userID, User user)
        {
            return Update(buyerID, userID, user);
        }

        protected abstract Object Create(string buyerID, User user);

        protected abstract void Delete(string buyerID, string userID);

        protected abstract Object Get(string buyerID, string userID);

        protected abstract Object GetAccessToken(string buyerID, string userID, ImpersonateTokenRequest tokenRequest);

        protected abstract Object List(string buyerID, string userGroupID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract void Patch(string buyerID, string userID, User user);

        protected abstract Object Update(string buyerID, string userID, User user);
    }

}
