(ns pasquale.bonus-time
  (:gen-class))

;; Build a function that takes in two arguments (salary, bonus).
;; Salary will be an integer, and bonus a boolean.
;; If bonus is true, the salary should be multiplied by 10.
;; If bonus is false, the fatcat did not make enough money and must receive only his stated salary.
;; Return the total figure the individual will receive as a string prefixed with "$".

(defn bonus-time
  [salary bonus]
  (if bonus (str "$" (* salary 10)) (str "$" salary)))
