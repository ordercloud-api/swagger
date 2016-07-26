goog.provide('API.Client.BuyerCreditCard');

/**
 * @record
 */
API.Client.BuyerCreditCard = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerCreditCard.prototype.token;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerCreditCard.prototype.cardType;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerCreditCard.prototype.partialAccountNumber;

/**
 * @type {!string}
 * @export
 */
API.Client.BuyerCreditCard.prototype.cardholderName;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.BuyerCreditCard.prototype.expirationDate;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.BuyerCreditCard.prototype.xp;

