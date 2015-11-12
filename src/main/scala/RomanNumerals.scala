object RomanNumerals {
  val conversions = List( // less than N -> "..."+from(...)
    (1, "", 0),
    (4, "I", 1),
    (5, "IV", 4),
    (9, "V", 5),
    (10,"IX", 9),
    (40,"X", 10),
    (50, "XL", 40),
    (90, "L", 50),
    (100, "XC", 90),
    (400, "C", 100))

  def fromNumber(n: Int): String = {
    if (n  < 1) ""
    else {
      val conversion = conversions.find { case (number, _, _) => n < number }
      conversion match {
        case None => ""
        case Some((_, roman, substr)) => roman + fromNumber(n - substr)
      }
    }
  }

}
