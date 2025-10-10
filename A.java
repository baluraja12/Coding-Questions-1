package hashset;


public class A {

	private static long count2;

	public static void main(String[] args) {
		String str = "My name is Balu, Currectly I'm working in TCS";
		
		String lowerStr = str.toLowerCase();
		
		System.out.println(lowerStr);
		
		
		int count = 0;
		
		for(int i = 0; i<lowerStr.length(); i++) {
			if(lowerStr.charAt(i) == 'm') {
				count++;
			}
		}
		
		System.out.println("Count of letter m is : " +count);
		
		
		
	long count1 = str.toLowerCase()
		   .chars()
		   .filter(ch-> ch == 'm')
		   .count();
  System.out.println(count1);
  
     String reverse = "";
     
     for(int i = str.length()-1; i>=0; i--) {
    	 //reverse += str.charAt(i);
    	 reverse = reverse+ str.charAt(i);
     }
     System.out.println(reverse);
	}

}
