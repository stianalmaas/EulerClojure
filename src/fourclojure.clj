

; Write a function which removes consecutive duplicates from a sequence.
;
; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

;		(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

;		(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))


(defn remdup [coll]
  (keep-indexed #(if (not (= (nth coll (+ %1 1)) %2)) %2) coll))

(defn remdup [coll]
  (loop [coll coll
         prev nil
         result (seq )]
    (if (empty? coll) )))

