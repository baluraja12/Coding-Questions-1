package abstraction;

public class TextBank {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();
		
		ic.educationLoan();
		ic.carLoan();
		ic.homeLoan();
		
		ic.credit();
		ic.debit();
		ic.tranferMoney();
		ic.trading();
		
		ic.mutualFunds();
		ic.insurance();
		
		
		System.out.println(USBank.min_bal);
		
		
		USBank us = new ICICIBank();
		
		us.credit();
		us.debit();
		us.tranferMoney();
		
	}

}
