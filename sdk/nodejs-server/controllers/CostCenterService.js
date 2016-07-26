'use strict';

exports.create = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * costCenter (CostCenter)
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
  * buyerID (String)
  * costCenterID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.deleteAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * costCenterID (String)
  * userID (String)
  * userGroupID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * costCenterID (String)
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
  * buyerID (String)
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

exports.listAssignments = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * costCenterID (String)
  * userID (String)
  * userGroupID (String)
  * level (String)
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
  * buyerID (String)
  * costCenterID (String)
  * costCenter (CostCenter)
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

exports.saveAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * assignment (CostCenterAssignment)
  **/
  // no response value expected for this operation
  res.end();
}

exports.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * costCenterID (String)
  * costCenter (CostCenter)
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

