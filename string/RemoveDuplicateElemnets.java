package string;

import java.util.stream.Collectors;

public class RemoveDuplicateElemnets {

	public static void main(String[] args) {
		String s = "programming";
		
//		String result = s.chars()
//		.distinct()
//		.mapToObj(c->String.valueOf((char) c))
//		.collect(Collectors.joining());
//		System.out.println(result);
//	}
		
		String distinct = s.chars()
		.distinct()
		.mapToObj(c->String.valueOf((char) c))
		.collect(Collectors.joining());
		
		System.out.println(distinct);
	}
}
