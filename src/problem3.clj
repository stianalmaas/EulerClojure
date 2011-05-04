
(use '[clojure.contrib.lazy-seqs :only (primes)])

;The prime factors of 13195 are 5, 7, 13 and 29.

;What is the largest prime factor of the number 600851475143 ?

(defn ikke-delelig-med-en? [tall primtall]
  (empty? (filter #(= (mod tall %) 0) primtall)))

(defn udelelig-med-alle? [tall coll]
  (not-any? #(= (mod tall %) 0) coll))


(defn generate-next-prime [primes]
  (loop [candidate (+ (first primes) 1)]
    (if (udelelig-med-alle? candidate primes)
      candidate
      (recur (inc candidate)))))

(defn generate-primes [limit]
  (loop [primes [2]]
    (let [next (generate-next-prime primes)]
      (if (> next limit)
        primes
        (recur (conj primes next))))))

(defn find-prime-factors [number]
  (filter #(zero? (mod number %)) (take-while #(> number (* % %)) primes)))
