object RomanNumerals {

  val conversions = List(
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
    conversions.find(n >= _._1).map{ case (x, roman) =>
      roman + fromNumber(n-x)
    }.getOrElse("")
  }

}
