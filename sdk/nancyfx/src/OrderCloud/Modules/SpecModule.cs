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
    /// Module processing requests of Spec domain.
    /// </summary>
    public sealed class SpecModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SpecModule(SpecService service) : base("/v1")
        { 
            Post["/specs"] = parameters =>
            {
                var spec = this.Bind<Spec>();
                Preconditions.IsNotNull(spec, "Required parameter: 'spec' is missing at 'Create'");
                
                return service.Create(Context, spec);
            };

            Post["/specs/{specID}/options"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var option = this.Bind<SpecOption>();
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'CreateOption'");
                
                Preconditions.IsNotNull(option, "Required parameter: 'option' is missing at 'CreateOption'");
                
                return service.CreateOption(Context, specID, option);
            };

            Delete["/specs/{specID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'Delete'");
                
                service.Delete(Context, specID);
                return new Response { ContentType = ""};
            };

            Delete["/specs/{specID}/options/{optionID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var optionID = Parameters.ValueOf<string>(parameters, Context.Request, "optionID", ParameterType.Path);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'DeleteOption'");
                
                Preconditions.IsNotNull(optionID, "Required parameter: 'optionID' is missing at 'DeleteOption'");
                
                service.DeleteOption(Context, specID, optionID);
                return new Response { ContentType = ""};
            };

            Delete["/specs/{specID}/productassignments/{productID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'DeleteProductAssignment'");
                
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'DeleteProductAssignment'");
                
                service.DeleteProductAssignment(Context, specID, productID);
                return new Response { ContentType = ""};
            };

            Get["/specs/{specID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'Get'");
                
                return service.Get(Context, specID);
            };

            Get["/specs/{specID}/options/{optionID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var optionID = Parameters.ValueOf<string>(parameters, Context.Request, "optionID", ParameterType.Path);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'GetOption'");
                
                Preconditions.IsNotNull(optionID, "Required parameter: 'optionID' is missing at 'GetOption'");
                
                return service.GetOption(Context, specID, optionID);
            };

            Get["/specs"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/specs/{specID}/options"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'ListOptions'");
                
                return service.ListOptions(Context, specID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/specs/productassignments"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Query);
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListProductAssignments(Context, specID, productID, page, pageSize);
            };

            Patch["/specs/{specID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var spec = this.Bind<Spec>();
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(spec, "Required parameter: 'spec' is missing at 'Patch'");
                
                return service.Patch(Context, specID, spec);
            };

            Patch["/specs/{specID}/options/{optionID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var optionID = Parameters.ValueOf<string>(parameters, Context.Request, "optionID", ParameterType.Path);
                var option = this.Bind<SpecOption>();
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'PatchOption'");
                
                Preconditions.IsNotNull(optionID, "Required parameter: 'optionID' is missing at 'PatchOption'");
                
                Preconditions.IsNotNull(option, "Required parameter: 'option' is missing at 'PatchOption'");
                
                return service.PatchOption(Context, specID, optionID, option);
            };

            Post["/specs/productassignments"] = parameters =>
            {
                var productAssignment = this.Bind<SpecProductAssignment>();
                Preconditions.IsNotNull(productAssignment, "Required parameter: 'productAssignment' is missing at 'SaveProductAssignment'");
                
                service.SaveProductAssignment(Context, productAssignment);
                return new Response { ContentType = ""};
            };

            Put["/specs/{specID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var spec = this.Bind<Spec>();
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'Update'");
                
                Preconditions.IsNotNull(spec, "Required parameter: 'spec' is missing at 'Update'");
                
                return service.Update(Context, specID, spec);
            };

            Put["/specs/{specID}/options/{optionID}"] = parameters =>
            {
                var specID = Parameters.ValueOf<string>(parameters, Context.Request, "specID", ParameterType.Path);
                var optionID = Parameters.ValueOf<string>(parameters, Context.Request, "optionID", ParameterType.Path);
                var option = this.Bind<SpecOption>();
                Preconditions.IsNotNull(specID, "Required parameter: 'specID' is missing at 'UpdateOption'");
                
                Preconditions.IsNotNull(optionID, "Required parameter: 'optionID' is missing at 'UpdateOption'");
                
                Preconditions.IsNotNull(option, "Required parameter: 'option' is missing at 'UpdateOption'");
                
                return service.UpdateOption(Context, specID, optionID, option);
            };
        }
    }

    /// <summary>
    /// Service handling Spec requests.
    /// </summary>
    public interface SpecService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, Spec spec);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object CreateOption(NancyContext context, string specID, SpecOption option);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string specID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <returns></returns>
        void DeleteOption(NancyContext context, string specID, string optionID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns></returns>
        void DeleteProductAssignment(NancyContext context, string specID, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string specID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <returns>Object</returns>
        Object GetOption(NancyContext context, string specID, string optionID);

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

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListOptions(NancyContext context, string specID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec. (optional)</param>
        /// <param name="productID">ID of the product. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListProductAssignments(NancyContext context, string specID, string productID, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string specID, Spec spec);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object PatchOption(NancyContext context, string specID, string optionID, SpecOption option);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productAssignment"></param>
        /// <returns></returns>
        void SaveProductAssignment(NancyContext context, SpecProductAssignment productAssignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="spec"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string specID, Spec spec);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="specID">ID of the spec.</param>
        /// <param name="optionID">ID of the option.</param>
        /// <param name="option"></param>
        /// <returns>Object</returns>
        Object UpdateOption(NancyContext context, string specID, string optionID, SpecOption option);
    }

    /// <summary>
    /// Abstraction of SpecService.
    /// </summary>
    public abstract class AbstractSpecService: SpecService
    {
        public virtual Object Create(NancyContext context, Spec spec)
        {
            return Create(spec);
        }

        public virtual Object CreateOption(NancyContext context, string specID, SpecOption option)
        {
            return CreateOption(specID, option);
        }

        public virtual void Delete(NancyContext context, string specID)
        {
            Delete(specID);
        }

        public virtual void DeleteOption(NancyContext context, string specID, string optionID)
        {
            DeleteOption(specID, optionID);
        }

        public virtual void DeleteProductAssignment(NancyContext context, string specID, string productID)
        {
            DeleteProductAssignment(specID, productID);
        }

        public virtual Object Get(NancyContext context, string specID)
        {
            return Get(specID);
        }

        public virtual Object GetOption(NancyContext context, string specID, string optionID)
        {
            return GetOption(specID, optionID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListOptions(NancyContext context, string specID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListOptions(specID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListProductAssignments(NancyContext context, string specID, string productID, int? page, int? pageSize)
        {
            return ListProductAssignments(specID, productID, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string specID, Spec spec)
        {
            return Patch(specID, spec);
        }

        public virtual Object PatchOption(NancyContext context, string specID, string optionID, SpecOption option)
        {
            return PatchOption(specID, optionID, option);
        }

        public virtual void SaveProductAssignment(NancyContext context, SpecProductAssignment productAssignment)
        {
            SaveProductAssignment(productAssignment);
        }

        public virtual Object Update(NancyContext context, string specID, Spec spec)
        {
            return Update(specID, spec);
        }

        public virtual Object UpdateOption(NancyContext context, string specID, string optionID, SpecOption option)
        {
            return UpdateOption(specID, optionID, option);
        }

        protected abstract Object Create(Spec spec);

        protected abstract Object CreateOption(string specID, SpecOption option);

        protected abstract void Delete(string specID);

        protected abstract void DeleteOption(string specID, string optionID);

        protected abstract void DeleteProductAssignment(string specID, string productID);

        protected abstract Object Get(string specID);

        protected abstract Object GetOption(string specID, string optionID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListOptions(string specID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListProductAssignments(string specID, string productID, int? page, int? pageSize);

        protected abstract Object Patch(string specID, Spec spec);

        protected abstract Object PatchOption(string specID, string optionID, SpecOption option);

        protected abstract void SaveProductAssignment(SpecProductAssignment productAssignment);

        protected abstract Object Update(string specID, Spec spec);

        protected abstract Object UpdateOption(string specID, string optionID, SpecOption option);
    }

}
