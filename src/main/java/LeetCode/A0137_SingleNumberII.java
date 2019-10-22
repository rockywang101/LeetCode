package LeetCode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number-ii/
public class A0137_SingleNumberII {

	// i cannot understand why. 
	public int singleNumber(int[] nums) {
		
		int seen1 = 0, seen2 = 0;
		for (int n : nums) {
			seen1 = ~seen2 & (seen1 ^ n);
			seen2 = ~seen1 & (seen2 ^ n);
		}
		return seen1;
	}
	

	// Runtime: 5 ms, faster than 33.81% of Java online submissions for Single Number II.
	// Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Single Number II.
	public int singleNumberV1(int[] nums) {

		Map<Integer, Integer> numCntMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			Integer cnt = numCntMap.get(nums[i]);
			if (cnt == null)
				numCntMap.put(nums[i], 1);
			else
				numCntMap.put(nums[i], cnt + 1);
		}

		for (Integer num : numCntMap.keySet()) {
			if (numCntMap.get(num) == 1) {
				return num;
			}

		}

		throw new RuntimeException("no matched value");
	}

}
