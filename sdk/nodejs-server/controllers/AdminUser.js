'use strict';

var url = require('url');


var AdminUser = require('./AdminUserService');


module.exports.create = function create (req, res, next) {
  AdminUser.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  AdminUser.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  AdminUser.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  AdminUser.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  AdminUser.patch(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  AdminUser.update(req.swagger.params, res, next);
};
