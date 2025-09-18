package HishestScore;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HighestScore {

	public static void main(String[] args) {

		String [][] input = {
				{"Alice" , "90"},
				{"Bob", "85"},
				{"Alice", "95"},
				{"Charlie","78"},
				{"Bob","80"},
				{"Charlie","82"}
				
		};
//		System.out.println(hihestAverageScore(input));
//	}
//
//	private static int hihestAverageScore(String[][] marks) {
//		
//		Map<String, int[]> studentData = new HashMap<>();
//		
//		for(String[] entry: marks) {
//			String name = entry[0];
//			int score = Integer.parseInt(entry[1]);
//			
//			studentData.putIfAbsent(name, new int[2]);
//			
//			studentData.get(name)[0]+=score;
//			
//			studentData.get(name)[1]++;
//			
//			
//		}
//		
//		return studentData.values().
//				stream()
//				.mapToInt(arr->arr[0]/arr[1])
//				.max()
//				.orElse(0);
//	}
		
		Map<String, int[]> score = new HashMap<>();
		
		for(String[] entry : input) {
			String name = entry[0];
			int scores = Integer.parseInt(entry[1]);
			
			score.putIfAbsent(name, new int[2]);
			score.get(name)[0]+=scores;
			score.get(name)[1]++;
		}
	 score.entrySet().stream()
	                 .map(e-> new AbstractMap.SimpleEntry<>(e.getKey(), (double) e.getValue()[0]/e.getValue()[1]))
	                 .sorted((e1, e2)-> Double.compare(e2.getValue(), e1.getValue()))
	                 .forEach(e->System.out.println(e.getKey() + " = " + e.getValue()));
	 
	}

}
