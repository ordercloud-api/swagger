package io.swagger.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface FileApi  {
    @GET
    @Path("/files/{fileID}")
    
    
    public Response get(@PathParam("fileID") String fileID);
    @GET
    @Path("/files")
    
    
    public Response list(@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @POST
    @Path("/files")
    
    
    public Response postFileData(@QueryParam("filename") String filename);
}

