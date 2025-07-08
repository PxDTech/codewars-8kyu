(ns make-negative.core
  (:gen-class))

(defn make-negative [number]
  (- (Math/abs number))
)
