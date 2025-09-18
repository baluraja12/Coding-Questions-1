package threads;


public class A extends Thread{
	


	public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
        	System.out.println("Main");
			
		}
        A a = new A();
        a.start();
		
	}

}
