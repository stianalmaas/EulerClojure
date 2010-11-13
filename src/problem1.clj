
(defn divide-by-5? [x] (== (rem x 5) 0))

(defn divide-by-3? [x] (== (rem x 3) 0))

(defn divisible-by-3-or-5? [x] (or (divide-by-5? x) (divide-by-3? x)))

(reduce + 0 (filter divisible-by-3-or-5? (range 999)))


(defn all-numbers [x] (filter #(or (divide-by-5? %) (divide-by-3? %)) (range x)))

(reduce + 0 (all-numbers 1000))