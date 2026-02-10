package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Balu");
		ar.add("Indhu");
		ar.add("Rajasekhar");
		ar.add("Lakshmipathi");
		
	
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("----");
		
		ar.stream().forEach(ele-> System.out.println(ele));
		
		System.out.println("----");
      
	    Iterator<String> it = ar.iterator();
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(20,10,50,40));
	    
	    System.out.println(numbers);
	    
	    System.out.println("----");

	    Collections.sort(numbers);
	    for(Integer in : numbers) {
	    	System.out.println(in);
	    }
	    
ArrayList<String> names = new ArrayList<String>(Arrays.asList("Balu", "Indhu"));
	    
	    System.out.println(names);
	    
	    System.out.println("------");

	    
	   // Collections.sort(ar);
	    
	    Collections.sort(ar, Collections.reverseOrder());
	    
	    for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	  
	    System.out.println("-----");

	    
	    ar.set(0, "Opel");
	    System.out.println(ar);

     ar.remove(0);
     System.out.println(ar);

	
	}
}
