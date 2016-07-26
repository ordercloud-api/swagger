(ns order-cloud.api.address
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id address ]
  (call-api "/buyers/{buyerID}/addresses" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id address ]
  (:data (create-with-http-info buyer-id address)))

(defn delete-with-http-info
  ""
  [buyer-id address-id ]
  (call-api "/buyers/{buyerID}/addresses/{addressID}" :delete
            {:path-params   {"buyerID" buyer-id "addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id address-id ]
  (:data (delete-with-http-info buyer-id address-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id address-id ] (delete-assignment-with-http-info buyer-id address-id nil))
  ([buyer-id address-id {:keys [user-id user-group-id ]}]
   (call-api "/buyers/{buyerID}/addresses/{addressID}/assignments" :delete
             {:path-params   {"buyerID" buyer-id "addressID" address-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id address-id ] (delete-assignment buyer-id address-id nil))
  ([buyer-id address-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id address-id optional-params))))

(defn get-with-http-info
  ""
  [buyer-id address-id ]
  (call-api "/buyers/{buyerID}/addresses/{addressID}" :get
            {:path-params   {"buyerID" buyer-id "addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id address-id ]
  (:data (get-with-http-info buyer-id address-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/addresses" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([buyer-id ] (list buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-with-http-info buyer-id optional-params))))

(defn list-assignments-with-http-info
  ""
  ([buyer-id ] (list-assignments-with-http-info buyer-id nil))
  ([buyer-id {:keys [address-id user-id user-group-id level is-shipping is-billing page page-size ]}]
   (call-api "/buyers/{buyerID}/addresses/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"addressID" address-id "userID" user-id "userGroupID" user-group-id "level" level "isShipping" is-shipping "isBilling" is-billing "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-assignments
  ""
  ([buyer-id ] (list-assignments buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-assignments-with-http-info buyer-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id address-id address ]
  (call-api "/buyers/{buyerID}/addresses/{addressID}" :patch
            {:path-params   {"buyerID" buyer-id "addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id address-id address ]
  (:data (patch-with-http-info buyer-id address-id address)))

(defn save-assignment-with-http-info
  ""
  [buyer-id assignment ]
  (call-api "/buyers/{buyerID}/addresses/assignments" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-assignment
  ""
  [buyer-id assignment ]
  (:data (save-assignment-with-http-info buyer-id assignment)))

(defn update-with-http-info
  ""
  [buyer-id address-id address ]
  (call-api "/buyers/{buyerID}/addresses/{addressID}" :put
            {:path-params   {"buyerID" buyer-id "addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id address-id address ]
  (:data (update-with-http-info buyer-id address-id address)))

