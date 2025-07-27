(ns sum.core
  (:gen-class))

(defn sum [a]
  (reduce + a))
