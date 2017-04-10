package lecture2;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	
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
	public void debit(double m) throws Exception{
		
		if(balance+credit_limit < m){
			throw new Exception("한도초과");
		}
		else{
			balance -= m;
		}
			
	}

	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void passTime(int month) {
		// TODO Auto-generated method stub
		
	}
}


