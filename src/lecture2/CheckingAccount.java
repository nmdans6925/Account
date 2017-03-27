package lecture2;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double m, double limit, double in, double loan){
		super(m);
		setBalance(m);
		credit_limit = limit;
		interest = in;
		loan_interest = loan;
		
	}
	
	public void nextMonth(){
		if(balance >= 0){
			balance += balance * interest;
		}else{
			balance += balance * loan_interest;
			}
		}

	}

    public double getWithdrawableAccount(){
    	return balance + credit_limit;
    	
    }
    passTime(int){
    }
    

	
	@Override
	public int debit(double m){
		balance -= m;
	}
}


