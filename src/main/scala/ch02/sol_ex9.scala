// run in REPL :load sol_ex9.scala
/*
9. Make the function of the preceding exercise a recursive function.
* */
def product(s:String):Long = {
     if(s.isEmpty) 1L
     else if(s.length == 1) s.charAt(0).toLong
     else s.charAt(0).toLong * product(s.substring(1))
   }

product("Hello")