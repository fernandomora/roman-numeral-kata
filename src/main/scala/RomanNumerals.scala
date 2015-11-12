object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n == 4) "IV"
    else {
      val s = if (n >= 5) "V" else ""
      s + {
        (n % 5) match {
          case 0 => ""
          case 1 => "I"
          case 2 => "II"
          case 3 => "III"
        }
      }
    }
  }

}
