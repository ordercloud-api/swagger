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
    /// Module processing requests of PriceSchedule domain.
    /// </summary>
    public sealed class PriceScheduleModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PriceScheduleModule(PriceScheduleService service) : base("/v1")
        { 
            Post["/priceschedules"] = parameters =>
            {
                var priceSchedule = this.Bind<PriceSchedule>();
                Preconditions.IsNotNull(priceSchedule, "Required parameter: 'priceSchedule' is missing at 'Create'");
                
                return service.Create(Context, priceSchedule);
            };

            Delete["/priceschedules/{priceScheduleID}"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'Delete'");
                
                service.Delete(Context, priceScheduleID);
                return new Response { ContentType = ""};
            };

            Delete["/priceschedules/{priceScheduleID}/PriceBreaks"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                var quantity = Parameters.ValueOf<int?>(parameters, Context.Request, "quantity", ParameterType.Query);
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'DeletePriceBreak'");
                
                Preconditions.IsNotNull(quantity, "Required parameter: 'quantity' is missing at 'DeletePriceBreak'");
                
                service.DeletePriceBreak(Context, priceScheduleID, quantity);
                return new Response { ContentType = ""};
            };

            Get["/priceschedules/{priceScheduleID}"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'Get'");
                
                return service.Get(Context, priceScheduleID);
            };

            Get["/priceschedules"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/priceschedules/{priceScheduleID}"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                var priceSchedule = this.Bind<PriceSchedule>();
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(priceSchedule, "Required parameter: 'priceSchedule' is missing at 'Patch'");
                
                return service.Patch(Context, priceScheduleID, priceSchedule);
            };

            Post["/priceschedules/{priceScheduleID}/PriceBreaks"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                var priceBreak = this.Bind<PriceBreak>();
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'SavePriceBreak'");
                
                Preconditions.IsNotNull(priceBreak, "Required parameter: 'priceBreak' is missing at 'SavePriceBreak'");
                
                return service.SavePriceBreak(Context, priceScheduleID, priceBreak);
            };

            Put["/priceschedules/{priceScheduleID}"] = parameters =>
            {
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Path);
                var priceSchedule = this.Bind<PriceSchedule>();
                Preconditions.IsNotNull(priceScheduleID, "Required parameter: 'priceScheduleID' is missing at 'Update'");
                
                Preconditions.IsNotNull(priceSchedule, "Required parameter: 'priceSchedule' is missing at 'Update'");
                
                return service.Update(Context, priceScheduleID, priceSchedule);
            };
        }
    }

    /// <summary>
    /// Service handling PriceSchedule requests.
    /// </summary>
    public interface PriceScheduleService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, PriceSchedule priceSchedule);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string priceScheduleID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="quantity">Quantity of the price schedule.</param>
        /// <returns></returns>
        void DeletePriceBreak(NancyContext context, string priceScheduleID, int? quantity);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string priceScheduleID);

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
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string priceScheduleID, PriceSchedule priceSchedule);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceBreak"></param>
        /// <returns>Object</returns>
        Object SavePriceBreak(NancyContext context, string priceScheduleID, PriceBreak priceBreak);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="priceScheduleID">ID of the price schedule.</param>
        /// <param name="priceSchedule"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string priceScheduleID, PriceSchedule priceSchedule);
    }

    /// <summary>
    /// Abstraction of PriceScheduleService.
    /// </summary>
    public abstract class AbstractPriceScheduleService: PriceScheduleService
    {
        public virtual Object Create(NancyContext context, PriceSchedule priceSchedule)
        {
            return Create(priceSchedule);
        }

        public virtual void Delete(NancyContext context, string priceScheduleID)
        {
            Delete(priceScheduleID);
        }

        public virtual void DeletePriceBreak(NancyContext context, string priceScheduleID, int? quantity)
        {
            DeletePriceBreak(priceScheduleID, quantity);
        }

        public virtual Object Get(NancyContext context, string priceScheduleID)
        {
            return Get(priceScheduleID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string priceScheduleID, PriceSchedule priceSchedule)
        {
            return Patch(priceScheduleID, priceSchedule);
        }

        public virtual Object SavePriceBreak(NancyContext context, string priceScheduleID, PriceBreak priceBreak)
        {
            return SavePriceBreak(priceScheduleID, priceBreak);
        }

        public virtual Object Update(NancyContext context, string priceScheduleID, PriceSchedule priceSchedule)
        {
            return Update(priceScheduleID, priceSchedule);
        }

        protected abstract Object Create(PriceSchedule priceSchedule);

        protected abstract void Delete(string priceScheduleID);

        protected abstract void DeletePriceBreak(string priceScheduleID, int? quantity);

        protected abstract Object Get(string priceScheduleID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string priceScheduleID, PriceSchedule priceSchedule);

        protected abstract Object SavePriceBreak(string priceScheduleID, PriceBreak priceBreak);

        protected abstract Object Update(string priceScheduleID, PriceSchedule priceSchedule);
    }

}
