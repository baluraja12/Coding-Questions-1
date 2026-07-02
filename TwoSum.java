package practice;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		
		int target = 6;
		
		int[] result = TwoSum(nums, target);
		
		System.out.println(result[0] + " " + result[1]);
	}

	private static int[] TwoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			int n = target - nums[i];
			
			if (map.containsKey(n)) {
				return new int[] {map.get(n), i};
				
			}
			map.put(nums[i], i);
		}
		
		return new int[] {-1, -1};	}

	
	
}
