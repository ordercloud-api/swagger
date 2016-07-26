'use strict';

var url = require('url');


var Category = require('./CategoryService');


module.exports.create = function create (req, res, next) {
  Category.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Category.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  Category.deleteAssignment(req.swagger.params, res, next);
};

module.exports.deleteProductAssignment = function deleteProductAssignment (req, res, next) {
  Category.deleteProductAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Category.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Category.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  Category.listAssignments(req.swagger.params, res, next);
};

module.exports.listChildren = function listChildren (req, res, next) {
  Category.listChildren(req.swagger.params, res, next);
};

module.exports.listProductAssignments = function listProductAssignments (req, res, next) {
  Category.listProductAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Category.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  Category.saveAssignment(req.swagger.params, res, next);
};

module.exports.saveProductAssignment = function saveProductAssignment (req, res, next) {
  Category.saveProductAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Category.update(req.swagger.params, res, next);
};
