
(defn square [n]
  (* n n))

(defn sum-of-squares [limit]
  (reduce + 0 (map square (range limit))))

(defn square-of-sums [limit]
  (square (reduce + 0 (range limit))))

(defn the-difference [limit]
  (- (square-of-sums limit) (sum-of-squares limit)))