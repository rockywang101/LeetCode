package LeetCode;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class A0137_SingleNumberTest {

	@Test 
	public void testSingleNumber() {
		
		A0137_SingleNumberII obj = new A0137_SingleNumberII();
		
		assertEquals(obj.singleNumber(new int [] {2, 2, 3, 2}), 3);
		
		assertEquals(obj.singleNumber(new int [] {0, 1, 0, 1, 0, 1, 99}), 99);
	}
}
