(defproject cljs-google-datastore "1.0.0"
  :description "Interoperability @google-cloud/datastore to cljs"
  :url "https://github.com/avelino/cljs-google-datastore"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :npm-deps {"@google-cloud/datastore" "5.1.0"}
  :plugins [[lein-codox "0.10.3"]]
  :codox {:language :clojurescript}
  :source-paths ["src"])