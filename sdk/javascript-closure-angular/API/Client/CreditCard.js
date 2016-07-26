goog.provide('API.Client.CreditCard');

/**
 * @record
 */
API.Client.CreditCard = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreditCard.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.CreditCard.prototype.token;

/**
 * @type {!string}
 * @export
 */
API.Client.CreditCard.prototype.cardType;

/**
 * @type {!string}
 * @export
 */
API.Client.CreditCard.prototype.partialAccountNumber;

/**
 * @type {!string}
 * @export
 */
API.Client.CreditCard.prototype.cardholderName;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.CreditCard.prototype.expirationDate;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreditCard.prototype.xp;

