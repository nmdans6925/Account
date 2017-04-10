package lecture2;

public abstract class Account implements Valuable {
 protected double balance;

 public Account(double m){
  balance = m;
 }

 public double getBalance(){
  return balance;
 }
 
 protected void setBalance(double m){
  balance = m;
 }
 
 public void credit(double m){
  balance += m;
 }
 
 public void debit(double m)throws Exception{
  balance -= m;
 }
 
 public abstract double getWithdrawableAccount();
 public abstract void passTime(int month);
 
}
 
