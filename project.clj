(defproject flare "0.2.9"
  :description "Enlightened failure reports for clojure.test and Midje"
  :url "http://github.com/andersfurseth/flare"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojars.brenton/google-diff-match-patch "0.1"]]
  :profiles {:provided {:dependencies [[midje "1.6.3"]
                                       [expectations "2.1.1"]]}
             :dev {:dependencies [[org.clojure/test.check "0.6.1"]]
                   :injections [(require 'flare.clojure-test)
                                (flare.clojure-test/install!)]}}
  :plugins [[lein-cloverage "1.0.2"]]
  :lein-release {:deploy-via :clojars})
