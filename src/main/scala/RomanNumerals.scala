object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n < 4) "I" * n
    else if (n == 4) "IV"
    else if (n == 9) "IX"
    else if (n < 10) "V" + fromNumber(n - 5)
    else "X"
  }

}
