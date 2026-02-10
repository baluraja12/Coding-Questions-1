package StringConcept;

public class StringClass {

	public static void main(String[] args) {

		String name = "spring boot";
		
	
		//Length of a given string
		System.out.println(name.length());
		
		//each character in a given string 
		System.out.println(name.charAt(10));
		
		//print the substring 
		System.out.println(name.substring(0, 6));
		
		System.out.println(name.equals("spring boot"));
		
		//the length should be same if the Upper or lower of the string it will ignore 
		System.out.println(name.equalsIgnoreCase("Spring Boot"));
		
		System.out.println(name.contains("spring"));
		
		System.out.println(name.replace("boot", "Cloud"));
		
		
		
	}

}
