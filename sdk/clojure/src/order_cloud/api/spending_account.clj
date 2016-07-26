(ns order-cloud.api.spending-account
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id spending-account ]
  (call-api "/buyers/{buyerID}/spendingaccounts" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spending-account
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id spending-account ]
  (:data (create-with-http-info buyer-id spending-account)))

(defn delete-with-http-info
  ""
  [buyer-id spending-account-id ]
  (call-api "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}" :delete
            {:path-params   {"buyerID" buyer-id "spendingAccountID" spending-account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id spending-account-id ]
  (:data (delete-with-http-info buyer-id spending-account-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id spending-account-id ] (delete-assignment-with-http-info buyer-id spending-account-id nil))
  ([buyer-id spending-account-id {:keys [user-id user-group-id ]}]
   (call-api "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments" :delete
             {:path-params   {"buyerID" buyer-id "spendingAccountID" spending-account-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id spending-account-id ] (delete-assignment buyer-id spending-account-id nil))
  ([buyer-id spending-account-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id spending-account-id optional-params))))

(defn get-with-http-info
  ""
  [buyer-id spending-account-id ]
  (call-api "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}" :get
            {:path-params   {"buyerID" buyer-id "spendingAccountID" spending-account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id spending-account-id ]
  (:data (get-with-http-info buyer-id spending-account-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/spendingaccounts" :get
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
  ([buyer-id {:keys [spending-account-id user-id user-group-id level page page-size ]}]
   (call-api "/buyers/{buyerID}/spendingaccounts/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"spendingAccountID" spending-account-id "userID" user-id "userGroupID" user-group-id "level" level "page" page "pageSize" page-size }
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
  [buyer-id spending-account-id spending-account ]
  (call-api "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}" :patch
            {:path-params   {"buyerID" buyer-id "spendingAccountID" spending-account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spending-account
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id spending-account-id spending-account ]
  (:data (patch-with-http-info buyer-id spending-account-id spending-account)))

(defn save-assignment-with-http-info
  ""
  [buyer-id assignment ]
  (call-api "/buyers/{buyerID}/spendingaccounts/assignments" :post
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
  [buyer-id spending-account-id spending-account ]
  (call-api "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}" :put
            {:path-params   {"buyerID" buyer-id "spendingAccountID" spending-account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spending-account
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id spending-account-id spending-account ]
  (:data (update-with-http-info buyer-id spending-account-id spending-account)))

