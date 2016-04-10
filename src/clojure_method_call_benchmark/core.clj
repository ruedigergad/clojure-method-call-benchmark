(ns clojure-method-call-benchmark.core)

(defn condp-obj-0
  [data]
  (fn [arg]
    (condp = arg
      (+ data arg))))

(defn condp-obj-1
  [data]
  (fn [arg]
    (condp = arg
      :foo_0 0
      (+ data arg))))

(defn condp-obj-2
  [data]
  (fn [arg]
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
      (+ data arg))))

(defn condp-obj-3
  [data]
  (fn [arg]
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
      (+ data arg))))

(defn condp-obj-4
  [data]
  (fn [arg]
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
      (+ data arg))))

(defn condp-obj-5
  [data]
  (fn [arg]
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
      (+ data arg))))

(defn condp-if-obj-0
  [data]
  (fn [arg]
    (if (not (keyword? arg))
      (+ data arg)
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
        :foo_39 39))))

(defn map-obj-0
  [data]
  {:bar (fn [arg] (+ data arg))})

(defn map-obj-1
  [data]
  {:foo_0 0
   :bar (fn [arg] (+ data arg))})

(defn map-obj-2
  [data]
  {:foo_0 0
   :foo_1 1
   :foo_2 2
   :foo_3 3
   :foo_4 4
   :foo_5 5
   :foo_6 6
   :foo_7 7
   :foo_8 8
   :foo_9 9
   :bar (fn [arg] (+ data arg))})

(defn map-obj-3
  [data]
  {:foo_0 0
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
   :bar (fn [arg] (+ data arg))})

(defn map-obj-4
  [data]
  {:foo_0 0
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
   :bar (fn [arg] (+ data arg))})

(defn map-obj-5
  [data]
  {:foo_0 0
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
   :bar (fn [arg] (+ data arg))})

