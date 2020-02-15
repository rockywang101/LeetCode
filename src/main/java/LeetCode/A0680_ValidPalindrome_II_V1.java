package LeetCode;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * Runtime: 5 ms, faster than 95.10% of Java online submissions for Valid Palindrome II.
 * Memory Usage: 42.1 MB, less than 5.55% of Java online submissions for Valid Palindrome II.
 * 
 * @author rocky
 */
public class A0680_ValidPalindrome_II_V1 {
    
    public boolean validPalindrome(String s) {

        char[] arr = s.toCharArray();
        int left = 0; 
        int right = arr.length - 1;

        int errCnt = 0;
        while (left < right) {
            if (arr[left] != arr[right]) {
                // case: xcux -> remove c or u, both xcx or xux are OK
                if (right - left == 1)
                    return true;
                
                if (errCnt++ > 0)
                    return false;
                
                if (arr[left+1] == arr[right] && arr[left+2] == arr[right-1])
                    left++;
                else if (arr[left] == arr[right-1] && arr[left+1] == arr[right-2])
                    right--;
                else
                    return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
