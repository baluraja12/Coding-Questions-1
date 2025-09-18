package exceptions;

public class ArthimeticException {
	public static void main(String[] args) {
		
	
	try {
	int a = 10;
	
	int b = 0;
	
	int c = a/b;
	
	System.out.println(c); 
	}catch(ArithmeticException exception){
		exception.printStackTrace();
		
	}
	
	System.out.println(10);

}
}