(ns order-cloud.api.spec
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [spec ]
  (call-api "/specs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spec
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [spec ]
  (:data (create-with-http-info spec)))

(defn create-option-with-http-info
  ""
  [spec-id option ]
  (call-api "/specs/{specID}/options" :post
            {:path-params   {"specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    option
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create-option
  ""
  [spec-id option ]
  (:data (create-option-with-http-info spec-id option)))

(defn delete-with-http-info
  ""
  [spec-id ]
  (call-api "/specs/{specID}" :delete
            {:path-params   {"specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [spec-id ]
  (:data (delete-with-http-info spec-id)))

(defn delete-option-with-http-info
  ""
  [spec-id option-id ]
  (call-api "/specs/{specID}/options/{optionID}" :delete
            {:path-params   {"specID" spec-id "optionID" option-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-option
  ""
  [spec-id option-id ]
  (:data (delete-option-with-http-info spec-id option-id)))

(defn delete-product-assignment-with-http-info
  ""
  [spec-id product-id ]
  (call-api "/specs/{specID}/productassignments/{productID}" :delete
            {:path-params   {"specID" spec-id "productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-product-assignment
  ""
  [spec-id product-id ]
  (:data (delete-product-assignment-with-http-info spec-id product-id)))

(defn get-with-http-info
  ""
  [spec-id ]
  (call-api "/specs/{specID}" :get
            {:path-params   {"specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [spec-id ]
  (:data (get-with-http-info spec-id)))

(defn get-option-with-http-info
  ""
  [spec-id option-id ]
  (call-api "/specs/{specID}/options/{optionID}" :get
            {:path-params   {"specID" spec-id "optionID" option-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-option
  ""
  [spec-id option-id ]
  (:data (get-option-with-http-info spec-id option-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/specs" :get
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

(defn list-options-with-http-info
  ""
  ([spec-id ] (list-options-with-http-info spec-id nil))
  ([spec-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/specs/{specID}/options" :get
             {:path-params   {"specID" spec-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-options
  ""
  ([spec-id ] (list-options spec-id nil))
  ([spec-id optional-params]
   (:data (list-options-with-http-info spec-id optional-params))))

(defn list-product-assignments-with-http-info
  ""
  ([] (list-product-assignments-with-http-info nil))
  ([{:keys [spec-id product-id page page-size ]}]
   (call-api "/specs/productassignments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"specID" spec-id "productID" product-id "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-product-assignments
  ""
  ([] (list-product-assignments nil))
  ([optional-params]
   (:data (list-product-assignments-with-http-info optional-params))))

(defn patch-with-http-info
  ""
  [spec-id spec ]
  (call-api "/specs/{specID}" :patch
            {:path-params   {"specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spec
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [spec-id spec ]
  (:data (patch-with-http-info spec-id spec)))

(defn patch-option-with-http-info
  ""
  [spec-id option-id option ]
  (call-api "/specs/{specID}/options/{optionID}" :patch
            {:path-params   {"specID" spec-id "optionID" option-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    option
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-option
  ""
  [spec-id option-id option ]
  (:data (patch-option-with-http-info spec-id option-id option)))

(defn save-product-assignment-with-http-info
  ""
  [product-assignment ]
  (call-api "/specs/productassignments" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product-assignment
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn save-product-assignment
  ""
  [product-assignment ]
  (:data (save-product-assignment-with-http-info product-assignment)))

(defn update-with-http-info
  ""
  [spec-id spec ]
  (call-api "/specs/{specID}" :put
            {:path-params   {"specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    spec
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [spec-id spec ]
  (:data (update-with-http-info spec-id spec)))

(defn update-option-with-http-info
  ""
  [spec-id option-id option ]
  (call-api "/specs/{specID}/options/{optionID}" :put
            {:path-params   {"specID" spec-id "optionID" option-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    option
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-option
  ""
  [spec-id option-id option ]
  (:data (update-option-with-http-info spec-id option-id option)))

