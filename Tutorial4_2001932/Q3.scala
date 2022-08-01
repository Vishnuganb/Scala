package Tutorial4_2001932

object Q3 {

  def main(args:Array[String]): Unit ={

    def toUpper(x:String):String ={
      x.toUpperCase
    }
    def toLower(x:String):String ={
      x.toLowerCase
    }

    def formatNames(name: String, format: String => String): String ={
      
     format(name)

    }

    println(formatNames("Benny ",toUpper))
    print(formatNames("Niroshan ".slice(0,2),toUpper))
    println(formatNames("Niroshan ".slice(2,8),toLower))
    println(formatNames("Saman ",toLower))
    print(formatNames("Kumara ".slice(0,1),toUpper))
    print(formatNames("Kumara ".slice(1,5),toLower))
    println(formatNames("Kumara ".slice(5,6),toUpper))

  }

}

//    def formatNames(name: String, format: String => String): String = {
//      format(name)
//    }
//    println(formatNames("Benny", toUpper))
//    println(formatNames("Niroshan", toLower))
//    println(formatNames("Saman", toUpper))
//    println(formatNames("KumarA", toLower))