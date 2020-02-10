package LeetCode;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 * 
 * Runtime: 1 ms, faster than 35.96% of Java online submissions for Number of Segments in a String.
 * Memory Usage: 37.6 MB, less than 8.33% of Java online submissions for Number of Segments in a String.
 * 
 * @author rocky
 */
public class A0434_NumberOfSegmentsInAString_V1 {

    public int countSegments(String s) {
        
        if (s == null || s.trim().equals(""))
            return 0;
        
        return s.trim().split("\\s+").length;
    }
}
