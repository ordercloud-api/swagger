package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public abstract class AdminusersApiService {
    public abstract Response create(User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response delete(String userID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response get(String userID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response list(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patch(String userID,User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response update(String userID,User user,SecurityContext securityContext) throws NotFoundException;
}
