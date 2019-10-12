(ns test-deps.prod
  (:require [test-deps.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
