//package lecture2;
/*import java.util.Scanner;

public class AccountTest {
 
 public static void main(String[] args){
  Account account1 = new Account(50);
  Account account2 = new Account(0);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account1 balance : $%.2f\n", account2.getMoney());
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter withdrawal amount for account1: ");
  double withdraw1 = sc.nextDouble();
  
  account1.withdraw(withdraw1);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account1 balance : $%.2f\n", account2.getMoney());
  

  System.out.printf("Enter withdrawal amount for account2: ");
  double withdraw2 = sc.nextDouble();
  
  account2.withdraw(withdraw2);
  
  if(account2.getMoney() < 0){
   System.out.println("Debit amount exceeded account balance");
   account2.setMoney(0);
  }
  
  System.out.printf("account1 balance : $%.2f\n", account1.getMoney());
  System.out.printf("account1 balance : $%.2f\n", account2.getMoney());
 }

}
*/

import java.util.Scanner;
public class AccountTest{
	public static void main(String args[]){
		Account account1 = new CheckingAccount(100.50.0.01.0.07);
		Account account2 = new SvaingAccount(100.0.05);
		
		//CheckingAccount
		Scanner scan = new Scanner(System.in;
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1:");;
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n",account1.getBalance(),account1.getWithdrawableAccount());
		
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account1.getBalance(),accont1.getWithdrawableAccount());
		
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account1.getBalance().account1.getWithdrawableAccount());
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account2.getBalance(),account2.getWithdrawableAccount());
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");;
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account2.getBalance(),account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t������ݰ��ɾ�: %.2f \n", account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t����Ǯ�ݰ��ɾ�: %.2f \n", account2.getBalance().account2.getWithdrawableAccount());
	}
}
		
	}
}
 

