(ns pasquale.third-angle-of-triangle
  (:gen-class))

;; You are given two interior angles (in degrees) of a triangle.
;; Write a function to return the 3rd.

(defn third-angle
  [a b]
  (- 180 a b))
