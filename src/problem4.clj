; A palindromic number reads the same both ways. The largest palindrome
; made from the product of two 2-digit numbers is 9009 = 91  99.

; Find the largest palindrome made from the product of two 3-digit numbers.

(defn is-palindrome? [number]
  (= (seq (str number)) (reverse (str number))))

(defn generate-products [first-limit second-limit]
  (loop [a first-limit
         products []]
    (cond
      (< a 1) products
      :else
      (recur (dec a) (loop [b second-limit
             products products]
        (cond
          (< b 1) products
          :else (recur (dec b) (conj products (* a b)))))))))

(take 1 (reverse (sort (filter is-palindrome? (generate-products 999 999)))))