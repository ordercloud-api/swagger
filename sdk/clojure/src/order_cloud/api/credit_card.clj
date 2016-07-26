(ns order-cloud.api.credit-card
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id card ]
  (call-api "/buyers/{buyerID}/creditcards" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id card ]
  (:data (create-with-http-info buyer-id card)))

(defn delete-with-http-info
  ""
  [buyer-id credit-card-id ]
  (call-api "/buyers/{buyerID}/creditcards/{creditCardID}" :delete
            {:path-params   {"buyerID" buyer-id "creditCardID" credit-card-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id credit-card-id ]
  (:data (delete-with-http-info buyer-id credit-card-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id credit-card-id ] (delete-assignment-with-http-info buyer-id credit-card-id nil))
  ([buyer-id credit-card-id {:keys [user-id user-group-id ]}]
   (call-api "/buyers/{buyerID}/creditcards/{creditCardID}/assignments" :delete
             {:path-params   {"buyerID" buyer-id "creditCardID" credit-card-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id credit-card-id ] (delete-assignment buyer-id credit-card-id nil))
  ([buyer-id credit-card-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id credit-card-id optional-params))))

(defn get-with-http-info
  ""
  [buyer-id credit-card-id ]
  (call-api "/buyers/{buyerID}/creditcards/{creditCardID}" :get
            {:path-params   {"buyerID" buyer-id "creditCardID" credit-card-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id credit-card-id ]
  (:data (get-with-http-info buyer-id credit-card-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/creditcards" :get
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
  ([buyer-id {:keys [credit-card-id user-id user-group-id level page page-size ]}]
   (call-api "/buyers/{buyerID}/creditcards/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"creditCardID" credit-card-id "userID" user-id "userGroupID" user-group-id "level" level "page" page "pageSize" page-size }
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
  [buyer-id credit-card-id card ]
  (call-api "/buyers/{buyerID}/creditcards/{creditCardID}" :patch
            {:path-params   {"buyerID" buyer-id "creditCardID" credit-card-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id credit-card-id card ]
  (:data (patch-with-http-info buyer-id credit-card-id card)))

(defn save-assignment-with-http-info
  ""
  [buyer-id assignment ]
  (call-api "/buyers/{buyerID}/creditcards/assignments" :post
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
  [buyer-id credit-card-id card ]
  (call-api "/buyers/{buyerID}/creditcards/{creditCardID}" :put
            {:path-params   {"buyerID" buyer-id "creditCardID" credit-card-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id credit-card-id card ]
  (:data (update-with-http-info buyer-id credit-card-id card)))

