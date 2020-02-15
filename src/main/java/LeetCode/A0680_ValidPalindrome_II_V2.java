package LeetCode;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * 網路上的版本，較好懂，也較快一點，我想應該是因為他不用比兩個字元
 * 
 * Runtime: 4 ms, faster than 99.55% of Java online submissions for Valid Palindrome II.
 * Memory Usage: 41.9 MB, less than 5.55% of Java online submissions for Valid Palindrome II.
 * 
 * @author rocky
 */
public class A0680_ValidPalindrome_II_V2 {
    
    public boolean validPalindrome(String s) {

        if (s==null || s.length()<2)
            return true;
        
        return isPalindrome(s, 0, s.length()-1, 1);
    }
    
    
    private boolean isPalindrome(String s, int left , int right, int miss){
        
        if (miss < 0)
            return false;
        
        while (left < right) {
            
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                miss--;
                return isPalindrome(s,left+1, right, miss) || isPalindrome(s, left, right-1, miss);
            }
        }
        
        return true;
    }
}
