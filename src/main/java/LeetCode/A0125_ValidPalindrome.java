package LeetCode;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * 基本的 two pointer 問題，從前面跟從後面讀都要一樣
 * 只是要留意處理大小寫與判斷非合法字母要略過
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Palindrome.
 * Memory Usage: 39 MB, less than 47.32% of Java online submissions for Valid Palindrome.
 * 
 * @author rocky
 */
public class A0125_ValidPalindrome {
    
    public boolean isPalindrome(String s) {
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            
            while (! isAlphanumeric(arr[left]) && left < right)
                left++;
            while (! isAlphanumeric(arr[right]) && left < right)
                right--;

            if (left >= right)
                break;
            
            if (lower(arr[left]) != lower(arr[right]))
                return false;
            
            left++;
            right--;
        }
        
        return true;
    }
    
    private boolean isAlphanumeric(char c) {
        
        if (c >= '0' && c <= '9')
            return true;
        else if (c >= 'A' && c <= 'Z')
            return true;
        else if (c >= 'a' && c <= 'z')
            return true;
        
        return false;
    }
    
    private char lower(char c) {

        if (c >= 'A' && c <= 'Z')
            return (char) (c+32);
        
        return c;
    }
}
