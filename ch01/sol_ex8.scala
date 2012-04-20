// run in REPL with :load sol_ex8.scala
// create 20 character long random name
scala> scala.util.Random.alphanumeric.filter(!_.isUpper).take(20).mkString