public class Account {
 private double balance;

 public Account(double e){
  balance = e;
 }
 
 public double getMoney(){
  return balance;
 }
 
 public void setMoney(double e){
  balance = e;
 }
 
 public void add(double m){
  balance += e;
 }
 
 public void withdraw(double m){
  balance -= e;
 }
}