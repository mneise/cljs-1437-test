(require '[cljs.build.api :as b])

(b/watch (b/inputs "src2" "src")
  {:main 'cljs-1437-test.core
   :output-to "out/cljs_1437_test.js"
   :output-dir "out"})
