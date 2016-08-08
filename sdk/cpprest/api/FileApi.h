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

/*
 * FileApi.h
 * 
 * 
 */
 
#ifndef FileApi_H_
#define FileApi_H_


#include "ApiClient.h"

#include <cpprest/details/basic_types.h>
#include "Object.h"

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  FileApi
{
public:
    FileApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~FileApi();
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="fileID">ID of the file.</param>
    pplx::task<std::shared_ptr<Object>> get(utility::string_t fileID);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="page">Page of results to return. Default: 1 (optional)</param>/// <param name="pageSize">Number of results to return per page. Default: 20, max: 100. (optional)</param>
    pplx::task<std::shared_ptr<Object>> list(int32_t page, int32_t pageSize);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="filename">Filename of the file. (optional)</param>
    pplx::task<std::shared_ptr<Object>> postFileData(utility::string_t filename);
    
protected:
    std::shared_ptr<ApiClient> m_ApiClient;    
};
    
}
}
}
}

#endif /* FileApi_H_ */
