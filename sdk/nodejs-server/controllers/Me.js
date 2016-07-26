'use strict';

var url = require('url');


var Me = require('./MeService');


module.exports.createAddress = function createAddress (req, res, next) {
  Me.createAddress(req.swagger.params, res, next);
};

module.exports.createCreditCard = function createCreditCard (req, res, next) {
  Me.createCreditCard(req.swagger.params, res, next);
};

module.exports.deleteAddress = function deleteAddress (req, res, next) {
  Me.deleteAddress(req.swagger.params, res, next);
};

module.exports.deleteCreditCard = function deleteCreditCard (req, res, next) {
  Me.deleteCreditCard(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  Me.get(req.swagger.params, res, next);
};

module.exports.getAddress = function getAddress (req, res, next) {
  Me.getAddress(req.swagger.params, res, next);
};

module.exports.getCreditCard = function getCreditCard (req, res, next) {
  Me.getCreditCard(req.swagger.params, res, next);
};

module.exports.getOrder = function getOrder (req, res, next) {
  Me.getOrder(req.swagger.params, res, next);
};

module.exports.getProduct = function getProduct (req, res, next) {
  Me.getProduct(req.swagger.params, res, next);
};

module.exports.getPromotion = function getPromotion (req, res, next) {
  Me.getPromotion(req.swagger.params, res, next);
};

module.exports.getSpec = function getSpec (req, res, next) {
  Me.getSpec(req.swagger.params, res, next);
};

module.exports.listAddresses = function listAddresses (req, res, next) {
  Me.listAddresses(req.swagger.params, res, next);
};

module.exports.listCategories = function listCategories (req, res, next) {
  Me.listCategories(req.swagger.params, res, next);
};

module.exports.listCostCenters = function listCostCenters (req, res, next) {
  Me.listCostCenters(req.swagger.params, res, next);
};

module.exports.listCreditCards = function listCreditCards (req, res, next) {
  Me.listCreditCards(req.swagger.params, res, next);
};

module.exports.listIncomingOrders = function listIncomingOrders (req, res, next) {
  Me.listIncomingOrders(req.swagger.params, res, next);
};

module.exports.listOutgoingOrders = function listOutgoingOrders (req, res, next) {
  Me.listOutgoingOrders(req.swagger.params, res, next);
};

module.exports.listProducts = function listProducts (req, res, next) {
  Me.listProducts(req.swagger.params, res, next);
};

module.exports.listPromotions = function listPromotions (req, res, next) {
  Me.listPromotions(req.swagger.params, res, next);
};

module.exports.listSpecs = function listSpecs (req, res, next) {
  Me.listSpecs(req.swagger.params, res, next);
};

module.exports.listSubcategories = function listSubcategories (req, res, next) {
  Me.listSubcategories(req.swagger.params, res, next);
};

module.exports.listUserGroups = function listUserGroups (req, res, next) {
  Me.listUserGroups(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  Me.patch(req.swagger.params, res, next);
};

module.exports.patchAddress = function patchAddress (req, res, next) {
  Me.patchAddress(req.swagger.params, res, next);
};

module.exports.patchCreditCard = function patchCreditCard (req, res, next) {
  Me.patchCreditCard(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  Me.update(req.swagger.params, res, next);
};

module.exports.updateAddress = function updateAddress (req, res, next) {
  Me.updateAddress(req.swagger.params, res, next);
};

module.exports.updateCreditCard = function updateCreditCard (req, res, next) {
  Me.updateCreditCard(req.swagger.params, res, next);
};
