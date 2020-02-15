package LeetCode;

/**
 * https://leetcode.com/problems/maximum-69-number/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum 69 Number.
 * Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Maximum 69 Number.
 * 
 * @author rocky
 */
public class A1323_Maximum69Number {

    // reference network and write again
    public int maximum69Number (int num) {
        
        String s = String.valueOf(num);
        int i = 1;
        for (char c : s.toCharArray()) {
            if (c == '9') {
                i++;
                continue;
            }
            else {
                break;
            }
        }
        
        return num + (int) Math.pow(10, s.length()-i) * 3;
    }

    // myself version
    /*
    public int maximum69Number (int num) {

        int n = 1000;
        while (n > 0) {
            int mod = num / n % 10;
            if (mod == 0 || mod == 9) {
                n = n / 10;
                continue;
            }
            else {
                return num + n * 3;
            }
        }
        
        return num; // should not be here
    }
    */
}
