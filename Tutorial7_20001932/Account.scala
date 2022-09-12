package Tutorial7_20001932

class Account(id:String,n:Int,b:Double) {
  val nic: String = id
  val acnumber:Int = n
  var balance:Double = b

  def withdraw(amount:Double) = this.balance = this.balance - amount
  def deposit(amount:Double) =  this.balance = this.balance + amount
  def transfer( amount : Double , that : Account ): Unit = {
    this.balance =  this.balance - amount
    that.balance = that.balance + amount
  }
  def getBalance: Double = balance;


  // override def toString = "["+nic+":"+acnumber+":"+balance+"]"
  //@Override
  override def toString = "NIC : " + this.nic + " Account Number : " + this.acnumber + " Balance : " + this.balance
}
