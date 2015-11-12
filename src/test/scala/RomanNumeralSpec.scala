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
}