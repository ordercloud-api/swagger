'use strict';

exports.resetPassword = function(args, res, next) {
  /**
   * parameters expected in the args:
  * verificationCode (String)
  * passwordReset (PasswordReset)
  **/
  // no response value expected for this operation
  res.end();
}

exports.sendVerificationCode = function(args, res, next) {
  /**
   * parameters expected in the args:
  * passwordResetRequest (PasswordResetRequest)
  **/
  // no response value expected for this operation
  res.end();
}

