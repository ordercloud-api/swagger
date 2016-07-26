package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SpecsApiService;
import io.swagger.api.factories.SpecsApiServiceFactory;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/specs")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class SpecsApi  {
   private final SpecsApiService delegate = SpecsApiServiceFactory.getSpecsApi();

    @POST
    
    
    
    public Response create( Spec spec,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(spec,securityContext);
    }
    @POST
    @Path("/{specID}/options")
    
    
    public Response createOption( @PathParam("specID") String specID, SpecOption option,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOption(specID,option,securityContext);
    }
    @DELETE
    @Path("/{specID}")
    
    
    public Response delete( @PathParam("specID") String specID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(specID,securityContext);
    }
    @DELETE
    @Path("/{specID}/options/{optionID}")
    
    
    public Response deleteOption( @PathParam("specID") String specID, @PathParam("optionID") String optionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOption(specID,optionID,securityContext);
    }
    @DELETE
    @Path("/{specID}/productassignments/{productID}")
    
    
    public Response deleteProductAssignment( @PathParam("specID") String specID, @PathParam("productID") String productID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProductAssignment(specID,productID,securityContext);
    }
    @GET
    @Path("/{specID}")
    
    
    public Response get( @PathParam("specID") String specID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(specID,securityContext);
    }
    @GET
    @Path("/{specID}/options/{optionID}")
    
    
    public Response getOption( @PathParam("specID") String specID, @PathParam("optionID") String optionID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOption(specID,optionID,securityContext);
    }
    @GET
    
    
    
    public Response list( @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{specID}/options")
    
    
    public Response listOptions( @PathParam("specID") String specID, @QueryParam("search") String search, @QueryParam("searchOn") String searchOn, @QueryParam("sortBy") String sortBy, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOptions(specID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/productassignments")
    
    
    public Response listProductAssignments( @QueryParam("specID") String specID, @QueryParam("productID") String productID, @QueryParam("page") Integer page, @QueryParam("pageSize") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProductAssignments(specID,productID,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{specID}")
    
    
    public Response patch( @PathParam("specID") String specID, Spec spec,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(specID,spec,securityContext);
    }
    @PATCH
    @Path("/{specID}/options/{optionID}")
    
    
    public Response patchOption( @PathParam("specID") String specID, @PathParam("optionID") String optionID, SpecOption option,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchOption(specID,optionID,option,securityContext);
    }
    @POST
    @Path("/productassignments")
    
    
    public Response saveProductAssignment( SpecProductAssignment productAssignment,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveProductAssignment(productAssignment,securityContext);
    }
    @PUT
    @Path("/{specID}")
    
    
    public Response update( @PathParam("specID") String specID, Spec spec,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(specID,spec,securityContext);
    }
    @PUT
    @Path("/{specID}/options/{optionID}")
    
    
    public Response updateOption( @PathParam("specID") String specID, @PathParam("optionID") String optionID, SpecOption option,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOption(specID,optionID,option,securityContext);
    }
}
