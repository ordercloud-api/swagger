package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.PasswordReset;
import io.swagger.model.PasswordResetRequest;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public abstract class PasswordApiService {
      public abstract Response resetPassword(String verificationCode,PasswordReset passwordReset,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response sendVerificationCode(PasswordResetRequest passwordResetRequest,SecurityContext securityContext)
      throws NotFoundException;
}
