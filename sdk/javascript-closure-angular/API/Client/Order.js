goog.provide('API.Client.Order');

/**
 * @record
 */
API.Client.Order = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.fromUserID;

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.billingAddressID;

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.shippingAddressID;

/**
 * @type {!string}
 * @export
 */
API.Client.Order.prototype.comments;

/**
 * @type {!number}
 * @export
 */
API.Client.Order.prototype.shippingCost;

/**
 * @type {!number}
 * @export
 */
API.Client.Order.prototype.taxCost;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Order.prototype.xp;

