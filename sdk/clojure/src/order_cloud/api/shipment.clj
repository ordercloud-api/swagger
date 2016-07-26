(ns order-cloud.api.shipment
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id shipment ]
  (call-api "/buyers/{buyerID}/shipments" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    shipment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id shipment ]
  (:data (create-with-http-info buyer-id shipment)))

(defn delete-with-http-info
  ""
  [buyer-id shipment-id ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}" :delete
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id shipment-id ]
  (:data (delete-with-http-info buyer-id shipment-id)))

(defn delete-item-with-http-info
  ""
  [buyer-id shipment-id order-id line-item-id ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}" :delete
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-item
  ""
  [buyer-id shipment-id order-id line-item-id ]
  (:data (delete-item-with-http-info buyer-id shipment-id order-id line-item-id)))

(defn get-with-http-info
  ""
  [buyer-id shipment-id ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}" :get
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id shipment-id ]
  (:data (get-with-http-info buyer-id shipment-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [order-id search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/shipments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"orderID" order-id "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([buyer-id ] (list buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-with-http-info buyer-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id shipment-id shipment ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}" :patch
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    shipment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id shipment-id shipment ]
  (:data (patch-with-http-info buyer-id shipment-id shipment)))

(defn save-item-with-http-info
  ""
  [buyer-id shipment-id item ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}/items" :post
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    item
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-item
  ""
  [buyer-id shipment-id item ]
  (:data (save-item-with-http-info buyer-id shipment-id item)))

(defn update-with-http-info
  ""
  [buyer-id shipment-id shipment ]
  (call-api "/buyers/{buyerID}/shipments/{shipmentID}" :put
            {:path-params   {"buyerID" buyer-id "shipmentID" shipment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    shipment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id shipment-id shipment ]
  (:data (update-with-http-info buyer-id shipment-id shipment)))

