/**
 * OrderCloud
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Buyer'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Buyer'));
  } else {
    // Browser globals (root is window)
    if (!root.OrderCloud) {
      root.OrderCloud = {};
    }
    root.OrderCloud.BuyerApi = factory(root.OrderCloud.ApiClient, root.OrderCloud.Buyer);
  }
}(this, function(ApiClient, Buyer) {
  'use strict';

  /**
   * Buyer service.
   * @module api/BuyerApi
   * @version 0.1
   */

  /**
   * Constructs a new BuyerApi. 
   * @alias module:api/BuyerApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the callDelete operation.
     * @callback module:api/BuyerApi~callDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} buyerID ID of the buyer.
     * @param {module:api/BuyerApi~callDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.callDelete = function(buyerID, callback) {
      var postBody = null;

      // verify the required parameter 'buyerID' is set
      if (buyerID == undefined || buyerID == null) {
        throw "Missing the required parameter 'buyerID' when calling callDelete";
      }


      var pathParams = {
        'buyerID': buyerID
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['auth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = null;

      return this.apiClient.callApi(
        '/buyers/{buyerID}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the create operation.
     * @callback module:api/BuyerApi~createCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/Buyer} company 
     * @param {module:api/BuyerApi~createCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.create = function(company, callback) {
      var postBody = company;

      // verify the required parameter 'company' is set
      if (company == undefined || company == null) {
        throw "Missing the required parameter 'company' when calling create";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['auth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/buyers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the get operation.
     * @callback module:api/BuyerApi~getCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} buyerID ID of the buyer.
     * @param {module:api/BuyerApi~getCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.get = function(buyerID, callback) {
      var postBody = null;

      // verify the required parameter 'buyerID' is set
      if (buyerID == undefined || buyerID == null) {
        throw "Missing the required parameter 'buyerID' when calling get";
      }


      var pathParams = {
        'buyerID': buyerID
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['auth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/buyers/{buyerID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the list operation.
     * @callback module:api/BuyerApi~listCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {String} opts.search Word or phrase to search for.
     * @param {Integer} opts.page Page of results to return. Default: 1
     * @param {Integer} opts.pageSize Number of results to return per page. Default: 20, max: 100.
     * @param {module:api/BuyerApi~listCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.list = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'search': opts['search'],
        'page': opts['page'],
        'pageSize': opts['pageSize']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['auth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/buyers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the update operation.
     * @callback module:api/BuyerApi~updateCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} buyerID ID of the buyer.
     * @param {module:model/Buyer} company 
     * @param {module:api/BuyerApi~updateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.update = function(buyerID, company, callback) {
      var postBody = company;

      // verify the required parameter 'buyerID' is set
      if (buyerID == undefined || buyerID == null) {
        throw "Missing the required parameter 'buyerID' when calling update";
      }

      // verify the required parameter 'company' is set
      if (company == undefined || company == null) {
        throw "Missing the required parameter 'company' when calling update";
      }


      var pathParams = {
        'buyerID': buyerID
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['auth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = Object;

      return this.apiClient.callApi(
        '/buyers/{buyerID}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));