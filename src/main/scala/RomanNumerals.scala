object RomanNumerals {

  val conversions = List(
    (1000,"M"),
    (900,"CM"),
    (500, "D"),
    (400, "CD"),
    (100, "C"),
    (90, "XC"),
    (50, "L"),
    (40, "XL"),
    (10,"X"),
    (9,"IX"),
    (5, "V"),
    (4, "IV"),
    (1, "I")
  )

  def fromNumber(n: Int): String = {
    conversions.collectFirst{ case (x, roman) if n >= x =>
      roman + fromNumber(n-x)
    }.getOrElse("")
  }

}
