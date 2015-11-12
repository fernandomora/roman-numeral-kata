import org.scalatest.{Matchers, FlatSpec}

class RomanNumeralSpec extends FlatSpec with Matchers {

  behavior of "RomanNumerals"

  it should "zero is empty string" in {
    assert(RomanNumerals.fromNumber(0) === "")
  }

  it should "one is computed" in {
    assert(RomanNumerals.fromNumber(1) === "I")
  }

}