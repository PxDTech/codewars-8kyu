(ns summation.core
  (:gen-class))

(defn summation [n]
  (reduce + (range 1 (inc n))))
