goog.provide('API.Client.Category');

/**
 * @record
 */
API.Client.Category = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Category.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Category.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.Category.prototype.description;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Category.prototype.xp;

/**
 * @type {!number}
 * @export
 */
API.Client.Category.prototype.listOrder;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Category.prototype.active;

/**
 * @type {!string}
 * @export
 */
API.Client.Category.prototype.parentID;

