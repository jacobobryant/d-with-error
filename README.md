```
$ java -version
openjdk version "1.8.0_212"
OpenJDK Runtime Environment (build 1.8.0_212-b01)
OpenJDK 64-Bit Server VM (build 25.212-b01, mixed mode)

$ clj
Clojure 1.9.0
user=> (foo)
ExceptionInfo Datomic Client Exception  clojure.core/ex-info (core.clj:4739)
user=> (clojure.pprint/pprint (ex-data *e))
{:cognitect.anomalies/category :cognitect.anomalies/incorrect,
 :http-result
 {:status 400,
  :headers
  {"content-length" "220",
   "server" "Jetty(9.3.7.v20160115)",
   "date" "Tue, 07 May 2019 01:40:12 GMT",
   "content-type" "application/transit+msgpack"},
  :body nil}}
```
