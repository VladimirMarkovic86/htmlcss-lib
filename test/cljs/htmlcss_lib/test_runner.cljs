(ns htmlcss-lib.test-runner
  (:require [htmlcss-lib.core-test-cljs]
            [doo.runner :refer-macros [doo-tests doo-all-tests]]))

(enable-console-print!)

(doo-tests
  'htmlcss-lib.core-test-cljs)

