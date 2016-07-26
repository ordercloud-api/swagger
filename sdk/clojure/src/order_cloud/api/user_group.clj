(ns order-cloud.api.user-group
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id group ]
  (call-api "/buyers/{buyerID}/usergroups" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    group
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id group ]
  (:data (create-with-http-info buyer-id group)))

(defn delete-with-http-info
  ""
  [buyer-id user-group-id ]
  (call-api "/buyers/{buyerID}/usergroups/{userGroupID}" :delete
            {:path-params   {"buyerID" buyer-id "userGroupID" user-group-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id user-group-id ]
  (:data (delete-with-http-info buyer-id user-group-id)))

(defn delete-user-assignment-with-http-info
  ""
  [buyer-id user-group-id user-id ]
  (call-api "/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}" :delete
            {:path-params   {"buyerID" buyer-id "userGroupID" user-group-id "userID" user-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-user-assignment
  ""
  [buyer-id user-group-id user-id ]
  (:data (delete-user-assignment-with-http-info buyer-id user-group-id user-id)))

(defn get-with-http-info
  ""
  [buyer-id user-group-id ]
  (call-api "/buyers/{buyerID}/usergroups/{userGroupID}" :get
            {:path-params   {"buyerID" buyer-id "userGroupID" user-group-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id user-group-id ]
  (:data (get-with-http-info buyer-id user-group-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/usergroups" :get
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

(defn list-user-assignments-with-http-info
  ""
  ([buyer-id ] (list-user-assignments-with-http-info buyer-id nil))
  ([buyer-id {:keys [user-group-id user-id page page-size ]}]
   (call-api "/buyers/{buyerID}/usergroups/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"userGroupID" user-group-id "userID" user-id "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-user-assignments
  ""
  ([buyer-id ] (list-user-assignments buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-user-assignments-with-http-info buyer-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id user-group-id group ]
  (call-api "/buyers/{buyerID}/usergroups/{userGroupID}" :patch
            {:path-params   {"buyerID" buyer-id "userGroupID" user-group-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    group
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id user-group-id group ]
  (:data (patch-with-http-info buyer-id user-group-id group)))

(defn save-user-assignment-with-http-info
  ""
  [buyer-id user-group-assignment ]
  (call-api "/buyers/{buyerID}/usergroups/assignments" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user-group-assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-user-assignment
  ""
  [buyer-id user-group-assignment ]
  (:data (save-user-assignment-with-http-info buyer-id user-group-assignment)))

(defn update-with-http-info
  ""
  [buyer-id user-group-id group ]
  (call-api "/buyers/{buyerID}/usergroups/{userGroupID}" :put
            {:path-params   {"buyerID" buyer-id "userGroupID" user-group-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    group
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id user-group-id group ]
  (:data (update-with-http-info buyer-id user-group-id group)))

