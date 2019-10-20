package LeetCode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {

	@Test
	public void testIsValid() {
		
		ValidParentheses obj = new ValidParentheses();
		
		assertTrue(obj.isValid("[]"));
		
		assertTrue(obj.isValid("()[]{}"));
		
		assertTrue(obj.isValid("{[]}"));
		
		assertFalse(obj.isValid("([)]"));
		
		assertFalse(obj.isValid("(]"));
		
		assertFalse(obj.isValid("("));
		
	}
}
