goog.provide('API.Client.Product');

/**
 * @record
 */
API.Client.Product = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.ID;

/**
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.description;

/**
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.quantityMultiplier;

/**
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.shipWeight;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Product.prototype.active;

/**
 * @type {!string}
 * @export
 */
API.Client.Product.prototype.type;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Product.prototype.inventoryEnabled;

/**
 * @type {!number}
 * @export
 */
API.Client.Product.prototype.inventoryNotificationPoint;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Product.prototype.variantLevelInventory;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Product.prototype.xp;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Product.prototype.allowOrderExceedInventory;

/**
 * @type {!boolean}
 * @export
 */
API.Client.Product.prototype.inventoryVisible;

