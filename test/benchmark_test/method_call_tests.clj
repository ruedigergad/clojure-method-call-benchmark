(ns benchmark-test.method-call-tests
  (:require [clojure.test :refer :all]
            [criterium [core :as cc]]))

(deftest fn-baseline-0
  (println "\nRunning: fn-baseline-0")
  (let [f (fn [arg]
            (str arg))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest condp-benchmark-0
  (println "\nRunning: condp-benchmark-0")
  (let [f (fn [arg]
            (condp = arg
              :foo_0 0
              (str arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest condp-benchmark-1
  (println "\nRunning: condp-benchmark-1")
  (let [f (fn [arg]
            (condp = arg
              :foo_0 0
              :foo_1 1
              :foo_2 2
              :foo_3 3
              :foo_4 4
              :foo_5 5
              :foo_6 6
              :foo_7 7
              :foo_8 8
              :foo_9 9
              (str arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest condp-benchmark-2
  (println "\nRunning: condp-benchmark-2")
  (let [f (fn [arg]
            (condp = arg
              :foo_0 0
              :foo_1 1
              :foo_2 2
              :foo_3 3
              :foo_4 4
              :foo_5 5
              :foo_6 6
              :foo_7 7
              :foo_8 8
              :foo_9 9
              :foo_10 10
              :foo_11 11
              :foo_12 12
              :foo_13 13
              :foo_14 14
              :foo_15 15
              :foo_16 16
              :foo_17 17
              :foo_18 18
              :foo_19 19
              (str arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest condp-benchmark-3
  (println "\nRunning: condp-benchmark-3")
  (let [f (fn [arg]
            (condp = arg
              :foo_0 0
              :foo_1 1
              :foo_2 2
              :foo_3 3
              :foo_4 4
              :foo_5 5
              :foo_6 6
              :foo_7 7
              :foo_8 8
              :foo_9 9
              :foo_10 10
              :foo_11 11
              :foo_12 12
              :foo_13 13
              :foo_14 14
              :foo_15 15
              :foo_16 16
              :foo_17 17
              :foo_18 18
              :foo_19 19
              :foo_20 20
              :foo_21 21
              :foo_22 22
              :foo_23 23
              :foo_24 24
              :foo_25 25
              :foo_26 26
              :foo_27 27
              :foo_28 28
              :foo_29 29
              (str arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest condp-benchmark-4
  (println "\nRunning: condp-benchmark-4")
  (let [f (fn [arg]
            (condp = arg
              :foo_0 0
              :foo_1 1
              :foo_2 2
              :foo_3 3
              :foo_4 4
              :foo_5 5
              :foo_6 6
              :foo_7 7
              :foo_8 8
              :foo_9 9
              :foo_10 10
              :foo_11 11
              :foo_12 12
              :foo_13 13
              :foo_14 14
              :foo_15 15
              :foo_16 16
              :foo_17 17
              :foo_18 18
              :foo_19 19
              :foo_20 20
              :foo_21 21
              :foo_22 22
              :foo_23 23
              :foo_24 24
              :foo_25 25
              :foo_26 26
              :foo_27 27
              :foo_28 28
              :foo_29 29
              :foo_30 30
              :foo_31 31
              :foo_32 32
              :foo_33 33
              :foo_34 34
              :foo_35 35
              :foo_36 36
              :foo_37 37
              :foo_38 38
              :foo_39 39
              (str arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest if-condp-benchmark-0
  (println "\nRunning: if-condp-benchmark-0")
  (let [f (fn [arg]
            (if (not (keyword? arg))
              (str arg)
              (condp = arg
                :foo_0 0
                :foo_1 1
                :foo_2 2
                :foo_3 3
                :foo_4 4
                :foo_5 5
                :foo_6 6
                :foo_7 7
                :foo_8 8
                :foo_9 9
                :foo_10 10
                :foo_11 11
                :foo_12 12
                :foo_13 13
                :foo_14 14
                :foo_15 15
                :foo_16 16
                :foo_17 17
                :foo_18 18
                :foo_19 19
                :foo_20 20
                :foo_21 21
                :foo_22 22
                :foo_23 23
                :foo_24 24
                :foo_25 25
                :foo_26 26
                :foo_27 27
                :foo_28 28
                :foo_29 29
                :foo_30 30
                :foo_31 31
                :foo_32 32
                :foo_33 33
                :foo_34 34
                :foo_35 35
                :foo_36 36
                :foo_37 37
                :foo_38 38
                :foo_39 39)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest map-benchmark-0
  (println "\nRunning: map-benchmark-0")
  (let [m {:foo_0 0
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) "bar")
        :verbose))))

(deftest map-benchmark-1
  (println "\nRunning: map-benchmark-1")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) "bar")
        :verbose))))

(deftest map-benchmark-2
  (println "\nRunning: map-benchmark-2")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) "bar")
        :verbose))))

(deftest map-benchmark-3
  (println "\nRunning: map-benchmark-3")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :foo_20 20
           :foo_21 21
           :foo_22 22
           :foo_23 23
           :foo_24 24
           :foo_25 25
           :foo_26 26
           :foo_27 27
           :foo_28 28
           :foo_29 29
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) "bar")
        :verbose))))

(deftest map-benchmark-4
  (println "\nRunning: map-benchmark-4")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :foo_20 20
           :foo_21 21
           :foo_22 22
           :foo_23 23
           :foo_24 24
           :foo_25 25
           :foo_26 26
           :foo_27 27
           :foo_28 28
           :foo_29 29
           :foo_30 30
           :foo_31 31
           :foo_32 32
           :foo_33 33
           :foo_34 34
           :foo_35 35
           :foo_36 36
           :foo_37 37
           :foo_38 38
           :foo_39 39
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) "bar")
        :verbose))))

(deftest map-cached-benchmark-0
  (println "\nRunning: map-cached-benchmark-0")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :foo_20 20
           :foo_21 21
           :foo_22 22
           :foo_23 23
           :foo_24 24
           :foo_25 25
           :foo_26 26
           :foo_27 27
           :foo_28 28
           :foo_29 29
           :foo_30 30
           :foo_31 31
           :foo_32 32
           :foo_33 33
           :foo_34 34
           :foo_35 35
           :foo_36 36
           :foo_37 37
           :foo_38 38
           :foo_39 39
           :bar (fn [arg] (str arg))}
        f (m :bar)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f "bar")
        :verbose))))

(deftest map-rev-benchmark-0
  (println "\nRunning: map-rev-benchmark-0")
  (let [m {:foo_0 0
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) "bar")
        :verbose))))

(deftest map-rev-benchmark-1
  (println "\nRunning: map-rev-benchmark-1")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) "bar")
        :verbose))))

(deftest map-rev-benchmark-2
  (println "\nRunning: map-rev-benchmark-2")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) "bar")
        :verbose))))

(deftest map-rev-benchmark-3
  (println "\nRunning: map-rev-benchmark-3")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :foo_20 20
           :foo_21 21
           :foo_22 22
           :foo_23 23
           :foo_24 24
           :foo_25 25
           :foo_26 26
           :foo_27 27
           :foo_28 28
           :foo_29 29
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) "bar")
        :verbose))))

(deftest map-rev-benchmark-4
  (println "\nRunning: map-rev-benchmark-4")
  (let [m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :foo_10 10
           :foo_11 11
           :foo_12 12
           :foo_13 13
           :foo_14 14
           :foo_15 15
           :foo_16 16
           :foo_17 17
           :foo_18 18
           :foo_19 19
           :foo_20 20
           :foo_21 21
           :foo_22 22
           :foo_23 23
           :foo_24 24
           :foo_25 25
           :foo_26 26
           :foo_27 27
           :foo_28 28
           :foo_29 29
           :foo_30 30
           :foo_31 31
           :foo_32 32
           :foo_33 33
           :foo_34 34
           :foo_35 35
           :foo_36 36
           :foo_37 37
           :foo_38 38
           :foo_39 39
           :bar (fn [arg] (str arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) "bar")
        :verbose))))

(defprotocol MyProt
  (foo [_])
  (bar [_ arg]))

(defrecord MyRec
  []
  MyProt
  (foo [_] 0)
  (bar [_ arg] (str arg)))

(deftest defrecord-benchmark-0
  (println "\nRunning: defrecord-benchmark-0")
  (let [r (MyRec.)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar r "bar")
        :verbose))))

(deftype MyType
  []
  MyProt
  (foo [_] 0)
  (bar [_ arg] (str arg)))

(deftest deftype-benchmark-0
  (println "\nRunning: deftype-benchmark-0")
  (let [t (MyType.)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar t "bar")
        :verbose))))

;(deftest benchmark-1
;  (cc/report-result
;    (cc/quick-benchmark
;      (Thread/sleep 10)
;      {:verbose true})))

