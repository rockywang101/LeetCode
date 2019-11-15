package LeetCode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class A0001_TwoSumTest {

	@Test 
	public void testTwoSum() {
		
		int[] nums = new int [] {2, 7, 11, 5};
		int target = 9;
		
		int[] result = new A0001_TwoSum().twoSum(nums, target);
		
		assertArrayEquals(new int[] {0, 1}, result);
	}
	
}
