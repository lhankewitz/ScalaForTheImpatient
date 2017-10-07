// run in REPL :load sol_ex05.scala
def countdown(n:Int):Unit = if(n >=0) {println(n); countdown(n-1) }

countdown(10)