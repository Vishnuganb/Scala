package Tutorial4_2001932

object Q1 {

  def main(args:Array[String]): Unit ={

    print("Enter the amount of deposit : ")
    var x = scala.io.StdIn.readDouble()

    if (0<= x && x<=20000) println("Interest is = "+ .02*x)
    else if(20000< x && x<=200000) println("Interest is = "+ .04*x)
    else if(200000< x && x<=2000000) println("Interest is = "+ .035*x)
    else  println("Interest is = "+ .065*x)
  }

}
