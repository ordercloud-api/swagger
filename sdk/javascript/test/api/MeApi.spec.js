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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OrderCloud);
  }
}(this, function(expect, OrderCloud) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OrderCloud.MeApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('MeApi', function() {
    describe('createAddress', function() {
      it('should call createAddress successfully', function(done) {
        //uncomment below and update the code to test createAddress
        //instance.createAddress(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createCreditCard', function() {
      it('should call createCreditCard successfully', function(done) {
        //uncomment below and update the code to test createCreditCard
        //instance.createCreditCard(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAddress', function() {
      it('should call deleteAddress successfully', function(done) {
        //uncomment below and update the code to test deleteAddress
        //instance.deleteAddress(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteCreditCard', function() {
      it('should call deleteCreditCard successfully', function(done) {
        //uncomment below and update the code to test deleteCreditCard
        //instance.deleteCreditCard(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('get', function() {
      it('should call get successfully', function(done) {
        //uncomment below and update the code to test get
        //instance.get(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAddress', function() {
      it('should call getAddress successfully', function(done) {
        //uncomment below and update the code to test getAddress
        //instance.getAddress(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCreditCard', function() {
      it('should call getCreditCard successfully', function(done) {
        //uncomment below and update the code to test getCreditCard
        //instance.getCreditCard(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOrder', function() {
      it('should call getOrder successfully', function(done) {
        //uncomment below and update the code to test getOrder
        //instance.getOrder(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProduct', function() {
      it('should call getProduct successfully', function(done) {
        //uncomment below and update the code to test getProduct
        //instance.getProduct(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPromotion', function() {
      it('should call getPromotion successfully', function(done) {
        //uncomment below and update the code to test getPromotion
        //instance.getPromotion(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSpec', function() {
      it('should call getSpec successfully', function(done) {
        //uncomment below and update the code to test getSpec
        //instance.getSpec(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listAddresses', function() {
      it('should call listAddresses successfully', function(done) {
        //uncomment below and update the code to test listAddresses
        //instance.listAddresses(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listCategories', function() {
      it('should call listCategories successfully', function(done) {
        //uncomment below and update the code to test listCategories
        //instance.listCategories(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listCostCenters', function() {
      it('should call listCostCenters successfully', function(done) {
        //uncomment below and update the code to test listCostCenters
        //instance.listCostCenters(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listCreditCards', function() {
      it('should call listCreditCards successfully', function(done) {
        //uncomment below and update the code to test listCreditCards
        //instance.listCreditCards(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listIncomingOrders', function() {
      it('should call listIncomingOrders successfully', function(done) {
        //uncomment below and update the code to test listIncomingOrders
        //instance.listIncomingOrders(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listOutgoingOrders', function() {
      it('should call listOutgoingOrders successfully', function(done) {
        //uncomment below and update the code to test listOutgoingOrders
        //instance.listOutgoingOrders(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listProducts', function() {
      it('should call listProducts successfully', function(done) {
        //uncomment below and update the code to test listProducts
        //instance.listProducts(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listPromotions', function() {
      it('should call listPromotions successfully', function(done) {
        //uncomment below and update the code to test listPromotions
        //instance.listPromotions(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listSpecs', function() {
      it('should call listSpecs successfully', function(done) {
        //uncomment below and update the code to test listSpecs
        //instance.listSpecs(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listSubcategories', function() {
      it('should call listSubcategories successfully', function(done) {
        //uncomment below and update the code to test listSubcategories
        //instance.listSubcategories(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listUserGroups', function() {
      it('should call listUserGroups successfully', function(done) {
        //uncomment below and update the code to test listUserGroups
        //instance.listUserGroups(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('patch', function() {
      it('should call patch successfully', function(done) {
        //uncomment below and update the code to test patch
        //instance.patch(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('patchAddress', function() {
      it('should call patchAddress successfully', function(done) {
        //uncomment below and update the code to test patchAddress
        //instance.patchAddress(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('patchCreditCard', function() {
      it('should call patchCreditCard successfully', function(done) {
        //uncomment below and update the code to test patchCreditCard
        //instance.patchCreditCard(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('update', function() {
      it('should call update successfully', function(done) {
        //uncomment below and update the code to test update
        //instance.update(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateAddress', function() {
      it('should call updateAddress successfully', function(done) {
        //uncomment below and update the code to test updateAddress
        //instance.updateAddress(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateCreditCard', function() {
      it('should call updateCreditCard successfully', function(done) {
        //uncomment below and update the code to test updateCreditCard
        //instance.updateCreditCard(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));