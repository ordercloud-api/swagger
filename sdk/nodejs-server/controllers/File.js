'use strict';

var url = require('url');


var File = require('./FileService');


module.exports.get = function get (req, res, next) {
  File.get(req.swagger.params, res, next);
};

module.exports.list = function list (req, res, next) {
  File.list(req.swagger.params, res, next);
};

module.exports.postFileData = function postFileData (req, res, next) {
  File.postFileData(req.swagger.params, res, next);
};
