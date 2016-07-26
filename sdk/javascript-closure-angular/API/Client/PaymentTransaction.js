goog.provide('API.Client.PaymentTransaction');

/**
 * @record
 */
API.Client.PaymentTransaction = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PaymentTransaction.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.PaymentTransaction.prototype.type;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.PaymentTransaction.prototype.dateExecuted;

/**
 * @type {!number}
 * @export
 */
API.Client.PaymentTransaction.prototype.amount;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PaymentTransaction.prototype.succeeded;

/**
 * @type {!string}
 * @export
 */
API.Client.PaymentTransaction.prototype.resultCode;

/**
 * @type {!string}
 * @export
 */
API.Client.PaymentTransaction.prototype.resultMessage;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.PaymentTransaction.prototype.xp;

