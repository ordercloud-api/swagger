(ns order-cloud.api.category
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id category ]
  (call-api "/buyers/{buyerID}/categories" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    category
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id category ]
  (:data (create-with-http-info buyer-id category)))

(defn delete-with-http-info
  ""
  [buyer-id category-id ]
  (call-api "/buyers/{buyerID}/categories/{categoryID}" :delete
            {:path-params   {"buyerID" buyer-id "categoryID" category-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id category-id ]
  (:data (delete-with-http-info buyer-id category-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id category-id ] (delete-assignment-with-http-info buyer-id category-id nil))
  ([buyer-id category-id {:keys [user-id user-group-id ]}]
   (call-api "/buyers/{buyerID}/categories/{categoryID}/assignments" :delete
             {:path-params   {"buyerID" buyer-id "categoryID" category-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id category-id ] (delete-assignment buyer-id category-id nil))
  ([buyer-id category-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id category-id optional-params))))

(defn delete-product-assignment-with-http-info
  ""
  [buyer-id category-id product-id ]
  (call-api "/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}" :delete
            {:path-params   {"buyerID" buyer-id "categoryID" category-id "productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-product-assignment
  ""
  [buyer-id category-id product-id ]
  (:data (delete-product-assignment-with-http-info buyer-id category-id product-id)))

(defn get-with-http-info
  ""
  [buyer-id category-id ]
  (call-api "/buyers/{buyerID}/categories/{categoryID}" :get
            {:path-params   {"buyerID" buyer-id "categoryID" category-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id category-id ]
  (:data (get-with-http-info buyer-id category-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [parent-id depth search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/categories" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"parentID" parent-id "depth" depth "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
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
  ([buyer-id {:keys [category-id user-id user-group-id level page page-size ]}]
   (call-api "/buyers/{buyerID}/categories/assignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"categoryID" category-id "userID" user-id "userGroupID" user-group-id "level" level "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-assignments
  ""
  ([buyer-id ] (list-assignments buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-assignments-with-http-info buyer-id optional-params))))

(defn list-children-with-http-info
  ""
  ([buyer-id parent-id ] (list-children-with-http-info buyer-id parent-id nil))
  ([buyer-id parent-id {:keys [search depth page page-size ]}]
   (call-api "/buyers/{buyerID}/categories/{parentID}/categories" :get
             {:path-params   {"buyerID" buyer-id "parentID" parent-id }
              :header-params {}
              :query-params  {"search" search "depth" depth "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-children
  ""
  ([buyer-id parent-id ] (list-children buyer-id parent-id nil))
  ([buyer-id parent-id optional-params]
   (:data (list-children-with-http-info buyer-id parent-id optional-params))))

(defn list-product-assignments-with-http-info
  ""
  ([buyer-id ] (list-product-assignments-with-http-info buyer-id nil))
  ([buyer-id {:keys [category-id product-id page page-size ]}]
   (call-api "/buyers/{buyerID}/categories/productassignments" :get
             {:path-params   {"buyerID" buyer-id }
              :header-params {}
              :query-params  {"categoryID" category-id "productID" product-id "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-product-assignments
  ""
  ([buyer-id ] (list-product-assignments buyer-id nil))
  ([buyer-id optional-params]
   (:data (list-product-assignments-with-http-info buyer-id optional-params))))

(defn patch-with-http-info
  ""
  [buyer-id category-id category ]
  (call-api "/buyers/{buyerID}/categories/{categoryID}" :patch
            {:path-params   {"buyerID" buyer-id "categoryID" category-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    category
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id category-id category ]
  (:data (patch-with-http-info buyer-id category-id category)))

(defn save-assignment-with-http-info
  ""
  [buyer-id category-assignment ]
  (call-api "/buyers/{buyerID}/categories/assignments" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    category-assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-assignment
  ""
  [buyer-id category-assignment ]
  (:data (save-assignment-with-http-info buyer-id category-assignment)))

(defn save-product-assignment-with-http-info
  ""
  [buyer-id product-assignment ]
  (call-api "/buyers/{buyerID}/categories/productassignments" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product-assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-product-assignment
  ""
  [buyer-id product-assignment ]
  (:data (save-product-assignment-with-http-info buyer-id product-assignment)))

(defn update-with-http-info
  ""
  [buyer-id category-id category ]
  (call-api "/buyers/{buyerID}/categories/{categoryID}" :put
            {:path-params   {"buyerID" buyer-id "categoryID" category-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    category
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id category-id category ]
  (:data (update-with-http-info buyer-id category-id category)))

