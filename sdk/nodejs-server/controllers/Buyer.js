'use strict';

var url = require('url');


var Buyer = require('./BuyerService');


module.exports.create = function create (req, res, next) {
  Buyer.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Buyer.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Buyer.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Buyer.list(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Buyer.update(req.swagger.params, res, next);
};
