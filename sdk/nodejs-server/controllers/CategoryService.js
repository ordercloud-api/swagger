'use strict';

exports.create = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * category (Category)
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
  * categoryID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.deleteAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryID (String)
  * userID (String)
  * userGroupID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.deleteProductAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryID (String)
  * productID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryID (String)
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
  * parentID (String)
  * depth (String)
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
  * categoryID (String)
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

exports.listChildren = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * parentID (String)
  * search (String)
  * depth (String)
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

exports.listProductAssignments = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryID (String)
  * productID (String)
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
  * categoryID (String)
  * category (Category)
  **/
  // no response value expected for this operation
  res.end();
}

exports.saveAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryAssignment (CategoryAssignment)
  **/
  // no response value expected for this operation
  res.end();
}

exports.saveProductAssignment = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * productAssignment (CategoryProductAssignment)
  **/
  // no response value expected for this operation
  res.end();
}

exports.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * categoryID (String)
  * category (Category)
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

