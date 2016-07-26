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
    /// Module processing requests of PasswordReset domain.
    /// </summary>
    public sealed class PasswordResetModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PasswordResetModule(PasswordResetService service) : base("/v1")
        { 
            Put["/password/reset/{verificationCode}"] = parameters =>
            {
                var verificationCode = Parameters.ValueOf<string>(parameters, Context.Request, "verificationCode", ParameterType.Path);
                var passwordReset = this.Bind<PasswordReset>();
                Preconditions.IsNotNull(verificationCode, "Required parameter: 'verificationCode' is missing at 'ResetPassword'");
                
                Preconditions.IsNotNull(passwordReset, "Required parameter: 'passwordReset' is missing at 'ResetPassword'");
                
                service.ResetPassword(Context, verificationCode, passwordReset);
                return new Response { ContentType = ""};
            };

            Post["/password/reset"] = parameters =>
            {
                var passwordResetRequest = this.Bind<PasswordResetRequest>();
                Preconditions.IsNotNull(passwordResetRequest, "Required parameter: 'passwordResetRequest' is missing at 'SendVerificationCode'");
                
                service.SendVerificationCode(Context, passwordResetRequest);
                return new Response { ContentType = ""};
            };
        }
    }

    /// <summary>
    /// Service handling PasswordReset requests.
    /// </summary>
    public interface PasswordResetService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="verificationCode">Verification code of the forgotten password.</param>
        /// <param name="passwordReset"></param>
        /// <returns></returns>
        void ResetPassword(NancyContext context, string verificationCode, PasswordReset passwordReset);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="passwordResetRequest"></param>
        /// <returns></returns>
        void SendVerificationCode(NancyContext context, PasswordResetRequest passwordResetRequest);
    }

    /// <summary>
    /// Abstraction of PasswordResetService.
    /// </summary>
    public abstract class AbstractPasswordResetService: PasswordResetService
    {
        public virtual void ResetPassword(NancyContext context, string verificationCode, PasswordReset passwordReset)
        {
            ResetPassword(verificationCode, passwordReset);
        }

        public virtual void SendVerificationCode(NancyContext context, PasswordResetRequest passwordResetRequest)
        {
            SendVerificationCode(passwordResetRequest);
        }

        protected abstract void ResetPassword(string verificationCode, PasswordReset passwordReset);

        protected abstract void SendVerificationCode(PasswordResetRequest passwordResetRequest);
    }

}
