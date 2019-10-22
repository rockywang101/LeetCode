package LeetCode;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class A0136_SingleNumberTest {

	@Test 
	public void testSingleNumber() {
		
		A0136_SingleNumber obj = new A0136_SingleNumber();
		
		assertEquals(obj.singleNumber(new int [] {2, 2, 1}), 1);
		
		assertEquals(obj.singleNumber(new int [] {4, 1, 2, 1, 2}), 4);
	}
}
