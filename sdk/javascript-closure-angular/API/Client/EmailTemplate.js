goog.provide('API.Client.EmailTemplate');

/**
 * @record
 */
API.Client.EmailTemplate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.EmailTemplate.prototype.subject;

/**
 * @type {!string}
 * @export
 */
API.Client.EmailTemplate.prototype.body;

/**
 * @type {!string}
 * @export
 */
API.Client.EmailTemplate.prototype.replyEmail;

/**
 * @type {!boolean}
 * @export
 */
API.Client.EmailTemplate.prototype.sendMessageType;

/**
 * @type {!string}
 * @export
 */
API.Client.EmailTemplate.prototype.emailFormatType;

