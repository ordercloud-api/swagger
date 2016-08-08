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

#ifndef _SWG_SWGPriceScheduleApi_H_
#define _SWG_SWGPriceScheduleApi_H_

#include "SWGHttpRequest.h"

#include "SWGPriceSchedule.h"
#include "SWGObject.h"
#include <QString>
#include "SWGPriceBreak.h"

#include <QObject>

namespace Swagger {

class SWGPriceScheduleApi: public QObject {
    Q_OBJECT

public:
    SWGPriceScheduleApi();
    SWGPriceScheduleApi(QString host, QString basePath);
    ~SWGPriceScheduleApi();

    QString host;
    QString basePath;

    void create(SWGPriceSchedule priceSchedule);
    void delete(QString* priceScheduleID);
    void deletePriceBreak(QString* priceScheduleID, qint32 quantity);
    void get(QString* priceScheduleID);
    void list(QString* search, QString* searchOn, QString* sortBy, qint32 page, qint32 pageSize);
    void patch(QString* priceScheduleID, SWGPriceSchedule priceSchedule);
    void savePriceBreak(QString* priceScheduleID, SWGPriceBreak priceBreak);
    void update(QString* priceScheduleID, SWGPriceSchedule priceSchedule);
    
private:
    void createCallback (HttpRequestWorker * worker);
    void deleteCallback (HttpRequestWorker * worker);
    void deletePriceBreakCallback (HttpRequestWorker * worker);
    void getCallback (HttpRequestWorker * worker);
    void listCallback (HttpRequestWorker * worker);
    void patchCallback (HttpRequestWorker * worker);
    void savePriceBreakCallback (HttpRequestWorker * worker);
    void updateCallback (HttpRequestWorker * worker);
    
signals:
    void createSignal(SWGObject* summary);
    void deleteSignal();
    void deletePriceBreakSignal();
    void getSignal(SWGObject* summary);
    void listSignal(SWGObject* summary);
    void patchSignal(SWGObject* summary);
    void savePriceBreakSignal(SWGObject* summary);
    void updateSignal(SWGObject* summary);
    
};
}
#endif