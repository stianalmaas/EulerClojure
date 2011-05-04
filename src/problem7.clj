
(defn lag-neste-primtall [primtall]
  (loop [test (last primtall)]
    (cond
      (delelig-av-noen? test primtall) (recur (inc test))
      :else (conj primtall test))))


(defn delelig-av-noen? [tall divisorer]
  (reduce #(or %1 %2) false (map #(== 0 (mod tall %)) divisorer)))

(defn lag-n-primtall [n]
  (loop [i 1
         primtall [2]]
    (cond
      (< i n) (recur (inc i) (lag-neste-primtall primtall))
      :else primtall)))

(take-last 1 (lag-n-primtall 10001))