
(defn char-value [letter]
  (- (int letter) 64))

(defn word-value-seq [word]
  (map char-value (seq word)))

(defn word-value [word]
  (reduce + (word-value-seq word)))

(defn triangle-formula [n]
  (* (/ 1 2) n (+ n 1)))

(defn lazy-range []
  (lazy-seq (iterate (partial + 1) 0)))


(defn triangle-numbers []
  (map triangle-formula lazy-range) )

(defn delelig-med? [divisor]
  (fn [tall]
    (= 0 (mod tall divisor) ) ))

(loop [teller]
  (if ))

(defn delelig-med-alle? [tall liste]
  (reduce #(and %1 %2) true (map #(= 0 (mod tall %)) liste)))

(defn tall-delelig-med [liste]
  (loop [teller 1]
    (if (delelig-med-alle? teller liste)
      teller
      (recur (inc teller)))))

(tall-delelig-med (map inc (range 20)))