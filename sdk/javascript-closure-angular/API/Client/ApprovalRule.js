goog.provide('API.Client.ApprovalRule');

/**
 * @record
 */
API.Client.ApprovalRule = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.approvingGroupID;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.ruleExpression;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.scope;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.scopeTimeUnit;

/**
 * @type {!number}
 * @export
 */
API.Client.ApprovalRule.prototype.scopeTimeNumber;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.ApprovalRule.prototype.scopeStartDate;

/**
 * @type {!string}
 * @export
 */
API.Client.ApprovalRule.prototype.expireAfterTimeUnit;

/**
 * @type {!number}
 * @export
 */
API.Client.ApprovalRule.prototype.expireAfterNumber;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ApprovalRule.prototype.approveOnExpire;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ApprovalRule.prototype.xp;

