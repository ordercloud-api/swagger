'use strict';

var url = require('url');


var Payment = require('./PaymentService');


module.exports.create = function create (req, res, next) {
  Payment.create(req.swagger.params, res, next);
};

module.exports.createTransaction = function createTransaction (req, res, next) {
  Payment.createTransaction(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Payment.delete(req.swagger.params, res, next);
};

module.exports.deleteTransaction = function deleteTransaction (req, res, next) {
  Payment.deleteTransaction(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Payment.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Payment.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Payment.patch(req.swagger.params, res, next);
};

module.exports.patchTransaction = function patchTransaction (req, res, next) {
  Payment.patchTransaction(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Payment.update(req.swagger.params, res, next);
};

module.exports.updateTransaction = function updateTransaction (req, res, next) {
  Payment.updateTransaction(req.swagger.params, res, next);
};
