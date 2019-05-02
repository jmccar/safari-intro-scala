package exceptions

import java.sql.SQLException

import scala.util.{Failure, Success, Try}

object UseExceptions2 {
  def doStuff:String = {
    if (math.random > 0.5) throw new SQLException else "Hello"
  }
  def main(args: Array[String]): Unit = {
    val result = Try(doStuff)
    result match {
      case Success(value) => println(s"It worked, produced ${value}")
      case Failure(exception) => println(s"It broke: ${exception.getMessage}")
    }
  }
}
