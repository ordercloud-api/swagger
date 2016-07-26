(ns order-cloud.api.me
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-address-with-http-info
  ""
  [address ]
  (call-api "/me/addresses" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create-address
  ""
  [address ]
  (:data (create-address-with-http-info address)))

(defn create-credit-card-with-http-info
  ""
  [credit-card ]
  (call-api "/me/creditcards" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    credit-card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create-credit-card
  ""
  [credit-card ]
  (:data (create-credit-card-with-http-info credit-card)))

(defn delete-address-with-http-info
  ""
  [address-id ]
  (call-api "/me/addresses/{addressID}" :delete
            {:path-params   {"addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-address
  ""
  [address-id ]
  (:data (delete-address-with-http-info address-id)))

(defn delete-credit-card-with-http-info
  ""
  [creditcard-id ]
  (call-api "/me/creditcards/{creditcardID}" :delete
            {:path-params   {"creditcardID" creditcard-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete-credit-card
  ""
  [creditcard-id ]
  (:data (delete-credit-card-with-http-info creditcard-id)))

(defn get-with-http-info
  ""
  []
  (call-api "/me" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  []
  (:data (get-with-http-info)))

(defn get-address-with-http-info
  ""
  [address-id ]
  (call-api "/me/addresses/{addressID}" :get
            {:path-params   {"addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-address
  ""
  [address-id ]
  (:data (get-address-with-http-info address-id)))

(defn get-credit-card-with-http-info
  ""
  [creditcard-id ]
  (call-api "/me/creditcards/{creditcardID}" :get
            {:path-params   {"creditcardID" creditcard-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-credit-card
  ""
  [creditcard-id ]
  (:data (get-credit-card-with-http-info creditcard-id)))

(defn get-order-with-http-info
  ""
  [order-id ]
  (call-api "/me/orders/{orderID}" :get
            {:path-params   {"orderID" order-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-order
  ""
  [order-id ]
  (:data (get-order-with-http-info order-id)))

(defn get-product-with-http-info
  ""
  [product-id ]
  (call-api "/me/products/{productID}" :get
            {:path-params   {"productID" product-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-product
  ""
  [product-id ]
  (:data (get-product-with-http-info product-id)))

(defn get-promotion-with-http-info
  ""
  [promotion-id ]
  (call-api "/me/promotions/{promotionID}" :get
            {:path-params   {"promotionID" promotion-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-promotion
  ""
  [promotion-id ]
  (:data (get-promotion-with-http-info promotion-id)))

(defn get-spec-with-http-info
  ""
  [product-id spec-id ]
  (call-api "/me/products/{productID}/specs/{specID}" :get
            {:path-params   {"productID" product-id "specID" spec-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get-spec
  ""
  [product-id spec-id ]
  (:data (get-spec-with-http-info product-id spec-id)))

(defn list-addresses-with-http-info
  ""
  ([] (list-addresses-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/addresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-addresses
  ""
  ([] (list-addresses nil))
  ([optional-params]
   (:data (list-addresses-with-http-info optional-params))))

(defn list-categories-with-http-info
  ""
  ([] (list-categories-with-http-info nil))
  ([{:keys [depth search search-on sort-by page page-size ]}]
   (call-api "/me/categories" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"depth" depth "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-categories
  ""
  ([] (list-categories nil))
  ([optional-params]
   (:data (list-categories-with-http-info optional-params))))

(defn list-cost-centers-with-http-info
  ""
  ([] (list-cost-centers-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/costcenters" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-cost-centers
  ""
  ([] (list-cost-centers nil))
  ([optional-params]
   (:data (list-cost-centers-with-http-info optional-params))))

(defn list-credit-cards-with-http-info
  ""
  ([] (list-credit-cards-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/creditcards" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-credit-cards
  ""
  ([] (list-credit-cards nil))
  ([optional-params]
   (:data (list-credit-cards-with-http-info optional-params))))

(defn list-incoming-orders-with-http-info
  ""
  ([] (list-incoming-orders-with-http-info nil))
  ([{:keys [from to search search-on sort-by page page-size ]}]
   (call-api "/me/orders/incoming" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"from" from "to" to "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-incoming-orders
  ""
  ([] (list-incoming-orders nil))
  ([optional-params]
   (:data (list-incoming-orders-with-http-info optional-params))))

(defn list-outgoing-orders-with-http-info
  ""
  ([] (list-outgoing-orders-with-http-info nil))
  ([{:keys [from to search search-on sort-by page page-size ]}]
   (call-api "/me/orders/outgoing" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"from" from "to" to "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-outgoing-orders
  ""
  ([] (list-outgoing-orders nil))
  ([optional-params]
   (:data (list-outgoing-orders-with-http-info optional-params))))

(defn list-products-with-http-info
  ""
  ([] (list-products-with-http-info nil))
  ([{:keys [category-id search search-on sort-by page page-size ]}]
   (call-api "/me/products" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"categoryID" category-id "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-products
  ""
  ([] (list-products nil))
  ([optional-params]
   (:data (list-products-with-http-info optional-params))))

(defn list-promotions-with-http-info
  ""
  ([] (list-promotions-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/promotions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-promotions
  ""
  ([] (list-promotions nil))
  ([optional-params]
   (:data (list-promotions-with-http-info optional-params))))

(defn list-specs-with-http-info
  ""
  ([product-id ] (list-specs-with-http-info product-id nil))
  ([product-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/products/{productID}/specs" :get
             {:path-params   {"productID" product-id }
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-specs
  ""
  ([product-id ] (list-specs product-id nil))
  ([product-id optional-params]
   (:data (list-specs-with-http-info product-id optional-params))))

(defn list-subcategories-with-http-info
  ""
  ([parent-id ] (list-subcategories-with-http-info parent-id nil))
  ([parent-id {:keys [depth search search-on sort-by page page-size ]}]
   (call-api "/me/categories/{parentID}/categories" :get
             {:path-params   {"parentID" parent-id }
              :header-params {}
              :query-params  {"depth" depth "search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-subcategories
  ""
  ([parent-id ] (list-subcategories parent-id nil))
  ([parent-id optional-params]
   (:data (list-subcategories-with-http-info parent-id optional-params))))

(defn list-user-groups-with-http-info
  ""
  ([] (list-user-groups-with-http-info nil))
  ([{:keys [search search-on sort-by page page-size ]}]
   (call-api "/me/usergroups" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"search" search "searchOn" search-on "sortBy" sort-by "page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list-user-groups
  ""
  ([] (list-user-groups nil))
  ([optional-params]
   (:data (list-user-groups-with-http-info optional-params))))

(defn patch-with-http-info
  ""
  [user ]
  (call-api "/me" :patch
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [user ]
  (:data (patch-with-http-info user)))

(defn patch-address-with-http-info
  ""
  [address-id address ]
  (call-api "/me/addresses/{addressID}" :patch
            {:path-params   {"addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-address
  ""
  [address-id address ]
  (:data (patch-address-with-http-info address-id address)))

(defn patch-credit-card-with-http-info
  ""
  [creditcard-id credit-card ]
  (call-api "/me/creditcards/{creditcardID}" :patch
            {:path-params   {"creditcardID" creditcard-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    credit-card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch-credit-card
  ""
  [creditcard-id credit-card ]
  (:data (patch-credit-card-with-http-info creditcard-id credit-card)))

(defn update-with-http-info
  ""
  [user ]
  (call-api "/me" :put
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [user ]
  (:data (update-with-http-info user)))

(defn update-address-with-http-info
  ""
  [address-id address ]
  (call-api "/me/addresses/{addressID}" :put
            {:path-params   {"addressID" address-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    address
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-address
  ""
  [address-id address ]
  (:data (update-address-with-http-info address-id address)))

(defn update-credit-card-with-http-info
  ""
  [creditcard-id credit-card ]
  (call-api "/me/creditcards/{creditcardID}" :put
            {:path-params   {"creditcardID" creditcard-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    credit-card
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update-credit-card
  ""
  [creditcard-id credit-card ]
  (:data (update-credit-card-with-http-info creditcard-id credit-card)))

