(ns grow.core
  (:gen-class))

;; Given a non-empty array of integers, return the result of multiplying the values together in order.

(defn grow [xs]
  (reduce * xs)
  )
