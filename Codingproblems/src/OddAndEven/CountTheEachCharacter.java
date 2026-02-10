package OddAndEven;

import java.util.HashMap;
import java.util.Map;

public class CountTheEachCharacter {

	public static void main(String[] args) {

		String s = "programming";
		
		Map<Character, Integer> freEach = new HashMap<Character, Integer>();
		
		for(char ch : s.toCharArray()) {
			freEach.put(ch, freEach.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(freEach);
	}
	

}
