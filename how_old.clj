(ns pasquale.how-old
  (:gen-class))

;; You ask a small girl,"How old are you?" She always says, "x years old",
;; where x is a random number between 0 and 9.
;; Write a program that returns the girl's age (0-9) as an integer.
;; Assume the test input string is always a valid string. For example,
;; the test input may be "1 year old" or "5 years old".
;; The first character in the string is always a number.

(defn how-old
  [her-old]
  (-> her-old
      (subs 0 1)
      Integer/parseInt))

;; This works because:
;; (subs s 0 1) returns the substring from index 0 up to (but not including) 1, i.e.,
;; the first character.
;; Integer/parseInt converts that character string into a number.

(defn how-old1
  [her-old]
  (-> her-old
      first
      str
      Integer/parseInt))

