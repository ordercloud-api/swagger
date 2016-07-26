'use strict';

var url = require('url');


var PasswordReset = require('./PasswordResetService');


module.exports.resetPassword = function resetPassword (req, res, next) {
  PasswordReset.resetPassword(req.swagger.params, res, next);
};

module.exports.sendVerificationCode = function sendVerificationCode (req, res, next) {
  PasswordReset.sendVerificationCode(req.swagger.params, res, next);
};
