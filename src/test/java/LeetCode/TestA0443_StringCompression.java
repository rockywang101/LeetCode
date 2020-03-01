package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestA0443_StringCompression {

    @Test public void test() {
        
        char[] chars;

        chars = new char[] {'a'};
        assertEquals(1, new A0443_StringCompression().compress(chars));
        assertEquals(chars[0], 'a');
        
        chars = new char[] {'a', 'a', 'a', 'a'};
        assertEquals(2, new A0443_StringCompression().compress(chars));
        assertEquals(chars[0], 'a');
        assertEquals(chars[1], '4');
        assertEquals(chars[2], 'a');
        assertEquals(chars[3], 'a');
        
        chars = new char[] {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        assertEquals(3, new A0443_StringCompression().compress(chars));
        assertEquals(chars[0], 'a');
        assertEquals(chars[1], '1');
        assertEquals(chars[2], '2');
        assertEquals(chars[3], 'a');       
        
        // this is still fail
        chars = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, new A0443_StringCompression().compress(chars));
        assertEquals(chars[0], 'a');
        assertEquals(chars[1], '2');
        assertEquals(chars[2], 'b');
        assertEquals(chars[3], '2');
        assertEquals(chars[4], 'c');
        assertEquals(chars[5], '3');
        
        
        
        
        
    }
}
