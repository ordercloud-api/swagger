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
    /// Module processing requests of CostCenter domain.
    /// </summary>
    public sealed class CostCenterModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CostCenterModule(CostCenterService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/costcenters"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenter = this.Bind<CostCenter>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(costCenter, "Required parameter: 'costCenter' is missing at 'Create'");
                
                return service.Create(Context, buyerID, costCenter);
            };

            Delete["/buyers/{buyerID}/costcenters/{costCenterID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(costCenterID, "Required parameter: 'costCenterID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, costCenterID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/costcenters/{costCenterID}/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(costCenterID, "Required parameter: 'costCenterID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, costCenterID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/costcenters/{costCenterID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(costCenterID, "Required parameter: 'costCenterID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, costCenterID);
            };

            Get["/buyers/{buyerID}/costcenters"] = parameters =>
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

            Get["/buyers/{buyerID}/costcenters/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, costCenterID, userID, userGroupID, level, page, pageSize);
            };

            Patch["/buyers/{buyerID}/costcenters/{costCenterID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Path);
                var costCenter = this.Bind<CostCenter>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(costCenterID, "Required parameter: 'costCenterID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(costCenter, "Required parameter: 'costCenter' is missing at 'Patch'");
                
                return service.Patch(Context, buyerID, costCenterID, costCenter);
            };

            Post["/buyers/{buyerID}/costcenters/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var assignment = this.Bind<CostCenterAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveAssignment'");
                
                Preconditions.IsNotNull(assignment, "Required parameter: 'assignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, buyerID, assignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/costcenters/{costCenterID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var costCenterID = Parameters.ValueOf<string>(parameters, Context.Request, "costCenterID", ParameterType.Path);
                var costCenter = this.Bind<CostCenter>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(costCenterID, "Required parameter: 'costCenterID' is missing at 'Update'");
                
                Preconditions.IsNotNull(costCenter, "Required parameter: 'costCenter' is missing at 'Update'");
                
                return service.Update(Context, buyerID, costCenterID, costCenter);
            };
        }
    }

    /// <summary>
    /// Service handling CostCenter requests.
    /// </summary>
    public interface CostCenterService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenter"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, CostCenter costCenter);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenterID">ID of the cost center.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string costCenterID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenterID">ID of the cost center.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string costCenterID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenterID">ID of the cost center.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string costCenterID);

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
        /// <param name="costCenterID">ID of the cost center. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the cost center. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string costCenterID, string userID, string userGroupID, string level, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenterID">ID of the cost center.</param>
        /// <param name="costCenter"></param>
        /// <returns>Object</returns>
        Object Patch(NancyContext context, string buyerID, string costCenterID, CostCenter costCenter);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="assignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, string buyerID, CostCenterAssignment assignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="costCenterID">ID of the cost center.</param>
        /// <param name="costCenter"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string costCenterID, CostCenter costCenter);
    }

    /// <summary>
    /// Abstraction of CostCenterService.
    /// </summary>
    public abstract class AbstractCostCenterService: CostCenterService
    {
        public virtual Object Create(NancyContext context, string buyerID, CostCenter costCenter)
        {
            return Create(buyerID, costCenter);
        }

        public virtual void Delete(NancyContext context, string buyerID, string costCenterID)
        {
            Delete(buyerID, costCenterID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string costCenterID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, costCenterID, userID, userGroupID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string costCenterID)
        {
            return Get(buyerID, costCenterID);
        }

        public virtual Object List(NancyContext context, string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string costCenterID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, costCenterID, userID, userGroupID, level, page, pageSize);
        }

        public virtual Object Patch(NancyContext context, string buyerID, string costCenterID, CostCenter costCenter)
        {
            return Patch(buyerID, costCenterID, costCenter);
        }

        public virtual void SaveAssignment(NancyContext context, string buyerID, CostCenterAssignment assignment)
        {
            SaveAssignment(buyerID, assignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string costCenterID, CostCenter costCenter)
        {
            return Update(buyerID, costCenterID, costCenter);
        }

        protected abstract Object Create(string buyerID, CostCenter costCenter);

        protected abstract void Delete(string buyerID, string costCenterID);

        protected abstract void DeleteAssignment(string buyerID, string costCenterID, string userID, string userGroupID);

        protected abstract Object Get(string buyerID, string costCenterID);

        protected abstract Object List(string buyerID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string costCenterID, string userID, string userGroupID, string level, int? page, int? pageSize);

        protected abstract Object Patch(string buyerID, string costCenterID, CostCenter costCenter);

        protected abstract void SaveAssignment(string buyerID, CostCenterAssignment assignment);

        protected abstract Object Update(string buyerID, string costCenterID, CostCenter costCenter);
    }

}
