package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class OddAndEven {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(1,1,2,3,2,3,4,5,5,5,2,3,4,5,6,7,2,3,4,5,6);
		
		Map<Boolean, List<Integer>> evenAndOdd = listOfIntegers.stream()
		.collect(Collectors.partitioningBy(i->i%2==0));
				
		List<Integer> oddNumber = evenAndOdd.get(false);
		List<Integer> Even = evenAndOdd.get(true); 
		
		System.out.println("Even numbers :" + Even);
		System.out.println("Odd numbers :" + oddNumber);
		
		List<Integer> distinct = listOfIntegers.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("Distinct number in given array: " +distinct);
		
			
		Map<Integer, Long> frequency = listOfIntegers.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequecy of numbers :" + frequency);
		
	}

}
