package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A0804_UniqueMorseCodeWordsTest {

	@Test
	public void testUniqueMorseRepresentations() {
		
		A0804_UniqueMorseCodeWords obj = new A0804_UniqueMorseCodeWords();
		assertEquals(2, obj.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
		
		
	}
}
