(ns digitize.core
  (:gen-class))

; Given a random non-negative number, you have to return the digits of this number
; within an array in reverse order.

(defn digitize [n]
  (->> (str n)                          ; Convert number to string
       (seq)                            ; Get sequence of characters
       (map #(Character/digit % 10))    ; Convert each char to digit
       (reverse)                        ; Reverse the sequence
       (vec)))                          ; Convert to a vector
