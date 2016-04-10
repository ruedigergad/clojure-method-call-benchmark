(ns clojure-method-call-benchmark.benchmarks
  (:require
    [clojure-method-call-benchmark.core :refer :all]
    [clojure.test :refer :all]
    [criterium [core :as cc]]))

(deftest baseline-0
  (println "\nBenchmarking: baseline-0")
  (cc/with-progress-reporting
    (cc/quick-bench
      (+ 1 2)
      :verbose)))

(deftest baseline-1
  (println "\nBenchmarking: baseline-1")
  (let [f (fn []
            2)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f)
        :verbose))))

(deftest baseline-2
  (println "\nBenchmarking: baseline-2")
  (let [f (fn [arg]
            arg)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-3
  (println "\nBenchmarking: baseline-3")
  (let [f (fn [arg]
            (+ 1 arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-4
  (println "\nBenchmarking: baseline-4")
  (let [res 1
        f (fn [arg]
            (+ res arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-0
  (println "\nBenchmarking: condp-0")
  (let [o (condp-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-1
  (println "\nBenchmarking: condp-1")
  (let [o (condp-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-2
  (println "\nBenchmarking: condp-2")
  (let [o (condp-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-3
  (println "\nBenchmarking: condp-3")
  (let [o (condp-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-4
(println "\nBenchmarking: condp-4")
(let [o (condp-obj-4 1)]
  (cc/with-progress-reporting
    (cc/quick-bench
      (o 2)
      :verbose))))

(deftest condp-5
  (println "\nBenchmarking: condp-5")
  (let [o (condp-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-if-0
  (println "\nBenchmarking: condp-if-0")
  (let [o (condp-if-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest map-0
  (println "\nBenchmarking: map-0")
  (let [o (map-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-1
  (println "\nBenchmarking: map-1")
  (let [o (map-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-2
  (println "\nBenchmarking: map-2")
  (let [o (map-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-3
  (println "\nBenchmarking: map-3")
  (let [o (map-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-4
  (println "\nBenchmarking: map-4")
  (let [o (map-obj-4 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-5
  (println "\nBenchmarking: map-5")
  (let [o (map-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-cached-0
  (println "\nBenchmarking: map-cached-0")
  (let [o (map-obj-5 1)
        f (o :bar)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest map-rev-0
  (println "\nBenchmarking: map-rev-0")
  (let [o (map-obj-0 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-1
  (println "\nBenchmarking: map-rev-1")
  (let [o (map-obj-1 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-2
  (println "\nBenchmarking: map-rev-2")
  (let [o (map-obj-2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-3
  (println "\nBenchmarking: map-rev-3")
  (let [o (map-obj-3 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-4
  (println "\nBenchmarking: map-rev-4")
  (let [o (map-obj-4 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-5
  (println "\nBenchmarking: map-rev-5")
  (let [o (map-obj-5 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))
;
(deftest defrecord-0
  (println "\nBenchmarking: defrecord-0")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar r 2)
        :verbose))))

(deftest defrecord-1
  (println "\nBenchmarking: defrecord-1")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (r 2)
        :verbose))))

(deftest defrecord-2
  (println "\nBenchmarking: defrecord-2")
  (let [r (->MyRec2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (r 2)
        :verbose))))

(deftest deftype-0
  (println "\nBenchmarking: deftype-0")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar t 2)
        :verbose))))

(deftest deftype-1
  (println "\nBenchmarking: deftype-1")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (t 2)
        :verbose))))

(deftest deftype-2
  (println "\nBenchmarking: deftype-2")
  (let [t (->MyType2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (t 2)
        :verbose))))

