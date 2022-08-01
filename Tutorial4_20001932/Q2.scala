package Tutorial4_20001932

object Q2 {

  def patternMatch(x:Int): Unit = x match {
    case x if x<=0 => println("Negative/Zero")
    case x if x%2==0 => println("Even number is given")
    case _ => println("Odd number is given")
  }

  def main(args:Array[String]): Unit ={

    print("Enter the number : ")
    var x = scala.io.StdIn.readInt()

    patternMatch(x)

  }

}
