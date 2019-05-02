package uselists

import scala.annotation.tailrec

object Ex2 {
//  @tailrec !!!! NOT IN THIS CASE
  def map[T, U](list: List[T])(op: T => U): List[U] = list match {
    case Nil => Nil
    case h :: t => op(h) :: map(t)(op)
  }

  @tailrec
  def showAll[T](list: List[T]): Unit = list match {
    case Nil =>
    case h :: t => println(h) ; showAll(t)
  }

  def main(args: Array[String]): Unit = {
    val names = 99 :: "Fred" :: 3.14 :: "Jim" :: "Sheila" :: Nil

    showAll(names)
//    showAll(map(names, (n: String) => n.toUpperCase))
    val justNames = "Fred"::"Jim"::"Sheila"::Nil
    val op: String => String = n => n.toUpperCase
    showAll(map(justNames)(n => n.toUpperCase))

    justNames
      .map(s => s.toUpperCase()) // Functor
      .foreach(s => println(s"> $s"))

//    val doStuff: (String, Int) => Int = (s, i) => s.length + i
    val doStuff: (String, Int) => Int = _.length + _

    justNames map (_.toUpperCase) foreach println

//      .foreach(println(_))
//      .foreach(x => println(x))
//      .foreach(x => println(s"> ${x}"))

    // flatMap is key "monad" behavior
    justNames flatMap (s => s.toCharArray) foreach println
  }
}
