
(defn big-st-n [string n]
  (> (.length string) n))

(defn collection-type [col]
  (cond
    (list? col)   :list
    (vector? col) :vector
    (map? col)    :map))