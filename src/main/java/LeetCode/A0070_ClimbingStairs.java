package LeetCode;

public class A0070_ClimbingStairs {
    
    public int climbStairs(int n) {
        if (n <= 2) 
            return n;
        
        int result = 0;
        int pre1 = 2;
        int pre2 = 1;
        
        for (int i=3; i<=n; i++) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        
        return result;
    }
}
