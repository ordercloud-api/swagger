goog.provide('API.Client.ShipmentItem');

/**
 * @record
 */
API.Client.ShipmentItem = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ShipmentItem.prototype.orderID;

/**
 * @type {!string}
 * @export
 */
API.Client.ShipmentItem.prototype.lineItemID;

/**
 * @type {!number}
 * @export
 */
API.Client.ShipmentItem.prototype.quantityShipped;

