package LeetCode;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * 
 * 這題真的很簡單，就只是在練習不要用字串處理，而是以 % 來取最後一個數
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
 * Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
 * 
 * @author rocky
 */
public class A1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
    
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        
        return product - sum;
    }
}
