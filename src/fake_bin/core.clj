(ns fake-bin.core
  (:gen-class))

;; Given a string of digits, you should replace any digit below 5 with '0'
;; and any digit 5 and above with '1'. Return the resulting string.

(defn fake-bin [x]
  (apply str
         (map (fn [ch] 
                (if (< (Character/digit ch 10) 5)
                  \0
                  \1))
              x)))

;; Explanation:
;; map processes each character ch in the input string.
;; Character/digit ch 10 converts the character to its numeric value.
;; The if checks if the digit is less than 5; it returns character \0 or \1 accordingly.
;; apply str joins the sequence of characters back into a string.

