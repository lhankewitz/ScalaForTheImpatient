// run in REPL :load sol_ex06.scala
/*
* 6. Write a for loop for computing the product of the Unicode codes of all letters
in a string. For example, the product of the characters in "Hello" is 9415087488L.
* */
scala> var sum  = 1L; for(l <- "Hello"; num = l.toInt ) sum *= num


