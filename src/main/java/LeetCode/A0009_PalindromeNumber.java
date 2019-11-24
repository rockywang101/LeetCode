package LeetCode;

/**
 * https://leetcode.com/problems/palindrome-number/
 * @author rocky.wang
 */
public class A0009_PalindromeNumber {

	// Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
	// Memory Usage: 36.5 MB, less than 5.02% of Java online submissions for Palindrome Number.
    public boolean isPalindrome(int x) {
    	
        if (x < 0 || (x % 10 == 0 && x != 0))
    		return false;
    	
    	int ret = 0;
    	while (x > ret) {
    		int pop = x % 10;
    		x = x / 10;
    		ret = ret * 10 + pop;
    	}
        
        return x == ret || x == ret / 10;
    }

	
	// Runtime: 7 ms, faster than 70.97% of Java online submissions for Palindrome Number.
	// Memory Usage: 35.8 MB, less than 5.02% of Java online submissions for Palindrome Number.
    public boolean isPalindromeV1(int x) {

    	if (x < 0)
    		return false;
    	
    	return reverseInteger(x) == x;
    }
    
    private int reverseInteger(int x) {
    	
    	int ret = 0;
    	
    	while (x > 0) {
    		int pop = x % 10;
    		x = x / 10;
    		ret = ret * 10 + pop;
    	}
    	
    	return ret;
    }
    
    public static void main(String[] args) {
		
    	A0009_PalindromeNumber obj = new A0009_PalindromeNumber();
    	
    	System.out.println(obj.isPalindrome(121));
    	System.out.println(obj.isPalindrome(-121));
    	System.out.println(obj.isPalindrome(10));
    	System.out.println(obj.isPalindrome(100));
    	System.out.println(obj.isPalindrome(1000));
    	System.out.println(obj.isPalindrome(13531));

    	// 100
    	// 10 0
    	// 1 00
    	// 0 1
    	

	}
}
