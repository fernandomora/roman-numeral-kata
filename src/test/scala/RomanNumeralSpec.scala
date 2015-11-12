import org.scalatest.{Matchers, FlatSpec}

class RomanNumeralSpec extends FlatSpec with Matchers {

  behavior of "RomanNumerals"

  it should "zero is empty string" in {
    assert(RomanNumerals.fromNumber(0) === "")
  }

  it should "one is computed" in {
    assert(RomanNumerals.fromNumber(1) === "I")
  }

  it should "two and three" in {
    assert(RomanNumerals.fromNumber(2) === "II")
    assert(RomanNumerals.fromNumber(3) === "III")
  }

  it should "five" in {
    assert(RomanNumerals.fromNumber(5) === "V")
  }

  it should "four" in {
    assert(RomanNumerals.fromNumber(4) === "IV")
  }

  it should "til eight" in {
    assert(RomanNumerals.fromNumber(6) === "VI")
    assert(RomanNumerals.fromNumber(7) === "VII")
    assert(RomanNumerals.fromNumber(8) === "VIII")
  }

  it should "ten" in {
    assert(RomanNumerals.fromNumber(10) === "X")
  }

  it should "nine" in {
    assert(RomanNumerals.fromNumber(9) === "IX")
  }

  it should "til thirteen" in {
    assert(RomanNumerals.fromNumber(11) === "XI")
    assert(RomanNumerals.fromNumber(12) === "XII")
    assert(RomanNumerals.fromNumber(13) === "XIII")
  }

  it should "til thirty nine" in {
    assert(RomanNumerals.fromNumber(19) === "XIX")
    assert(RomanNumerals.fromNumber(24) === "XXIV")
    assert(RomanNumerals.fromNumber(39) === "XXXIX")
  }

  it should "til fourthy nine" in {
    assert(RomanNumerals.fromNumber(44) === "XLIV")
    assert(RomanNumerals.fromNumber(49) === "XLIX")
    assert(RomanNumerals.fromNumber(41) === "XLI")
  }
}