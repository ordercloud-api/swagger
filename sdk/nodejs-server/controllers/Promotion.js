'use strict';

var url = require('url');


var Promotion = require('./PromotionService');


module.exports.create = function create (req, res, next) {
  Promotion.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Promotion.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  Promotion.deleteAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Promotion.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Promotion.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  Promotion.listAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Promotion.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  Promotion.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Promotion.update(req.swagger.params, res, next);
};
