goog.provide('API.Client.Shipment');

/**
 * @record
 */
API.Client.Shipment = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Shipment.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Shipment.prototype.shipper;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.Shipment.prototype.dateShipped;

/**
 * @type {!string}
 * @export
 */
API.Client.Shipment.prototype.trackingNumber;

/**
 * @type {!number}
 * @export
 */
API.Client.Shipment.prototype.cost;

/**
 * @type {!Array<!API.Client.ShipmentItem>}
 * @export
 */
API.Client.Shipment.prototype.items;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Shipment.prototype.xp;

