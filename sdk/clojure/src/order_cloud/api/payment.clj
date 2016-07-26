(ns order-cloud.api.payment
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id order-id payment ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    payment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id order-id payment ]
  (:data (create-with-http-info buyer-id order-id payment)))

(defn create-transaction-with-http-info
  ""
  [buyer-id order-id payment-id transaction ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions" :post
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transaction
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create-transaction
  ""
  [buyer-id order-id payment-id transaction ]
  (:data (create-transaction-with-http-info buyer-id order-id payment-id transaction)))

(defn delete-with-http-info
  ""
  [buyer-id order-id payment-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}" :delete
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id order-id payment-id ]
  (:data (delete-with-http-info buyer-id order-id payment-id)))

(defn delete-transaction-with-http-info
  ""
  [buyer-id order-id payment-id transaction-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}" :delete
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id "transactionID" transaction-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-transaction
  ""
  [buyer-id order-id payment-id transaction-id ]
  (:data (delete-transaction-with-http-info buyer-id order-id payment-id transaction-id)))

(defn get-with-http-info
  ""
  [buyer-id order-id payment-id ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}" :get
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id order-id payment-id ]
  (:data (get-with-http-info buyer-id order-id payment-id)))

(defn list-with-http-info
  ""
  ([buyer-id order-id ] (list-with-http-info buyer-id order-id nil))
  ([buyer-id order-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/orders/{orderID}/payments" :get
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
  [buyer-id order-id payment-id partial-payment ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-payment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id order-id payment-id partial-payment ]
  (:data (patch-with-http-info buyer-id order-id payment-id partial-payment)))

(defn patch-transaction-with-http-info
  ""
  [buyer-id order-id payment-id transaction-id partial-transaction ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}" :patch
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id "transactionID" transaction-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-transaction
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-transaction
  ""
  [buyer-id order-id payment-id transaction-id partial-transaction ]
  (:data (patch-transaction-with-http-info buyer-id order-id payment-id transaction-id partial-transaction)))

(defn update-with-http-info
  ""
  [buyer-id order-id payment-id payment ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    payment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id order-id payment-id payment ]
  (:data (update-with-http-info buyer-id order-id payment-id payment)))

(defn update-transaction-with-http-info
  ""
  [buyer-id order-id payment-id transaction-id transaction ]
  (call-api "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}" :put
            {:path-params   {"buyerID" buyer-id "orderID" order-id "paymentID" payment-id "transactionID" transaction-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transaction
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-transaction
  ""
  [buyer-id order-id payment-id transaction-id transaction ]
  (:data (update-transaction-with-http-info buyer-id order-id payment-id transaction-id transaction)))

