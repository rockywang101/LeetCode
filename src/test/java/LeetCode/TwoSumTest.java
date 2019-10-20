package LeetCode;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TwoSumTest {

	// [2,7,11,15]		9
		
	@Test public void testTwoSum() {
		
		int[] nums = new int [] {2, 7, 11, 5};
		int target = 9;
		
		int[] result = new TwoSum().twoSum(nums, target);
		
		assertEquals(result[0], 0);
		assertEquals(result[1], 1);
	}
	
}
