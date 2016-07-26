'use strict';

var url = require('url');


var Product = require('./ProductService');


module.exports.create = function create (req, res, next) {
  Product.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Product.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  Product.deleteAssignment(req.swagger.params, res, next);
};

module.exports.generateVariants = function generateVariants (req, res, next) {
  Product.generateVariants(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Product.get(req.swagger.params, res, next);
};

module.exports.getInventory = function getInventory (req, res, next) {
  Product.getInventory(req.swagger.params, res, next);
};

module.exports.getVariant = function getVariant (req, res, next) {
  Product.getVariant(req.swagger.params, res, next);
};

module.exports.getVariantInventory = function getVariantInventory (req, res, next) {
  Product.getVariantInventory(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Product.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  Product.listAssignments(req.swagger.params, res, next);
};

module.exports.listInventory = function listInventory (req, res, next) {
  Product.listInventory(req.swagger.params, res, next);
};

module.exports.listVariantInventory = function listVariantInventory (req, res, next) {
  Product.listVariantInventory(req.swagger.params, res, next);
};

module.exports.listVariants = function listVariants (req, res, next) {
  Product.listVariants(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Product.patch(req.swagger.params, res, next);
};

module.exports.patchVariant = function patchVariant (req, res, next) {
  Product.patchVariant(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  Product.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Product.update(req.swagger.params, res, next);
};

module.exports.updateInventory = function updateInventory (req, res, next) {
  Product.updateInventory(req.swagger.params, res, next);
};

module.exports.updateVariant = function updateVariant (req, res, next) {
  Product.updateVariant(req.swagger.params, res, next);
};

module.exports.updateVariantInventory = function updateVariantInventory (req, res, next) {
  Product.updateVariantInventory(req.swagger.params, res, next);
};
