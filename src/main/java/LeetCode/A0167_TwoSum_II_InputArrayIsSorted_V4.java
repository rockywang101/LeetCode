package LeetCode;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * from network, easy to understand, but i really cannot understand
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
 * Memory Usage: 48.8 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
 * 
 * @author rocky
 */
public class A0167_TwoSum_II_InputArrayIsSorted_V4 {
    
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        int tt = (target >= 0)? target / 2 : target / 2 - 1;
        
        while (left < right - 1) {
            int mid = (right - left) / 2 + left;
            if (numbers[mid] <= tt) 
                left = mid;
            else 
                right = mid;
        }
        
        // 7 + 7 = 14 這種案例 [1, 2, 3, 7, 7, 9, 15]
        if (target % 2 == 0 && left > 0 && numbers[left] == tt && numbers[left - 1] == tt) 
            return new int[] {left, left + 1};

        // two pointer from left and right to find solution
        while (left >= 0 && right < numbers.length) {
            
            if (numbers[left] + numbers[right] == target)
                return new int[] {left + 1, right + 1};
            
            while (right < numbers.length && numbers[left] + numbers[right] < target)
                ++right;
            
            while (left >= 0 && right < numbers.length && numbers[left] + numbers[right] > target)
                --left;
        }
        
        return null; // no solution
    }
}
