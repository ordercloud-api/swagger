'use strict';

exports.create = function(args, res, next) {
  /**
   * parameters expected in the args:
  * user (User)
  **/
    var examples = {};
  examples['application/json'] = "{}";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.delete = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userID (String)
  **/
    var examples = {};
  examples['application/json'] = "{}";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.list = function(args, res, next) {
  /**
   * parameters expected in the args:
  * search (String)
  * searchOn (String)
  * sortBy (String)
  * page (Integer)
  * pageSize (Integer)
  **/
    var examples = {};
  examples['application/json'] = "{}";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.patch = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userID (String)
  * user (User)
  **/
  // no response value expected for this operation
  res.end();
}

exports.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userID (String)
  * user (User)
  **/
    var examples = {};
  examples['application/json'] = "{}";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

