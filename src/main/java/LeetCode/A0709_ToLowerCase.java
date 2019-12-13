package LeetCode;

/**
 * 只是在練習 ascii code 的知識而已
 * 
 * https://leetcode.com/problems/to-lower-case/
 * @author rocky
 */
public class A0709_ToLowerCase {
	
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
	// Memory Usage: 33.8 MB, less than 98.70% of Java online submissions for To Lower Case.
    public String toLowerCase(String str) {

    	char[] charArray = str.toCharArray();
    	for (int i = 0, length = charArray.length; i < length; i++) {
    		if (charArray[i] >= 65 && charArray[i] <= 90) {
    			charArray[i] += 32;
    		}
    	}
    	
    	return String.valueOf(charArray);
    }
    
    public static void main(String[] args) {
		String str = new A0709_ToLowerCase().toLowerCase("ABC");
		System.out.println(str);
	}
}
