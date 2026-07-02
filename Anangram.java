package practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anangram {

	public static void main(String[] args) {

		
		String str1 = "Listen";
		String str2 = "silent ";
		
		System.out.println(isAnangram(str1, str2));
	}

	private static boolean isAnangram(String str1, String str2) {
		
		Map<Character, Long> map1= str1.toLowerCase()
		.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()));
		
		
		Map<Character, Long> map2 =str2.toLowerCase()
		.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()));
		return map1.equals(map2);
	}

}
