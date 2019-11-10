package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A0217_ContainsDuplicate {

	// Runtime: 4 ms, faster than 97.09% of Java online submissions for Contains Duplicate.
	// Memory Usage: 41.7 MB, less than 98.28% of Java online submissions for Contains Duplicate.
	public boolean containsDuplicate(int[] nums) {
		
		Arrays.sort(nums);
		
		for (int i=0; i<nums.length-1; i++) {
			
			if (nums[i] == nums[i+1])
				return true;
		}
		
		return false;
	}
		
	
	// Runtime: 9 ms, faster than 57.75% of Java online submissions for Contains Duplicate.
	// Memory Usage: 44 MB, less than 62.07% of Java online submissions for Contains Duplicate.
	public boolean containsDuplicateV1(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int num : nums) {
			
			if (map.containsKey(num))
				return true;
			
			map.put(num, 0);
		}
		
		return false;
    }
}
