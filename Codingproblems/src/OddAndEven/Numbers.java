package OddAndEven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Numbers {

	public static void main(String[] args) {
		   
//		   int num = 100;
//		   
//		   for(int i = 0; i<=num; i++) {
//			   
//			   if(i%2==0) {
//				   System.out.println("Even numbers are : " + i);
//			   }
//			   else
//				   System.out.println("The Odd number are : " + i);
//			   
//		   }  
		
		List<Integer> listOfIntegers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		Map<Boolean, List<Integer>> result = listOfIntegers.stream()
		              .collect(Collectors.partitioningBy(num->num%2==0));
		
		List<Integer> even = result.get(true);
		List<Integer> odd = result.get(false);
		
		System.out.println("List of even numbers : " +even);
		System.out.println("List of odd numbers : " +odd);
		
		   
	}

}
