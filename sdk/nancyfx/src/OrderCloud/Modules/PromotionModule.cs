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
    /// Module processing requests of Promotion domain.
    /// </summary>
    public sealed class PromotionModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PromotionModule(PromotionService service) : base("/v1")
        { 
            Post["/promotions"] = parameters =>
            {
                var promo = this.Bind<Promotion>();
                Preconditions.IsNotNull(promo, "Required parameter: 'promo' is missing at 'Create'");
                
                return service.Create(Context, promo);
            };

            Delete["/promotions/{promotionID}"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'Delete'");
                
                service.Delete(Context, promotionID);
                return new Response { ContentType = ""};
            };

            Delete["/promotions/{promotionID}/assignments"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, promotionID, buyerID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Get["/promotions/{promotionID}"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'Get'");
                
                return service.Get(Context, promotionID);
            };

            Get["/promotions"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/promotions/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Query);
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, promotionID, userID, userGroupID, level, page, pageSize);
            };

            Patch["/promotions/{promotionID}"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                var partialPromotion = this.Bind<Promotion>();
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(partialPromotion, "Required parameter: 'partialPromotion' is missing at 'Patch'");
                
                return service.Patch(Context, promotionID, partialPromotion);
            };

            Post["/promotions/assignments"] = parameters =>
            {
                var assignment = this.Bind<PromotionAssignment>();
                Preconditions.IsNotNull(assignment, "Required parameter: 'assignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, assignment);
                return new Response { ContentType = ""};
            };

            Put["/promotions/{promotionID}"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                var promo = this.Bind<Promotion>();
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'Update'");
                
                Preconditions.IsNotNull(promo, "Required parameter: 'promo' is missing at 'Update'");
                
                return service.Update(Context, promotionID, promo);
            };
        }
    }

    /// <summary>
    /// Service handling Promotion requests.
    /// </summary>
    public interface PromotionService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promo"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, Promotion promo);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string promotionID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string promotionID, string buyerID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string promotionID);

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
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="promotionID">ID of the promotion. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the promotion. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string promotionID, string userID, string userGroupID, string level, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="partialPromotion"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string promotionID, Promotion partialPromotion);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, PromotionAssignment assignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <param name="promo"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string promotionID, Promotion promo);
    }

    /// <summary>
    /// Abstraction of PromotionService.
    /// </summary>
    public abstract class AbstractPromotionService: PromotionService
    {
        public virtual Object Create(NancyContext context, Promotion promo)
        {
            return Create(promo);
        }

        public virtual void Delete(NancyContext context, string promotionID)
        {
            Delete(promotionID);
        }

        public virtual void DeleteAssignment(NancyContext context, string promotionID, string buyerID, string userID, string userGroupID)
        {
            DeleteAssignment(promotionID, buyerID, userID, userGroupID);
        }

        public virtual Object Get(NancyContext context, string promotionID)
        {
            return Get(promotionID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string promotionID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, promotionID, userID, userGroupID, level, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string promotionID, Promotion partialPromotion)
        {
            return Patch(promotionID, partialPromotion);
        }

        public virtual void SaveAssignment(NancyContext context, PromotionAssignment assignment)
        {
            SaveAssignment(assignment);
        }

        public virtual Object Update(NancyContext context, string promotionID, Promotion promo)
        {
            return Update(promotionID, promo);
        }

        protected abstract Object Create(Promotion promo);

        protected abstract void Delete(string promotionID);

        protected abstract void DeleteAssignment(string promotionID, string buyerID, string userID, string userGroupID);

        protected abstract Object Get(string promotionID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string promotionID, string userID, string userGroupID, string level, int? page, int? pageSize);

        protected abstract Object Patch(string promotionID, Promotion partialPromotion);

        protected abstract void SaveAssignment(PromotionAssignment assignment);

        protected abstract Object Update(string promotionID, Promotion promo);
    }

}
