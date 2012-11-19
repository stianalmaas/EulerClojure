(ns com.clojureinaction.book
  (:import (java.text SimpleDateFormat)))

(def sdf (SimpleDateFormat. "yyyy-MM-dd"))

(defn date-from-date-string [date-string]
  (let [sdf (SimpleDateFormat. "dd.MM.yyyy")]
    (.parse sdf date-string)))

