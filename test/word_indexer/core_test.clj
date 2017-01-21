(ns word-indexer.core-test
  (:require [clojure.test :refer [deftest is]]
            [word-indexer.core :as core]))

(deftest test-scrub 
  (is (= "I wonder Ive how" (core/scrub "’I wonder I‘ve how‘"))))

(deftest test-text-to-tokens
  (is (= ["a" "quick" "brown" "fox"]  (core/text-to-tokens "a quick brown fox"))))

(deftest test-text-to-tokens-convert-lower
  (is (= ["a" "quick" "brown" "fox"]  (core/text-to-tokens "A quICk BROWN fox"))))

(deftest test-run-indexer-no-repeats 
  (is (= '(["a" 1] ["quick" 1] ["brown" 1] ["fox" 1]) (core/run-indexer "a quick brown fox"))))

(deftest test-run-indexer-with-repeats 
  (is (= '(["a" 3] ["quick" 1] ["brown" 1] ["fox" 1]) (core/run-indexer "a quick a brown a fox"))))

(deftest run-indexer-with-repeats 
  (is (= '(["fox" 4] ["a" 3] ["quick" 1] ["brown" 1]) (core/run-indexer "a FOX fox quick a brown FOX a fox"))))
