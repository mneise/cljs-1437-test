(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build (b/inputs "src")
    {:main 'cljs-1437-test.core
     :output-to "out/cljs_1437_test.js"
     :output-dir "out"
     :optimizations :whitespace
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
