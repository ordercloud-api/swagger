package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SpecsApiService;
import io.swagger.api.factories.SpecsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/specs")


@io.swagger.annotations.Api(description = "the specs API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class SpecsApi  {
   private final SpecsApiService delegate = SpecsApiServiceFactory.getSpecsApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(@ApiParam(value = "" ,required=true) Spec spec
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(spec,securityContext);
    }
    @POST
    @Path("/{specID}/options")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "A Spec can have multiple Options-- for example, if the spec is called 'Color', the options might be 'Blue', 'Red', and 'Green'. ", response = Object.class) })
    public Response createOption(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "" ,required=true) SpecOption option
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOption(specID,option,securityContext);
    }
    @DELETE
    @Path("/{specID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(specID,securityContext);
    }
    @DELETE
    @Path("/{specID}/options/{optionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteOption(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "ID of the option.",required=true) @PathParam("optionID") String optionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOption(specID,optionID,securityContext);
    }
    @DELETE
    @Path("/{specID}/productassignments/{productID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteProductAssignment(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "ID of the product.",required=true) @PathParam("productID") String productID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProductAssignment(specID,productID,securityContext);
    }
    @GET
    @Path("/{specID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.get(specID,securityContext);
    }
    @GET
    @Path("/{specID}/options/{optionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getOption(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "ID of the option.",required=true) @PathParam("optionID") String optionID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOption(specID,optionID,securityContext);
    }
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.list(search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/{specID}/options")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listOptions(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "Word or phrase to search for.") @QueryParam("search") String search
,@ApiParam(value = "Comma-delimited list of fields to search on.") @QueryParam("searchOn") String searchOn
,@ApiParam(value = "Comma-delimited list of fields to sort by.") @QueryParam("sortBy") String sortBy
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listOptions(specID,search,searchOn,sortBy,page,pageSize,securityContext);
    }
    @GET
    @Path("/productassignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listProductAssignments(@ApiParam(value = "ID of the spec.") @QueryParam("specID") String specID
,@ApiParam(value = "ID of the product.") @QueryParam("productID") String productID
,@ApiParam(value = "Page of results to return. Default: 1") @QueryParam("page") Integer page
,@ApiParam(value = "Number of results to return per page. Default: 20, max: 100.") @QueryParam("pageSize") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProductAssignments(specID,productID,page,pageSize,securityContext);
    }
    @PATCH
    @Path("/{specID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "" ,required=true) Spec spec
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patch(specID,spec,securityContext);
    }
    @PATCH
    @Path("/{specID}/options/{optionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchOption(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "ID of the option.",required=true) @PathParam("optionID") String optionID
,@ApiParam(value = "" ,required=true) SpecOption option
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchOption(specID,optionID,option,securityContext);
    }
    @POST
    @Path("/productassignments")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "While DefinesVariant is an optional parameter, if it is set to 'False', generating product variants will not generate variants with that spec. This is useful for things like custom logos, where you don't want a defined variant product for each logo, but you do want to capture a product customization.", response = void.class) })
    public Response saveProductAssignment(@ApiParam(value = "" ,required=true) SpecProductAssignment productAssignment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveProductAssignment(productAssignment,securityContext);
    }
    @PUT
    @Path("/{specID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "" ,required=true) Spec spec
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.update(specID,spec,securityContext);
    }
    @PUT
    @Path("/{specID}/options/{optionID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateOption(@ApiParam(value = "ID of the spec.",required=true) @PathParam("specID") String specID
,@ApiParam(value = "ID of the option.",required=true) @PathParam("optionID") String optionID
,@ApiParam(value = "" ,required=true) SpecOption option
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOption(specID,optionID,option,securityContext);
    }
}
