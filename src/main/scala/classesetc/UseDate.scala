package classesetc

object UseDate {
  def main(args: Array[String]): Unit = {
    println(s"2000 is leap? ${Date.isLeapYear(2000)}")
    println(s"1900 is leap? ${Date.isLeapYear(1900)}")
    val d = new Date(1, 1, 2000)
    println(s"date, with year ${d.year}")
    val d1 = new Date(30, 2, 2000)
    println(s"date, with year ${d.year}")
  }
}
