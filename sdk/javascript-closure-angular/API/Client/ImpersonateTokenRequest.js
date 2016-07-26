goog.provide('API.Client.ImpersonateTokenRequest');

/**
 * @record
 */
API.Client.ImpersonateTokenRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ImpersonateTokenRequest.prototype.clientID;

/**
 * @type {!Array<!API.Client.ShipmentItem>}
 * @export
 */
API.Client.ImpersonateTokenRequest.prototype.claims;

