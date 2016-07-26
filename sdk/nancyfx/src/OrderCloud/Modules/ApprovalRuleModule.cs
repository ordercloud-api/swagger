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
    /// Module processing requests of ApprovalRule domain.
    /// </summary>
    public sealed class ApprovalRuleModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ApprovalRuleModule(ApprovalRuleService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/approvalrules"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var approvalRule = this.Bind<ApprovalRule>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(approvalRule, "Required parameter: 'approvalRule' is missing at 'Create'");
                
                return service.Create(Context, buyerID, approvalRule);
            };

            Delete["/buyers/{buyerID}/approvalrules/{approvalRuleID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var approvalRuleID = Parameters.ValueOf<string>(parameters, Context.Request, "approvalRuleID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(approvalRuleID, "Required parameter: 'approvalRuleID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, approvalRuleID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/approvalrules/{approvalRuleID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var approvalRuleID = Parameters.ValueOf<string>(parameters, Context.Request, "approvalRuleID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(approvalRuleID, "Required parameter: 'approvalRuleID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, approvalRuleID);
            };

            Get["/buyers/{buyerID}/approvalrules"] = parameters =>
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

            Patch["/buyers/{buyerID}/approvalrules/{approvalRuleID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var approvalRuleID = Parameters.ValueOf<string>(parameters, Context.Request, "approvalRuleID", ParameterType.Path);
                var partialApprovalRule = this.Bind<ApprovalRule>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(approvalRuleID, "Required parameter: 'approvalRuleID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(partialApprovalRule, "Required parameter: 'partialApprovalRule' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, approvalRuleID, partialApprovalRule);
            };

            Put["/buyers/{buyerID}/approvalrules/{approvalRuleID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var approvalRuleID = Parameters.ValueOf<string>(parameters, Context.Request, "approvalRuleID", ParameterType.Path);
                var approvalRule = this.Bind<ApprovalRule>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(approvalRuleID, "Required parameter: 'approvalRuleID' is missing at 'Update'");
                
                Preconditions.IsNotNull(approvalRule, "Required parameter: 'approvalRule' is missing at 'Update'");
                
                return service.Update(Context, buyerID, approvalRuleID, approvalRule);
            };
        }
    }

    /// <summary>
    /// Service handling ApprovalRule requests.
    /// </summary>
    public interface ApprovalRuleService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="approvalRule"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, ApprovalRule approvalRule);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="approvalRuleID">ID of the approval rule.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string approvalRuleID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="approvalRuleID">ID of the approval rule.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string approvalRuleID);

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
        /// <param name="approvalRuleID">ID of the approval rule.</param>
        /// <param name="partialApprovalRule"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string approvalRuleID, ApprovalRule partialApprovalRule);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="approvalRuleID">ID of the approval rule.</param>
        /// <param name="approvalRule"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string approvalRuleID, ApprovalRule approvalRule);
    }

    /// <summary>
    /// Abstraction of ApprovalRuleService.
    /// </summary>
    public abstract class AbstractApprovalRuleService: ApprovalRuleService
    {
        public virtual Object Create(NancyContext context, string buyerID, ApprovalRule approvalRule)
        {
            return Create(buyerID, approvalRule);
        }

        public virtual void Delete(NancyContext context, string buyerID, string approvalRuleID)
        {
            Delete(buyerID, approvalRuleID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string approvalRuleID)
        {
            return Get(buyerID, approvalRuleID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string approvalRuleID, ApprovalRule partialApprovalRule)
        {
            return Patch(buyerID, approvalRuleID, partialApprovalRule);
        }

        public virtual Object Update(NancyContext context, string buyerID, string approvalRuleID, ApprovalRule approvalRule)
        {
            return Update(buyerID, approvalRuleID, approvalRule);
        }

        protected abstract Object Create(string buyerID, ApprovalRule approvalRule);

        protected abstract void Delete(string buyerID, string approvalRuleID);

        protected abstract Object Get(string buyerID, string approvalRuleID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string approvalRuleID, ApprovalRule partialApprovalRule);

        protected abstract Object Update(string buyerID, string approvalRuleID, ApprovalRule approvalRule);
    }

}
