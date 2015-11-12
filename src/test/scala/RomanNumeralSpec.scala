import org.scalatest.{Matchers, FlatSpec}

class RomanNumeralSpec extends FlatSpec with Matchers {

  behavior of "RomanNumerals"

  it should "do something" in {
    assert(RomanNumerals.fromNumber(0) === "")
  }

}