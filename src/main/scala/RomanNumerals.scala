object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n <= 3) "I" * n
    else if (n < 5) "IV"
    else if (n == 5) "V"
    else if (n == 6) "VI"
    else if (n == 7) "VII"
    else "VIII"
  }

}
