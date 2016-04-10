(ns benchmark-test.method-call-tests
  (:require
    [clojure-method-call-benchmark.core :refer :all]
    [clojure.test :refer :all]
    [criterium [core :as cc]])
  (:import
    (clojure.lang IFn)))

(deftest baseline-0
  (println "\nRunning: baseline-0")
  (cc/with-progress-reporting
    (cc/quick-bench
      (+ 1 2)
      :verbose)))

(deftest baseline-1
  (println "\nRunning: baseline-1")
  (let [f (fn []
            2)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f)
        :verbose))))

(deftest baseline-2
  (println "\nRunning: baseline-2")
  (let [f (fn [arg]
            arg)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-3
  (println "\nRunning: baseline-3")
  (let [f (fn [arg]
            (+ 1 arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-4
  (println "\nRunning: baseline-4")
  (let [res 1
        f (fn [arg]
            (+ res arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-0
  (println "\nRunning: condp-benchmark-0")
  (let [o (condp-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-benchmark-1
  (println "\nRunning: condp-benchmark-1")
  (let [o (condp-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-benchmark-2
  (println "\nRunning: condp-benchmark-2")
  (let [o (condp-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-benchmark-3
  (println "\nRunning: condp-benchmark-3")
  (let [o (condp-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-benchmark-4
(println "\nRunning: condp-benchmark-4")
(let [o (condp-obj-4 1)]
  (cc/with-progress-reporting
    (cc/quick-bench
      (o 2)
      :verbose))))

(deftest condp-benchmark-5
  (println "\nRunning: condp-benchmark-5")
  (let [o (condp-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-if-benchmark-0
  (println "\nRunning: condp-if-benchmark-0")
  (let [o (condp-if-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest map-benchmark-0
  (println "\nRunning: map-benchmark-0")
  (let [o (map-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-benchmark-1
  (println "\nRunning: map-benchmark-1")
  (let [o (map-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-benchmark-2
  (println "\nRunning: map-benchmark-2")
  (let [o (map-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-benchmark-3
  (println "\nRunning: map-benchmark-3")
  (let [o (map-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-benchmark-4
  (println "\nRunning: map-benchmark-4")
  (let [o (map-obj-4 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-benchmark-5
  (println "\nRunning: map-benchmark-5")
  (let [o (map-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-cached-benchmark-0
  (println "\nRunning: map-cached-benchmark-0")
  (let [o (map-obj-5 1)
        f (o :bar)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest map-rev-benchmark-0
  (println "\nRunning: map-rev-benchmark-0")
  (let [o (map-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-benchmark-1
  (println "\nRunning: map-rev-benchmark-1")
  (let [o (map-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-benchmark-2
  (println "\nRunning: map-rev-benchmark-2")
  (let [o (map-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-benchmark-3
  (println "\nRunning: map-rev-benchmark-3")
  (let [o (map-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-benchmark-4
  (println "\nRunning: map-rev-benchmark-4")
  (let [o (map-obj-4 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-benchmark-5
  (println "\nRunning: map-rev-benchmark-5")
  (let [o (map-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest defrecord-benchmark-0
  (println "\nRunning: defrecord-benchmark-0")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar r 2)
        :verbose))))

(deftest defrecord-benchmark-1
  (println "\nRunning: defrecord-benchmark-1")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (r 2)
        :verbose))))

(deftest deftype-benchmark-0
  (println "\nRunning: deftype-benchmark-0")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar t 2)
        :verbose))))

(deftest deftype-benchmark-1
  (println "\nRunning: deftype-benchmark-1")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (t 2)
        :verbose))))

