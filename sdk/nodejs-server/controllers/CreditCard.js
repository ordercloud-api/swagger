'use strict';

var url = require('url');


var CreditCard = require('./CreditCardService');


module.exports.create = function create (req, res, next) {
  CreditCard.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  CreditCard.delete(req.swagger.params, res, next);
};

module.exports.deleteAssignment = function deleteAssignment (req, res, next) {
  CreditCard.deleteAssignment(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  CreditCard.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  CreditCard.list(req.swagger.params, res, next);
};

module.exports.listAssignments = function listAssignments (req, res, next) {
  CreditCard.listAssignments(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  CreditCard.patch(req.swagger.params, res, next);
};

module.exports.saveAssignment = function saveAssignment (req, res, next) {
  CreditCard.saveAssignment(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  CreditCard.update(req.swagger.params, res, next);
};
