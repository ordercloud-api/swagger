goog.provide('API.Client.SpendingAccount');

/**
 * @record
 */
API.Client.SpendingAccount = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.SpendingAccount.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.SpendingAccount.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.SpendingAccount.prototype.balance;

/**
 * @type {!boolean}
 * @export
 */
API.Client.SpendingAccount.prototype.allowAsPaymentMethod;

/**
 * @type {!string}
 * @export
 */
API.Client.SpendingAccount.prototype.redemptionCode;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.SpendingAccount.prototype.startDate;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.SpendingAccount.prototype.endDate;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.SpendingAccount.prototype.xp;

