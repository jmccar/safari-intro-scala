package classesetc

object UseDate {
  def main(args: Array[String]): Unit = {
    println(s"2000 is leap? ${Date.isLeapYear(2000)}")
    println(s"1900 is leap? ${Date.isLeapYear(1900)}")
    val d = Date(1, 1, 2000)
    println(s"date, with year ${d.year}")
//    val d1 = new Date(30, 2, 2000)
//    println(s"date, with year ${d.year}")
    println(s"date is ${d}")
    val d2 = Date(1, 1, 2000)
    println(s"d == d2 ? ${d == d2}")

    val d3 = new Date(1, 4)
    println(s"d3 is ${d3}")

    val h1: Named = new Holiday(1, 1, 2020, "New Year's Day")
    println(s"Holiday is ${h1}")
    println(s"name of holiday is ${h1.name}")
  }
}
