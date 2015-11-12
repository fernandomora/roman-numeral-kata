object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n < 4) "I" * n
    else if (n == 4) "IV"
    else "V" + fromNumber(n - 5)
  }

}
