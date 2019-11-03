package LeetCode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A0283_MoveZeroesTest {

	@Test
	public void testMoveZeroes() {
		
		A0283_MoveZeroes obj = new A0283_MoveZeroes();
		
		int[] nums = {0, 1, 0, 3, 12};
		obj.moveZeroes(nums);
		assertArrayEquals(new int[] {1, 3, 12, 0, 0}, nums);
		
	}
}
