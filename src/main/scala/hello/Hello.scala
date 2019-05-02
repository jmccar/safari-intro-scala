package hello

object Hello {
  // Array is a class type
  // variables (and methods) are typed AFTER
  // their names using a colon separator
  // generic types use square brackets
  // (Arrays use round parens!!! NOT square brackets!!
  // "Unit" expression (has a value) equivalent-ish to void
  // Unit is a singleton, with the literal value ()
  // equals = carries idea that left and right are substitutable
  // blocks ARE EXPRESSIONS
  // RHS of fn def is an expression! (block is optional)
  def main(args: Array[String]): Unit = {
//    val x: Int = 99
    // IntelliJ uses Control Q to show inferred type
    // Scala is strongly, statically typed
    val x = 99 // val is "final" (kinda immutable) so must be initialized
//    x = 100
    var y:Double = 100
    y = 200 // var can be reassigned (minimize use for good style!)
    val p = 3.141

//    val names:Array[String] = Array[String]("Fred", "Jim", "Sheila")
    val names = Array("Fred", "Jim", "Sheila")
//    val names = Array.apply("Fred", "Jim", "Sheila")
    println(names(0)) // array access with parens, not []
//    println(names.apply(0)) // array access with parens, not []
    names(0) = "Albert"
//    names.update(0, "Albert")
    println(names(0))

    println(s"hello, my name is ${names(0).toUpperCase}")
  }
}
