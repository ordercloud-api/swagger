goog.provide('API.Client.Promotion');

/**
 * @record
 */
API.Client.Promotion = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.Promotion.prototype.usagesRemaining;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.finePrint;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.Promotion.prototype.startDate;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.Promotion.prototype.expirationDate;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.eligibleExpression;

/**
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.valueExpression;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Promotion.prototype.canCombine;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Promotion.prototype.xp;

