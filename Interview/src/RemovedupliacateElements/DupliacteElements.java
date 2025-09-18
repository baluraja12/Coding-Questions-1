package RemovedupliacateElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupliacteElements {

	public static void main(String[] args) {
      int [] arr = {2,3,4,5,1,2,3,};
      
      Set<Integer> remove = new HashSet<>();
      
      for(int num : arr) {
    	  remove.add(num);
    	  
      }
      System.out.println(remove);
      
      
      
     int[] original = Arrays.stream(arr).distinct().boxed().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray();
      System.out.println(Arrays.toString(original));
	}
	


}
