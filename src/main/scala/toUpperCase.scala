import scala.io.Source

object toUpperCase extends App {
    val n = args(0).toInt
    val line = Source.fromFile(args(1)).getLines.toList.flatMap(c => c.split("\\W+"))
    val upperCase = line.map(w => if (line.indexOf(w) % n == 0){w.toUpperCase } else{w} )
print(upperCase)
}


/*
    var x = 0
    for(word <- line){
        var mod:Int  = x % n
        if(mod == 0 ){
            println(word.toUpperCase())
        }
        else{
            println(word)
        }
        x = x +1

 */



