package Tutorial2_20001932

object Q4_a{
  def normalSalary(hours:Int):Int=hours*250
  def overTime(hours:Int):Int=hours*85
  def income(h1:Int,h2:Int):Int=normalSalary(h1)+overTime(h2)
  def tax(income:Double):Double=income*.12
  def totalSalary(h1:Int,h2:Int):Double= income(h1,h2)-tax(income(h1,h2))

  def main(args:Array[String]): Unit ={
    println("Salary for 40 hours normal work time and 30 hours Over time = "+totalSalary(40,30))
  }

}


