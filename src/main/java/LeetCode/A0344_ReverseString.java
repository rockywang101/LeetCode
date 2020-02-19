package LeetCode;

/**
 * https://leetcode.com/problems/reverse-string/
 * 
 * 真的很簡單，就是 two pointer 交換而已
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse String.
 * Memory Usage: 43.2 MB, less than 99.41% of Java online submissions for Reverse String.
 * 
 * @author rocky
 */
public class A0344_ReverseString {

    public void reverseString(char[] s) {
        
        if (s == null)
            return;

        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
