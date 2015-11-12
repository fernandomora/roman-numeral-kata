object RomanNumerals {

  def fromNumber(n: Int): String = {
    n match {
      case 0 => ""
      case 1 => "I"
    }
  }

}
