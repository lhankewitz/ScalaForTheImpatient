// run in REPL via :load sol_ex1.scala
scala> def signum(n:Int) = if(n > 0) 1 else if(n == 0) 0 else -1

scala> (signum(42) + signum(0) + signum(-42)) == 0

scala> (signum(42) - signum(-42))  == 2

scala> signum(0) == 0