goog.provide('API.Client.LineItem');

/**
 * @record
 */
API.Client.LineItem = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productID;

/**
 * @type {!number}
 * @export
 */
API.Client.LineItem.prototype.quantity;

/**
 * @type {!number}
 * @export
 */
API.Client.LineItem.prototype.unitPrice;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.costCenter;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.LineItem.prototype.dateNeeded;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.shippingAccount;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.shippingAddressID;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.shipfromAddressID;

/**
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.shipperID;

/**
 * @type {!Array<!API.Client.ShipmentItem>}
 * @export
 */
API.Client.LineItem.prototype.specs;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.LineItem.prototype.xp;

