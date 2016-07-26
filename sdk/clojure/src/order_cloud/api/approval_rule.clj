(ns order-cloud.api.approval-rule
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-with-http-info
  ""
  [buyer-id approval-rule ]
  (call-api "/buyers/{buyerID}/approvalrules" :post
            {:path-params   {"buyerID" buyer-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    approval-rule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn create
  ""
  [buyer-id approval-rule ]
  (:data (create-with-http-info buyer-id approval-rule)))

(defn delete-with-http-info
  ""
  [buyer-id approval-rule-id ]
  (call-api "/buyers/{buyerID}/approvalrules/{approvalRuleID}" :delete
            {:path-params   {"buyerID" buyer-id "approvalRuleID" approval-rule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn delete
  ""
  [buyer-id approval-rule-id ]
  (:data (delete-with-http-info buyer-id approval-rule-id)))

(defn get-with-http-info
  ""
  [buyer-id approval-rule-id ]
  (call-api "/buyers/{buyerID}/approvalrules/{approvalRuleID}" :get
            {:path-params   {"buyerID" buyer-id "approvalRuleID" approval-rule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id approval-rule-id ]
  (:data (get-with-http-info buyer-id approval-rule-id)))

(defn list-with-http-info
  ""
  ([buyer-id ] (list-with-http-info buyer-id nil))
  ([buyer-id {:keys [search search-on sort-by page page-size ]}]
   (call-api "/buyers/{buyerID}/approvalrules" :get
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

(defn patch-with-http-info
  ""
  [buyer-id approval-rule-id partial-approval-rule ]
  (call-api "/buyers/{buyerID}/approvalrules/{approvalRuleID}" :patch
            {:path-params   {"buyerID" buyer-id "approvalRuleID" approval-rule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    partial-approval-rule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id approval-rule-id partial-approval-rule ]
  (:data (patch-with-http-info buyer-id approval-rule-id partial-approval-rule)))

(defn update-with-http-info
  ""
  [buyer-id approval-rule-id approval-rule ]
  (call-api "/buyers/{buyerID}/approvalrules/{approvalRuleID}" :put
            {:path-params   {"buyerID" buyer-id "approvalRuleID" approval-rule-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    approval-rule
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id approval-rule-id approval-rule ]
  (:data (update-with-http-info buyer-id approval-rule-id approval-rule)))

