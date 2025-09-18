package Commonelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CommonElement {
	

	public static void main(String[] args) {
		
		List<List<Integer>> elements = new ArrayList<>();
		elements.add(Arrays.asList(1,2,3));
		elements.add(Arrays.asList(2,4,3));
		elements.add(Arrays.asList(5,2,3));
		
		Set<Integer> common = new HashSet<>(elements.get(0));
		
		for(int i=1; i<elements.size();i++) {
			common.retainAll(new HashSet<>(elements.get(i)));
		}
		System.out.println(common);
	}
	
}
