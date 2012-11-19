
(defn pythagorean? [a b c]
  (= (* c c) (+ (* a a) (* b b))))


(pythagorean? 3 4 5)

(for [a (range 500) b (range 500) c (range 500)
      :when (and (= 1000 (+ a b c)) (pythagorean? a b c))]
  (list a b c))

(* 375 200 425)