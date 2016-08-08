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

#ifndef _SWG_SWGCategoryApi_H_
#define _SWG_SWGCategoryApi_H_

#include "SWGHttpRequest.h"

#include "SWGCategory.h"
#include <QString>
#include "SWGObject.h"
#include "SWGCategoryAssignment.h"
#include "SWGCategoryProductAssignment.h"

#include <QObject>

namespace Swagger {

class SWGCategoryApi: public QObject {
    Q_OBJECT

public:
    SWGCategoryApi();
    SWGCategoryApi(QString host, QString basePath);
    ~SWGCategoryApi();

    QString host;
    QString basePath;

    void create(QString* buyerID, SWGCategory category);
    void delete(QString* buyerID, QString* categoryID);
    void deleteAssignment(QString* buyerID, QString* categoryID, QString* userID, QString* userGroupID);
    void deleteProductAssignment(QString* buyerID, QString* categoryID, QString* productID);
    void get(QString* buyerID, QString* categoryID);
    void list(QString* buyerID, QString* parentID, QString* depth, QString* search, QString* searchOn, QString* sortBy, qint32 page, qint32 pageSize);
    void listAssignments(QString* buyerID, QString* categoryID, QString* userID, QString* userGroupID, QString* level, qint32 page, qint32 pageSize);
    void listChildren(QString* buyerID, QString* parentID, QString* search, QString* depth, qint32 page, qint32 pageSize);
    void listProductAssignments(QString* buyerID, QString* categoryID, QString* productID, qint32 page, qint32 pageSize);
    void patch(QString* buyerID, QString* categoryID, SWGCategory category);
    void saveAssignment(QString* buyerID, SWGCategoryAssignment categoryAssignment);
    void saveProductAssignment(QString* buyerID, SWGCategoryProductAssignment productAssignment);
    void update(QString* buyerID, QString* categoryID, SWGCategory category);
    
private:
    void createCallback (HttpRequestWorker * worker);
    void deleteCallback (HttpRequestWorker * worker);
    void deleteAssignmentCallback (HttpRequestWorker * worker);
    void deleteProductAssignmentCallback (HttpRequestWorker * worker);
    void getCallback (HttpRequestWorker * worker);
    void listCallback (HttpRequestWorker * worker);
    void listAssignmentsCallback (HttpRequestWorker * worker);
    void listChildrenCallback (HttpRequestWorker * worker);
    void listProductAssignmentsCallback (HttpRequestWorker * worker);
    void patchCallback (HttpRequestWorker * worker);
    void saveAssignmentCallback (HttpRequestWorker * worker);
    void saveProductAssignmentCallback (HttpRequestWorker * worker);
    void updateCallback (HttpRequestWorker * worker);
    
signals:
    void createSignal(SWGObject* summary);
    void deleteSignal();
    void deleteAssignmentSignal();
    void deleteProductAssignmentSignal();
    void getSignal(SWGObject* summary);
    void listSignal(SWGObject* summary);
    void listAssignmentsSignal(SWGObject* summary);
    void listChildrenSignal(SWGObject* summary);
    void listProductAssignmentsSignal(SWGObject* summary);
    void patchSignal();
    void saveAssignmentSignal();
    void saveProductAssignmentSignal();
    void updateSignal(SWGObject* summary);
    
};
}
#endif