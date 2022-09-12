package Tutorial7_20001932

object Application_Q3 extends App {

  var acc1 = new Account("997256123V", 1, 10000);
  var acc2 = new Account("996542753V", 2, 20000);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);

  println("Transfer 1000 from Account 1 to Account 2");
  acc1.transfer(1000, acc2);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);




}
