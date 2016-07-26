goog.provide('API.Client.AddressAssignment');

/**
 * @record
 */
API.Client.AddressAssignment = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AddressAssignment.prototype.addressID;

/**
 * @type {!string}
 * @export
 */
API.Client.AddressAssignment.prototype.userID;

/**
 * @type {!string}
 * @export
 */
API.Client.AddressAssignment.prototype.userGroupID;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AddressAssignment.prototype.isShipping;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AddressAssignment.prototype.isBilling;

