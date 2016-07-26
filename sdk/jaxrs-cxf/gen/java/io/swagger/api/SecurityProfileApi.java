package io.swagger.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface SecurityProfileApi  {
    @GET
    @Path("/SecurityProfiles/{securityProfileID}")
    
    
    public Response get(@PathParam("securityProfileID") String securityProfileID);
    @GET
    @Path("/SecurityProfiles")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
}

