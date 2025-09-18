package ReverseString;


public class ReverseAString {

	public static void main(String[] args) {

		String name = "balu abdullah rajasekhar";
		
		for (int i= name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
			
		}
		System.out.println(" ");
		String s = new StringBuilder(name).reverse().toString();
		System.out.println(s);
		
		
		String[] s1 = name.trim().split("\\s");
		int words = s1.length;
		System.out.println(words);
		
		
		String[] s2 = name.trim().split("\\s+");	
		
		StringBuilder word = new StringBuilder();
		 for(String eachWord : s2 ) {
			 
			 word.append(Character.toUpperCase(eachWord.charAt(0)))
			     .append(eachWord.substring(1).toLowerCase())
			     .append(" ");
		 }
		 
		 System.out.println(word);
	
	}

}
