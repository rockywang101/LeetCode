package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A0204_CountPrimesTest {

	@Test
	public void testV1() {
		
		A0204_CountPrimes_V1 obj = new A0204_CountPrimes_V1();

		assertEquals(4, obj.countPrimes(10)); // 2, 3, 5, 7
		assertEquals(4, obj.countPrimes(11)); // 2, 3, 5, 7
		assertEquals(5, obj.countPrimes(12)); // 2, 3, 5, 7, 11
		assertEquals(5, obj.countPrimes(13)); // 2, 3, 5, 7, 11
		assertEquals(6, obj.countPrimes(14)); // 2, 3, 5, 7, 11, 13
		assertEquals(0, obj.countPrimes(0));
		assertEquals(0, obj.countPrimes(1));
		assertEquals(0, obj.countPrimes(2));
		
	}
}
