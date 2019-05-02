package exceptions

import java.sql.SQLException

object UseExceptions {
  def doStuff():Unit = if (math.random() > 0.5) throw new SQLException("Bad db")

  def main(args: Array[String]): Unit = {
    try {
      doStuff()
    } catch {
      case x: SQLException => println("DB broke!")
      case x: Throwable => println(s"That broke with ${x.getMessage}")
    }
  }

}
