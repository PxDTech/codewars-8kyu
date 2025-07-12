(ns string-repeat.core
  (:gen-class))

;; Write a function that accepts a non-negative integer n and a string s as parameters,
;; and returns a string of s repeated exactly n times.

(defn repeat-str [n string]
  (apply str (repeat n string)))
