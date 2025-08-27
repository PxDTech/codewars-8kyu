(ns pasquale.check-for-factor
  (:gen-class))

;; This function should test if the factor is a factor of base.
;; Return true if it is a factor or false if it is not.

(defn check-for-factor
  [base factor]
  (zero? (mod base factor)))
