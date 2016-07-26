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
    /// Module processing requests of CreditCard domain.
    /// </summary>
    public sealed class CreditCardModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CreditCardModule(CreditCardService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/creditcards"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var card = this.Bind<CreditCard>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(card, "Required parameter: 'card' is missing at 'Create'");
                
                return service.Create(Context, buyerID, card);
            };

            Delete["/buyers/{buyerID}/creditcards/{creditCardID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(creditCardID, "Required parameter: 'creditCardID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, creditCardID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/creditcards/{creditCardID}/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(creditCardID, "Required parameter: 'creditCardID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, creditCardID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/creditcards/{creditCardID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(creditCardID, "Required parameter: 'creditCardID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, creditCardID);
            };

            Get["/buyers/{buyerID}/creditcards"] = parameters =>
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

            Get["/buyers/{buyerID}/creditcards/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, creditCardID, userID, userGroupID, level, page, pageSize);
            };

            Patch["/buyers/{buyerID}/creditcards/{creditCardID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Path);
                var card = this.Bind<CreditCard>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(creditCardID, "Required parameter: 'creditCardID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(card, "Required parameter: 'card' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, creditCardID, card);
            };

            Post["/buyers/{buyerID}/creditcards/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var assignment = this.Bind<CreditCardAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveAssignment'");
                
                Preconditions.IsNotNull(assignment, "Required parameter: 'assignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, buyerID, assignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/creditcards/{creditCardID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var creditCardID = Parameters.ValueOf<string>(parameters, Context.Request, "creditCardID", ParameterType.Path);
                var card = this.Bind<CreditCard>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(creditCardID, "Required parameter: 'creditCardID' is missing at 'Update'");
                
                Preconditions.IsNotNull(card, "Required parameter: 'card' is missing at 'Update'");
                
                return service.Update(Context, buyerID, creditCardID, card);
            };
        }
    }

    /// <summary>
    /// Service handling CreditCard requests.
    /// </summary>
    public interface CreditCardService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="card"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, CreditCard card);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="creditCardID">ID of the credit card.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string creditCardID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="creditCardID">ID of the credit card.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string creditCardID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="creditCardID">ID of the credit card.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string creditCardID);

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
        /// <param name="creditCardID">ID of the credit card. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the credit card. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string creditCardID, string userID, string userGroupID, string level, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="creditCardID">ID of the credit card.</param>
        /// <param name="card"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string creditCardID, CreditCard card);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, string buyerID, CreditCardAssignment assignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="creditCardID">ID of the credit card.</param>
        /// <param name="card"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string creditCardID, CreditCard card);
    }

    /// <summary>
    /// Abstraction of CreditCardService.
    /// </summary>
    public abstract class AbstractCreditCardService: CreditCardService
    {
        public virtual Object Create(NancyContext context, string buyerID, CreditCard card)
        {
            return Create(buyerID, card);
        }

        public virtual void Delete(NancyContext context, string buyerID, string creditCardID)
        {
            Delete(buyerID, creditCardID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string creditCardID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, creditCardID, userID, userGroupID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string creditCardID)
        {
            return Get(buyerID, creditCardID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string creditCardID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, creditCardID, userID, userGroupID, level, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string creditCardID, CreditCard card)
        {
            return Patch(buyerID, creditCardID, card);
        }

        public virtual void SaveAssignment(NancyContext context, string buyerID, CreditCardAssignment assignment)
        {
            SaveAssignment(buyerID, assignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string creditCardID, CreditCard card)
        {
            return Update(buyerID, creditCardID, card);
        }

        protected abstract Object Create(string buyerID, CreditCard card);

        protected abstract void Delete(string buyerID, string creditCardID);

        protected abstract void DeleteAssignment(string buyerID, string creditCardID, string userID, string userGroupID);

        protected abstract Object Get(string buyerID, string creditCardID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string creditCardID, string userID, string userGroupID, string level, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string creditCardID, CreditCard card);

        protected abstract void SaveAssignment(string buyerID, CreditCardAssignment assignment);

        protected abstract Object Update(string buyerID, string creditCardID, CreditCard card);
    }

}
