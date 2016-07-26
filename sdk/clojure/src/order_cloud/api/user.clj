(ns order-cloud.api.user
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id user ]
  (call-api "/buyers/{buyerID}/users" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id user ]
  (:data (create-with-http-info buyer-id user)))

(defn delete-with-http-info
  ""
  [buyer-id user-id ]
  (call-api "/buyers/{buyerID}/users/{userID}" :delete
            {:path-params   {"buyerID" buyer-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id user-id ]
  (:data (delete-with-http-info buyer-id user-id)))

(defn get-with-http-info
  ""
  [buyer-id user-id ]
  (call-api "/buyers/{buyerID}/users/{userID}" :get
            {:path-params   {"buyerID" buyer-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id user-id ]
  (:data (get-with-http-info buyer-id user-id)))

(defn get-access-token-with-http-info
  ""
  [buyer-id user-id token-request ]
  (call-api "/buyers/{buyerID}/users/{userID}/accesstoken" :post
            {:path-params   {"buyerID" buyer-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    token-request
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-access-token
  ""
  [buyer-id user-id token-request ]
  (:data (get-access-token-with-http-info buyer-id user-id token-request)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [user-group-id search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/users" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"userGroupID" user-group-id "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
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
  [buyer-id user-id user ]
  (call-api "/buyers/{buyerID}/users/{userID}" :patch
            {:path-params   {"buyerID" buyer-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id user-id user ]
  (:data (patch-with-http-info buyer-id user-id user)))

(defn update-with-http-info
  ""
  [buyer-id user-id user ]
  (call-api "/buyers/{buyerID}/users/{userID}" :put
            {:path-params   {"buyerID" buyer-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id user-id user ]
  (:data (update-with-http-info buyer-id user-id user)))

