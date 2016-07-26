'use strict';

var url = require('url');


var User = require('./UserService');


module.exports.create = function create (req, res, next) {
  User.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  User.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  User.get(req.swagger.params, res, next);
};

module.exports.getAccessToken = function getAccessToken (req, res, next) {
  User.getAccessToken(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  User.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  User.patch(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  User.update(req.swagger.params, res, next);
};
