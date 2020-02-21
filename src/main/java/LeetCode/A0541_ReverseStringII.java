package LeetCode;

/**
 * https://leetcode.com/problems/reverse-string-ii/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse String II.
 * Memory Usage: 39.6 MB, less than 7.41% of Java online submissions for Reverse String II.
 *
 * @author rocky
 */
public class A0541_ReverseStringII {

    public String reverseStr(String s, int k) {

        int i = 0; 
        char[] chars = s.toCharArray();
        while (i < chars.length) {
            
            int end = i + k - 1;
            if (end > chars.length - 1)
                end = chars.length - 1;
            
            reverse(chars, i, end);
            
            i = i + 2 * k;
        }
        
        return new String(chars);
    }

    private void reverse(char[] chars, int left, int right) {
        
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
    }
}
