(ns order-cloud.api.product
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [product ]
  (call-api "/products" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [product ]
  (:data (create-with-http-info product)))

(defn delete-with-http-info
  ""
  [product-id ]
  (call-api "/products/{productID}" :delete
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [product-id ]
  (:data (delete-with-http-info product-id)))

(defn delete-assignment-with-http-info
  ""
  ([buyer-id product-id ] (delete-assignment-with-http-info buyer-id product-id nil))
  ([buyer-id product-id {:keys [user-id user-group-id ]}]
   (call-api "/products/{productID}/assignments/{buyerID}" :delete
             {:path-params   {"buyerID" buyer-id "productID" product-id }
              :header-params {}
              :query-params  {"userID" user-id "userGroupID" user-group-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn delete-assignment
  ""
  ([buyer-id product-id ] (delete-assignment buyer-id product-id nil))
  ([buyer-id product-id optional-params]
   (:data (delete-assignment-with-http-info buyer-id product-id optional-params))))

(defn generate-variants-with-http-info
  ""
  ([product-id ] (generate-variants-with-http-info product-id nil))
  ([product-id {:keys [overwrite-existing ]}]
   (call-api "/products/{productID}/variants/generate" :post
             {:path-params   {"productID" product-id }
              :header-params {}
              :query-params  {"overwriteExisting" overwrite-existing }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn generate-variants
  ""
  ([product-id ] (generate-variants product-id nil))
  ([product-id optional-params]
   (:data (generate-variants-with-http-info product-id optional-params))))

(defn get-with-http-info
  ""
  [product-id ]
  (call-api "/products/{productID}" :get
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [product-id ]
  (:data (get-with-http-info product-id)))

(defn get-inventory-with-http-info
  ""
  [product-id ]
  (call-api "/products/{productID}/inventory" :get
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-inventory
  ""
  [product-id ]
  (:data (get-inventory-with-http-info product-id)))

(defn get-variant-with-http-info
  ""
  [product-id variant-id ]
  (call-api "/products/{productID}/variants/{variantID}" :get
            {:path-params   {"productID" product-id "variantID" variant-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-variant
  ""
  [product-id variant-id ]
  (:data (get-variant-with-http-info product-id variant-id)))

(defn get-variant-inventory-with-http-info
  ""
  [product-id variant-id ]
  (call-api "/products/{productID}/variants/inventory/{variantID}" :get
            {:path-params   {"productID" product-id "variantID" variant-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-variant-inventory
  ""
  [product-id variant-id ]
  (:data (get-variant-inventory-with-http-info product-id variant-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/products" :get
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
  ([] (list-assignments-with-http-info nil))
  ([{:keys [product-id buyer-id user-id user-group-id level price-schedule-id page page-size ]}]
   (call-api "/products/assignments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"productID" product-id "buyerID" buyer-id "userID" user-id "userGroupID" user-group-id "level" level "priceScheduleID" price-schedule-id "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-assignments
  ""
  ([] (list-assignments nil))
  ([optional-params]
   (:data (list-assignments-with-http-info optional-params))))

(defn list-inventory-with-http-info
  ""
  ([] (list-inventory-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/products/inventory" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-inventory
  ""
  ([] (list-inventory nil))
  ([optional-params]
   (:data (list-inventory-with-http-info optional-params))))

(defn list-variant-inventory-with-http-info
  ""
  ([product-id ] (list-variant-inventory-with-http-info product-id nil))
  ([product-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/products/{productID}/variants/inventory" :get
             {:path-params   {"productID" product-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-variant-inventory
  ""
  ([product-id ] (list-variant-inventory product-id nil))
  ([product-id optional-params]
   (:data (list-variant-inventory-with-http-info product-id optional-params))))

(defn list-variants-with-http-info
  ""
  ([product-id ] (list-variants-with-http-info product-id nil))
  ([product-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/products/{productID}/variants" :get
             {:path-params   {"productID" product-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-variants
  ""
  ([product-id ] (list-variants product-id nil))
  ([product-id optional-params]
   (:data (list-variants-with-http-info product-id optional-params))))

(defn patch-with-http-info
  ""
  [product-id product ]
  (call-api "/products/{productID}" :patch
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [product-id product ]
  (:data (patch-with-http-info product-id product)))

(defn patch-variant-with-http-info
  ""
  [product-id variant-id variant ]
  (call-api "/products/{productID}/variants/{variantID}" :patch
            {:path-params   {"productID" product-id "variantID" variant-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    variant
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-variant
  ""
  [product-id variant-id variant ]
  (:data (patch-variant-with-http-info product-id variant-id variant)))

(defn save-assignment-with-http-info
  ""
  [product-assignment ]
  (call-api "/products/assignments" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product-assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-assignment
  ""
  [product-assignment ]
  (:data (save-assignment-with-http-info product-assignment)))

(defn update-with-http-info
  ""
  [product-id product ]
  (call-api "/products/{productID}" :put
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [product-id product ]
  (:data (update-with-http-info product-id product)))

(defn update-inventory-with-http-info
  ""
  [product-id inventory ]
  (call-api "/products/{productID}/inventory/{inventory}" :put
            {:path-params   {"productID" product-id "inventory" inventory }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-inventory
  ""
  [product-id inventory ]
  (:data (update-inventory-with-http-info product-id inventory)))

(defn update-variant-with-http-info
  ""
  [product-id variant-id variant ]
  (call-api "/products/{productID}/variants/{variantID}" :put
            {:path-params   {"productID" product-id "variantID" variant-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    variant
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-variant
  ""
  [product-id variant-id variant ]
  (:data (update-variant-with-http-info product-id variant-id variant)))

(defn update-variant-inventory-with-http-info
  ""
  [product-id variant-id inventory ]
  (call-api "/products/{productID}/variants/inventory/{variantID}/{inventory}" :put
            {:path-params   {"productID" product-id "variantID" variant-id "inventory" inventory }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-variant-inventory
  ""
  [product-id variant-id inventory ]
  (:data (update-variant-inventory-with-http-info product-id variant-id inventory)))

