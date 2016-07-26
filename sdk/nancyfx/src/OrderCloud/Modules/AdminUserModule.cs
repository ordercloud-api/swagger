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
    /// Module processing requests of AdminUser domain.
    /// </summary>
    public sealed class AdminUserModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public AdminUserModule(AdminUserService service) : base("/v1")
        { 
            Post["/adminusers"] = parameters =>
            {
                var user = this.Bind<User>();
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Create'");
                
                return service.Create(Context, user);
            };

            Delete["/adminusers/{userID}"] = parameters =>
            {
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Delete'");
                
                service.Delete(Context, userID);
                return new Response { ContentType = ""};
            };

            Get["/adminusers/{userID}"] = parameters =>
            {
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Get'");
                
                return service.Get(Context, userID);
            };

            Get["/adminusers"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/adminusers/{userID}"] = parameters =>
            {
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                var user = this.Bind<User>();
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Patch'");
                
                service.Patch(Context, userID, user);
                return new Response { ContentType = ""};
            };

            Put["/adminusers/{userID}"] = parameters =>
            {
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                var user = this.Bind<User>();
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'Update'");
                
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Update'");
                
                return service.Update(Context, userID, user);
            };
        }
    }

    /// <summary>
    /// Service handling AdminUser requests.
    /// </summary>
    public interface AdminUserService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userID">ID of the user.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string userID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userID">ID of the user.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string userID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="user"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string userID, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userID">ID of the user.</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string userID, User user);
    }

    /// <summary>
    /// Abstraction of AdminUserService.
    /// </summary>
    public abstract class AbstractAdminUserService: AdminUserService
    {
        public virtual Object Create(NancyContext context, User user)
        {
            return Create(user);
        }

        public virtual void Delete(NancyContext context, string userID)
        {
            Delete(userID);
        }

        public virtual Object Get(NancyContext context, string userID)
        {
            return Get(userID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        public virtual void Patch(NancyContext context, string userID, User user)
        {
            Patch(userID, user);
        }

        public virtual Object Update(NancyContext context, string userID, User user)
        {
            return Update(userID, user);
        }

        protected abstract Object Create(User user);

        protected abstract void Delete(string userID);

        protected abstract Object Get(string userID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract void Patch(string userID, User user);

        protected abstract Object Update(string userID, User user);
    }

}
