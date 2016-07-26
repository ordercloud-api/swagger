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
    /// Module processing requests of Shipment domain.
    /// </summary>
    public sealed class ShipmentModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ShipmentModule(ShipmentService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/shipments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipment = this.Bind<Shipment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(shipment, "Required parameter: 'shipment' is missing at 'Create'");
                
                return service.Create(Context, buyerID, shipment);
            };

            Delete["/buyers/{buyerID}/shipments/{shipmentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, shipmentID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var lineItemID = Parameters.ValueOf<string>(parameters, Context.Request, "lineItemID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteItem'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'DeleteItem'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'DeleteItem'");
                
                Preconditions.IsNotNull(lineItemID, "Required parameter: 'lineItemID' is missing at 'DeleteItem'");
                
                return service.DeleteItem(Context, buyerID, shipmentID, orderID, lineItemID);
            };

            Get["/buyers/{buyerID}/shipments/{shipmentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, shipmentID);
            };

            Get["/buyers/{buyerID}/shipments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'List'");
                
                return service.List(Context, buyerID, orderID, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/buyers/{buyerID}/shipments/{shipmentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                var shipment = this.Bind<Shipment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(shipment, "Required parameter: 'shipment' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, shipmentID, shipment);
            };

            Post["/buyers/{buyerID}/shipments/{shipmentID}/items"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                var item = this.Bind<ShipmentItem>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveItem'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'SaveItem'");
                
                Preconditions.IsNotNull(item, "Required parameter: 'item' is missing at 'SaveItem'");
                
                return service.SaveItem(Context, buyerID, shipmentID, item);
            };

            Put["/buyers/{buyerID}/shipments/{shipmentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var shipmentID = Parameters.ValueOf<string>(parameters, Context.Request, "shipmentID", ParameterType.Path);
                var shipment = this.Bind<Shipment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(shipmentID, "Required parameter: 'shipmentID' is missing at 'Update'");
                
                Preconditions.IsNotNull(shipment, "Required parameter: 'shipment' is missing at 'Update'");
                
                return service.Update(Context, buyerID, shipmentID, shipment);
            };
        }
    }

    /// <summary>
    /// Service handling Shipment requests.
    /// </summary>
    public interface ShipmentService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipment"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, Shipment shipment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string shipmentID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="lineItemID">ID of the line item.</param>
        /// <returns>Object</returns>
        Object DeleteItem(NancyContext context, string buyerID, string shipmentID, string orderID, string lineItemID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string shipmentID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order. (optional)</param>
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
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <param name="shipment"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string shipmentID, Shipment shipment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <param name="item"></param>
        /// <returns>Object</returns>
        Object SaveItem(NancyContext context, string buyerID, string shipmentID, ShipmentItem item);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="shipmentID">ID of the shipment.</param>
        /// <param name="shipment"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string shipmentID, Shipment shipment);
    }

    /// <summary>
    /// Abstraction of ShipmentService.
    /// </summary>
    public abstract class AbstractShipmentService: ShipmentService
    {
        public virtual Object Create(NancyContext context, string buyerID, Shipment shipment)
        {
            return Create(buyerID, shipment);
        }

        public virtual void Delete(NancyContext context, string buyerID, string shipmentID)
        {
            Delete(buyerID, shipmentID);
        }

        public virtual Object DeleteItem(NancyContext context, string buyerID, string shipmentID, string orderID, string lineItemID)
        {
            return DeleteItem(buyerID, shipmentID, orderID, lineItemID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string shipmentID)
        {
            return Get(buyerID, shipmentID);
        }

        public virtual Object List(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string shipmentID, Shipment shipment)
        {
            return Patch(buyerID, shipmentID, shipment);
        }

        public virtual Object SaveItem(NancyContext context, string buyerID, string shipmentID, ShipmentItem item)
        {
            return SaveItem(buyerID, shipmentID, item);
        }

        public virtual Object Update(NancyContext context, string buyerID, string shipmentID, Shipment shipment)
        {
            return Update(buyerID, shipmentID, shipment);
        }

        protected abstract Object Create(string buyerID, Shipment shipment);

        protected abstract void Delete(string buyerID, string shipmentID);

        protected abstract Object DeleteItem(string buyerID, string shipmentID, string orderID, string lineItemID);

        protected abstract Object Get(string buyerID, string shipmentID);

        protected abstract Object List(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string shipmentID, Shipment shipment);

        protected abstract Object SaveItem(string buyerID, string shipmentID, ShipmentItem item);

        protected abstract Object Update(string buyerID, string shipmentID, Shipment shipment);
    }

}
