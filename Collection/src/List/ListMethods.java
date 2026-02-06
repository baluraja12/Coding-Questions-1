package List;

import java.util.ArrayList;
import java.util.Arrays;
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
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
	    
	    System.out.println(numbers);
	    
ArrayList<String> names = new ArrayList<String>(Arrays.asList("Balu", "Indhu"));
	    
	    System.out.println(names);
	}
	


}
