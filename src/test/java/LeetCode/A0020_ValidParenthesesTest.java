package LeetCode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class A0020_ValidParenthesesTest {

	@Test
	public void testIsValid() {
		
		A0020_ValidParentheses obj = new A0020_ValidParentheses();
		
		assertTrue(obj.isValid("[]"));
		
		assertTrue(obj.isValid("()[]{}"));
		
		assertTrue(obj.isValid("{[]}"));
		
		assertFalse(obj.isValid("([)]"));
		
		assertFalse(obj.isValid("(]"));
		
		assertFalse(obj.isValid("("));
		
	}
}
