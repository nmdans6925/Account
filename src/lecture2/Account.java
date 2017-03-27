package lecture2;

public abstract class Account {
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
 
 public int debit(double m){
  balance -= m;
  return 0;
 }
 
 public abstract double getWithdrawableAccount();
 public abstract void passTime(int month);
 
}
 
