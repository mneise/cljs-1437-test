(ns cljs-1437-test.core
  (:require [cljs.js :as cljs]
            [cljs-1437-test.foo :as foo]))

(enable-console-print!)

(println "Hello world!")
(println (:foo (meta #'foo/foo)))
