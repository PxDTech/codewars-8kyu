(ns pasquale.goals
  (:gen-class))

;; Messi is a soccer player with goals in three leagues:
;;  LaLiga, Copa del Rey, Champions
;; Complete the function to return his total number of goals in all three leagues.

(defn goals
  [la-liga-goals copa-del-rey-goals champions-league-goals]
  (+ la-liga-goals copa-del-rey-goals champions-league-goals))
