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
    /// Module processing requests of Me domain.
    /// </summary>
    public sealed class MeModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public MeModule(MeService service) : base("/v1")
        { 
            Post["/me/addresses"] = parameters =>
            {
                var address = this.Bind<BuyerAddress>();
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'CreateAddress'");
                
                return service.CreateAddress(Context, address);
            };

            Post["/me/creditcards"] = parameters =>
            {
                var creditCard = this.Bind<BuyerCreditCard>();
                Preconditions.IsNotNull(creditCard, "Required parameter: 'creditCard' is missing at 'CreateCreditCard'");
                
                return service.CreateCreditCard(Context, creditCard);
            };

            Delete["/me/addresses/{addressID}"] = parameters =>
            {
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'DeleteAddress'");
                
                service.DeleteAddress(Context, addressID);
                return new Response { ContentType = ""};
            };

            Delete["/me/creditcards/{creditcardID}"] = parameters =>
            {
                var creditcardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditcardID", ParameterType.Path);
                Preconditions.IsNotNull(creditcardID, "Required parameter: 'creditcardID' is missing at 'DeleteCreditCard'");
                
                service.DeleteCreditCard(Context, creditcardID);
                return new Response { ContentType = ""};
            };

            Get["/me"] = parameters =>
            {
                
                return service.Get(Context);
            };

            Get["/me/addresses/{addressID}"] = parameters =>
            {
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'GetAddress'");
                
                return service.GetAddress(Context, addressID);
            };

            Get["/me/creditcards/{creditcardID}"] = parameters =>
            {
                var creditcardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditcardID", ParameterType.Path);
                Preconditions.IsNotNull(creditcardID, "Required parameter: 'creditcardID' is missing at 'GetCreditCard'");
                
                return service.GetCreditCard(Context, creditcardID);
            };

            Get["/me/orders/{orderID}"] = parameters =>
            {
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'GetOrder'");
                
                return service.GetOrder(Context, orderID);
            };

            Get["/me/products/{productID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GetProduct'");
                
                return service.GetProduct(Context, productID);
            };

            Get["/me/promotions/{promotionID}"] = parameters =>
            {
                var promotionID = Parameters.ValueOf<string>(parameters, Context.Request, "promotionID", ParameterType.Path);
                Preconditions.IsNotNull(promotionID, "Required parameter: 'promotionID' is missing at 'GetPromotion'");
                
                return service.GetPromotion(Context, promotionID);
            };

            Get["/me/products/{productID}/specs/{specID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GetSpec'");
                
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'GetSpec'");
                
                return service.GetSpec(Context, productID, specID);
            };

            Get["/me/addresses"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListAddresses(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/categories"] = parameters =>
            {
                var depth = Parameters.ValueOf<string>(parameters, Context.Request, "depth", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListCategories(Context, depth, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/costcenters"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListCostCenters(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/creditcards"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListCreditCards(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/orders/incoming"] = parameters =>
            {
                var from = Parameters.ValueOf<string>(parameters, Context.Request, "from", ParameterType.Query);
                var to = Parameters.ValueOf<string>(parameters, Context.Request, "to", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListIncomingOrders(Context, from, to, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/orders/outgoing"] = parameters =>
            {
                var from = Parameters.ValueOf<string>(parameters, Context.Request, "from", ParameterType.Query);
                var to = Parameters.ValueOf<string>(parameters, Context.Request, "to", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListOutgoingOrders(Context, from, to, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/products"] = parameters =>
            {
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListProducts(Context, categoryID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/promotions"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListPromotions(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/products/{productID}/specs"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'ListSpecs'");
                
                return service.ListSpecs(Context, productID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/categories/{parentID}/categories"] = parameters =>
            {
                var parentID = Parameters.ValueOf<string>(parameters, Context.Request, "parentID", ParameterType.Path);
                var depth = Parameters.ValueOf<string>(parameters, Context.Request, "depth", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(parentID, "Required parameter: 'parentID' is missing at 'ListSubcategories'");
                
                return service.ListSubcategories(Context, parentID, depth, search, searchOn, sortBy, page, pageSize);
            };

            Get["/me/usergroups"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListUserGroups(Context, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/me"] = parameters =>
            {
                var user = this.Bind<User>();
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Patch'");
                
                return service.Patch(Context, user);
            };

            Patch["/me/addresses/{addressID}"] = parameters =>
            {
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                var address = this.Bind<BuyerAddress>();
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'PatchAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'PatchAddress'");
                
                service.PatchAddress(Context, addressID, address);
                return new Response { ContentType = ""};
            };

            Patch["/me/creditcards/{creditcardID}"] = parameters =>
            {
                var creditcardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditcardID", ParameterType.Path);
                var creditCard = this.Bind<BuyerCreditCard>();
                Preconditions.IsNotNull(creditcardID, "Required parameter: 'creditcardID' is missing at 'PatchCreditCard'");
                
                Preconditions.IsNotNull(creditCard, "Required parameter: 'creditCard' is missing at 'PatchCreditCard'");
                
                service.PatchCreditCard(Context, creditcardID, creditCard);
                return new Response { ContentType = ""};
            };

            Put["/me"] = parameters =>
            {
                var user = this.Bind<User>();
                Preconditions.IsNotNull(user, "Required parameter: 'user' is missing at 'Update'");
                
                return service.Update(Context, user);
            };

            Put["/me/addresses/{addressID}"] = parameters =>
            {
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                var address = this.Bind<BuyerAddress>();
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'UpdateAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'UpdateAddress'");
                
                return service.UpdateAddress(Context, addressID, address);
            };

            Put["/me/creditcards/{creditcardID}"] = parameters =>
            {
                var creditcardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditcardID", ParameterType.Path);
                var creditCard = this.Bind<BuyerCreditCard>();
                Preconditions.IsNotNull(creditcardID, "Required parameter: 'creditcardID' is missing at 'UpdateCreditCard'");
                
                Preconditions.IsNotNull(creditCard, "Required parameter: 'creditCard' is missing at 'UpdateCreditCard'");
                
                return service.UpdateCreditCard(Context, creditcardID, creditCard);
            };
        }
    }

    /// <summary>
    /// Service handling Me requests.
    /// </summary>
    public interface MeService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object CreateAddress(NancyContext context, BuyerAddress address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="creditCard"></param>
        /// <returns>Object</returns>
        Object CreateCreditCard(NancyContext context, BuyerCreditCard creditCard);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="addressID">ID of the address.</param>
        /// <returns></returns>
        void DeleteAddress(NancyContext context, string addressID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="creditcardID">ID of the creditcard.</param>
        /// <returns></returns>
        void DeleteCreditCard(NancyContext context, string creditcardID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="addressID">ID of the address.</param>
        /// <returns>Object</returns>
        Object GetAddress(NancyContext context, string addressID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="creditcardID">ID of the creditcard.</param>
        /// <returns>Object</returns>
        Object GetCreditCard(NancyContext context, string creditcardID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="orderID">ID of the order.</param>
        /// <returns>Object</returns>
        Object GetOrder(NancyContext context, string orderID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns>Object</returns>
        Object GetProduct(NancyContext context, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="promotionID">ID of the promotion.</param>
        /// <returns>Object</returns>
        Object GetPromotion(NancyContext context, string promotionID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="specID">ID of the spec.</param>
        /// <returns>Object</returns>
        Object GetSpec(NancyContext context, string productID, string specID);

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
        Object ListAddresses(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="depth">Depth of the category. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListCategories(NancyContext context, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListCostCenters(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListCreditCards(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="from">Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)</param>
        /// <param name="to">Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListIncomingOrders(NancyContext context, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="from">Lower bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)</param>
        /// <param name="to">Upper bound of date range that the order was created (if outgoing) or submitted (if incoming). (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListOutgoingOrders(NancyContext context, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="categoryID">ID of the category. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListProducts(NancyContext context, string categoryID, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListPromotions(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListSpecs(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="parentID">ID of the parent.</param>
        /// <param name="depth">Depth of the category. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListSubcategories(NancyContext context, string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListUserGroups(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="addressID">ID of the address.</param>
        /// <param name="address"></param>
        /// <returns></returns>
        void PatchAddress(NancyContext context, string addressID, BuyerAddress address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="creditcardID">ID of the creditcard.</param>
        /// <param name="creditCard"></param>
        /// <returns></returns>
        void PatchCreditCard(NancyContext context, string creditcardID, BuyerCreditCard creditCard);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="user"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, User user);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="addressID">ID of the address.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object UpdateAddress(NancyContext context, string addressID, BuyerAddress address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="creditcardID">ID of the creditcard.</param>
        /// <param name="creditCard"></param>
        /// <returns>Object</returns>
        Object UpdateCreditCard(NancyContext context, string creditcardID, BuyerCreditCard creditCard);
    }

    /// <summary>
    /// Abstraction of MeService.
    /// </summary>
    public abstract class AbstractMeService: MeService
    {
        public virtual Object CreateAddress(NancyContext context, BuyerAddress address)
        {
            return CreateAddress(address);
        }

        public virtual Object CreateCreditCard(NancyContext context, BuyerCreditCard creditCard)
        {
            return CreateCreditCard(creditCard);
        }

        public virtual void DeleteAddress(NancyContext context, string addressID)
        {
            DeleteAddress(addressID);
        }

        public virtual void DeleteCreditCard(NancyContext context, string creditcardID)
        {
            DeleteCreditCard(creditcardID);
        }

        public virtual Object Get(NancyContext context)
        {
            return Get();
        }

        public virtual Object GetAddress(NancyContext context, string addressID)
        {
            return GetAddress(addressID);
        }

        public virtual Object GetCreditCard(NancyContext context, string creditcardID)
        {
            return GetCreditCard(creditcardID);
        }

        public virtual Object GetOrder(NancyContext context, string orderID)
        {
            return GetOrder(orderID);
        }

        public virtual Object GetProduct(NancyContext context, string productID)
        {
            return GetProduct(productID);
        }

        public virtual Object GetPromotion(NancyContext context, string promotionID)
        {
            return GetPromotion(promotionID);
        }

        public virtual Object GetSpec(NancyContext context, string productID, string specID)
        {
            return GetSpec(productID, specID);
        }

        public virtual Object ListAddresses(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListAddresses(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListCategories(NancyContext context, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListCategories(depth, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListCostCenters(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListCostCenters(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListCreditCards(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListCreditCards(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListIncomingOrders(NancyContext context, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListIncomingOrders(from, to, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListOutgoingOrders(NancyContext context, string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListOutgoingOrders(from, to, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListProducts(NancyContext context, string categoryID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListProducts(categoryID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListPromotions(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListPromotions(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListSpecs(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListSpecs(productID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListSubcategories(NancyContext context, string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListSubcategories(parentID, depth, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListUserGroups(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListUserGroups(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, User user)
        {
            return Patch(user);
        }

        public virtual void PatchAddress(NancyContext context, string addressID, BuyerAddress address)
        {
            PatchAddress(addressID, address);
        }

        public virtual void PatchCreditCard(NancyContext context, string creditcardID, BuyerCreditCard creditCard)
        {
            PatchCreditCard(creditcardID, creditCard);
        }

        public virtual Object Update(NancyContext context, User user)
        {
            return Update(user);
        }

        public virtual Object UpdateAddress(NancyContext context, string addressID, BuyerAddress address)
        {
            return UpdateAddress(addressID, address);
        }

        public virtual Object UpdateCreditCard(NancyContext context, string creditcardID, BuyerCreditCard creditCard)
        {
            return UpdateCreditCard(creditcardID, creditCard);
        }

        protected abstract Object CreateAddress(BuyerAddress address);

        protected abstract Object CreateCreditCard(BuyerCreditCard creditCard);

        protected abstract void DeleteAddress(string addressID);

        protected abstract void DeleteCreditCard(string creditcardID);

        protected abstract Object Get();

        protected abstract Object GetAddress(string addressID);

        protected abstract Object GetCreditCard(string creditcardID);

        protected abstract Object GetOrder(string orderID);

        protected abstract Object GetProduct(string productID);

        protected abstract Object GetPromotion(string promotionID);

        protected abstract Object GetSpec(string productID, string specID);

        protected abstract Object ListAddresses(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListCategories(string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListCostCenters(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListCreditCards(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListIncomingOrders(string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListOutgoingOrders(string from, string to, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListProducts(string categoryID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListPromotions(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListSpecs(string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListSubcategories(string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListUserGroups(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(User user);

        protected abstract void PatchAddress(string addressID, BuyerAddress address);

        protected abstract void PatchCreditCard(string creditcardID, BuyerCreditCard creditCard);

        protected abstract Object Update(User user);

        protected abstract Object UpdateAddress(string addressID, BuyerAddress address);

        protected abstract Object UpdateCreditCard(string creditcardID, BuyerCreditCard creditCard);
    }

}
