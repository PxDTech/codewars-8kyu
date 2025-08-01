(ns better-than-average.core
  (:gen-class))

;; There was a test in your class and you passed it. Congratulations!
;; But you're an ambitious person. You want to know if you're better than the average student in your class.
;; You receive an array with your peers' test scores. Now calculate the average and compare your score!
;; Return true if you're better, else false!
;; Your points are not included in the array of your class's points. Do not forget them when calculating the average score!

(defn better-than-average
  [class-points your-points]
  (let [total-points (+ (reduce + class-points) your-points)
        total-students (inc (count class-points))
        average (/ total-points total-students)]
    (> your-points average)))
