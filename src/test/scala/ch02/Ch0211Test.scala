package ch02

import org.scalatest.FunSuite


/**
  * Class to test chapter 02 exercise 11.
  *
  * @author L.Hankewitz 
  * @since 26.10.17.
  */

class Ch0211Test extends FunSuite  {

  test("correct output for ") {
    val year = "2017"
    val month = "10"
    val day = "26"

    println(date"$year-$month-$day")
  }

}

