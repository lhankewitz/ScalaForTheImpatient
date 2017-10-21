// run in REPL :load sol_ex8.scala
/*
8. Write a function product(s : String) that computes the product, as described
in the preceding exercises.
* */
def product(s:String) = {
     s.foldLeft(1L)(_ * _.toInt)
   }

product("Hello")







