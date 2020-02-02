package LeetCode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 
 * Runtime: 2 ms, faster than 40.20% of Java online submissions for Find Numbers with Even Number of Digits.
 * Memory Usage: 40.7 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 * 
 * @author rocky
 */
public class A1295_FindNumbersWithEvenNumberOfDigits_V1 {

    public int findNumbers(int[] nums) {
     
        int count = 0;
        for (int num : nums) {

            int times = 0;
            while (num > 0) {
                num = num / 10;
                times++;
            }
            
            if (times > 0 && times % 2 == 0)
                count++;
        }
        
        return count;
    }
}
