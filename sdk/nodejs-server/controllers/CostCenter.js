'use strict';

var url = require('url');


var CostCenter = require('./CostCenterService');


module.exports.create = function create (req, res, next) {
  CostCenter.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  CostCenter.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  CostCenter.deleteAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  CostCenter.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  CostCenter.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  CostCenter.listAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  CostCenter.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  CostCenter.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  CostCenter.update(req.swagger.params, res, next);
};
