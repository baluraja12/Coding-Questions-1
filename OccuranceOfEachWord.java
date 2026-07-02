package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachWord {
  public static void main(String[] args) {
	String str = "Java is easy and Java is powerful";
	
	   Map<String, Long> word= Arrays.stream(str.split(" "))
	    .collect(Collectors.groupingBy(
	    		Function.identity(),
	    		Collectors.counting()));
	   
	   System.out.println(word);
}
}
