(ns pasquale.points
  (:gen-class))

;; Our football team has finished the championship.

;; Our team's match results are recorded in a collection of strings.
;; Each match is represented by a string in the format "x:y",
;; where x is our team's score and y is our opponents score.
;; For example: ["3:1", "2:2", "0:1", ...]

;; Points are awarded for each match as follows:

;;    if x > y: 3 points (win)
;;    if x < y: 0 points (loss)
;;    if x = y: 1 point (tie)

;; We need to write a function that takes this collection and returns the number of points
;; our team (x) got in the championship by the rules given above.

(defn match-points
  "Takes a string 'x:y' and returns the number of points earned."
  [games]
  (let [[x y] (map #(Integer/parseInt %)
                   (clojure.string/split games #":"))]
    (cond
      (> x y) 3  ;; win
      (= x y) 1  ;; tie
      :else 0))) ;; loss

(defn points
  "Takes a collection of 10 match result strings and returns total points."
  [games]
  (reduce + (map match-points games)))
