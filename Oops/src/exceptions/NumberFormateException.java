package exceptions;

public class NumberFormateException {

	public static void main(String[] args) {
try {
	String s = "1224ghhv";
	
	int y = Integer.parseInt(s);
	System.out.println(y);
} catch (NumberFormatException e) {
	// TODO: handle exception
	e.printStackTrace();
}
		System.out.println(100);
	}

}
