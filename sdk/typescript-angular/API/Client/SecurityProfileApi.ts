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

/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class SecurityProfileApi {
        protected basePath = 'https://api.ordercloud.io/v1';
        public defaultHeaders : any = {};

        static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

        constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
            if (basePath !== undefined) {
                this.basePath = basePath;
            }
        }

        private extendObj<T1,T2>(objA: T1, objB: T2) {
            for(let key in objB){
                if(objB.hasOwnProperty(key)){
                    objA[key] = objB[key];
                }
            }
            return <T1&T2>objA;
        }

        /**
         * 
         * 
         * @param securityProfileID ID of the security profile.
         */
        public get (securityProfileID: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<any> {
            const localVarPath = this.basePath + '/SecurityProfiles/{securityProfileID}'
                .replace('{' + 'securityProfileID' + '}', String(securityProfileID));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'securityProfileID' is not null or undefined
            if (securityProfileID === null || securityProfileID === undefined) {
                throw new Error('Required parameter securityProfileID was null or undefined when calling get.');
            }
            let httpRequestParams: any = {
                method: 'GET',
                url: localVarPath,
                json: true,
                                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * 
         * 
         * @param search Word or phrase to search for.
         * @param searchOn Comma-delimited list of fields to search on.
         * @param sortBy Comma-delimited list of fields to sort by.
         * @param page Page of results to return. Default: 1
         * @param pageSize Number of results to return per page. Default: 20, max: 100.
         */
        public list (search?: string, searchOn?: string, sortBy?: string, page?: number, pageSize?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<any> {
            const localVarPath = this.basePath + '/SecurityProfiles';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (search !== undefined) {
                queryParameters['search'] = search;
            }

            if (searchOn !== undefined) {
                queryParameters['searchOn'] = searchOn;
            }

            if (sortBy !== undefined) {
                queryParameters['sortBy'] = sortBy;
            }

            if (page !== undefined) {
                queryParameters['page'] = page;
            }

            if (pageSize !== undefined) {
                queryParameters['pageSize'] = pageSize;
            }

            let httpRequestParams: any = {
                method: 'GET',
                url: localVarPath,
                json: true,
                                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
    }
}