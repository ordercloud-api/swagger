(ns order-cloud.api.buyer
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [company ]
  (call-api "/buyers" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    company
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [company ]
  (:data (create-with-http-info company)))

(defn delete-with-http-info
  ""
  [buyer-id ]
  (call-api "/buyers/{buyerID}" :delete
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id ]
  (:data (delete-with-http-info buyer-id)))

(defn get-with-http-info
  ""
  [buyer-id ]
  (call-api "/buyers/{buyerID}" :get
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id ]
  (:data (get-with-http-info buyer-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search page page-size ]}]
   (call-api "/buyers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([] (list nil))
  ([optional-params]
   (:data (list-with-http-info optional-params))))

(defn update-with-http-info
  ""
  [buyer-id company ]
  (call-api "/buyers/{buyerID}" :put
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    company
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id company ]
  (:data (update-with-http-info buyer-id company)))

