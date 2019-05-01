package iterations

object Loops {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 10) {
      val y = x + 1
      println(s"y is ${y}")
      x = y
    }

    val arr = Array("Fred", "Jim", "Sheila")
    for (x <- arr) {
      println(s"x is ${x}")
    }
  }
}
