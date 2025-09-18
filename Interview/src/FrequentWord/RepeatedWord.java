package FrequentWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWord {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "Mango", "apple", "banana", "banana");
	
	Map<String, Integer> wordCount = new HashMap<>();
	
	for(String word : words) {
		
		wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
		
	}    
    for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
    	System.out.println(entry.getKey()+ " = " + entry.getValue());
    }
    
    String letter = "ababsbaabsbbb";
    
    int count = 0;
    int count1 = 0;
    int count2 = 0;
    
    for(int i= 0; i<letter.length(); i++) {
    	char ch = letter.charAt(i);
    	
    	if(ch == 'a') {
    		count++;
    	}else if(ch == 'b') {
    		count1++;
    		
    	}else if (ch == 's') {
			count2++;
		}
    	
    }
    System.out.println("string : " + letter);
	System.out.println("Count of a :" + count);
	System.out.println("Count of b :" + count1);
	System.out.println("Count of c :" + count2);

    
    
}
	
}
