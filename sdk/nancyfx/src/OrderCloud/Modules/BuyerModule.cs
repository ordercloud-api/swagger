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
    /// Module processing requests of Buyer domain.
    /// </summary>
    public sealed class BuyerModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public BuyerModule(BuyerService service) : base("/v1")
        { 
            Post["/buyers"] = parameters =>
            {
                var company = this.Bind<Buyer>();
                Preconditions.IsNotNull(company, "Required parameter: 'company' is missing at 'Create'");
                
                return service.Create(Context, company);
            };

            Delete["/buyers/{buyerID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                return service.Get(Context, buyerID);
            };

            Get["/buyers"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, page, pageSize);
            };

            Put["/buyers/{buyerID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var company = this.Bind<Buyer>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(company, "Required parameter: 'company' is missing at 'Update'");
                
                return service.Update(Context, buyerID, company);
            };
        }
    }

    /// <summary>
    /// Service handling Buyer requests.
    /// </summary>
    public interface BuyerService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="company"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, Buyer company);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string search, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="company"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, Buyer company);
    }

    /// <summary>
    /// Abstraction of BuyerService.
    /// </summary>
    public abstract class AbstractBuyerService: BuyerService
    {
        public virtual Object Create(NancyContext context, Buyer company)
        {
            return Create(company);
        }

        public virtual void Delete(NancyContext context, string buyerID)
        {
            Delete(buyerID);
        }

        public virtual Object Get(NancyContext context, string buyerID)
        {
            return Get(buyerID);
        }

        public virtual Object List(NancyContext context, string search, int? page, int? pageSize)
        {
            return List(search, page, pageSize);
        }

        public virtual Object Update(NancyContext context, string buyerID, Buyer company)
        {
            return Update(buyerID, company);
        }

        protected abstract Object Create(Buyer company);

        protected abstract void Delete(string buyerID);

        protected abstract Object Get(string buyerID);

        protected abstract Object List(string search, int? page, int? pageSize);

        protected abstract Object Update(string buyerID, Buyer company);
    }

}
