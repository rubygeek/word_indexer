Congratulations for getting this far in the hiring process! As part of that
process, before inviting you to interview with the team, we'd like to see a
sample of your work following the specification below. We use this exercise as
an alternative to on-site coding challenges.

Once we've received your implementation and have had an opportunity to
evaluate it, we'll reach back out to discuss the next steps. If you do well on
the programming exercise, we'll invite you to a 3-hour series of interviews
with the team to review your implementation and to evaluate soft skills.

We send this exercise to all of our candidates, regardless of level. When we
evaluate it, we do adjust our expectations accordingly. Give us your best
shot.

Thanks!

# Simple Distributed File Indexer

Our end goal is to create a multi-process, command-line indexer application
that finds the top 10 words across a collection of documents. The outline below
will assist you in developing it. You may use any programming language of your
choice, but we suggest you use the one you are most comfortable with.

We only require that you complete the first four steps. We want to see quality
of code over quantity of features: develop this as though it needs to be
maintained by yourself and others for some period of time. Please do not spend
any more than 8 hours on this challenge; we want to be respectful of your time.

- Write logic that takes a blob of text as a parameter and tokenizes this blob
  into words. Words are delimited by any character other than a-z, A-Z, or 0-9.

- Write logic to track all unique words encountered and the number of times
  each was encountered. Words should be matched in a case-insensitive manner.
  This should return the top 10 words (and their counts).

- Provide some documentation for the code you wrote in each of the previous
  steps.

- You must test your code. Make sure you include some brief documentation on
  how to run the tests. Any collection of plain text files can be used as
  input, and we suggest you try out some free plain text books from
  http://www.gutenberg.org/


All of the following steps are optional. You may complete any number of them,
or none at all.

- Write a command-line interface for your indexer that takes the filenames of
  text blobs as arguments, and then prints the top 10 words across all files to
  standard output.

- Use source control to help you develop this software. If possible, we'd like
  you to post this on a public platform like GitHub or Bitbucket and then send
  us a link.

- Ensure that you can run your code in places other than your own development
  environment, and provide installation/deployment instructions. Provide
  documentation that walks the user through using your application.

- Extend your application execute concurrently. You may choose to support a
  fixed, configurable number of workers or to allow changing the number of
  workers dynamically.

- Extend your application to be distributed, such that workers can run on
  separate machines from each other. Hint: you may leverage existing open
  source technologies to accomplish this.
