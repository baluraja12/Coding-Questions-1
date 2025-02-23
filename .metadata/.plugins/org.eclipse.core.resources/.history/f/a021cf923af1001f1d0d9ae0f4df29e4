package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeUnsortedArray {

	public static void main(String[] args) {
		List<Integer> a1 = Arrays.asList(1, 2, 3, 4, 5, 2, 4);
		List<Integer> a2 = Arrays.asList(6, 4, 7, 8, 9, 0, 3);

		List<Integer> MergeTwoarrays = Stream.concat(a1.stream(), a2.stream()).distinct().sorted()
			//	.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Merging the two sorted array :" + MergeTwoarrays);	

//		List<String> cartesianProduct = a1.stream()
//                .flatMap(i -> a2.stream()
//                                 .map(j -> "(" + i + ", " + j + ")"))
//                .collect(Collectors.toList());
		
		List<String> pairs = a1.stream().flatMap(i->a2.stream().map(j->"("+i+","+j+")"))
				.collect(Collectors.toList());
		pairs.forEach(System.out::println);
		
		for (String s : pairs) {
			System.out.println("pairs of two arrays are: " +s);
			
		}
	      
	}

}
