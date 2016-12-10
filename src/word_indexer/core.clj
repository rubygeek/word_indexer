(ns word-indexer.core
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))

(defn scrub [text]
  (str/replace text #"’|‘" ""))

(defn text-to-tokens [text]
  (let [lower-text (clojure.string/lower-case text)] 
    (re-seq #"\w+|\d" lower-text)))

(defn run-indexer [text]
  (let [words (text-to-tokens text)
        freq-words (frequencies words)]
    (take 10 (sort-by val > freq-words))))

(defn format-row [row]
  (apply format "%-10s | %d\n" row))

(defn run [file-name]
  (let [text (slurp (io/file file-name))
        freq (run-indexer text)]
    (print " ")
    (apply print (map format-row freq))))
