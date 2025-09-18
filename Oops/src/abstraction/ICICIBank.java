package abstraction;

public class ICICIBank implements USBank, RBI{

	
	//RBI 
	@Override
	public void educationLoan() {
		// TODO Auto-generated method stub
		System.out.println("ICICI education loan");
		
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println("ICICI home loan");
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("ICICI car loan");
		
	}

	//US Bank
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI debit money");
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("ICICI credit money");
		
	}

	@Override
	public void tranferMoney() {
		// TODO Auto-generated method stub
		System.out.println("ICICI tranfer money");
		
	}

	@Override
	public void trading() {
		// TODO Auto-generated method stub
		System.out.println("ICICI trading money");
		
	}
	
	//ICICI Bank
	
	public void mutualFunds() {
		System.out.println("ICICI- mutual funds");
	}
	
	public void insurance() {
		System.out.println("ICICI-insurance");
	}

}
