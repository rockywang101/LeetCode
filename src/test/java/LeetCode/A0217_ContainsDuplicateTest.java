package LeetCode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A0217_ContainsDuplicateTest {

	@Test
	public void testContainsDuplicate() {
		
		A0217_ContainsDuplicate obj = new A0217_ContainsDuplicate();
		int[] nums;
		
		nums = new int[] {1, 2, 3, 1};
		assertTrue(obj.containsDuplicate(nums));
		
		nums = new int[] {1,1,1,3,3,4,3,2,4,2};
		assertTrue(obj.containsDuplicate(nums));
		
		nums = new int[] {1, 2, 3, 4};
		assertFalse(obj.containsDuplicate(nums));
		
	}
}
