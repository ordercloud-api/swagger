goog.provide('API.Client.Payment');

/**
 * @record
 */
API.Client.Payment = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Payment.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Payment.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.Payment.prototype.creditCardID;

/**
 * @type {!string}
 * @export
 */
API.Client.Payment.prototype.spendingAccountID;

/**
 * @type {!string}
 * @export
 */
API.Client.Payment.prototype.description;

/**
 * @type {!number}
 * @export
 */
API.Client.Payment.prototype.amount;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Payment.prototype.xp;

