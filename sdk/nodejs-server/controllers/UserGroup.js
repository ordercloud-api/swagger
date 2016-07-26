'use strict';

var url = require('url');


var UserGroup = require('./UserGroupService');


module.exports.create = function create (req, res, next) {
  UserGroup.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  UserGroup.delete(req.swagger.params, res, next);
};

module.exports.deleteUserAssignment = function deleteUserAssignment (req, res, next) {
  UserGroup.deleteUserAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  UserGroup.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  UserGroup.list(req.swagger.params, res, next);
};

module.exports.listUserAssignments = function listUserAssignments (req, res, next) {
  UserGroup.listUserAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  UserGroup.patch(req.swagger.params, res, next);
};

module.exports.saveUserAssignment = function saveUserAssignment (req, res, next) {
  UserGroup.saveUserAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  UserGroup.update(req.swagger.params, res, next);
};
