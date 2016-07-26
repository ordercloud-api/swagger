(ns order-cloud.api.file
  (:require [order-cloud.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-with-http-info
  ""
  [file-id ]
  (call-api "/files/{fileID}" :get
            {:path-params   {"fileID" file-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["auth"]}))

(defn get
  ""
  [file-id ]
  (:data (get-with-http-info file-id)))

(defn list-with-http-info
  ""
  ([] (list-with-http-info nil))
  ([{:keys [page page-size ]}]
   (call-api "/files" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "pageSize" page-size }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn list
  ""
  ([] (list nil))
  ([optional-params]
   (:data (list-with-http-info optional-params))))

(defn post-file-data-with-http-info
  ""
  ([] (post-file-data-with-http-info nil))
  ([{:keys [filename ]}]
   (call-api "/files" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"filename" filename }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["auth"]})))

(defn post-file-data
  ""
  ([] (post-file-data nil))
  ([optional-params]
   (:data (post-file-data-with-http-info optional-params))))

