package Encapsulation;

public class Employee {
	//It is a part of Oops concept
	//Wrapping methods and data in a single unit like capsule
	//Also we can call t as  Data hiding
	//Here we use private variable and public setter and getters 
	//Only we can access the data from the inside class out side class we cann't access 
	//For security purpose we use 
	
	private String EmpName;
	private String EmpAge;

	
	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public String getEmpAge() {
		return EmpAge;
	}


	public void setEmpAge(String empAge) {
		EmpAge = empAge;
	}


	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpName("Balu");
		emp.setEmpAge("27");
		
		System.out.println("Employee name is: "+emp.getEmpName());
		System.out.println("Employee age is: "+emp.getEmpAge());
	}
	
	
	

}
