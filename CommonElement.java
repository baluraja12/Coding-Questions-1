package hashset;

import java.util.*;


public class CommonElement {

	private static HashSet<Integer> set;

	public static void main(String[] args) {
   List<List<Integer>> listOfElements = new ArrayList<List<Integer>>();
      listOfElements.add(Arrays.asList(1,2,3,4));
      listOfElements.add(Arrays.asList(2,3,5,6));
      listOfElements.add(Arrays.asList(2,7,8));
      
      
      System.out.println(listOfElements);
      
      Set<Integer> commonElements = new HashSet<>(listOfElements.get(0));
      
      System.out.println(commonElements);
      
      for(int i = 0; i<listOfElements.size(); i++) {
    	  commonElements.retainAll(new HashSet<>(listOfElements.get(i)));
    	  
    	//  System.out.println(commonElements);
      }
    //  System.out.println(commonElements);
      
      
     Set<Integer> commonElement1 =  listOfElements.stream().skip(1)
    		                                      .collect(()-> new HashSet<Integer>(listOfElements.get(0)), 
    		                                    		  (set, list)-> set.retainAll(list), 
    		                                    		  (set1, set2)-> set1.retainAll(set2));
                                   System.out.println(commonElement1);
                   
	}
	
//	
//	1️⃣ listOfElements.stream()
//
//	Converts the list of lists into a Stream of lists.
//
//	Streams allow us to process collections in a functional style, e.g., map, filter, collect.
//
//	Each element in the stream is a List<Integer>.
//
//	2️⃣ .skip(1)
//
//	Skips the first list in the stream.
//
//	Reason: we’ll use the first list as the starting point for intersection.
//
//	Example:
//
//	listOfElements = [[1,2,4], [4,3,2], [2,5,6]]
//	skip(1) → [[4,3,2], [2,5,6]]
//
//	3️⃣ .collect(...)
//
//	Collect is used to accumulate stream elements into a single result.
//
//	Here, we provide 3 functions: supplier, accumulator, combiner.
//
//	a) Supplier: () -> new HashSet<>(listOfElements.get(0))
//
//	Creates the initial container for collecting results.
//
//	We start with the first list converted to a HashSet: {1,2,4}
//
//	HashSet is used because:
//
//	It stores unique elements
//
//	Supports retainAll() for intersection
//
//	b) Accumulator: (set, list) -> set.retainAll(list)
//
//	This is applied for each remaining list in the stream.
//
//	set → the current set of common elements
//
//	list → the next list from the stream
//
//	set.retainAll(list) → keeps only elements that are in both
//
//	Example iteration:
//
//	set = {1,2,4}, list = [4,3,2] → set.retainAll(list) → {2,4}
//
//	set = {2,4}, list = [2,5,6] → set.retainAll(list) → {2}
//
//	c) Combiner: (set1, set2) -> set1.retainAll(set2)
//
//	Used only for parallel streams (streams processed in multiple threads)
//
//	Combines two partial results (set1 and set2) into one set containing common elements.
//
//	In this example (sequential stream), it won’t be called, but it’s required for collect() syntax.
//
//	4️⃣ Final Result
//
//	commonElements → a Set<Integer> containing all numbers that are present in every list
//
//	In our example:
//
//	commonElements = [2]
//
//	💡 Summary in Simple Words
//
//	Start with the first list as a HashSet.
//
//	Go through each remaining list.
//
//	Keep only the numbers that appear in both sets (retainAll).
//
//	At the end, you get the intersection of all lists.

}
