package OddAndEven;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveTheDuplicate {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,2,4,5,6,7,2,3,5);
		
		Set<Integer> set = new HashSet<Integer>(asList);
		
		System.out.println(set);
		
		
		Set<Integer> set1 = new LinkedHashSet<Integer>(asList);
		System.out.println(set1);
		
		
		List<Integer> numbers = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(numbers);
		
		TreeSet<Integer> set3 = new TreeSet<Integer>(asList);
		System.out.println(set3);
		
		
	}

}
