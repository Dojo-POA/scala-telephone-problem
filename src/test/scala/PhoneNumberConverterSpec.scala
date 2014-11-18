import org.scalatest.{ShouldMatchers, Matchers, FunSuite}

class PhoneNumberConverterSpec extends FunSuite with ShouldMatchers {

  test("phone number 1 should return 1") {
    val telephoneNumber = "1"

    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)

    convertedNumber should equal("1")
  }

  test("phone number A should return 2") {
    val telephoneNumber = "A"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("2")

  }

  test("phone number B should return 2") {
    val telephoneNumber = "B"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("2")
  }

  test("phone number AB should return 22") {
    val telephoneNumber = "AB"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("22")
  }

  test("phone number ABC should return 222") {
    val telephoneNumber = "ABC"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("222")
  }

  test("phone number - should return -") {
    val telephoneNumber = "-"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("-")
  }

  test("phone number D should return 3") {
    val telephoneNumber = "D"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("3")
  }

  test("phone number DE should return 33") {
    val telephoneNumber = "DE"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("33")
  }

  test("phone number DEF should return 333") {
    val telephoneNumber = "DEF"
    val convertedNumber = PhoneNumberConverter.convert(telephoneNumber)
    convertedNumber should equal("333")
  }

}
