package exceptions

object PassByName {
  def useThis(x: => String):Unit = {
    println("During")
    if (math.random() > 0.5) {
      println(s"Evaluated x to ${x}")
    } else {
      println("Feeling lazy")
    }
  }

  def theString: String = {
    println("Calculating the string...")
//    "the String!"
    throw new IllegalArgumentException();
  }

  def main(args: Array[String]): Unit = {
    println("Before")
    useThis(theString)
    println("After")
  }
}
