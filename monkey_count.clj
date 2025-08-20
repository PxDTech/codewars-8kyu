(ns pasquale.monkey-count
  (:gen-class))

;; Given the number (n), populate an array with all numbers up to and including that number,
;; but excluding zero.

(defn monkey-count
  [n]
  (vec (range 1 (inc n))))

;; Explanation
;; (range 1 (inc n))
;; range generates numbers starting at 1 up to, but not including, (inc n) (which is n+1).
;; So for n=5, it generates 1 2 3 4 5.
;; vec
;; Converts the lazy sequence returned by range into a vector (array-like structure).

