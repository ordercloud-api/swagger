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
    /// Module processing requests of Category domain.
    /// </summary>
    public sealed class CategoryModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CategoryModule(CategoryService service) : base("/v1")
        { 
            Post["/buyers/{buyerID}/categories"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var category = this.Bind<Category>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Create'");
                
                Preconditions.IsNotNull(category, "Required parameter: 'category' is missing at 'Create'");
                
                return service.Create(Context, buyerID, category);
            };

            Delete["/buyers/{buyerID}/categories/{categoryID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Delete'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'Delete'");
                
                service.Delete(Context, buyerID, categoryID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/categories/{categoryID}/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, categoryID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Delete["/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteProductAssignment'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'DeleteProductAssignment'");
                
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'DeleteProductAssignment'");
                
                service.DeleteProductAssignment(Context, buyerID, categoryID, productID);
                return new Response { ContentType = ""};
            };

            Get["/buyers/{buyerID}/categories/{categoryID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Get'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'Get'");
                
                return service.Get(Context, buyerID, categoryID);
            };

            Get["/buyers/{buyerID}/categories"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var parentID = Parameters.ValueOf<string>(parameters, Context.Request, "parentID", ParameterType.Query);
                var depth = Parameters.ValueOf<string>(parameters, Context.Request, "depth", ParameterType.Query);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'List'");
                
                return service.List(Context, buyerID, parentID, depth, search, searchOn, sortBy, page, pageSize);
            };

            Get["/buyers/{buyerID}/categories/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListAssignments'");
                
                return service.ListAssignments(Context, buyerID, categoryID, userID, userGroupID, level, page, pageSize);
            };

            Get["/buyers/{buyerID}/categories/{parentID}/categories"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var parentID = Parameters.ValueOf<string>(parameters, Context.Request, "parentID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var depth = Parameters.ValueOf<string>(parameters, Context.Request, "depth", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListChildren'");
                
                Preconditions.IsNotNull(parentID, "Required parameter: 'parentID' is missing at 'ListChildren'");
                
                return service.ListChildren(Context, buyerID, parentID, search, depth, page, pageSize);
            };

            Get["/buyers/{buyerID}/categories/productassignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Query);
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'ListProductAssignments'");
                
                return service.ListProductAssignments(Context, buyerID, categoryID, productID, page, pageSize);
            };

            Patch["/buyers/{buyerID}/categories/{categoryID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                var category = this.Bind<Category>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(category, "Required parameter: 'category' is missing at 'Patch'");
                
                service.Patch(Context, buyerID, categoryID, category);
                return new Response { ContentType = ""};
            };

            Post["/buyers/{buyerID}/categories/assignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryAssignment = this.Bind<CategoryAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveAssignment'");
                
                Preconditions.IsNotNull(categoryAssignment, "Required parameter: 'categoryAssignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, buyerID, categoryAssignment);
                return new Response { ContentType = ""};
            };

            Post["/buyers/{buyerID}/categories/productassignments"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var productAssignment = this.Bind<CategoryProductAssignment>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'SaveProductAssignment'");
                
                Preconditions.IsNotNull(productAssignment, "Required parameter: 'productAssignment' is missing at 'SaveProductAssignment'");
                
                service.SaveProductAssignment(Context, buyerID, productAssignment);
                return new Response { ContentType = ""};
            };

            Put["/buyers/{buyerID}/categories/{categoryID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var categoryID = Parameters.ValueOf<string>(parameters, Context.Request, "categoryID", ParameterType.Path);
                var category = this.Bind<Category>();
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'Update'");
                
                Preconditions.IsNotNull(categoryID, "Required parameter: 'categoryID' is missing at 'Update'");
                
                Preconditions.IsNotNull(category, "Required parameter: 'category' is missing at 'Update'");
                
                return service.Update(Context, buyerID, categoryID, category);
            };
        }
    }

    /// <summary>
    /// Service handling Category requests.
    /// </summary>
    public interface CategoryService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="category"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, string buyerID, Category category);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string buyerID, string categoryID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string categoryID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns></returns>
        void DeleteProductAssignment(NancyContext context, string buyerID, string categoryID, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string buyerID, string categoryID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="parentID">ID of the parent. (optional)</param>
        /// <param name="depth">Depth of the category. (optional)</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="searchOn">Comma-delimited list of fields to search on. (optional)</param>
        /// <param name="sortBy">Comma-delimited list of fields to sort by. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, string buyerID, string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the category. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string buyerID, string categoryID, string userID, string userGroupID, string level, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="parentID">ID of the parent.</param>
        /// <param name="search">Word or phrase to search for. (optional)</param>
        /// <param name="depth">Depth of the category. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListChildren(NancyContext context, string buyerID, string parentID, string search, string depth, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category. (optional)</param>
        /// <param name="productID">ID of the product. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListProductAssignments(NancyContext context, string buyerID, string categoryID, string productID, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <param name="category"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string buyerID, string categoryID, Category category);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryAssignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, string buyerID, CategoryAssignment categoryAssignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="productAssignment"></param>
        /// <returns></returns>
        void SaveProductAssignment(NancyContext context, string buyerID, CategoryProductAssignment productAssignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="categoryID">ID of the category.</param>
        /// <param name="category"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string buyerID, string categoryID, Category category);
    }

    /// <summary>
    /// Abstraction of CategoryService.
    /// </summary>
    public abstract class AbstractCategoryService: CategoryService
    {
        public virtual Object Create(NancyContext context, string buyerID, Category category)
        {
            return Create(buyerID, category);
        }

        public virtual void Delete(NancyContext context, string buyerID, string categoryID)
        {
            Delete(buyerID, categoryID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string categoryID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, categoryID, userID, userGroupID);
        }

        public virtual void DeleteProductAssignment(NancyContext context, string buyerID, string categoryID, string productID)
        {
            DeleteProductAssignment(buyerID, categoryID, productID);
        }

        public virtual Object Get(NancyContext context, string buyerID, string categoryID)
        {
            return Get(buyerID, categoryID);
        }

        public virtual Object List(NancyContext context, string buyerID, string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(buyerID, parentID, depth, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string buyerID, string categoryID, string userID, string userGroupID, string level, int? page, int? pageSize)
        {
            return ListAssignments(buyerID, categoryID, userID, userGroupID, level, page, pageSize);
        }

        public virtual Object ListChildren(NancyContext context, string buyerID, string parentID, string search, string depth, int? page, int? pageSize)
        {
            return ListChildren(buyerID, parentID, search, depth, page, pageSize);
        }

        public virtual Object ListProductAssignments(NancyContext context, string buyerID, string categoryID, string productID, int? page, int? pageSize)
        {
            return ListProductAssignments(buyerID, categoryID, productID, page, pageSize);
        }

        public virtual void Patch(NancyContext context, string buyerID, string categoryID, Category category)
        {
            Patch(buyerID, categoryID, category);
        }

        public virtual void SaveAssignment(NancyContext context, string buyerID, CategoryAssignment categoryAssignment)
        {
            SaveAssignment(buyerID, categoryAssignment);
        }

        public virtual void SaveProductAssignment(NancyContext context, string buyerID, CategoryProductAssignment productAssignment)
        {
            SaveProductAssignment(buyerID, productAssignment);
        }

        public virtual Object Update(NancyContext context, string buyerID, string categoryID, Category category)
        {
            return Update(buyerID, categoryID, category);
        }

        protected abstract Object Create(string buyerID, Category category);

        protected abstract void Delete(string buyerID, string categoryID);

        protected abstract void DeleteAssignment(string buyerID, string categoryID, string userID, string userGroupID);

        protected abstract void DeleteProductAssignment(string buyerID, string categoryID, string productID);

        protected abstract Object Get(string buyerID, string categoryID);

        protected abstract Object List(string buyerID, string parentID, string depth, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string buyerID, string categoryID, string userID, string userGroupID, string level, int? page, int? pageSize);

        protected abstract Object ListChildren(string buyerID, string parentID, string search, string depth, int? page, int? pageSize);

        protected abstract Object ListProductAssignments(string buyerID, string categoryID, string productID, int? page, int? pageSize);

        protected abstract void Patch(string buyerID, string categoryID, Category category);

        protected abstract void SaveAssignment(string buyerID, CategoryAssignment categoryAssignment);

        protected abstract void SaveProductAssignment(string buyerID, CategoryProductAssignment productAssignment);

        protected abstract Object Update(string buyerID, string categoryID, Category category);
    }

}
