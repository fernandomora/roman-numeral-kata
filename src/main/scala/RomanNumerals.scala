object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n == 0) ""
    else if (n == 4) "IV"
    else if (n == 9) "IX"

    else if (n < 5)  "I" + fromNumber(n - 1)
    else if (n < 10) "V" + fromNumber(n - 5)
    else if (n < 40) "X" + fromNumber(n - 10)
    else if (n < 50) "XL" + fromNumber(n - 40)

    else "unknown"
  }

}
