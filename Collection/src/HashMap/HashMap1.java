package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		  HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("India", "New Dehli");
		    capitalCities.put("Austria", "Wien");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("Norway", "Oslo"); // Duplicate
		    capitalCities.put("USA", "Washington DC");

		    System.out.println(capitalCities); 
		    
		    for(String s : capitalCities.keySet()) {
		    	System.out.println("key :" + s + " Value : " + capitalCities.get(s));
		    }
		  }
	

}
