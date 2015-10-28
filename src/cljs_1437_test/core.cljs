(ns cljs-1437-test.core
  (:require [cljs.js :as cljs]
            [cljs-1437-test.test]))

(enable-console-print!)

(println "Hello world!")
(println (:foo (meta #'cljs-1437-test.test/a)))
