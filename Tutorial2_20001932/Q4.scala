package Tutorial2_20001932

object Q4 {
  def bookPrice(x:Int):Double=x*24.95
  def discount(amount:Double):Double= amount*.4
  def shippingCost(x:Int):Double=3*x+(x-50)*.75
  def totalCost(x:Int):Double=bookPrice(x)-discount(bookPrice(x))+shippingCost(x)

  def main(arg: Array[String]): Unit ={

    println("Total cost of books is = "+totalCost(60))

  }

}
