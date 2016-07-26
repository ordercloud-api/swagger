(ns order-cloud.api.admin-user
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [user ]
  (call-api "/adminusers" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [user ]
  (:data (create-with-http-info user)))

(defn delete-with-http-info
  ""
  [user-id ]
  (call-api "/adminusers/{userID}" :delete
            {:path-params   {"userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [user-id ]
  (:data (delete-with-http-info user-id)))

(defn get-with-http-info
  ""
  [user-id ]
  (call-api "/adminusers/{userID}" :get
            {:path-params   {"userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [user-id ]
  (:data (get-with-http-info user-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/adminusers" :get
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
  [user-id user ]
  (call-api "/adminusers/{userID}" :patch
            {:path-params   {"userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [user-id user ]
  (:data (patch-with-http-info user-id user)))

(defn update-with-http-info
  ""
  [user-id user ]
  (call-api "/adminusers/{userID}" :put
            {:path-params   {"userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [user-id user ]
  (:data (update-with-http-info user-id user)))

