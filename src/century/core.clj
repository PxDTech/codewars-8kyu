(ns century.core
  (:gen-class))

;; The first century spans from the year 1 up to and including the year 100, the second century -
;; from the year 101 up to and including the year 200, etc.
;; Task
;; Given a year, return the century it is in.

(defn century [year]
  (if (zero? (mod year 100))
    (quot year 100)
    (inc (quot year 100))))
