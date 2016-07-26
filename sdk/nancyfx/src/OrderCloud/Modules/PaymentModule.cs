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
    /// Module processing requests of Payment domain.
    /// </summary>
    public sealed class PaymentModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PaymentModule(PaymentService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/orders/{orderID}/payments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var payment = this.Bind<Payment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Create'");
                
                Preconditions.IsNotNull(payment, "Required parameter: 'payment' is missing at 'Create'");
                
                return service.Create(Context, buyerID, orderID, payment);
            };

            Post["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var transaction = this.Bind<PaymentTransaction>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'CreateTransaction'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'CreateTransaction'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'CreateTransaction'");
                
                Preconditions.IsNotNull(transaction, "Required parameter: 'transaction' is missing at 'CreateTransaction'");
                
                return service.CreateTransaction(Context, buyerID, orderID, paymentID, transaction);
            };

            Delete["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, orderID, paymentID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var transactionID = Parameters.ValueOf<string>(parameters, Context.Request, "transactionID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteTransaction'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'DeleteTransaction'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'DeleteTransaction'");
                
                Preconditions.IsNotNull(transactionID, "Required parameter: 'transactionID' is missing at 'DeleteTransaction'");
                
                service.DeleteTransaction(Context, buyerID, orderID, paymentID, transactionID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Get'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, orderID, paymentID);
            };

            Get["/buyers/{buyerID}/orders/{orderID}/payments"] = parameters =>
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

            Patch["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var partialPayment = this.Bind<Payment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(partialPayment, "Required parameter: 'partialPayment' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, orderID, paymentID, partialPayment);
            };

            Patch["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var transactionID = Parameters.ValueOf<string>(parameters, Context.Request, "transactionID", ParameterType.Path);
                var partialTransaction = this.Bind<PaymentTransaction>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'PatchTransaction'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'PatchTransaction'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'PatchTransaction'");
                
                Preconditions.IsNotNull(transactionID, "Required parameter: 'transactionID' is missing at 'PatchTransaction'");
                
                Preconditions.IsNotNull(partialTransaction, "Required parameter: 'partialTransaction' is missing at 'PatchTransaction'");
                
                return service.PatchTransaction(Context, buyerID, orderID, paymentID, transactionID, partialTransaction);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var payment = this.Bind<Payment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'Update'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'Update'");
                
                Preconditions.IsNotNull(payment, "Required parameter: 'payment' is missing at 'Update'");
                
                return service.Update(Context, buyerID, orderID, paymentID, payment);
            };

            Put["/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var orderID = Parameters.ValueOf<string>(parameters, Context.Request, "orderID", ParameterType.Path);
                var paymentID = Parameters.ValueOf<string>(parameters, Context.Request, "paymentID", ParameterType.Path);
                var transactionID = Parameters.ValueOf<string>(parameters, Context.Request, "transactionID", ParameterType.Path);
                var transaction = this.Bind<PaymentTransaction>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'UpdateTransaction'");
                
                Preconditions.IsNotNull(orderID, "Required parameter: 'orderID' is missing at 'UpdateTransaction'");
                
                Preconditions.IsNotNull(paymentID, "Required parameter: 'paymentID' is missing at 'UpdateTransaction'");
                
                Preconditions.IsNotNull(transactionID, "Required parameter: 'transactionID' is missing at 'UpdateTransaction'");
                
                Preconditions.IsNotNull(transaction, "Required parameter: 'transaction' is missing at 'UpdateTransaction'");
                
                return service.UpdateTransaction(Context, buyerID, orderID, paymentID, transactionID, transaction);
            };
        }
    }

    /// <summary>
    /// Service handling Payment requests.
    /// </summary>
    public interface PaymentService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="payment"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, string orderID, Payment payment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transaction"></param>
        /// <returns>Object</returns>
        Object CreateTransaction(NancyContext context, string buyerID, string orderID, string paymentID, PaymentTransaction transaction);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string orderID, string paymentID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <returns></returns>
        void DeleteTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string orderID, string paymentID);

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
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="partialPayment"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string orderID, string paymentID, Payment partialPayment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <param name="partialTransaction"></param>
        /// <returns>Object</returns>
        Object PatchTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction partialTransaction);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="payment"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string orderID, string paymentID, Payment payment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="orderID">ID of the order.</param>
        /// <param name="paymentID">ID of the payment.</param>
        /// <param name="transactionID">ID of the transaction.</param>
        /// <param name="transaction"></param>
        /// <returns>Object</returns>
        Object UpdateTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction transaction);
    }

    /// <summary>
    /// Abstraction of PaymentService.
    /// </summary>
    public abstract class AbstractPaymentService: PaymentService
    {
        public virtual Object Create(NancyContext context, string buyerID, string orderID, Payment payment)
        {
            return Create(buyerID, orderID, payment);
        }

        public virtual Object CreateTransaction(NancyContext context, string buyerID, string orderID, string paymentID, PaymentTransaction transaction)
        {
            return CreateTransaction(buyerID, orderID, paymentID, transaction);
        }

        public virtual void Delete(NancyContext context, string buyerID, string orderID, string paymentID)
        {
            Delete(buyerID, orderID, paymentID);
        }

        public virtual void DeleteTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID)
        {
            DeleteTransaction(buyerID, orderID, paymentID, transactionID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string orderID, string paymentID)
        {
            return Get(buyerID, orderID, paymentID);
        }

        public virtual Object List(NancyContext context, string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, orderID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string orderID, string paymentID, Payment partialPayment)
        {
            return Patch(buyerID, orderID, paymentID, partialPayment);
        }

        public virtual Object PatchTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction partialTransaction)
        {
            return PatchTransaction(buyerID, orderID, paymentID, transactionID, partialTransaction);
        }

        public virtual Object Update(NancyContext context, string buyerID, string orderID, string paymentID, Payment payment)
        {
            return Update(buyerID, orderID, paymentID, payment);
        }

        public virtual Object UpdateTransaction(NancyContext context, string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction transaction)
        {
            return UpdateTransaction(buyerID, orderID, paymentID, transactionID, transaction);
        }

        protected abstract Object Create(string buyerID, string orderID, Payment payment);

        protected abstract Object CreateTransaction(string buyerID, string orderID, string paymentID, PaymentTransaction transaction);

        protected abstract void Delete(string buyerID, string orderID, string paymentID);

        protected abstract void DeleteTransaction(string buyerID, string orderID, string paymentID, string transactionID);

        protected abstract Object Get(string buyerID, string orderID, string paymentID);

        protected abstract Object List(string buyerID, string orderID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string orderID, string paymentID, Payment partialPayment);

        protected abstract Object PatchTransaction(string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction partialTransaction);

        protected abstract Object Update(string buyerID, string orderID, string paymentID, Payment payment);

        protected abstract Object UpdateTransaction(string buyerID, string orderID, string paymentID, string transactionID, PaymentTransaction transaction);
    }

}
