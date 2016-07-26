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
    /// Module processing requests of EmailTemplate domain.
    /// </summary>
    public sealed class EmailTemplateModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public EmailTemplateModule(EmailTemplateService service) : base("/v1")
        { 
            Get["/buyers/{buyerID}/emailtemplates/{emailTemplateType}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var emailTemplateType = Parameters.ValueOf<string>(parameters, Context.Request, "emailTemplateType", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(emailTemplateType, "Required parameter: 'emailTemplateType' is missing at 'Get'");
                
                return service.Get(Context, buyerID, emailTemplateType);
            };

            Patch["/buyers/{buyerID}/emailtemplates/{emailTemplateType}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var emailTemplateType = Parameters.ValueOf<string>(parameters, Context.Request, "emailTemplateType", ParameterType.Path);
                var emailTemplate = this.Bind<EmailTemplate>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(emailTemplateType, "Required parameter: 'emailTemplateType' is missing at 'Patch'");
                
                Preconditions.IsNotNull(emailTemplate, "Required parameter: 'emailTemplate' is missing at 'Patch'");
                
                service.Patch(Context, buyerID, emailTemplateType, emailTemplate);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/emailtemplates/{emailTemplateType}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var emailTemplateType = Parameters.ValueOf<string>(parameters, Context.Request, "emailTemplateType", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ResetToDefault'");
                
                Preconditions.IsNotNull(emailTemplateType, "Required parameter: 'emailTemplateType' is missing at 'ResetToDefault'");
                
                service.ResetToDefault(Context, buyerID, emailTemplateType);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/emailtemplates/{emailTemplateType}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var emailTemplateType = Parameters.ValueOf<string>(parameters, Context.Request, "emailTemplateType", ParameterType.Path);
                var emailTemplate = this.Bind<EmailTemplate>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(emailTemplateType, "Required parameter: 'emailTemplateType' is missing at 'Update'");
                
                Preconditions.IsNotNull(emailTemplate, "Required parameter: 'emailTemplate' is missing at 'Update'");
                
                service.Update(Context, buyerID, emailTemplateType, emailTemplate);
                return new Response { ContentType = ""};
            };
        }
    }

    /// <summary>
    /// Service handling EmailTemplate requests.
    /// </summary>
    public interface EmailTemplateService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="emailTemplateType">Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string emailTemplateType);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="emailTemplateType">Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.</param>
        /// <param name="emailTemplate"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string buyerID, string emailTemplateType, EmailTemplate emailTemplate);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="emailTemplateType">Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.</param>
        /// <returns></returns>
        void ResetToDefault(NancyContext context, string buyerID, string emailTemplateType);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="emailTemplateType">Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.</param>
        /// <param name="emailTemplate"></param>
        /// <returns></returns>
        void Update(NancyContext context, string buyerID, string emailTemplateType, EmailTemplate emailTemplate);
    }

    /// <summary>
    /// Abstraction of EmailTemplateService.
    /// </summary>
    public abstract class AbstractEmailTemplateService: EmailTemplateService
    {
        public virtual Object Get(NancyContext context, string buyerID, string emailTemplateType)
        {
            return Get(buyerID, emailTemplateType);
        }

        public virtual void Patch(NancyContext context, string buyerID, string emailTemplateType, EmailTemplate emailTemplate)
        {
            Patch(buyerID, emailTemplateType, emailTemplate);
        }

        public virtual void ResetToDefault(NancyContext context, string buyerID, string emailTemplateType)
        {
            ResetToDefault(buyerID, emailTemplateType);
        }

        public virtual void Update(NancyContext context, string buyerID, string emailTemplateType, EmailTemplate emailTemplate)
        {
            Update(buyerID, emailTemplateType, emailTemplate);
        }

        protected abstract Object Get(string buyerID, string emailTemplateType);

        protected abstract void Patch(string buyerID, string emailTemplateType, EmailTemplate emailTemplate);

        protected abstract void ResetToDefault(string buyerID, string emailTemplateType);

        protected abstract void Update(string buyerID, string emailTemplateType, EmailTemplate emailTemplate);
    }

}
