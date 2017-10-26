package ch02

import org.scalatest.FunSuite


/**
  * Class to test chapter 02 exercise 11.
  *
  * @author L.Hankewitz 
  * @since 26.10.17.
  */

class Ch02_11_Test extends FunSuite  {

  test("correct output for ") {
    val year = "2017"
    val month = "10"
    val day = "26"

    val localDate = date"$year-$month-$day"
    assert(localDate.getYear == year.toInt)
    assert(localDate.getMonthValue == month.toInt)
    assert(localDate.getDayOfMonth == day.toInt)
  }

  test("Wrong delimiter throws exception"){
    val year = "2017"
    val month = "10"
    val day = "26"

    assertThrows[IllegalArgumentException] {
      callAndCatchAndThrow(year, month, day)
    }
  }

  test("null value throws exception"){
    val year = null
    val month = "10"
    val day = "26"

    assertThrows[IllegalArgumentException] {
      callAndCatchAndThrow(year, month, day)
    }
  }

  private def callAndCatchAndThrow(year: String, month: String, day: String) = {
    try {
      date"$year+$month+$day"
    } catch {
      case e: IllegalArgumentException =>
        println(e.getMessage)
        throw e
    }
  }

  test("some value is not a number throws exception"){
    val year = "12"
    val month = "xxx"
    val day = "26"

    assertThrows[IllegalArgumentException] {
      callAndCatchAndThrow(year, month, day)
    }
  }

}

