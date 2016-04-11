(ns clojure-method-call-benchmark.benchmarks
  (:require
    [clojure-method-call-benchmark.core :refer :all]
    [clojure.test :refer :all]
    [criterium [core :as cc]]))

(deftest baseline-0-add
  (println "\nBenchmarking: baseline-0-add")
  (cc/with-progress-reporting
    (cc/quick-bench
      (+ 1 2)
      :verbose)))

(deftest baseline-1-fn-const
  (println "\nBenchmarking: baseline-1-fn-const")
  (let [f (fn []
            2)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f)
        :verbose))))

(deftest baseline-2-fn-arg
  (println "\nBenchmarking: baseline-2-fn-arg")
  (let [f (fn [arg]
            arg)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-3-fn-add-arg
  (println "\nBenchmarking: baseline-3-fn-add-arg")
  (let [f (fn [arg]
            (+ 1 arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest baseline-4-fn-add-closure
  (println "\nBenchmarking: baseline-4-fn-add-closure")
  (let [data 1
        f (fn [arg]
            (+ data arg))]
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

(deftest condp-10
  (println "\nBenchmarking: condp-10")
  (let [o (condp-obj-10 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-20
  (println "\nBenchmarking: condp-20")
  (let [o (condp-obj-20 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-30
(println "\nBenchmarking: condp-30")
(let [o (condp-obj-30 1)]
  (cc/with-progress-reporting
    (cc/quick-bench
      (o 2)
      :verbose))))

(deftest condp-40
  (println "\nBenchmarking: condp-40")
  (let [o (condp-obj-40 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (o 2)
        :verbose))))

(deftest condp-if-40
  (println "\nBenchmarking: condp-if-40")
  (let [o (condp-if-obj-40 1)]
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

(deftest map-10
  (println "\nBenchmarking: map-10")
  (let [o (map-obj-10 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-20
  (println "\nBenchmarking: map-20")
  (let [o (map-obj-20 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-30
  (println "\nBenchmarking: map-30")
  (let [o (map-obj-30 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-40
  (println "\nBenchmarking: map-40")
  (let [o (map-obj-40 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((o :bar) 2)
        :verbose))))

(deftest map-cached-40
  (println "\nBenchmarking: map-cached-40")
  (let [o (map-obj-40 1)
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

(deftest map-rev-10
  (println "\nBenchmarking: map-rev-10")
  (let [o (map-obj-10 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-20
  (println "\nBenchmarking: map-rev-20")
  (let [o (map-obj-20 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-30
  (println "\nBenchmarking: map-rev-30")
  (let [o (map-obj-30 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest map-rev-40
  (println "\nBenchmarking: map-rev-40")
  (let [o (map-obj-40 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar o) 2)
        :verbose))))

(deftest record-fn
  (println "\nBenchmarking: record-0-fn")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar r 2)
        :verbose))))

(deftest record-method
  (println "\nBenchmarking: record-1-method")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar r 2)
        :verbose))))

(deftest record-self-fn
  (println "\nBenchmarking: record-2-self-fn")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (r 2)
        :verbose))))

(deftest record-self-method
  (println "\nBenchmarking: record-3-self-method")
  (let [r (->MyRec2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (r 2)
        :verbose))))

(deftest record-ext-fn
  (println "\nBenchmarking: record-4-ext-fn")
  (let [r (->MyRec 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (foobar r 2)
        :verbose))))

(deftest type-fn
  (println "\nBenchmarking: type-0-fn")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (bar t 2)
        :verbose))))

(deftest type-method
  (println "\nBenchmarking: type-1-method")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar t 2)
        :verbose))))

(deftest type-self-fn
  (println "\nBenchmarking: type-2-self-fn")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (t 2)
        :verbose))))

(deftest type-self-method
  (println "\nBenchmarking: type-3-self-method")
  (let [t (->MyType2 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (t 2)
        :verbose))))

(deftest type-ext-fn
  (println "\nBenchmarking: type-4-ext-fn")
  (let [t (->MyType 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (foobar t 2)
        :verbose))))

