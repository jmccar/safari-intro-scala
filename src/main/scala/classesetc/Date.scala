package classesetc

object Date {
  def isLeapYear(year: Int): Boolean =
    (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)

  def daysInMont(month: Int, year: Int): Int = month match {
    case 9 | 4 | 6 | 11 => 30
    case 2 => if (isLeapYear(year)) 29 else 28
    case m if m >= 1 && m <= 12 => 31
    case _ => throw new IllegalArgumentException("Bad month!")
  }
}

class Date(val day: Int, val month: Int, val year: Int) {
  println("Constructing a date")
  if (day < 1 || day > Date.daysInMont(month, year))
    throw new IllegalArgumentException("Bad day")
}

/*
// in parens... primary constructor's arg list
class Date(d: Int, m: Int, y: Int) {
  println(s"Starting the constructor for a Date, d = ${d}")
//  var day: Int = _
  val day: Int = d
  val month: Int = m
  val year: Int = y
}
*/
