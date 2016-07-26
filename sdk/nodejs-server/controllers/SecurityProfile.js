'use strict';

var url = require('url');


var SecurityProfile = require('./SecurityProfileService');


module.exports.get = function get (req, res, next) {
  SecurityProfile.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  SecurityProfile.list(req.swagger.params, res, next);
};
