(ns clojure-pokeapi.prod
  (:require [clojure-pokeapi.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
