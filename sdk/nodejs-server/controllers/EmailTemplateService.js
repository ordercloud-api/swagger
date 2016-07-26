'use strict';

exports.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * emailTemplateType (String)
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
  * emailTemplateType (String)
  * emailTemplate (EmailTemplate)
  **/
  // no response value expected for this operation
  res.end();
}

exports.resetToDefault = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * emailTemplateType (String)
  **/
  // no response value expected for this operation
  res.end();
}

exports.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * buyerID (String)
  * emailTemplateType (String)
  * emailTemplate (EmailTemplate)
  **/
  // no response value expected for this operation
  res.end();
}

