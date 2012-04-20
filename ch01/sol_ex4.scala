// run in REPL with :load sol_ex4.scala

scala> "crazy" * 3
res5: String = crazycrazycrazy


// the method * can be found in scala.collection.immutable.StringOps.*(n:Int)
// it is automatically called via the implicit transformation in scala.Predef
// implicit def augmentString (x: String): StringOps 
//
// How can this be found out?
// run in your command line>scala -Xprint:typer -e  "\"crazy\" * 3"
// and you will see a code line like this:
// scala.this.Predef.augmentString("crazy").*(3)
// which points to the augmentString method in scala.Predef
// Found out thanks to 
// see http://stackoverflow.com/questions/9999664/how-to-examine-implicit-rich-conversions-and-implemented-traits-in-the-repl
