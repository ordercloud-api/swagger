package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.BuyerAddress;
import io.swagger.model.BuyerCreditCard;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public abstract class MeApiService {
    public abstract Response createAddress(BuyerAddress address,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCreditCard(BuyerCreditCard creditCard,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAddress(String addressID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCreditCard(String creditcardID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response get(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAddress(String addressID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCreditCard(String creditcardID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrder(String orderID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProduct(String productID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPromotion(String promotionID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSpec(String productID,String specID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAddresses(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCategories(String depth,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCostCenters(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCreditCards(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listIncomingOrders(String from,String to,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listOutgoingOrders(String from,String to,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProducts(String categoryID,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listPromotions(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listSpecs(String productID,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listSubcategories(String parentID,String depth,String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserGroups(String search,String searchOn,String sortBy,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patch(User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchAddress(String addressID,BuyerAddress address,SecurityContext securityContext) throws NotFoundException;
    public abstract Response patchCreditCard(String creditcardID,BuyerCreditCard creditCard,SecurityContext securityContext) throws NotFoundException;
    public abstract Response update(User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAddress(String addressID,BuyerAddress address,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateCreditCard(String creditcardID,BuyerCreditCard creditCard,SecurityContext securityContext) throws NotFoundException;
}
