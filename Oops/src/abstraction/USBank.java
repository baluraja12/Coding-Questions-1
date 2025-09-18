package abstraction;

public interface USBank {
	
	int min_bal = 100;
	
	public void debit();
	
	public void credit();
	
	public void tranferMoney();
	
	
	
	
	//In interface there is no method body only method declaration or method prototype
	//We cann't be create a object of an interface and interface cannot be instantiate
    //No static method but variables are by default static nature
	//I cann't create a object of an interface but I can create a reference  of an interface
	//Abstraction - 100%
	// Multiple inheritance we can achieve
}
