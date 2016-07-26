(ns order-cloud.api.password-reset
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn reset-password-with-http-info
  ""
  [verification-code password-reset ]
  (call-api "/password/reset/{verificationCode}" :put
            {:path-params   {"verificationCode" verification-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    password-reset
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn reset-password
  ""
  [verification-code password-reset ]
  (:data (reset-password-with-http-info verification-code password-reset)))

(defn send-verification-code-with-http-info
  ""
  [password-reset-request ]
  (call-api "/password/reset" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    password-reset-request
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn send-verification-code
  ""
  [password-reset-request ]
  (:data (send-verification-code-with-http-info password-reset-request)))

