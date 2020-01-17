package LeetCode;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * two pointer solution
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
 * Memory Usage: 47.8 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
 * 
 * @author rocky
 */
public class A0167_TwoSum_II_InputArrayIsSorted_V2 {
    
    public int[] twoSum(int[] numbers, int target) {
    
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
            else if (numbers[i] + numbers[j] < target) {
                i++;
            }
            else {
                return new int[] {i+1, j+1};
            }
        }
        
        return null; // no solution
    }
}
