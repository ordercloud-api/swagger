'use strict';

var url = require('url');


var PriceSchedule = require('./PriceScheduleService');


module.exports.create = function create (req, res, next) {
  PriceSchedule.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  PriceSchedule.delete(req.swagger.params, res, next);
};

module.exports.deletePriceBreak = function deletePriceBreak (req, res, next) {
  PriceSchedule.deletePriceBreak(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  PriceSchedule.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  PriceSchedule.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  PriceSchedule.patch(req.swagger.params, res, next);
};

module.exports.savePriceBreak = function savePriceBreak (req, res, next) {
  PriceSchedule.savePriceBreak(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  PriceSchedule.update(req.swagger.params, res, next);
};
