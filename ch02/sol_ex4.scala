// run in REPL via :load sol_ex4.scala
// java equivalent to for(int i = 10; i >= 0; i--){System.out.println(i)}
scala> for(i <- 10 to 0 by -1) println(i)

// other solution
scala> var i = 10; while(i >= 0){ println(i); i -= 1}

// recursive solution
scala> def f(i:Int){ if(i >= 0) {println(i); f(i-1)} }; f(10) 