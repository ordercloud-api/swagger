(ns order-cloud.api.order
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-promotion-with-http-info
  ""
  [buyer-id order-id promo-code ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id "promoCode" promo-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn add-promotion
  ""
  [buyer-id order-id promo-code ]
  (:data (add-promotion-with-http-info buyer-id order-id promo-code)))

(defn approve-with-http-info
  ""
  ([buyer-id order-id ] (approve-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [comments ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/approve" :post
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"comments" comments }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn approve
  ""
  ([buyer-id order-id ] (approve buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (approve-with-http-info buyer-id order-id optional-params))))

(defn cancel-with-http-info
  ""
  [buyer-id order-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/cancel" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn cancel
  ""
  [buyer-id order-id ]
  (:data (cancel-with-http-info buyer-id order-id)))

(defn create-with-http-info
  ""
  [buyer-id order ]
  (call-api "/buyers/{buyerID}/orders" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id order ]
  (:data (create-with-http-info buyer-id order)))

(defn decline-with-http-info
  ""
  ([buyer-id order-id ] (decline-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [comments ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/decline" :post
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"comments" comments }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn decline
  ""
  ([buyer-id order-id ] (decline buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (decline-with-http-info buyer-id order-id optional-params))))

(defn delete-with-http-info
  ""
  [buyer-id order-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}" :delete
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id order-id ]
  (:data (delete-with-http-info buyer-id order-id)))

(defn get-with-http-info
  ""
  [buyer-id order-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}" :get
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id order-id ]
  (:data (get-with-http-info buyer-id order-id)))

(defn list-approvals-with-http-info
  ""
  ([buyer-id order-id ] (list-approvals-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/approvals" :get
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-approvals
  ""
  ([buyer-id order-id ] (list-approvals buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (list-approvals-with-http-info buyer-id order-id optional-params))))

(defn list-eligible-approvers-with-http-info
  ""
  ([buyer-id order-id ] (list-eligible-approvers-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/eligibleapprovers" :get
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-eligible-approvers
  ""
  ([buyer-id order-id ] (list-eligible-approvers buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (list-eligible-approvers-with-http-info buyer-id order-id optional-params))))

(defn list-incoming-with-http-info
  ""
  ([] (list-incoming-with-http-info nil))
  ([{:keys [buyer-id from to search search-on sort-by page page-size ]}]
   (call-api "/orders/incoming" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"buyerID" buyer-id "from" from "to" to "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-incoming
  ""
  ([] (list-incoming nil))
  ([optional-params]
   (:data (list-incoming-with-http-info optional-params))))

(defn list-outgoing-with-http-info
  ""
  ([] (list-outgoing-with-http-info nil))
  ([{:keys [buyer-id from to search search-on sort-by page page-size ]}]
   (call-api "/orders/outgoing" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"buyerID" buyer-id "from" from "to" to "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-outgoing
  ""
  ([] (list-outgoing nil))
  ([optional-params]
   (:data (list-outgoing-with-http-info optional-params))))

(defn list-promotions-with-http-info
  ""
  ([buyer-id order-id ] (list-promotions-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/promotions" :get
             {:path-params   {"buyerID" buyer-id "orderID" order-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-promotions
  ""
  ([buyer-id order-id ] (list-promotions buyer-id order-id nil))
  ([buyer-id order-id optional-params]
   (:data (list-promotions-with-http-info buyer-id order-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id order-id partial-order ]
  (call-api "/buyers/{buyerID}/orders/{orderID}" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-order
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id order-id partial-order ]
  (:data (patch-with-http-info buyer-id order-id partial-order)))

(defn patch-billing-address-with-http-info
  ""
  [buyer-id order-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/billto" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-billing-address
  ""
  [buyer-id order-id address ]
  (:data (patch-billing-address-with-http-info buyer-id order-id address)))

(defn patch-shipping-address-with-http-info
  ""
  [buyer-id order-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/shipto" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-shipping-address
  ""
  [buyer-id order-id address ]
  (:data (patch-shipping-address-with-http-info buyer-id order-id address)))

(defn remove-promotion-with-http-info
  ""
  [buyer-id order-id promo-code ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}" :delete
            {:path-params   {"buyerID" buyer-id "orderID" order-id "promoCode" promo-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn remove-promotion
  ""
  [buyer-id order-id promo-code ]
  (:data (remove-promotion-with-http-info buyer-id order-id promo-code)))

(defn set-billing-address-with-http-info
  ""
  [buyer-id order-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/billto" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn set-billing-address
  ""
  [buyer-id order-id address ]
  (:data (set-billing-address-with-http-info buyer-id order-id address)))

(defn set-shipping-address-with-http-info
  ""
  [buyer-id order-id address ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/shipto" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn set-shipping-address
  ""
  [buyer-id order-id address ]
  (:data (set-shipping-address-with-http-info buyer-id order-id address)))

(defn ship-with-http-info
  ""
  [buyer-id order-id shipment ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/ship" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    shipment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn ship
  ""
  [buyer-id order-id shipment ]
  (:data (ship-with-http-info buyer-id order-id shipment)))

(defn submit-with-http-info
  ""
  [buyer-id order-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/submit" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn submit
  ""
  [buyer-id order-id ]
  (:data (submit-with-http-info buyer-id order-id)))

(defn transfer-temp-user-order-with-http-info
  ""
  [buyer-id temp-user-token ]
  (call-api "/buyers/{buyerID}/orders" :put
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {"tempUserToken" temp-user-token }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn transfer-temp-user-order
  ""
  [buyer-id temp-user-token ]
  (:data (transfer-temp-user-order-with-http-info buyer-id temp-user-token)))

(defn update-with-http-info
  ""
  [buyer-id order-id order ]
  (call-api "/buyers/{buyerID}/orders/{orderID}" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id order-id order ]
  (:data (update-with-http-info buyer-id order-id order)))

