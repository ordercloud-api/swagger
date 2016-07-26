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
    /// Module processing requests of File domain.
    /// </summary>
    public sealed class FileModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public FileModule(FileService service) : base("/v1")
        { 
            Get["/files/{fileID}"] = parameters =>
            {
                var fileID = Parameters.ValueOf<string>(parameters, Context.Request, "fileID", ParameterType.Path);
                Preconditions.IsNotNull(fileID, "Required parameter: 'fileID' is missing at 'Get'");
                
                return service.Get(Context, fileID);
            };

            Get["/files"] = parameters =>
            {
                var page = Parameters.ValueOf<int?>(parameters, Context.Request, "page", ParameterType.Query);
                var pageSize = Parameters.ValueOf<int?>(parameters, Context.Request, "pageSize", ParameterType.Query);
                return service.List(Context, page, pageSize);
            };

            Post["/files"] = parameters =>
            {
                var filename = Parameters.ValueOf<string>(parameters, Context.Request, "filename", ParameterType.Query);
                return service.PostFileData(Context, filename);
            };
        }
    }

    /// <summary>
    /// Service handling File requests.
    /// </summary>
    public interface FileService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="fileID">ID of the file.</param>
        /// <returns>Object</returns>
        Object Get(NancyContext context, string fileID);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="page">Page of results to return. Default: 1 (optional)</param>
        /// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
        /// <returns>Object</returns>
        Object List(NancyContext context, int? page, int? pageSize);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="filename">Filename of the file. (optional)</param>
        /// <returns>Object</returns>
        Object PostFileData(NancyContext context, string filename);
    }

    /// <summary>
    /// Abstraction of FileService.
    /// </summary>
    public abstract class AbstractFileService: FileService
    {
        public virtual Object Get(NancyContext context, string fileID)
        {
            return Get(fileID);
        }

        public virtual Object List(NancyContext context, int? page, int? pageSize)
        {
            return List(page, pageSize);
        }

        public virtual Object PostFileData(NancyContext context, string filename)
        {
            return PostFileData(filename);
        }

        protected abstract Object Get(string fileID);

        protected abstract Object List(int? page, int? pageSize);

        protected abstract Object PostFileData(string filename);
    }

}
