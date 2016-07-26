(ns order-cloud.api.cost-center
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id cost-center ]
  (call-api "/buyers/{buyerID}/costcenters" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cost-center
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id cost-center ]
  (:data (create-with-http-info buyer-id cost-center)))

(defn delete-with-http-info
  ""
  [buyer-id cost-center-id ]
  (call-api "/buyers/{buyerID}/costcenters/{costCenterID}" :delete
            {:path-params   {"buyerID" buyer-id "costCenterID" cost-center-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id cost-center-id ]
  (:data (delete-with-http-info buyer-id cost-center-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id cost-center-id ] (delete-assignment-with-http-info buyer-id cost-center-id nil))
  ([buyer-id cost-center-id {:keys [user-id user-group-id ]}]
   (call-api "/buyers/{buyerID}/costcenters/{costCenterID}/assignments" :delete
             {:path-params   {"buyerID" buyer-id "costCenterID" cost-center-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id cost-center-id ] (delete-assignment buyer-id cost-center-id nil))
  ([buyer-id cost-center-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id cost-center-id optional-params))))

(defn get-with-http-info
  ""
  [buyer-id cost-center-id ]
  (call-api "/buyers/{buyerID}/costcenters/{costCenterID}" :get
            {:path-params   {"buyerID" buyer-id "costCenterID" cost-center-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id cost-center-id ]
  (:data (get-with-http-info buyer-id cost-center-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/costcenters" :get
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
  ([buyer-id {:keys [cost-center-id user-id user-group-id level page page-size ]}]
   (call-api "/buyers/{buyerID}/costcenters/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"costCenterID" cost-center-id "userID" user-id "userGroupID" user-group-id "level" level "page" page "pageSize" page-size }
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
  [buyer-id cost-center-id cost-center ]
  (call-api "/buyers/{buyerID}/costcenters/{costCenterID}" :patch
            {:path-params   {"buyerID" buyer-id "costCenterID" cost-center-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cost-center
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id cost-center-id cost-center ]
  (:data (patch-with-http-info buyer-id cost-center-id cost-center)))

(defn save-assignment-with-http-info
  ""
  [buyer-id assignment ]
  (call-api "/buyers/{buyerID}/costcenters/assignments" :post
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
  [buyer-id cost-center-id cost-center ]
  (call-api "/buyers/{buyerID}/costcenters/{costCenterID}" :put
            {:path-params   {"buyerID" buyer-id "costCenterID" cost-center-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cost-center
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id cost-center-id cost-center ]
  (:data (update-with-http-info buyer-id cost-center-id cost-center)))

