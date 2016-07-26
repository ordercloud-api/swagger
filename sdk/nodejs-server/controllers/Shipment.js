'use strict';

var url = require('url');


var Shipment = require('./ShipmentService');


module.exports.create = function create (req, res, next) {
  Shipment.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Shipment.delete(req.swagger.params, res, next);
};

module.exports.deleteItem = function deleteItem (req, res, next) {
  Shipment.deleteItem(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Shipment.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  Shipment.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Shipment.patch(req.swagger.params, res, next);
};

module.exports.saveItem = function saveItem (req, res, next) {
  Shipment.saveItem(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Shipment.update(req.swagger.params, res, next);
};
