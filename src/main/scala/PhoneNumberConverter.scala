object PhoneNumberConverter {

  def convert(phoneNumber: String) = {
    val map = Map[Int, String](
      45 -> "-", 49 -> "1", 65 -> "2", 66 -> "2",67 -> "2",68 -> "3",
      69 -> "3",70 -> "3")

    phoneNumber.toCharArray.map(char =>
      map.get(char).get
    ).mkString("")
  }
}
