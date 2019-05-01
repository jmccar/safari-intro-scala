package classesetc

trait Named {
  def name: String
}

object Date {
  def isLeapYear(year: Int): Boolean =
    (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)

  def daysInMont(month: Int, year: Int): Int = month match {
    case 9 | 4 | 6 | 11 => 30
    case 2 => if (isLeapYear(year)) 29 else 28
    case m if m >= 1 && m <= 12 => 31
    case _ => throw new IllegalArgumentException("Bad month!")
  }

  def apply(day: Int, month: Int, year: Int): Date =
    return new Date(day, month, year)
}

/*
class Date(var day: Int, var month: Int, var year: Int, isLeap: Boolean) {
  var isLeapYear: Boolean = isLeap
}
*/

class Date /*private*/ protected (val day: Int, val month: Int, val year: Int) {
  println("Constructing a date")
  if (day < 1 || day > Date.daysInMont(month, year))
    throw new IllegalArgumentException("Bad day")

  // "auxiliary" constructor (overloaded :)
  def this(day: Int, month: Int) = this(day, month, 2019)

  override def toString: String =
    s"Date: day=${this.day} month=${month} year=${year}"

  final override def equals(obj: Any): Boolean = obj match {
    case d: Date => d.day == day && d.month == month && d.year == year
    case _ => false
  }
}

class Holiday(day: Int, month: Int, year: Int, val name:String)
  extends Date(day, month, year) with Named {
  override def toString: String = name + " on " + super.toString
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
