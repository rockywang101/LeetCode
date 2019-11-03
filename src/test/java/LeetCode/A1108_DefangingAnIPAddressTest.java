package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1108_DefangingAnIPAddressTest {

	@Test
	public void test() {
		
		A1108_DefangingAnIPAddress obj = new A1108_DefangingAnIPAddress();
		
		assertEquals(obj.defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
		
		assertEquals(obj.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
		
	}
}
