package LeetCode;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 * 
 * 蠻基本的題目
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
 * Memory Usage: 37.7 MB, less than 8.33% of Java online submissions for Number of Segments in a String.
 * @author rocky
 */
public class A0434_NumberOfSegmentsInAString_V2 {

    public int countSegments(String s) {
        
        int count = 0;
        boolean isCharMode = false;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (isCharMode) {
                    count++;
                    isCharMode = false;
                }
            }
            else {
                isCharMode = true;
            }
        }
        
        if (isCharMode)
            count++;
        
        return count;
    }
}
