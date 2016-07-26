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
    /// Module processing requests of LineItem domain.
    /// </summary>
    public sealed class LineItemModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public LineItemModule(LineItemService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/orders/{orderID}/lineitems"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItem = this.Bind<LineItem>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Create'");
                
                Preconditions.IsNotNull(lineItem, "Required parameter: 'lineItem' is missing at 'Create'");
                
                return service.Create(Context, buyerID, orderID, lineItem);
            };

            Delete["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, orderID, lineItemID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Get'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, orderID, lineItemID);
            };

            Get["/buyers/{buyerID}/orders/{orderID}/lineitems"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'List'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'List'");
                
                return service.List(Context, buyerID, orderID, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                var partialLineItem = this.Bind<LineItem>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(partialLineItem, "Required parameter: 'partialLineItem' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, orderID, lineItemID, partialLineItem);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'PatchShippingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'PatchShippingAddress'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'PatchShippingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'PatchShippingAddress'");
                
                return service.PatchShippingAddress(Context, buyerID, orderID, lineItemID, address);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SetShippingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'SetShippingAddress'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'SetShippingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'SetShippingAddress'");
                
                return service.SetShippingAddress(Context, buyerID, orderID, lineItemID, address);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                var lineItem = this.Bind<LineItem>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Update'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'Update'");
                
                Preconditions.IsNotNull(lineItem, "Required parameter: 'lineItem' is missing at 'Update'");
                
                return service.Update(Context, buyerID, orderID, lineItemID, lineItem);
            };
        }
    }

    /// <summary>
    /// Service handling LineItem requests.
    /// </summary>
    public interface LineItemService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItem"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, string orderID, LineItem lineItem);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string orderID, string lineItemID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string orderID, string lineItemID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="partialLineItem"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string orderID, string lineItemID, LineItem partialLineItem);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object PatchShippingAddress(NancyContext context, string buyerID, string orderID, string lineItemID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object SetShippingAddress(NancyContext context, string buyerID, string orderID, string lineItemID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <param name="lineItem"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string orderID, string lineItemID, LineItem lineItem);
    }

    /// <summary>
    /// Abstraction of LineItemService.
    /// </summary>
    public abstract class AbstractLineItemService: LineItemService
    {
        public virtual Object Create(NancyContext context, string buyerID, string orderID, LineItem lineItem)
        {
            return Create(buyerID, orderID, lineItem);
        }

        public virtual void Delete(NancyContext context, string buyerID, string orderID, string lineItemID)
        {
            Delete(buyerID, orderID, lineItemID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string orderID, string lineItemID)
        {
            return Get(buyerID, orderID, lineItemID);
        }

        public virtual Object List(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string orderID, string lineItemID, LineItem partialLineItem)
        {
            return Patch(buyerID, orderID, lineItemID, partialLineItem);
        }

        public virtual Object PatchShippingAddress(NancyContext context, string buyerID, string orderID, string lineItemID, Address address)
        {
            return PatchShippingAddress(buyerID, orderID, lineItemID, address);
        }

        public virtual Object SetShippingAddress(NancyContext context, string buyerID, string orderID, string lineItemID, Address address)
        {
            return SetShippingAddress(buyerID, orderID, lineItemID, address);
        }

        public virtual Object Update(NancyContext context, string buyerID, string orderID, string lineItemID, LineItem lineItem)
        {
            return Update(buyerID, orderID, lineItemID, lineItem);
        }

        protected abstract Object Create(string buyerID, string orderID, LineItem lineItem);

        protected abstract void Delete(string buyerID, string orderID, string lineItemID);

        protected abstract Object Get(string buyerID, string orderID, string lineItemID);

        protected abstract Object List(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string orderID, string lineItemID, LineItem partialLineItem);

        protected abstract Object PatchShippingAddress(string buyerID, string orderID, string lineItemID, Address address);

        protected abstract Object SetShippingAddress(string buyerID, string orderID, string lineItemID, Address address);

        protected abstract Object Update(string buyerID, string orderID, string lineItemID, LineItem lineItem);
    }

}
