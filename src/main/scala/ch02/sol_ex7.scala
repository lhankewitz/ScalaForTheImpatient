// run in REPL :load sol_ex07.scala
/*
7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
* */
scala> "Hello".foldLeft(1L)(_ * _.toInt)

scala> (1L /: "Hello") (_ * _.toInt)

scala> "Hello".foldRight(1L)(_.toInt * _)

scala> ("Hello" :\ 1L ) (_.toInt  * _)

scala> "Hello".map(_.toLong).reduceLeft(_ * _)

scala> "Hello".map(_.toLong).reduceRight(_ * _)

scala> "Hello".map(_.toLong).product






