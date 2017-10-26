// run in REPL :load sol_ex10.scala
/*
10. Write a function that computes x^n, where n is an integer. Use the following
recursive definition:
• x^n = y · y if n is even and positive, where y = x^(n / 2).
• x^n = x · x^(n – 1) if n is odd and positive.
• x^0 = 1.
• x^n = 1 / x^(–n) if n is negative.
 Don’t use a return statement.
* */

def pow(x: Double, n: Integer): Double = {
  if (n > 0) {
    if (n % 2 == 0) pow(x, n / 2) * pow(x, n / 2)
    else x * pow(x, n - 1)
  }
  else if (n == 0) 1
  else 1.toDouble / pow(x, -n)
}

pow(2, 2)
pow(2,-1)
pow(2,0)
pow(2,3)

