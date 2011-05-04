
; lag liste med fibonacci-tall opp til en grense
(defn fib-liste [grense]
  (loop [liste '(1 1)
         neste 2]
    (if (> neste grense)
      liste
      (recur (cons neste liste) (+ neste (first liste))))))

(reduce + 0 (filter even? (fib-liste 4000000)))

(println (str "Resultatet er" (fib-liste 5)))