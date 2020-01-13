package LeetCode;

/**
 * https://leetcode.com/problems/rotate-array/
 * 
 * reverse all and reverse part two times solution
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
 * Memory Usage: 39 MB, less than 5.77% of Java online submissions for Rotate Array.
 * 
 * @author rocky
 */
public class A0189_RotateArray_V2 {

    public void rotate(int[] nums, int k) {
        
        if (nums.length <= 1)
            return;
        
        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        
        reverse(nums, 0, k-1);
        
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--]= tmp; 
        }
    }
}
