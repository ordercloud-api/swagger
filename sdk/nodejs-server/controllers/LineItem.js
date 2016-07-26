'use strict';

var url = require('url');


var LineItem = require('./LineItemService');


module.exports.create = function create (req, res, next) {
  LineItem.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  LineItem.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  LineItem.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  LineItem.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  LineItem.patch(req.swagger.params, res, next);
};

module.exports.patchShippingAddress = function patchShippingAddress (req, res, next) {
  LineItem.patchShippingAddress(req.swagger.params, res, next);
};

module.exports.setShippingAddress = function setShippingAddress (req, res, next) {
  LineItem.setShippingAddress(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  LineItem.update(req.swagger.params, res, next);
};
