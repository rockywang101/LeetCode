package LeetCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        
        ClimbingStairs obj = new ClimbingStairs();
        
        assertEquals(obj.climbStairs(1), 1);
        assertEquals(obj.climbStairs(2), 2);
        assertEquals(obj.climbStairs(3), 3);
        assertEquals(obj.climbStairs(4), 5);
        assertEquals(obj.climbStairs(5), 8);
        assertEquals(obj.climbStairs(6), 13);
        assertEquals(obj.climbStairs(7), 21);
        assertEquals(obj.climbStairs(8), 34);
    }
}
