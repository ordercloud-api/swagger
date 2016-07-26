'use strict';

var url = require('url');


var SpendingAccount = require('./SpendingAccountService');


module.exports.create = function create (req, res, next) {
  SpendingAccount.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  SpendingAccount.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  SpendingAccount.deleteAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  SpendingAccount.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  SpendingAccount.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  SpendingAccount.listAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  SpendingAccount.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  SpendingAccount.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  SpendingAccount.update(req.swagger.params, res, next);
};
