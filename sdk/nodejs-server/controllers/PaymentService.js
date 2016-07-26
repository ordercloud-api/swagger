'use strict';

exports.create = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * payment (Payment)
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

exports.createTransaction = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * transaction (PaymentTransaction)
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
  * orderID (String)
  * paymentID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.deleteTransaction = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * transactionID (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
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
  * orderID (String)
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
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * partialPayment (Payment)
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

exports.patchTransaction = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * transactionID (String)
  * partialTransaction (PaymentTransaction)
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

exports.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * payment (Payment)
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

exports.updateTransaction = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * orderID (String)
  * paymentID (String)
  * transactionID (String)
  * transaction (PaymentTransaction)
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

