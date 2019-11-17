package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A0961_NRepeatedElementInSize2NArrayTest {

	@Test
	public void test() {
		
		A0961_NRepeatedElementInSize2NArray obj = new A0961_NRepeatedElementInSize2NArray();
		
		assertEquals(3, obj.repeatedNTimes(new int[] {1, 2, 3, 3}));
		assertEquals(2, obj.repeatedNTimes(new int[] {2, 1, 2, 5, 3, 2}));
		assertEquals(5, obj.repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
	}
}
