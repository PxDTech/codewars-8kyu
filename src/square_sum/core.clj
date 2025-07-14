(ns square-sum.core
  (:gen-class))

;; Complete the square sum function so that it squares each number passed into it and
;; then sums the results together.

(defn square-sum [lst]
  (reduce + (map #(* % %) lst))
  )

(defn square-sum-loop [lst]
  (loop [remaining lst
         acc 0]
    (if (empty? remaining)
      acc
      (recur (rest remaining)
             (+ acc (* (first remaining) (first remaining)))))))

