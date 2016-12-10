# word_indexer

## Documentation on functions

Ccore file:

scrub - removed the funny quotes that happen to be in the Alice in Wonderland book file

text-to-token - takes a string and splits it on a word boundary or a decimal and lower cases the string 

run-indexer - uses the previous two functions and calls `frequencies` function on the map of words to get how often they appear

format-row - solely for formatting the vector of maps of word and counts

run - called when run on the command line 

## Running locally

Ensure [lein](http://leiningen.org/) is installed.

Clone the repo at [word-indexer](https://github.com/rubygeek/world_indexer)

CD into the directory and run 

`lein run resources/chap1.txt`

## Running tests

lein test

## Running on command line 

`lein run [filename]`

Example (data file in resources directory): 

`lein run resources/chap1.txt`


