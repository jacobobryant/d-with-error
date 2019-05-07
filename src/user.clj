(ns user
  (:require [datomic.client.api :as d]))

(defn foo []
  (let [client-cfg {:server-type :ion
                    :region "us-east-1"
                    :system "bud"
                    :endpoint "http://entry.bud.us-east-1.datomic.net:8182/"
                    :proxy-port 8182}
        client (d/client client-cfg)
        _ (d/create-database client {:db-name "dev"})
        conn (d/connect client {:db-name "dev"})]
    (d/with (d/db conn) {:tx-data []})))
