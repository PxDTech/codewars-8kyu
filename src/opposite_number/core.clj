(ns opposite-number.core
  (:gen-class))

(defn opposite [number]
  ; Very simple, given a number (integer / decimal / both depending on the language),
  ; find its opposite (additive inverse).
  (* -1 number)
)
