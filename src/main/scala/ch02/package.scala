package object ch02{
  import java.time.LocalDate

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {

      if(args.length < 3 ) throw new IllegalArgumentException("At least year, month and date has to be given")
      if(args.exists( _ == null)) throw new IllegalArgumentException("Non of the parameters is allowed to be null")
      if(args.exists( !_.toString.matches("\\d+"))) throw new IllegalArgumentException("Some parameters are no integers")
      if(sc.parts.drop(1).take(2).exists(_ != "-")) throw new IllegalArgumentException("Numbers have to be separated by '-'")

      val year = getAsInt(args(0))
      val month = getAsInt(args(1))
      val day = getAsInt(args(2))

      LocalDate.of(year, month.toInt, day.toInt)

    }

    private def getAsInt(parameter: Any) = {
      parameter.toString.toInt
    }
  }
}
