package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Removeduplicate {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,3,5);
		
		List<Integer> unique= nums.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(unique);
	}

}
