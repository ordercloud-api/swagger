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
    /// Module processing requests of SecurityProfile domain.
    /// </summary>
    public sealed class SecurityProfileModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SecurityProfileModule(SecurityProfileService service) : base("/v1")
        { 
            Get["/SecurityProfiles/{securityProfileID}"] = parameters =>
            {
                var securityProfileID = Parameters.ValueOf<string>(parameters, Context.Request, "securityProfileID", ParameterType.Path);
                Preconditions.IsNotNull(securityProfileID, "Required parameter: 'securityProfileID' is missing at 'Get'");
                
                return service.Get(Context, securityProfileID);
            };

            Get["/SecurityProfiles"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };
        }
    }

    /// <summary>
    /// Service handling SecurityProfile requests.
    /// </summary>
    public interface SecurityProfileService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="securityProfileID">ID of the security profile.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string securityProfileID);

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
    }

    /// <summary>
    /// Abstraction of SecurityProfileService.
    /// </summary>
    public abstract class AbstractSecurityProfileService: SecurityProfileService
    {
        public virtual Object Get(NancyContext context, string securityProfileID)
        {
            return Get(securityProfileID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        protected abstract Object Get(string securityProfileID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);
    }

}
