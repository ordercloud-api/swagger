'use strict';

var url = require('url');


var Order = require('./OrderService');


module.exports.addPromotion = function addPromotion (req, res, next) {
  Order.addPromotion(req.swagger.params, res, next);
};

module.exports.approve = function approve (req, res, next) {
  Order.approve(req.swagger.params, res, next);
};

module.exports.cancel = function cancel (req, res, next) {
  Order.cancel(req.swagger.params, res, next);
};

module.exports.create = function create (req, res, next) {
  Order.create(req.swagger.params, res, next);
};

module.exports.decline = function decline (req, res, next) {
  Order.decline(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  Order.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Order.get(req.swagger.params, res, next);
};

module.exports.listApprovals = function listApprovals (req, res, next) {
  Order.listApprovals(req.swagger.params, res, next);
};

module.exports.listEligibleApprovers = function listEligibleApprovers (req, res, next) {
  Order.listEligibleApprovers(req.swagger.params, res, next);
};

module.exports.listIncoming = function listIncoming (req, res, next) {
  Order.listIncoming(req.swagger.params, res, next);
};

module.exports.listOutgoing = function listOutgoing (req, res, next) {
  Order.listOutgoing(req.swagger.params, res, next);
};

module.exports.listPromotions = function listPromotions (req, res, next) {
  Order.listPromotions(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Order.patch(req.swagger.params, res, next);
};

module.exports.patchBillingAddress = function patchBillingAddress (req, res, next) {
  Order.patchBillingAddress(req.swagger.params, res, next);
};

module.exports.patchShippingAddress = function patchShippingAddress (req, res, next) {
  Order.patchShippingAddress(req.swagger.params, res, next);
};

module.exports.removePromotion = function removePromotion (req, res, next) {
  Order.removePromotion(req.swagger.params, res, next);
};

module.exports.setBillingAddress = function setBillingAddress (req, res, next) {
  Order.setBillingAddress(req.swagger.params, res, next);
};

module.exports.setShippingAddress = function setShippingAddress (req, res, next) {
  Order.setShippingAddress(req.swagger.params, res, next);
};

module.exports.ship = function ship (req, res, next) {
  Order.ship(req.swagger.params, res, next);
};

module.exports.submit = function submit (req, res, next) {
  Order.submit(req.swagger.params, res, next);
};

module.exports.transferTempUserOrder = function transferTempUserOrder (req, res, next) {
  Order.transferTempUserOrder(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Order.update(req.swagger.params, res, next);
};
