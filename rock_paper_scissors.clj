(ns pasquale.rock-paper-scissors
  (:gen-class))

;; Let's play! You have to return which player won! In case of a draw return Draw!.

(defn rps [p1 p2]
  (cond
    (= p1 p2) "Draw!"
    (and (= p1 "rock") (= p2 "scissors")) "Player 1 won!"
    (and (= p1 "paper") (= p2 "rock")) "Player 1 won!"
    (and (= p1 "scissors") (= p2 "paper")) "Player 1 won!"
    :else "Player 2 won!"))
