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
    /// Module processing requests of Product domain.
    /// </summary>
    public sealed class ProductModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ProductModule(ProductService service) : base("/v1")
        { 
            Post["/products"] = parameters =>
            {
                var product = this.Bind<Product>();
                Preconditions.IsNotNull(product, "Required parameter: 'product' is missing at 'Create'");
                
                return service.Create(Context, product);
            };

            Delete["/products/{productID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'Delete'");
                
                service.Delete(Context, productID);
                return new Response { ContentType = ""};
            };

            Delete["/products/{productID}/assignments/{buyerID}"] = parameters =>
            {
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Path);
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                Preconditions.IsNotNull(buyerID, "Required parameter: 'buyerID' is missing at 'DeleteAssignment'");
                
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'DeleteAssignment'");
                
                service.DeleteAssignment(Context, buyerID, productID, userID, userGroupID);
                return new Response { ContentType = ""};
            };

            Post["/products/{productID}/variants/generate"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var overwriteExisting = Parameters.ValueOf<bool?>(parameters, Context.Request, "overwriteExisting", ParameterType.Query);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GenerateVariants'");
                
                return service.GenerateVariants(Context, productID, overwriteExisting);
            };

            Get["/products/{productID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'Get'");
                
                return service.Get(Context, productID);
            };

            Get["/products/{productID}/inventory"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GetInventory'");
                
                return service.GetInventory(Context, productID);
            };

            Get["/products/{productID}/variants/{variantID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var variantID = Parameters.ValueOf<string>(parameters, Context.Request, "variantID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GetVariant'");
                
                Preconditions.IsNotNull(variantID, "Required parameter: 'variantID' is missing at 'GetVariant'");
                
                return service.GetVariant(Context, productID, variantID);
            };

            Get["/products/{productID}/variants/inventory/{variantID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var variantID = Parameters.ValueOf<string>(parameters, Context.Request, "variantID", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'GetVariantInventory'");
                
                Preconditions.IsNotNull(variantID, "Required parameter: 'variantID' is missing at 'GetVariantInventory'");
                
                return service.GetVariantInventory(Context, productID, variantID);
            };

            Get["/products"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/products/assignments"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Query);
                var buyerID = Parameters.ValueOf<string>(parameters, Context.Request, "buyerID", ParameterType.Query);
                var userID = Parameters.ValueOf<string>(parameters, Context.Request, "userID", ParameterType.Query);
                var userGroupID = Parameters.ValueOf<string>(parameters, Context.Request, "userGroupID", ParameterType.Query);
                var level = Parameters.ValueOf<string>(parameters, Context.Request, "level", ParameterType.Query);
                var priceScheduleID = Parameters.ValueOf<string>(parameters, Context.Request, "priceScheduleID", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListAssignments(Context, productID, buyerID, userID, userGroupID, level, priceScheduleID, page, pageSize);
            };

            Get["/products/inventory"] = parameters =>
            {
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.ListInventory(Context, search, searchOn, sortBy, page, pageSize);
            };

            Get["/products/{productID}/variants/inventory"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'ListVariantInventory'");
                
                return service.ListVariantInventory(Context, productID, search, searchOn, sortBy, page, pageSize);
            };

            Get["/products/{productID}/variants"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var search = Parameters.ValueOf<string>(parameters, Context.Request, "search", ParameterType.Query);
                var searchOn = Parameters.ValueOf<string>(parameters, Context.Request, "searchOn", ParameterType.Query);
                var sortBy = Parameters.ValueOf<string>(parameters, Context.Request, "sortBy", ParameterType.Query);
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'ListVariants'");
                
                return service.ListVariants(Context, productID, search, searchOn, sortBy, page, pageSize);
            };

            Patch["/products/{productID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var product = this.Bind<Product>();
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'Patch'");
                
                Preconditions.IsNotNull(product, "Required parameter: 'product' is missing at 'Patch'");
                
                service.Patch(Context, productID, product);
                return new Response { ContentType = ""};
            };

            Patch["/products/{productID}/variants/{variantID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var variantID = Parameters.ValueOf<string>(parameters, Context.Request, "variantID", ParameterType.Path);
                var variant = this.Bind<Variant>();
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'PatchVariant'");
                
                Preconditions.IsNotNull(variantID, "Required parameter: 'variantID' is missing at 'PatchVariant'");
                
                Preconditions.IsNotNull(variant, "Required parameter: 'variant' is missing at 'PatchVariant'");
                
                return service.PatchVariant(Context, productID, variantID, variant);
            };

            Post["/products/assignments"] = parameters =>
            {
                var productAssignment = this.Bind<ProductAssignment>();
                Preconditions.IsNotNull(productAssignment, "Required parameter: 'productAssignment' is missing at 'SaveAssignment'");
                
                service.SaveAssignment(Context, productAssignment);
                return new Response { ContentType = ""};
            };

            Put["/products/{productID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var product = this.Bind<Product>();
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'Update'");
                
                Preconditions.IsNotNull(product, "Required parameter: 'product' is missing at 'Update'");
                
                return service.Update(Context, productID, product);
            };

            Put["/products/{productID}/inventory/{inventory}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var inventory = Parameters.ValueOf<int?>(parameters, Context.Request, "inventory", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'UpdateInventory'");
                
                Preconditions.IsNotNull(inventory, "Required parameter: 'inventory' is missing at 'UpdateInventory'");
                
                return service.UpdateInventory(Context, productID, inventory);
            };

            Put["/products/{productID}/variants/{variantID}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var variantID = Parameters.ValueOf<string>(parameters, Context.Request, "variantID", ParameterType.Path);
                var variant = this.Bind<Variant>();
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'UpdateVariant'");
                
                Preconditions.IsNotNull(variantID, "Required parameter: 'variantID' is missing at 'UpdateVariant'");
                
                Preconditions.IsNotNull(variant, "Required parameter: 'variant' is missing at 'UpdateVariant'");
                
                return service.UpdateVariant(Context, productID, variantID, variant);
            };

            Put["/products/{productID}/variants/inventory/{variantID}/{inventory}"] = parameters =>
            {
                var productID = Parameters.ValueOf<string>(parameters, Context.Request, "productID", ParameterType.Path);
                var variantID = Parameters.ValueOf<string>(parameters, Context.Request, "variantID", ParameterType.Path);
                var inventory = Parameters.ValueOf<int?>(parameters, Context.Request, "inventory", ParameterType.Path);
                Preconditions.IsNotNull(productID, "Required parameter: 'productID' is missing at 'UpdateVariantInventory'");
                
                Preconditions.IsNotNull(variantID, "Required parameter: 'variantID' is missing at 'UpdateVariantInventory'");
                
                Preconditions.IsNotNull(inventory, "Required parameter: 'inventory' is missing at 'UpdateVariantInventory'");
                
                return service.UpdateVariantInventory(Context, productID, variantID, inventory);
            };
        }
    }

    /// <summary>
    /// Service handling Product requests.
    /// </summary>
    public interface ProductService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="product"></param>
        /// <returns>Object</returns>
        Object Create(NancyContext context, Product product);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns></returns>
        void Delete(NancyContext context, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="buyerID">ID of the buyer.</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <returns></returns>
        void DeleteAssignment(NancyContext context, string buyerID, string productID, string userID, string userGroupID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="overwriteExisting">Overwrite existing of the product. (optional)</param>
        /// <returns>Object</returns>
        Object GenerateVariants(NancyContext context, string productID, bool? overwriteExisting);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <returns>Object</returns>
        Object GetInventory(NancyContext context, string productID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <returns>Object</returns>
        Object GetVariant(NancyContext context, string productID, string variantID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <returns>Object</returns>
        Object GetVariantInventory(NancyContext context, string productID, string variantID);

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
        /// <param name="productID">ID of the product. (optional)</param>
        /// <param name="buyerID">ID of the buyer. (optional)</param>
        /// <param name="userID">ID of the user. (optional)</param>
        /// <param name="userGroupID">ID of the user group. (optional)</param>
        /// <param name="level">Level of the product. (optional)</param>
        /// <param name="priceScheduleID">ID of the price schedule. (optional)</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object ListAssignments(NancyContext context, string productID, string buyerID, string userID, string userGroupID, string level, string priceScheduleID, int? page, int? pageSize);

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
        Object ListInventory(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListVariantInventory(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

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
        Object ListVariants(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="product"></param>
        /// <returns></returns>
        void Patch(NancyContext context, string productID, Product product);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="variant"></param>
        /// <returns>Object</returns>
        Object PatchVariant(NancyContext context, string productID, string variantID, Variant variant);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productAssignment"></param>
        /// <returns></returns>
        void SaveAssignment(NancyContext context, ProductAssignment productAssignment);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="product"></param>
        /// <returns>Object</returns>
        Object Update(NancyContext context, string productID, Product product);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="inventory">Inventory of the product.</param>
        /// <returns>Object</returns>
        Object UpdateInventory(NancyContext context, string productID, int? inventory);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="variant"></param>
        /// <returns>Object</returns>
        Object UpdateVariant(NancyContext context, string productID, string variantID, Variant variant);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="productID">ID of the product.</param>
        /// <param name="variantID">ID of the variant.</param>
        /// <param name="inventory">Inventory of the product.</param>
        /// <returns>Object</returns>
        Object UpdateVariantInventory(NancyContext context, string productID, string variantID, int? inventory);
    }

    /// <summary>
    /// Abstraction of ProductService.
    /// </summary>
    public abstract class AbstractProductService: ProductService
    {
        public virtual Object Create(NancyContext context, Product product)
        {
            return Create(product);
        }

        public virtual void Delete(NancyContext context, string productID)
        {
            Delete(productID);
        }

        public virtual void DeleteAssignment(NancyContext context, string buyerID, string productID, string userID, string userGroupID)
        {
            DeleteAssignment(buyerID, productID, userID, userGroupID);
        }

        public virtual Object GenerateVariants(NancyContext context, string productID, bool? overwriteExisting)
        {
            return GenerateVariants(productID, overwriteExisting);
        }

        public virtual Object Get(NancyContext context, string productID)
        {
            return Get(productID);
        }

        public virtual Object GetInventory(NancyContext context, string productID)
        {
            return GetInventory(productID);
        }

        public virtual Object GetVariant(NancyContext context, string productID, string variantID)
        {
            return GetVariant(productID, variantID);
        }

        public virtual Object GetVariantInventory(NancyContext context, string productID, string variantID)
        {
            return GetVariantInventory(productID, variantID);
        }

        public virtual Object List(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return List(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListAssignments(NancyContext context, string productID, string buyerID, string userID, string userGroupID, string level, string priceScheduleID, int? page, int? pageSize)
        {
            return ListAssignments(productID, buyerID, userID, userGroupID, level, priceScheduleID, page, pageSize);
        }

        public virtual Object ListInventory(NancyContext context, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListInventory(search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListVariantInventory(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListVariantInventory(productID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual Object ListVariants(NancyContext context, string productID, string search, string searchOn, string sortBy, int? page, int? pageSize)
        {
            return ListVariants(productID, search, searchOn, sortBy, page, pageSize);
        }

        public virtual void Patch(NancyContext context, string productID, Product product)
        {
            Patch(productID, product);
        }

        public virtual Object PatchVariant(NancyContext context, string productID, string variantID, Variant variant)
        {
            return PatchVariant(productID, variantID, variant);
        }

        public virtual void SaveAssignment(NancyContext context, ProductAssignment productAssignment)
        {
            SaveAssignment(productAssignment);
        }

        public virtual Object Update(NancyContext context, string productID, Product product)
        {
            return Update(productID, product);
        }

        public virtual Object UpdateInventory(NancyContext context, string productID, int? inventory)
        {
            return UpdateInventory(productID, inventory);
        }

        public virtual Object UpdateVariant(NancyContext context, string productID, string variantID, Variant variant)
        {
            return UpdateVariant(productID, variantID, variant);
        }

        public virtual Object UpdateVariantInventory(NancyContext context, string productID, string variantID, int? inventory)
        {
            return UpdateVariantInventory(productID, variantID, inventory);
        }

        protected abstract Object Create(Product product);

        protected abstract void Delete(string productID);

        protected abstract void DeleteAssignment(string buyerID, string productID, string userID, string userGroupID);

        protected abstract Object GenerateVariants(string productID, bool? overwriteExisting);

        protected abstract Object Get(string productID);

        protected abstract Object GetInventory(string productID);

        protected abstract Object GetVariant(string productID, string variantID);

        protected abstract Object GetVariantInventory(string productID, string variantID);

        protected abstract Object List(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListAssignments(string productID, string buyerID, string userID, string userGroupID, string level, string priceScheduleID, int? page, int? pageSize);

        protected abstract Object ListInventory(string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListVariantInventory(string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract Object ListVariants(string productID, string search, string searchOn, string sortBy, int? page, int? pageSize);

        protected abstract void Patch(string productID, Product product);

        protected abstract Object PatchVariant(string productID, string variantID, Variant variant);

        protected abstract void SaveAssignment(ProductAssignment productAssignment);

        protected abstract Object Update(string productID, Product product);

        protected abstract Object UpdateInventory(string productID, int? inventory);

        protected abstract Object UpdateVariant(string productID, string variantID, Variant variant);

        protected abstract Object UpdateVariantInventory(string productID, string variantID, int? inventory);
    }

}
