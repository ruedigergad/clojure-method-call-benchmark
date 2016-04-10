(ns clojure-method-call-benchmark.core-tests
  (:require [clojure.test :refer :all]
            [clojure-method-call-benchmark.core :refer :all]))

(deftest condp-object-0-test
  (let [o (condp-obj-0 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-1-test
  (let [o (condp-obj-1 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-2-test
  (let [o (condp-obj-2 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-3-test
  (let [o (condp-obj-3 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-4-test
  (let [o (condp-obj-4 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-5-test
  (let [o (condp-obj-5 100)]
    (is (= 101 (o 1)))))

(deftest condp-if-object-0-test
  (let [o (condp-if-obj-0 100)]
    (is (= 101 (o 1)))))

(deftest map-object-0-test
  (let [o (map-obj-0 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-1-test
  (let [o (map-obj-1 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-2-test
  (let [o (map-obj-2 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-3-test
  (let [o (map-obj-3 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-4-test
  (let [o (map-obj-4 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-5-test
  (let [o (map-obj-5 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest type-object-0-test
  (let [o (->MyType 100)]
    (is (= 101 (bar o 1)))))

(deftest type-object-1-test
  (let [o (->MyType 100)]
    (is (= 101 (o 1)))))

(deftest record-object-0-test
  (let [o (->MyRec 100)]
    (is (= 101 (bar o 1)))))

(deftest record-object-1-test
  (let [o (->MyRec 100)]
    (is (= 101 (o 1)))))

