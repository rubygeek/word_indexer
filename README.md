# word_indexer

## Documentation on functions

Core file functions:

text-to-token - takes a string and splits it on a word boundary or a decimal and lower cases the string 

run-indexer - uses the previous two functions and calls `frequencies` function on the map of words to get how often they appear

format-row - solely for formatting the vector of maps of word and counts

run - called when run on the command line 



## Running locally

Ensure [lein](http://leiningen.org/) is installed.

Clone the repo at [clojure_word_indexer](https://github.com/rubygeek/clojure_word_indexer)

Change into the directory and run 

`lein run resources/chap1.txt`

## Running tests

lein test

## Running on command line 

`lein run [filename]`

Output:

```
▶ lein run resources/chap1.txt
 the        | 91
 she        | 80
 to         | 75
 it         | 67
 and        | 65
 was        | 53
 a          | 52
 of         | 43
 i          | 35
 alice      | 28
```

Example (data file in resources directory): 

`lein run resources/chap1.txt`

## Stuart Sierra Reloaded Technique

I have learned [Stuart Sierra's Reloaded](http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded) technique which has a lein template and a method of working. After starting a repl thoguh the command line or through cider, use `(dev)` to load the dev namespace and it has convient libraries installed for development. It is a handy way to develop! Here is a sample: 
 

```
▶ lein repl
nREPL server started on port 60894 on host 127.0.0.1 - nrepl://127.0.0.1:60894
REPL-y 0.3.7, nREPL 0.2.12
Clojure 1.8.0
Java HotSpot(TM) 64-Bit Server VM 1.8.0_91-b14
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=> (dev)
#object[clojure.lang.Namespace 0x4d06992c "dev"]

dev=> (dir word-indexer.core)
format-row
run
run-indexer
scrub
text-to-tokens
nil

dev=> (core/text-to-tokens "one two three four five")
("one" "two" "three" "four" "five")

dev=> (core/text-to-tokens "one two three four five one two three one one two two two")
("one" "two" "three" "four" "five" "one" "two" "three" "one" "one" "two" "two" "two")

dev=> (core/run-indexer *1)
(["two" 5] ["one" 4] ["three" 2] ["four" 1] ["five" 1])

dev=> (core/format-row (first *1))
"two        | 5\n"

```

