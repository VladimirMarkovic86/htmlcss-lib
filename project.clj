(defproject org.clojars.vladimirmarkovic86/htmlcss-lib "0.1.9"
  :description "Simple HTML and CSS library"
  :url "http://github.com/VladimirMarkovic86/htmlcss-lib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojurescript "1.10.339"]
                 ]

  :min-lein-version "2.0.0"
  
  :source-paths ["src/cljs"]
  
  :jar-exclusions [#"^public/"]

  :plugins [[lein-cljsbuild  "1.1.7"]
            [lein-doo "0.1.11"]
            ]

  :cljsbuild
    {:builds
      {:test
        {:source-paths ["src/cljs" "test/cljs"]
         :compiler     {:main htmlcss-lib.test-runner
                        :optimizations :whitespace
                        :output-dir "resources/public/assets/js/out/test"
                        :output-to "resources/public/assets/js/test.js"}}
       }}
 )

