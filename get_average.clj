(ns pasquale.get-average
  (:gen-class))

;; Return the average of the given array rounded down to its nearest integer.
;; The array will never be empty.

(defn get-average [marks]
  (let [sum   (reduce + marks)
        items (count marks)]
    (quot sum items)))

