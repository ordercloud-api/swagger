'use strict';

var url = require('url');


var Address = require('./AddressService');


module.exports.create = function create (req, res, next) {
  Address.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Address.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  Address.deleteAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Address.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Address.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  Address.listAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Address.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  Address.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Address.update(req.swagger.params, res, next);
};
