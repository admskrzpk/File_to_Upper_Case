import scala.io.Source

object toUpperCase extends App {
    val n = args(0).toInt
    val line = Source
      .fromFile(args(1))
      .getLines
      .flatMap(c => c.split("\\W+"))
      .zipWithIndex
      .map(w => if (w._2 % n ==0) {w._1.toUpperCase} else w._1 )
.foreach(println)
}