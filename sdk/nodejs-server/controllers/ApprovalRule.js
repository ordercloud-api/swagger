'use strict';

var url = require('url');


var ApprovalRule = require('./ApprovalRuleService');


module.exports.create = function create (req, res, next) {
  ApprovalRule.create(req.swagger.params, res, next);
};

module.exports.delete = function delete (req, res, next) {
  ApprovalRule.delete(req.swagger.params, res, next);
};

module.exports.get = function get (req, res, next) {
  ApprovalRule.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  ApprovalRule.list(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  ApprovalRule.patch(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  ApprovalRule.update(req.swagger.params, res, next);
};
