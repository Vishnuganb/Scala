package Tutorial7_20001932

class Rational(x:Int,y:Int){

  private def gcd(a:Int,b:Int):Int ={
    if(b==0) a else  gcd(b,a%b)
  }

  def numer = x/gcd(math.abs(x),y)
  def denom = y/gcd(math.abs(x),y)


  def neg = new Rational(-this.numer,this.denom) // Question 1

  def +(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom,  this.denom * r.denom)
  def -(r:Rational) = this + r.neg

  override def toString = numer + "/" + denom

}
