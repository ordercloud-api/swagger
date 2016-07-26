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
    /// Module processing requests of Address domain.
    /// </summary>
    public sealed class AddressModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public AddressModule(AddressService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/addresses"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'Create'");
                
                return service.Create(Context, buyerID, address);
            };

            Delete["/buyers/{buyerID}/addresses/{addressID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, addressID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/addresses/{addressID}/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, addressID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/addresses/{addressID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, addressID);
            };

            Get["/buyers/{buyerID}/addresses"] = parameters =>
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

            Get["/buyers/{buyerID}/addresses/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var isShipping = Parameters.ValueOf<bool?>(parameters, Context.Request, "isShipping", ParameterType.Query);
                var isBilling = Parameters.ValueOf<bool?>(parameters, Context.Request, "isBilling", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, addressID, userID, userGroupID, level, isShipping, isBilling, page, pageSize);
            };

            Patch["/buyers/{buyerID}/addresses/{addressID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, addressID, address);
            };

            Post["/buyers/{buyerID}/addresses/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var assignment = this.Bind<AddressAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveAssignment'");
                
                Preconditions.IsNotNull(assignment, "Required parameter: 'assignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, buyerID, assignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/addresses/{addressID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var addressID = Parameters.ValueOf<string>(parameters, Context.Request, "addressID", ParameterType.Path);
                var address = this.Bind<Address>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(addressID, "Required parameter: 'addressID' is missing at 'Update'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'Update'");
                
                return service.Update(Context, buyerID, addressID, address);
            };
        }
    }

    /// <summary>
    /// Service handling Address requests.
    /// </summary>
    public interface AddressService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="addressID">ID of the address.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string addressID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="addressID">ID of the address.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string addressID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="addressID">ID of the address.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string addressID);

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
        /// <param name="addressID">ID of the address. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the address. (optional)</param>
        /// <param name="isShipping">Is shipping of the address. (optional)</param>
        /// <param name="isBilling">Is billing of the address. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string addressID, string userID, string userGroupID, string level, bool? isShipping, bool? isBilling, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="addressID">ID of the address.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string addressID, Address address);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, string buyerID, AddressAssignment assignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="addressID">ID of the address.</param>
        /// <param name="address"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string addressID, Address address);
    }

    /// <summary>
    /// Abstraction of AddressService.
    /// </summary>
    public abstract class AbstractAddressService: AddressService
    {
        public virtual Object Create(NancyContext context, string buyerID, Address address)
        {
            return Create(buyerID, address);
        }

        public virtual void Delete(NancyContext context, string buyerID, string addressID)
        {
            Delete(buyerID, addressID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string addressID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, addressID, userID, userGroupID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string addressID)
        {
            return Get(buyerID, addressID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string addressID, string userID, string userGroupID, string level, bool? isShipping, bool? isBilling, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, addressID, userID, userGroupID, level, isShipping, isBilling, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string addressID, Address address)
        {
            return Patch(buyerID, addressID, address);
        }

        public virtual void SaveAssignment(NancyContext context, string buyerID, AddressAssignment assignment)
        {
            SaveAssignment(buyerID, assignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string addressID, Address address)
        {
            return Update(buyerID, addressID, address);
        }

        protected abstract Object Create(string buyerID, Address address);

        protected abstract void Delete(string buyerID, string addressID);

        protected abstract void DeleteAssignment(string buyerID, string addressID, string userID, string userGroupID);

        protected abstract Object Get(string buyerID, string addressID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string addressID, string userID, string userGroupID, string level, bool? isShipping, bool? isBilling, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string addressID, Address address);

        protected abstract void SaveAssignment(string buyerID, AddressAssignment assignment);

        protected abstract Object Update(string buyerID, string addressID, Address address);
    }

}
