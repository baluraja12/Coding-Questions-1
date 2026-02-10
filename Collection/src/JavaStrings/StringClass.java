package JavaStrings;

public class StringClass {

	public static void main(String[] args) {

		String s = " welcome to java coding ";
		String s1 = "welcome to java coding ";
		
		System.out.println("length of a given string is : " + s.length());
		
		System.out.println(s.toUpperCase());
		System.err.println(s.toLowerCase());
		
		
		System.out.println(s.indexOf("java"));
		
		System.out.println(s.charAt(0));
		
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.trim());
		
		System.out.println(s.concat(s1));
	}

}
