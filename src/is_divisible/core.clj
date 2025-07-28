(ns is-divisible.core
  (:gen-class))

;; Create a function that checks if a number n is divisible by two numbers x AND y.
;; All inputs are positive, non-zero numbers.

(defn is-divisible [n x y]
  (and (zero? (mod n x))
       (zero? (mod n y))))
