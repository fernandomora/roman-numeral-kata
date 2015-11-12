object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n <= 3) "I" * n
    else "V"
  }

}
