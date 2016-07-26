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
    /// Module processing requests of Order domain.
    /// </summary>
    public sealed class OrderModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public OrderModule(OrderService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var promoCode = Parameters.ValueOf<string>(parameters, Context.Request, "promoCode", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'AddPromotion'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'AddPromotion'");
                
                Preconditions.IsNotNull(promoCode, "Required parameter: 'promoCode' is missing at 'AddPromotion'");
                
                return service.AddPromotion(Context, buyerID, orderID, promoCode);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/approve"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var comments = Parameters.ValueOf<string>(parameters, Context.Request, "comments", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Approve'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Approve'");
                
                return service.Approve(Context, buyerID, orderID, comments);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/cancel"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Cancel'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Cancel'");
                
                return service.Cancel(Context, buyerID, orderID);
            };

            Post["/buyers/{buyerID}/orders"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var order = this.Bind<Order>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(order, "Required parameter: 'order' is missing at 'Create'");
                
                return service.Create(Context, buyerID, order);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/decline"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var comments = Parameters.ValueOf<string>(parameters, Context.Request, "comments", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Decline'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Decline'");
                
                return service.Decline(Context, buyerID, orderID, comments);
            };

            Delete["/buyers/{buyerID}/orders/{orderID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, orderID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/orders/{orderID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, orderID);
            };

            Get["/buyers/{buyerID}/orders/{orderID}/approvals"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListApprovals'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'ListApprovals'");
                
                return service.ListApprovals(Context, buyerID, orderID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/buyers/{buyerID}/orders/{orderID}/eligibleapprovers"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListEligibleApprovers'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'ListEligibleApprovers'");
                
                return service.ListEligibleApprovers(Context, buyerID, orderID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/orders/incoming"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Query);
                var from = Parameters.ValueOf<string>(parameters, Context.Request, "from", ParameterType.Query);
                var to = Parameters.ValueOf<string>(parameters, Context.Request, "to", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListIncoming(Context, buyerID, from, to, search, searchOn, sortBy, page, pageSize);
            };

            Get["/orders/outgoing"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Query);
                var from = Parameters.ValueOf<string>(parameters, Context.Request, "from", ParameterType.Query);
                var to = Parameters.ValueOf<string>(parameters, Context.Request, "to", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListOutgoing(Context, buyerID, from, to, search, searchOn, sortBy, page, pageSize);
            };

            Get["/buyers/{buyerID}/orders/{orderID}/promotions"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListPromotions'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'ListPromotions'");
                
                return service.ListPromotions(Context, buyerID, orderID, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var partialOrder = this.Bind<Order>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(partialOrder, "Required parameter: 'partialOrder' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, orderID, partialOrder);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}/billto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'PatchBillingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'PatchBillingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'PatchBillingAddress'");
                
                return service.PatchBillingAddress(Context, buyerID, orderID, address);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}/shipto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'PatchShippingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'PatchShippingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'PatchShippingAddress'");
                
                return service.PatchShippingAddress(Context, buyerID, orderID, address);
            };

            Delete["/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var promoCode = Parameters.ValueOf<string>(parameters, Context.Request, "promoCode", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'RemovePromotion'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'RemovePromotion'");
                
                Preconditions.IsNotNull(promoCode, "Required parameter: 'promoCode' is missing at 'RemovePromotion'");
                
                return service.RemovePromotion(Context, buyerID, orderID, promoCode);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/billto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SetBillingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'SetBillingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'SetBillingAddress'");
                
                return service.SetBillingAddress(Context, buyerID, orderID, address);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/shipto"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SetShippingAddress'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'SetShippingAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'SetShippingAddress'");
                
                return service.SetShippingAddress(Context, buyerID, orderID, address);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/ship"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var shipment = this.Bind<Shipment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Ship'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Ship'");
                
                Preconditions.IsNotNull(shipment, "Required parameter: 'shipment' is missing at 'Ship'");
                
                return service.Ship(Context, buyerID, orderID, shipment);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/submit"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Submit'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Submit'");
                
                return service.Submit(Context, buyerID, orderID);
            };

            Put["/buyers/{buyerID}/orders"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var tempUserToken = Parameters.ValueOf<string>(parameters, Context.Request, "tempUserToken", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'TransferTempUserOrder'");
                
                Preconditions.IsNotNull(tempUserToken, "Required parameter: 'tempUserToken' is missing at 'TransferTempUserOrder'");
                
                service.TransferTempUserOrder(Context, buyerID, tempUserToken);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/orders/{orderID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var order = this.Bind<Order>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Update'");
                
                Preconditions.IsNotNull(order, "Required parameter: 'order' is missing at 'Update'");
                
                return service.Update(Context, buyerID, orderID, order);
            };
        }
    }

    /// <summary>
    /// Service handling Order requests.
    /// </summary>
    public interface OrderService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="promoCode">Promo code of the order.</param>
        /// <returns>Object</returns>
        Object AddPromotion(NancyContext context, string buyerID, string orderID, string promoCode);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="comments">Comments to be saved with the order approval. (optional)</param>
        /// <returns>Object</returns>
        Object Approve(NancyContext context, string buyerID, string orderID, string comments);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <returns>Object</returns>
        Object Cancel(NancyContext context, string buyerID, string orderID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="order"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, Order order);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="comments">Comments to be saved with the order denial. (optional)</param>
        /// <returns>Object</returns>
        Object Decline(NancyContext context, string buyerID, string orderID, string comments);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string orderID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string orderID);

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
        Object ListApprovals(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListEligibleApprovers(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer. (optional)</param>
        /// <param name="from">Lower bound of date range that the order was submitted. (optional)</param>
        /// <param name="to">Upper bound of date range that the order was submitted. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListIncoming(NancyContext context, string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer. (optional)</param>
        /// <param name="from">Lower bound of date range that the order was created. (optional)</param>
        /// <param name="to">Upper bound of date range that the order was created. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListOutgoing(NancyContext context, string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListPromotions(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="partialOrder"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string orderID, Order partialOrder);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object PatchBillingAddress(NancyContext context, string buyerID, string orderID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object PatchShippingAddress(NancyContext context, string buyerID, string orderID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="promoCode">Promo code of the order.</param>
        /// <returns>Object</returns>
        Object RemovePromotion(NancyContext context, string buyerID, string orderID, string promoCode);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object SetBillingAddress(NancyContext context, string buyerID, string orderID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object SetShippingAddress(NancyContext context, string buyerID, string orderID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="shipment"></param>
        /// <returns>Object</returns>
        Object Ship(NancyContext context, string buyerID, string orderID, Shipment shipment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <returns>Object</returns>
        Object Submit(NancyContext context, string buyerID, string orderID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="tempUserToken">Temp user token of the order.</param>
        /// <returns></returns>
        void TransferTempUserOrder(NancyContext context, string buyerID, string tempUserToken);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="order"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string orderID, Order order);
    }

    /// <summary>
    /// Abstraction of OrderService.
    /// </summary>
    public abstract class AbstractOrderService: OrderService
    {
        public virtual Object AddPromotion(NancyContext context, string buyerID, string orderID, string promoCode)
        {
            return AddPromotion(buyerID, orderID, promoCode);
        }

        public virtual Object Approve(NancyContext context, string buyerID, string orderID, string comments)
        {
            return Approve(buyerID, orderID, comments);
        }

        public virtual Object Cancel(NancyContext context, string buyerID, string orderID)
        {
            return Cancel(buyerID, orderID);
        }

        public virtual Object Create(NancyContext context, string buyerID, Order order)
        {
            return Create(buyerID, order);
        }

        public virtual Object Decline(NancyContext context, string buyerID, string orderID, string comments)
        {
            return Decline(buyerID, orderID, comments);
        }

        public virtual void Delete(NancyContext context, string buyerID, string orderID)
        {
            Delete(buyerID, orderID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string orderID)
        {
            return Get(buyerID, orderID);
        }

        public virtual Object ListApprovals(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListApprovals(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListEligibleApprovers(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListEligibleApprovers(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListIncoming(NancyContext context, string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListIncoming(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListOutgoing(NancyContext context, string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListOutgoing(buyerID, from, to, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListPromotions(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListPromotions(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string orderID, Order partialOrder)
        {
            return Patch(buyerID, orderID, partialOrder);
        }

        public virtual Object PatchBillingAddress(NancyContext context, string buyerID, string orderID, Address address)
        {
            return PatchBillingAddress(buyerID, orderID, address);
        }

        public virtual Object PatchShippingAddress(NancyContext context, string buyerID, string orderID, Address address)
        {
            return PatchShippingAddress(buyerID, orderID, address);
        }

        public virtual Object RemovePromotion(NancyContext context, string buyerID, string orderID, string promoCode)
        {
            return RemovePromotion(buyerID, orderID, promoCode);
        }

        public virtual Object SetBillingAddress(NancyContext context, string buyerID, string orderID, Address address)
        {
            return SetBillingAddress(buyerID, orderID, address);
        }

        public virtual Object SetShippingAddress(NancyContext context, string buyerID, string orderID, Address address)
        {
            return SetShippingAddress(buyerID, orderID, address);
        }

        public virtual Object Ship(NancyContext context, string buyerID, string orderID, Shipment shipment)
        {
            return Ship(buyerID, orderID, shipment);
        }

        public virtual Object Submit(NancyContext context, string buyerID, string orderID)
        {
            return Submit(buyerID, orderID);
        }

        public virtual void TransferTempUserOrder(NancyContext context, string buyerID, string tempUserToken)
        {
            TransferTempUserOrder(buyerID, tempUserToken);
        }

        public virtual Object Update(NancyContext context, string buyerID, string orderID, Order order)
        {
            return Update(buyerID, orderID, order);
        }

        protected abstract Object AddPromotion(string buyerID, string orderID, string promoCode);

        protected abstract Object Approve(string buyerID, string orderID, string comments);

        protected abstract Object Cancel(string buyerID, string orderID);

        protected abstract Object Create(string buyerID, Order order);

        protected abstract Object Decline(string buyerID, string orderID, string comments);

        protected abstract void Delete(string buyerID, string orderID);

        protected abstract Object Get(string buyerID, string orderID);

        protected abstract Object ListApprovals(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListEligibleApprovers(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListIncoming(string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListOutgoing(string buyerID, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListPromotions(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string orderID, Order partialOrder);

        protected abstract Object PatchBillingAddress(string buyerID, string orderID, Address address);

        protected abstract Object PatchShippingAddress(string buyerID, string orderID, Address address);

        protected abstract Object RemovePromotion(string buyerID, string orderID, string promoCode);

        protected abstract Object SetBillingAddress(string buyerID, string orderID, Address address);

        protected abstract Object SetShippingAddress(string buyerID, string orderID, Address address);

        protected abstract Object Ship(string buyerID, string orderID, Shipment shipment);

        protected abstract Object Submit(string buyerID, string orderID);

        protected abstract void TransferTempUserOrder(string buyerID, string tempUserToken);

        protected abstract Object Update(string buyerID, string orderID, Order order);
    }

}
