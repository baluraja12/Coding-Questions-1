package OddAndEven;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "silent";
	    String s2 = "listen";
	    
	    System.out.println("This given string are anagram : " +isAnagram(s1, s2));
	}    
	   public static boolean isAnagram(String s1 , String s2) {
		   if(s1.length()!=s2.length()) return false;
		   
		   
		   Map<Character, Integer> map = new HashMap<Character, Integer>();
		   
		   
		   //Count the each char in s1
		   for(char ch : s1.toCharArray()) {
			   map.put(ch, map.getOrDefault(ch, 0)+1);
		   }
		   
		   //reduce the count using s2
		   
		  
		   for(char ch : s2.toCharArray()) {
			   if(!map.containsKey(ch)) {
				   return false;
			   }
			   map.put(ch, map.get(ch)-1);
			   
			   if(map.get(ch)==0) {
				   map.remove(ch);
			   }
			   
		   }
		   return map.isEmpty();
	   }  
	}


