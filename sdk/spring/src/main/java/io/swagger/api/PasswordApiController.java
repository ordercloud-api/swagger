package io.swagger.api;

import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

@Controller
public class PasswordApiController implements PasswordApi {

    public ResponseEntity<Void> resetPassword(@ApiParam(value = "Verification code of the forgotten password.",required=true ) @PathVariable("verificationCode") String verificationCode,
        @ApiParam(value = "" ,required=true ) @RequestBody PasswordReset passwordReset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> sendVerificationCode(@ApiParam(value = "" ,required=true ) @RequestBody PasswordResetRequest passwordResetRequest) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
