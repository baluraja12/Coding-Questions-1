package arrays;

import java.util.*;
import java.util.Collections;

public class DecendingOrder {

	public static void main(String[] args) {
           Integer array[] = {1,2,3,4,5,1,3,7};
           
           Arrays.sort(array, Collections.reverseOrder());
           System.out.println(Arrays.toString(array));
           
           Arrays.sort(array, (a,b)-> b-a);
           System.out.println(Arrays.toString(array));
           
           Integer[] sortedarray = Arrays.stream(array)
           .sorted((a,b)-> b-a)
           .toArray(Integer[]::new);
           
           System.out.println(Arrays.toString(sortedarray));
	}

}
