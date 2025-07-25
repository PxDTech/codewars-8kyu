(ns greet.core
  (:gen-class))

;; Create a function that accepts a parameter representing a name and returns the message:
;; "Hello, <name> how are you doing today?".

(defn greet [name]
  (str "Hello, " name " how are you doing today?")
  )
