(ns order-cloud.api.line-item
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id order-id line-item ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    line-item
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id order-id line-item ]
  (:data (create-with-http-info buyer-id order-id line-item)))

(defn delete-with-http-info
  ""
  [buyer-id order-id line-item-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}" :delete
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id order-id line-item-id ]
  (:data (delete-with-http-info buyer-id order-id line-item-id)))

(defn get-with-http-info
  ""
  [buyer-id order-id line-item-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}" :get
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id order-id line-item-id ]
  (:data (get-with-http-info buyer-id order-id line-item-id)))

(defn list-with-http-info
  ""
  ([buyer-id order-id ] (list-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems" :get
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([buyer-id order-id ] (list buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (list-with-http-info buyer-id order-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id order-id line-item-id partial-line-item ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-line-item
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id order-id line-item-id partial-line-item ]
  (:data (patch-with-http-info buyer-id order-id line-item-id partial-line-item)))

(defn patch-shipping-address-with-http-info
  ""
  [buyer-id order-id line-item-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-shipping-address
  ""
  [buyer-id order-id line-item-id address ]
  (:data (patch-shipping-address-with-http-info buyer-id order-id line-item-id address)))

(defn set-shipping-address-with-http-info
  ""
  [buyer-id order-id line-item-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn set-shipping-address
  ""
  [buyer-id order-id line-item-id address ]
  (:data (set-shipping-address-with-http-info buyer-id order-id line-item-id address)))

(defn update-with-http-info
  ""
  [buyer-id order-id line-item-id line-item ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id "lineItemID" line-item-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    line-item
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id order-id line-item-id line-item ]
  (:data (update-with-http-info buyer-id order-id line-item-id line-item)))

