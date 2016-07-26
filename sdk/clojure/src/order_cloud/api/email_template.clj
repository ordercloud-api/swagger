(ns order-cloud.api.email-template
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-with-http-info
  ""
  [buyer-id email-template-type ]
  (call-api "/buyers/{buyerID}/emailtemplates/{emailTemplateType}" :get
            {:path-params   {"buyerID" buyer-id "emailTemplateType" email-template-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [buyer-id email-template-type ]
  (:data (get-with-http-info buyer-id email-template-type)))

(defn patch-with-http-info
  ""
  [buyer-id email-template-type email-template ]
  (call-api "/buyers/{buyerID}/emailtemplates/{emailTemplateType}" :patch
            {:path-params   {"buyerID" buyer-id "emailTemplateType" email-template-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    email-template
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn patch
  ""
  [buyer-id email-template-type email-template ]
  (:data (patch-with-http-info buyer-id email-template-type email-template)))

(defn reset-to-default-with-http-info
  ""
  [buyer-id email-template-type ]
  (call-api "/buyers/{buyerID}/emailtemplates/{emailTemplateType}" :delete
            {:path-params   {"buyerID" buyer-id "emailTemplateType" email-template-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn reset-to-default
  ""
  [buyer-id email-template-type ]
  (:data (reset-to-default-with-http-info buyer-id email-template-type)))

(defn update-with-http-info
  ""
  [buyer-id email-template-type email-template ]
  (call-api "/buyers/{buyerID}/emailtemplates/{emailTemplateType}" :put
            {:path-params   {"buyerID" buyer-id "emailTemplateType" email-template-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    email-template
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn update
  ""
  [buyer-id email-template-type email-template ]
  (:data (update-with-http-info buyer-id email-template-type email-template)))

