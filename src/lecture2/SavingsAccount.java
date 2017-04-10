public class SavingsAccount extends Account{
	private double debit;
	private int passTime;
	private double interest;
	private double month;
	
	
	@Override
	public void debit(double m){
		balance -= m;
		
	}
	public double getWithdrawableAccount(double m){
	
		return m*Math.pow(1+interest,month);
		
	}
	public int passTime()
	
}