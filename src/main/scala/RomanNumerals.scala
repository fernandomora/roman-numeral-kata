object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n <= 3) "I" * n
    else if (n < 5) "IV"
    else "V"
  }

}
