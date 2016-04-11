(ns clojure-method-call-benchmark.core-tests
  (:require [clojure.test :refer :all]
            [clojure-method-call-benchmark.core :refer :all]))

(deftest condp-object-0-test
  (let [o (condp-obj-0 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-1-test
  (let [o (condp-obj-1 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-10-test
  (let [o (condp-obj-10 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-20-test
  (let [o (condp-obj-20 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-30-test
  (let [o (condp-obj-30 100)]
    (is (= 101 (o 1)))))

(deftest condp-object-40-test
  (let [o (condp-obj-40 100)]
    (is (= 101 (o 1)))))

(deftest condp-if-object-40-test
  (let [o (condp-if-obj-40 100)]
    (is (= 101 (o 1)))))

(deftest map-object-0-test
  (let [o (map-obj-0 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-1-test
  (let [o (map-obj-1 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-10-test
  (let [o (map-obj-10 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-20-test
  (let [o (map-obj-20 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-30-test
  (let [o (map-obj-30 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest map-object-40-test
  (let [o (map-obj-40 100)]
    (is (= 101 ((o :bar) 1)))))

(deftest type-object-0-test
  (let [o (->MyType 100)]
    (is (= 101 (bar o 1)))))

(deftest type-object-1-test
  (let [o (->MyType 100)]
    (is (= 101 (.bar o 1)))))

(deftest type-object-2-test
  (let [o (->MyType 100)]
    (is (= 101 (o 1)))))

(deftest type-object-3-test
  (let [o (->MyType2 100)]
    (is (= 101 (o 1)))))

(deftest type-object-ext-0-test
  (let [o (->MyType 100)]
    (is (= 101 (foobar o 1)))))

(deftest record-object-0-test
  (let [o (->MyRec 100)]
    (is (= 101 (bar o 1)))))

(deftest record-object-1-test
  (let [o (->MyRec 100)]
    (is (= 101 (.bar o 1)))))

(deftest record-object-2-test
  (let [o (->MyRec 100)]
    (is (= 101 (o 1)))))

(deftest record-object-3-test
  (let [o (->MyRec2 100)]
    (is (= 101 (o 1)))))

(deftest record-object-ext-0-test
  (let [o (->MyRec 100)]
    (is (= 101 (foobar o 1)))))

