package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FilesApiService;
import io.swagger.api.factories.FilesApiServiceFactory;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/files")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class FilesApi  {
   private final FilesApiService delegate = FilesApiServiceFactory.getFilesApi();

    @GET
    @Path("/{fileID}")
    
    
    public Response get( @PathParam("fileID") String fileID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(fileID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(page,pageSize,securityContext);
    }
    @POST
    
    
    
    public Response postFileData( @QueryParam("filename") String filename,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postFileData(filename,securityContext);
    }
}
