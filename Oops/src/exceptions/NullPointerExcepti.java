package exceptions;

public class NullPointerExcepti {
	static NullPointerExcepti n1;
	int x = 10;

	public static void main(String[] args) {
    
		
		try {
			System.out.println(n1.x);

			
		} catch (NullPointerException e) {
		e.printStackTrace();	

		}
		
	}

}
