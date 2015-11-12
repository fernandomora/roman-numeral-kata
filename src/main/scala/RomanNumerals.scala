object RomanNumerals {

  def fromNumber(n: Int): String = {
    n match {
      case 0 => ""
      case 1 => "I"
      case 2 => "II"
      case 3 => "III"
    }
  }

}
