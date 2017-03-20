public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double e, double limit, double in, double loan){
		super (e);
		setBalance(e);
		this.credit_limit = limit;
		this.interest = in;
		this.loan_interest = loan;
	}
	                 
	@Override
	public double credit(double e){
		return credit += e
	}
	public void debit(double e){
		return debit -= e
	}
	public 
}