(ns order-cloud.api.price-schedule
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [price-schedule ]
  (call-api "/priceschedules" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    price-schedule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [price-schedule ]
  (:data (create-with-http-info price-schedule)))

(defn delete-with-http-info
  ""
  [price-schedule-id ]
  (call-api "/priceschedules/{priceScheduleID}" :delete
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [price-schedule-id ]
  (:data (delete-with-http-info price-schedule-id)))

(defn delete-price-break-with-http-info
  ""
  [price-schedule-id quantity ]
  (call-api "/priceschedules/{priceScheduleID}/PriceBreaks" :delete
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {"quantity" quantity }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-price-break
  ""
  [price-schedule-id quantity ]
  (:data (delete-price-break-with-http-info price-schedule-id quantity)))

(defn get-with-http-info
  ""
  [price-schedule-id ]
  (call-api "/priceschedules/{priceScheduleID}" :get
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [price-schedule-id ]
  (:data (get-with-http-info price-schedule-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/priceschedules" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([] (list nil))
  ([optional-params]
   (:data (list-with-http-info optional-params))))

(defn patch-with-http-info
  ""
  [price-schedule-id price-schedule ]
  (call-api "/priceschedules/{priceScheduleID}" :patch
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    price-schedule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [price-schedule-id price-schedule ]
  (:data (patch-with-http-info price-schedule-id price-schedule)))

(defn save-price-break-with-http-info
  ""
  [price-schedule-id price-break ]
  (call-api "/priceschedules/{priceScheduleID}/PriceBreaks" :post
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    price-break
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-price-break
  ""
  [price-schedule-id price-break ]
  (:data (save-price-break-with-http-info price-schedule-id price-break)))

(defn update-with-http-info
  ""
  [price-schedule-id price-schedule ]
  (call-api "/priceschedules/{priceScheduleID}" :put
            {:path-params   {"priceScheduleID" price-schedule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    price-schedule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [price-schedule-id price-schedule ]
  (:data (update-with-http-info price-schedule-id price-schedule)))

