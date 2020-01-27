package LeetCode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 * Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 * 
 * @author rocky
 */
public class A1295_FindNumbersWithEvenNumberOfDigits_V2 {

    public int findNumbers(int[] nums) {
     
        int count = 0;
        for (int num : nums) {
            
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
                count++;
        }
        
        return count;
    }
}
