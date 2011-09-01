
(defn pythagorean? [a b c]
  (= (* c c) (+ (* a a) (* b b))))


(pythagorean? 3 4 5)

(for [a (range 998) b (range a) c (range b)
      :when (and (= 1000 (+ a b c)) (pythagorean? a b c))]
  (list a b c))

(* 375 200 425)