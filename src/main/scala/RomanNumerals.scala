object RomanNumerals {

  def fromNumber(n: Int): String = {
    if (n  < 1) ""
    else if (n < 4) "I" + fromNumber(n - 1)

    else if (n < 5) "IV"
    else if (n < 9) "V" + fromNumber(n - 5)

    else if (n < 10) "IX"
    else if (n < 40) "X" + fromNumber(n - 10)
    else if (n < 50) "XL" + fromNumber(n - 40)
    else if (n < 90) "L"  + fromNumber(n - 50)
    else if (n < 100) "XC" + fromNumber(n - 90)
    else if (n < 400) "C" + fromNumber(n - 100)
    else "unknown"
  }

}
