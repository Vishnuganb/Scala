package Tutorial2_20001932

object Q4_b{

  def attendees(price:Int):Int=120+(15-price)/5*20
  def revenue(price:Int):Int = attendees(price)* price
  def cost(price:Int):Int=500+attendees(price)*3
  def profit(price:Int):Int = revenue(price)- cost(price)

  def main(args:Array[String]): Unit ={
    print(profit(5), profit(10), profit(15), profit(20))
  }

}

// if ticket price is 10 rs so ticket price is decreased by 5 rs so 20 more attendees come to saw the performance
// In the revenue part attendees multiply by price of one ticket
