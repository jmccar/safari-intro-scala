package uselists

object Ex1 {
  def :#: (s:String) : String = "hahaha " + s

  def ++++ (s: String) : String = "blahbhal" + s

  def doStuff(s: String) : String = "what?" + s

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim","Sheila")
    println(s"names is: ${names}")
    names match {
      case List(a, b, c) =>
        val toPrint = s"List with three elements, ${a}, ${b}, and ${c}"
        println(toPrint)
    }

    val moreNames = "Albert" :: "Alice" :: names
//    val moreNames = names.::("Alice").::("Albert")
//
//    println(Ex1.:#:("Freddy"))
//    println("Freddy" :#: Ex1)
//    println(Ex1 ++++ "Fred")
//    println(Ex1 doStuff "Fred")

    moreNames match {
      case head :: tail => println(s"head is ${head}, tail is ${tail}")
    }
  }
}
