(ns benchmark-test.method-call-tests
  (:require [clojure.test :refer :all]
            [criterium [core :as cc]]))

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
  (let [res 1
        f (fn [arg]
            (condp = arg
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-1
  (println "\nRunning: condp-benchmark-1")
  (let [res 1
        f (fn [arg]
            (condp = arg
              :foo_0 0
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-2
  (println "\nRunning: condp-benchmark-2")
  (let [res 1
        f (fn [arg]
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
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-3
  (println "\nRunning: condp-benchmark-3")
  (let [res 1
        f (fn [arg]
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
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-4
  (println "\nRunning: condp-benchmark-4")
  (let [res 1
        f (fn [arg]
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
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest condp-benchmark-5
  (println "\nRunning: condp-benchmark-5")
  (let [res 1
        f (fn [arg]
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
              (+ res arg)))]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest if-condp-benchmark-0
  (println "\nRunning: if-condp-benchmark-0")
  (let [res 1
        f (fn [arg]
            (if (not (keyword? arg))
              (+ res arg)
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
        (f 2)
        :verbose))))

(deftest map-benchmark-0
  (println "\nRunning: map-benchmark-0")
  (let [res 1
        m {:bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-benchmark-1
  (println "\nRunning: map-benchmark-1")
  (let [res 1
        m {:foo_0 0
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-benchmark-2
  (println "\nRunning: map-benchmark-2")
  (let [res 1
        m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-benchmark-3
  (println "\nRunning: map-benchmark-3")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-benchmark-4
  (println "\nRunning: map-benchmark-4")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-benchmark-5
  (println "\nRunning: map-benchmark-5")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((m :bar) 2)
        :verbose))))

(deftest map-cached-benchmark-0
  (println "\nRunning: map-cached-benchmark-0")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}
        f (m :bar)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (f 2)
        :verbose))))

(deftest map-rev-benchmark-0
  (println "\nRunning: map-rev-benchmark-0")
  (let [res 1
        m {:bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(deftest map-rev-benchmark-1
  (println "\nRunning: map-rev-benchmark-1")
  (let [res 1
        m {:foo_0 0
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(deftest map-rev-benchmark-2
  (println "\nRunning: map-rev-benchmark-2")
  (let [res 1
        m {:foo_0 0
           :foo_1 1
           :foo_2 2
           :foo_3 3
           :foo_4 4
           :foo_5 5
           :foo_6 6
           :foo_7 7
           :foo_8 8
           :foo_9 9
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(deftest map-rev-benchmark-3
  (println "\nRunning: map-rev-benchmark-3")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(deftest map-rev-benchmark-4
  (println "\nRunning: map-rev-benchmark-4")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(deftest map-rev-benchmark-5
  (println "\nRunning: map-rev-benchmark-5")
  (let [res 1
        m {:foo_0 0
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
           :bar (fn [arg] (+ res arg))}]
    (cc/with-progress-reporting
      (cc/quick-bench
        ((:bar m) 2)
        :verbose))))

(defprotocol MyProt
  (foo [_])
  (bar [_ arg]))

(defrecord MyRec
  [res]
  MyProt
  (foo [_] 0)
  (bar [_ arg] (+ res arg)))

(deftest defrecord-benchmark-0
  (println "\nRunning: defrecord-benchmark-0")
  (let [r (MyRec. 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar r 2)
        :verbose))))

(deftype MyType
  [res]
  MyProt
  (foo [_] 0)
  (bar [_ arg] (+ res arg)))

(deftest deftype-benchmark-0
  (println "\nRunning: deftype-benchmark-0")
  (let [t (MyType. 1)]
    (cc/with-progress-reporting
      (cc/quick-bench
        (.bar t 2)
        :verbose))))

