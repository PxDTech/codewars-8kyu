(ns pasquale.rental-car-cost
  (:gen-class))

;; Every day you rent a car costs $40. If you rent the car for 7 or more days,
;; you get $50 off your total. Alternatively, if you rent the car for 3 or more days,
;; you get $20 off your total.
;; Write a code that gives out the total amount for different days(d).

(defn rental-car-cost
  [d]
  (cond
    (< d 3) (* d 40)
    (and (>= d 3) (< d 7)) (- (* d 40) 20)
    :else (- (* d 40) 50)
    ))

(defn rental-car-cost1 [d]
  (def cost (* d 40) )
  (cond 
    (>= d 7) (- cost 50)
    (>= d 3) (- cost 20)
    :else cost
  )
)
