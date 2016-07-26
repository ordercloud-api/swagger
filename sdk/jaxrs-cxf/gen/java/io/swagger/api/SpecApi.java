package io.swagger.api;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface SpecApi  {
    @POST
    @Path("/specs")
    
    
    public Response create(Spec spec);
    @POST
    @Path("/specs/{specID}/options")
    
    
    public Response createOption(@PathParam("specID") String specID,SpecOption option);
    @DELETE
    @Path("/specs/{specID}")
    
    
    public Response delete(@PathParam("specID") String specID);
    @DELETE
    @Path("/specs/{specID}/options/{optionID}")
    
    
    public Response deleteOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID);
    @DELETE
    @Path("/specs/{specID}/productassignments/{productID}")
    
    
    public Response deleteProductAssignment(@PathParam("specID") String specID,@PathParam("productID") String productID);
    @GET
    @Path("/specs/{specID}")
    
    
    public Response get(@PathParam("specID") String specID);
    @GET
    @Path("/specs/{specID}/options/{optionID}")
    
    
    public Response getOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID);
    @GET
    @Path("/specs")
    
    
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/specs/{specID}/options")
    
    
    public Response listOptions(@PathParam("specID") String specID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @GET
    @Path("/specs/productassignments")
    
    
    public Response listProductAssignments(@QueryParam("specID") String specID,@QueryParam("productID") String productID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize);
    @PATCH
    @Path("/specs/{specID}")
    
    
    public Response patch(@PathParam("specID") String specID,Spec spec);
    @PATCH
    @Path("/specs/{specID}/options/{optionID}")
    
    
    public Response patchOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID,SpecOption option);
    @POST
    @Path("/specs/productassignments")
    
    
    public Response saveProductAssignment(SpecProductAssignment productAssignment);
    @PUT
    @Path("/specs/{specID}")
    
    
    public Response update(@PathParam("specID") String specID,Spec spec);
    @PUT
    @Path("/specs/{specID}/options/{optionID}")
    
    
    public Response updateOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID,SpecOption option);
}

