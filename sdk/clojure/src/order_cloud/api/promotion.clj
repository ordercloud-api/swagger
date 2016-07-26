(ns order-cloud.api.promotion
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [promo ]
  (call-api "/promotions" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    promo
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [promo ]
  (:data (create-with-http-info promo)))

(defn delete-with-http-info
  ""
  [promotion-id ]
  (call-api "/promotions/{promotionID}" :delete
            {:path-params   {"promotionID" promotion-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [promotion-id ]
  (:data (delete-with-http-info promotion-id)))

(defn delete-assignment-with-http-info
  ""
  ([promotion-id buyer-id ] (delete-assignment-with-http-info promotion-id buyer-id nil))
  ([promotion-id buyer-id {:keys [user-id user-group-id ]}]
   (call-api "/promotions/{promotionID}/assignments" :delete
             {:path-params   {"promotionID" promotion-id }
              :header-params {}
              :query-params  {"buyerID" buyer-id "userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([promotion-id buyer-id ] (delete-assignment promotion-id buyer-id nil))
  ([promotion-id buyer-id optional-params]
   (:data (delete-assignment-with-http-info promotion-id buyer-id optional-params))))

(defn get-with-http-info
  ""
  [promotion-id ]
  (call-api "/promotions/{promotionID}" :get
            {:path-params   {"promotionID" promotion-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [promotion-id ]
  (:data (get-with-http-info promotion-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/promotions" :get
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

(defn list-assignments-with-http-info
  ""
  ([buyer-id ] (list-assignments-with-http-info buyer-id nil))
  ([buyer-id {:keys [promotion-id user-id user-group-id level page page-size ]}]
   (call-api "/promotions/assignments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"buyerID" buyer-id "promotionID" promotion-id "userID" user-id "userGroupID" user-group-id "level" level "page" page "pageSize" page-size }
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
  [promotion-id partial-promotion ]
  (call-api "/promotions/{promotionID}" :patch
            {:path-params   {"promotionID" promotion-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-promotion
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [promotion-id partial-promotion ]
  (:data (patch-with-http-info promotion-id partial-promotion)))

(defn save-assignment-with-http-info
  ""
  [assignment ]
  (call-api "/promotions/assignments" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-assignment
  ""
  [assignment ]
  (:data (save-assignment-with-http-info assignment)))

(defn update-with-http-info
  ""
  [promotion-id promo ]
  (call-api "/promotions/{promotionID}" :put
            {:path-params   {"promotionID" promotion-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    promo
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [promotion-id promo ]
  (:data (update-with-http-info promotion-id promo)))

