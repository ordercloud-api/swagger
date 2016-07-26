package io.swagger.api;

import io.swagger.model.Spec;
import io.swagger.model.SpecOption;
import io.swagger.model.SpecProductAssignment;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/specs")

@Api(description = "the specs API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-07-26T21:57:48.787Z")

public class SpecsApi  {

    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "", response = Object.class) })
    public Response create(Spec spec) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{specID}/options")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "A Spec can have multiple Options-- for example, if the spec is called 'Color', the options might be 'Blue', 'Red', and 'Green'. ", response = Object.class) })
    public Response createOption(@PathParam("specID") String specID,SpecOption option) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{specID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response delete(@PathParam("specID") String specID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{specID}/options/{optionID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID) {
    	return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{specID}/productassignments/{productID}")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = void.class) })
    public Response deleteProductAssignment(@PathParam("specID") String specID,@PathParam("productID") String productID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{specID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response get(@PathParam("specID") String specID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{specID}/options/{optionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response getOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response list(@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{specID}/options")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listOptions(@PathParam("specID") String specID,@QueryParam("search") String search,@QueryParam("searchOn") String searchOn,@QueryParam("sortBy") String sortBy,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/productassignments")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response listProductAssignments(@QueryParam("specID") String specID,@QueryParam("productID") String productID,@QueryParam("page") Integer page,@QueryParam("pageSize") Integer pageSize) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{specID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patch(@PathParam("specID") String specID,Spec spec) {
    	return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{specID}/options/{optionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response patchOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID,SpecOption option) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/productassignments")
    
    
    @ApiOperation(value = "", notes = "", response = void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "While DefinesVariant is an optional parameter, if it is set to 'False', generating product variants will not generate variants with that spec. This is useful for things like custom logos, where you don't want a defined variant product for each logo, but you do want to capture a product customization.", response = void.class) })
    public Response saveProductAssignment(SpecProductAssignment productAssignment) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{specID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response update(@PathParam("specID") String specID,Spec spec) {
    	return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{specID}/options/{optionID}")
    
    
    @ApiOperation(value = "", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
        })
    }, tags={ "Spec" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    public Response updateOption(@PathParam("specID") String specID,@PathParam("optionID") String optionID,SpecOption option) {
    	return Response.ok().entity("magic!").build();
    }
}

