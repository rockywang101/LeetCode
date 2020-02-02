package LeetCode;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
 * Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
 * 
 * @author rocky
 */
public class A1221_SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        
        int ret = 0;
        int left = 0;
        int right = 0;
        for (char c : s.toCharArray()) {
            
            if (c == 'L')
                left++;
            if (c == 'R')
                right++;
            
            if (left == right) {
                ret++;
                left = 0;
                right = 0;
            }
        }
        
        return ret;
    }
}
