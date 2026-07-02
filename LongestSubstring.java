package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String str = "abcabbcacc";
		
		System.out.println(longestSubString(str));
	}
	
	public static String longestSubString(String str) {
		
		Set<Character> s = new HashSet<Character>();
		
		int left = 0;
		int maxLength = 0;
		int start = 0;
		
		for(int right = 0; right<str.length(); right++) {
			
			while(s.contains(str.charAt(right))) {
				s.remove(str.charAt(left));
				left++;
			}
			
			s.add(str.charAt(right));
			
			if(right-left+1 > maxLength) {
				maxLength = right-left+1;
				start = left;
			}
			
		}
		
		
		
		return str.substring(start, start+maxLength);
		
	}
}
