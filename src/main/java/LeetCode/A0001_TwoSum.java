package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class A0001_TwoSum {
    
	public int[] twoSum(int[] nums, int target) {

		for (int i=0; i<nums.length; i++) {
			
			int num1 = nums[i];
			for (int j=i+1; j<nums.length; j++) {
				
				int num2 = nums[j];
				int sum = num1 + num2;
				if (sum == target)
					return new int[] {i, j};
			}
		}

		throw new RuntimeException("no matched nums");
    }

	public int[] twoSumV2(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++)
			map.put(nums[i], i);
		
		for (int i=0; i<nums.length; i++) {
			
			int diff = target - nums[i];
			if (map.containsKey(diff) && map.get(diff) != i)
				return new int[] {i, map.get(diff)};
		}

		throw new RuntimeException("no matched nums");
    }
	
	public static void main(String[] args) {
		
		int[] nums = new int [] {2, 7, 11, 5};
		int target = 9;
		
		int[] result = new A0001_TwoSum().twoSum(nums, target);

		System.out.println(result[0] + " " + result[1]);
	}
    
    
}
