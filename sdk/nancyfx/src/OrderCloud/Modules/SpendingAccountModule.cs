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
    /// Module processing requests of SpendingAccount domain.
    /// </summary>
    public sealed class SpendingAccountModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SpendingAccountModule(SpendingAccountService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/spendingaccounts"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccount = this.Bind<SpendingAccount>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(spendingAccount, "Required parameter: 'spendingAccount' is missing at 'Create'");
                
                return service.Create(Context, buyerID, spendingAccount);
            };

            Delete["/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(spendingAccountID, "Required parameter: 'spendingAccountID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, spendingAccountID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(spendingAccountID, "Required parameter: 'spendingAccountID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, spendingAccountID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(spendingAccountID, "Required parameter: 'spendingAccountID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, spendingAccountID);
            };

            Get["/buyers/{buyerID}/spendingaccounts"] = parameters =>
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

            Get["/buyers/{buyerID}/spendingaccounts/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, spendingAccountID, userID, userGroupID, level, page, pageSize);
            };

            Patch["/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Path);
                var spendingAccount = this.Bind<SpendingAccount>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(spendingAccountID, "Required parameter: 'spendingAccountID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(spendingAccount, "Required parameter: 'spendingAccount' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, spendingAccountID, spendingAccount);
            };

            Post["/buyers/{buyerID}/spendingaccounts/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var assignment = this.Bind<SpendingAccountAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveAssignment'");
                
                Preconditions.IsNotNull(assignment, "Required parameter: 'assignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, buyerID, assignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var spendingAccountID = Parameters.ValueOf<string>(parameters, Context.Request, "spendingAccountID", ParameterType.Path);
                var spendingAccount = this.Bind<SpendingAccount>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(spendingAccountID, "Required parameter: 'spendingAccountID' is missing at 'Update'");
                
                Preconditions.IsNotNull(spendingAccount, "Required parameter: 'spendingAccount' is missing at 'Update'");
                
                return service.Update(Context, buyerID, spendingAccountID, spendingAccount);
            };
        }
    }

    /// <summary>
    /// Service handling SpendingAccount requests.
    /// </summary>
    public interface SpendingAccountService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, SpendingAccount spendingAccount);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string spendingAccountID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string spendingAccountID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string spendingAccountID);

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
        /// <param name="spendingAccountID">ID of the spending account. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the spending account. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string spendingAccountID, string userID, string userGroupID, string level, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string spendingAccountID, SpendingAccount spendingAccount);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, string buyerID, SpendingAccountAssignment assignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="spendingAccountID">ID of the spending account.</param>
        /// <param name="spendingAccount"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string spendingAccountID, SpendingAccount spendingAccount);
    }

    /// <summary>
    /// Abstraction of SpendingAccountService.
    /// </summary>
    public abstract class AbstractSpendingAccountService: SpendingAccountService
    {
        public virtual Object Create(NancyContext context, string buyerID, SpendingAccount spendingAccount)
        {
            return Create(buyerID, spendingAccount);
        }

        public virtual void Delete(NancyContext context, string buyerID, string spendingAccountID)
        {
            Delete(buyerID, spendingAccountID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string spendingAccountID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, spendingAccountID, userID, userGroupID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string spendingAccountID)
        {
            return Get(buyerID, spendingAccountID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string spendingAccountID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, spendingAccountID, userID, userGroupID, level, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string spendingAccountID, SpendingAccount spendingAccount)
        {
            return Patch(buyerID, spendingAccountID, spendingAccount);
        }

        public virtual void SaveAssignment(NancyContext context, string buyerID, SpendingAccountAssignment assignment)
        {
            SaveAssignment(buyerID, assignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string spendingAccountID, SpendingAccount spendingAccount)
        {
            return Update(buyerID, spendingAccountID, spendingAccount);
        }

        protected abstract Object Create(string buyerID, SpendingAccount spendingAccount);

        protected abstract void Delete(string buyerID, string spendingAccountID);

        protected abstract void DeleteAssignment(string buyerID, string spendingAccountID, string userID, string userGroupID);

        protected abstract Object Get(string buyerID, string spendingAccountID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string spendingAccountID, string userID, string userGroupID, string level, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string spendingAccountID, SpendingAccount spendingAccount);

        protected abstract void SaveAssignment(string buyerID, SpendingAccountAssignment assignment);

        protected abstract Object Update(string buyerID, string spendingAccountID, SpendingAccount spendingAccount);
    }

}
