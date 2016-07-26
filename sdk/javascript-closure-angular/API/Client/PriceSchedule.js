goog.provide('API.Client.PriceSchedule');

/**
 * @record
 */
API.Client.PriceSchedule = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PriceSchedule.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.PriceSchedule.prototype.name;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PriceSchedule.prototype.applyTax;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PriceSchedule.prototype.applyShipping;

/**
 * @type {!number}
 * @export
 */
API.Client.PriceSchedule.prototype.maxQuantity;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PriceSchedule.prototype.useCumulativeQuantity;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PriceSchedule.prototype.restrictedQuantity;

/**
 * @type {!string}
 * @export
 */
API.Client.PriceSchedule.prototype.orderType;

/**
 * @type {!Array<!API.Client.ShipmentItem>}
 * @export
 */
API.Client.PriceSchedule.prototype.priceBreaks;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.PriceSchedule.prototype.xp;

