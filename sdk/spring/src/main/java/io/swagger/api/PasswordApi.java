package io.swagger.api;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Api(value = "password", description = "the password API")
public interface PasswordApi {

    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PasswordReset", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "", response = Void.class) })
    @RequestMapping(value = "/password/reset/{verificationCode}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> resetPassword(@ApiParam(value = "Verification code of the forgotten password.",required=true ) @PathVariable("verificationCode") String verificationCode,@ApiParam(value = "" ,required=true ) @RequestBody PasswordReset passwordReset);


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "auth", scopes = {
            
            })
    }, tags={ "PasswordReset", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Sends a temporary verification code via email, which must subsequently be passed in a Reset Password call.", response = Void.class) })
    @RequestMapping(value = "/password/reset",
        method = RequestMethod.POST)
    ResponseEntity<Void> sendVerificationCode(@ApiParam(value = "" ,required=true ) @RequestBody PasswordResetRequest passwordResetRequest);

}
