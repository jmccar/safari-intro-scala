package caseclasses

object UseAuto {
  def main(args: Array[String]): Unit = {
    val a = Automobile("Red", 6.7)
    val b = Automobile("Red", 6.7)
    println(s"a is ${a}")
    println(s"a == b ${a == b}")

    a match {
//      case x:Automobile => println(s"x is automobile color is ${x.color}")
      case Automobile(color, fuel) =>
        println(s"x is automobile color is ${color}, fuel is ${fuel}")
    }
  }
}
