(ns maps.core
  (:gen-class))

;; Given an array of integers, return a new array with each value doubled.

(defn maps [xs]
  (vec (map #(* 2 %) xs)))

(defn maps2 [xs]
  (mapv #(* 2 %) xs))
