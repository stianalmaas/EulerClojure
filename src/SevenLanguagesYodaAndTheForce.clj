
(defn size [v]
  (if (empty? v)
    0
    (inc (size (rest v)))))


(defn size [v]
  (loop [l v c 0]
    (if (empty? l)
      c
      (recur (rest l) (inc c)))))

(defn fib-pair [[a b]]
  [b (+ a b)])

(nth
  (map
   first
   (iterate fib-pair [1 1]) ) 500)

(defn factorial [n]
  (apply * (take n (iterate inc 1))))

(factorial 120)


(defmacro unless [test body]
  (list 'if (list 'not test) body))

(defmacro unless [test body else-body]
  (list 'if (list 'not test) body else-body))

(defmacro unless [test body &more]
  (list 'if (list 'not test)
    body
    (list 'if-let [(:else else-body) more]
    else-body
    (println "Syntax error!"))))


(defprotocol Compass
  (direction [c])
  (left [c])
  (right [c]))

(def directions [:north :east :south :west])

(defn turn [base amount]
  (rem (+ base amount) (count directions)))

(defrecord SimpleCompass [bearing]
  Compass
  (direction [_] (directions bearing))
  (left [_] (SimpleCompass. (turn bearing 3)))
  (right [_] (SimpleCompass. (turn bearing 1)))
  Object
  (toString [this] (str "[" (directions this) "]")))

