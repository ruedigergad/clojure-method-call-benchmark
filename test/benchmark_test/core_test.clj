(ns benchmark-test.core-test
  (:require [clojure.test :refer :all]
            [criterium [core :as cc]]
            [benchmark-test.core :refer :all]))

(deftest benchmark-1
  (cc/with-progress-reporting (cc/quick-bench (Thread/sleep 10) :verbose)))

(deftest benchmark-2
  (cc/report-result (cc/quick-benchmark (Thread/sleep 10) {:verbose true})))

