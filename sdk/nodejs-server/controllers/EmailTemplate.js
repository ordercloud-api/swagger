'use strict';

var url = require('url');


var EmailTemplate = require('./EmailTemplateService');


module.exports.get = function get (req, res, next) {
  EmailTemplate.get(req.swagger.params, res, next);
};

module.exports.patch = function patch (req, res, next) {
  EmailTemplate.patch(req.swagger.params, res, next);
};

module.exports.resetToDefault = function resetToDefault (req, res, next) {
  EmailTemplate.resetToDefault(req.swagger.params, res, next);
};

module.exports.update = function update (req, res, next) {
  EmailTemplate.update(req.swagger.params, res, next);
};
