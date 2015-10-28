(ns cljs-1437-test.core
  (:require [cljs.js :as cljs]
            [cljs-1437-test.foo :as foo]
            [cljs-1437-test.foo2 :as foo2]))

(enable-console-print!)

(println "Hello world!")
(println (:foo (meta #'foo/foo)))
(println (:foo2 (meta #'foo2/foo2)))
