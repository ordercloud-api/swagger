goog.provide('API.Client.User');

/**
 * @record
 */
API.Client.User = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.username;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.password;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.firstName;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.lastName;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.email;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.phone;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.User.prototype.termsAccepted;

/**
 * @type {!boolean}
 * @export
 */
API.Client.User.prototype.active;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.User.prototype.xp;

/**
 * @type {!string}
 * @export
 */
API.Client.User.prototype.securityProfileID;

