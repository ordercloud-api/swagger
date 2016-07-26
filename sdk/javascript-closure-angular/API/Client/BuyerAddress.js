goog.provide('API.Client.BuyerAddress');

/**
 * @record
 */
API.Client.BuyerAddress = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.BuyerAddress.prototype.shipping;

/**
 * @type {!boolean}
 * @export
 */
API.Client.BuyerAddress.prototype.billing;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.companyName;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.firstName;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.lastName;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.street1;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.street2;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.city;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.state;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.zip;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.phone;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerAddress.prototype.addressName;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.BuyerAddress.prototype.xp;

