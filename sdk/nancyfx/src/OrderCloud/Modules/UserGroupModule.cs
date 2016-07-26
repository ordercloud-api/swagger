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
    /// Module processing requests of UserGroup domain.
    /// </summary>
    public sealed class UserGroupModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public UserGroupModule(UserGroupService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/usergroups"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var group = this.Bind<UserGroup>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(group, "Required parameter: 'group' is missing at 'Create'");
                
                return service.Create(Context, buyerID, group);
            };

            Delete["/buyers/{buyerID}/usergroups/{userGroupID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(userGroupID, "Required parameter: 'userGroupID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, userGroupID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteUserAssignment'");
                
                Preconditions.IsNotNull(userGroupID, "Required parameter: 'userGroupID' is missing at 'DeleteUserAssignment'");
                
                Preconditions.IsNotNull(userID, "Required parameter: 'userID' is missing at 'DeleteUserAssignment'");
                
                service.DeleteUserAssignment(Context, buyerID, userGroupID, userID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/usergroups/{userGroupID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(userGroupID, "Required parameter: 'userGroupID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, userGroupID);
            };

            Get["/buyers/{buyerID}/usergroups"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'List'");
                
                return service.List(Context, buyerID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/buyers/{buyerID}/usergroups/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListUserAssignments'");
                
                return service.ListUserAssignments(Context, buyerID, userGroupID, userID, page, pageSize);
            };

            Patch["/buyers/{buyerID}/usergroups/{userGroupID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Path);
                var group = this.Bind<UserGroup>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(userGroupID, "Required parameter: 'userGroupID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(group, "Required parameter: 'group' is missing at 'Patch'");
                
                service.Patch(Context, buyerID, userGroupID, group);
                return new Response { ContentType = ""};
            };

            Post["/buyers/{buyerID}/usergroups/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupAssignment = this.Bind<UserGroupAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveUserAssignment'");
                
                Preconditions.IsNotNull(userGroupAssignment, "Required parameter: 'userGroupAssignment' is missing at 'SaveUserAssignment'");
                
                service.SaveUserAssignment(Context, buyerID, userGroupAssignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/usergroups/{userGroupID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Path);
                var group = this.Bind<UserGroup>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(userGroupID, "Required parameter: 'userGroupID' is missing at 'Update'");
                
                Preconditions.IsNotNull(group, "Required parameter: 'group' is missing at 'Update'");
                
                return service.Update(Context, buyerID, userGroupID, group);
            };
        }
    }

    /// <summary>
    /// Service handling UserGroup requests.
    /// </summary>
    public interface UserGroupService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="group"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, UserGroup group);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="userID">ID of the user.</param>
        /// <returns></returns>
        void DeleteUserAssignment(NancyContext context, string buyerID, string userGroupID, string userID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListUserAssignments(NancyContext context, string buyerID, string userGroupID, string userID, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="group"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string buyerID, string userGroupID, UserGroup group);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupAssignment"></param>
        /// <returns></returns>
        void SaveUserAssignment(NancyContext context, string buyerID, UserGroupAssignment userGroupAssignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userGroupID">ID of the user group.</param>
        /// <param name="group"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string userGroupID, UserGroup group);
    }

    /// <summary>
    /// Abstraction of UserGroupService.
    /// </summary>
    public abstract class AbstractUserGroupService: UserGroupService
    {
        public virtual Object Create(NancyContext context, string buyerID, UserGroup group)
        {
            return Create(buyerID, group);
        }

        public virtual void Delete(NancyContext context, string buyerID, string userGroupID)
        {
            Delete(buyerID, userGroupID);
        }

        public virtual void DeleteUserAssignment(NancyContext context, string buyerID, string userGroupID, string userID)
        {
            DeleteUserAssignment(buyerID, userGroupID, userID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string userGroupID)
        {
            return Get(buyerID, userGroupID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListUserAssignments(NancyContext context, string buyerID, string userGroupID, string userID, int? page, int? pageSize)
        {
            return ListUserAssignments(buyerID, userGroupID, userID, page, pageSize);
        }

        public virtual void Patch(NancyContext context, string buyerID, string userGroupID, UserGroup group)
        {
            Patch(buyerID, userGroupID, group);
        }

        public virtual void SaveUserAssignment(NancyContext context, string buyerID, UserGroupAssignment userGroupAssignment)
        {
            SaveUserAssignment(buyerID, userGroupAssignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string userGroupID, UserGroup group)
        {
            return Update(buyerID, userGroupID, group);
        }

        protected abstract Object Create(string buyerID, UserGroup group);

        protected abstract void Delete(string buyerID, string userGroupID);

        protected abstract void DeleteUserAssignment(string buyerID, string userGroupID, string userID);

        protected abstract Object Get(string buyerID, string userGroupID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListUserAssignments(string buyerID, string userGroupID, string userID, int? page, int? pageSize);

        protected abstract void Patch(string buyerID, string userGroupID, UserGroup group);

        protected abstract void SaveUserAssignment(string buyerID, UserGroupAssignment userGroupAssignment);

        protected abstract Object Update(string buyerID, string userGroupID, UserGroup group);
    }

}
