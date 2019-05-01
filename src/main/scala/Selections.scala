object Selections {
  def main(args: Array[String]): Unit = {
    // if is an expression

    // x = (booleanExpr) ? 99 : 100 -- C style "Ternary" operator

    val x: String = if (math.random() > 0.5) "Fred" else "Albert"
    println(s"x is $x")

    val y = {
      println("I'm executing a block...")
      (math.random * 100)
      200
    }
    println(s"y is ${y}")

    val x2 = if (math.random() > 0.5) {
      math.random()
    } else
      "Albert"

    // everything is an object
//    2.+(2)

    val xx = ()

    if (math.random() > 0.5)
      println("largish")
    else
      println("smallish")

    println(s"xx (Unit) is ${xx}")

    val s:Any = 123
    val fromMatch = s match {
      case "Hello" => println("Matched Hello")
        99
      case "Goodbye" => println("Matched Goodbye") ; 365
//      case _ => -1
      case x:String => println(s"matched ${x}") ; 1234
      case x:Int => println(s"Got a number ${x}") ; x * x
      case x => println(s"unknown data type ${x}"); -1
    }
    println(s"fromMatch is ${fromMatch}")
  }
}
