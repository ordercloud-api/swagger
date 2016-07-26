'use strict';

var url = require('url');


var Spec = require('./SpecService');


module.exports.create = function create (req, res, next) {
  Spec.create(req.swagger.params, res, next);
};

module.exports.createOption = function createOption (req, res, next) {
  Spec.createOption(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Spec.delete(req.swagger.params, res, next);
};

module.exports.deleteOption = function deleteOption (req, res, next) {
  Spec.deleteOption(req.swagger.params, res, next);
};

module.exports.deleteProductAssignment = function deleteProductAssignment (req, res, next) {
  Spec.deleteProductAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Spec.get(req.swagger.params, res, next);
};

module.exports.getOption = function getOption (req, res, next) {
  Spec.getOption(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Spec.list(req.swagger.params, res, next);
};

module.exports.listOptions = function listOptions (req, res, next) {
  Spec.listOptions(req.swagger.params, res, next);
};

module.exports.listProductAssignments = function listProductAssignments (req, res, next) {
  Spec.listProductAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Spec.patch(req.swagger.params, res, next);
};

module.exports.patchOption = function patchOption (req, res, next) {
  Spec.patchOption(req.swagger.params, res, next);
};

module.exports.saveProductAssignment = function saveProductAssignment (req, res, next) {
  Spec.saveProductAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Spec.update(req.swagger.params, res, next);
};

module.exports.updateOption = function updateOption (req, res, next) {
  Spec.updateOption(req.swagger.params, res, next);
};
