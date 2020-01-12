package LeetCode;

/**
 * https://leetcode.com/problems/rotate-array/
 * 
 * 簡單直覺的作法，但效能不好
 * 
 * Runtime: 1 ms, faster than 50.61% of Java online submissions for Rotate Array.
 * Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Rotate Array.
 * @author rocky
 */
public class A0189_RotateArray_V1 {

    public void rotate(int[] nums, int k) {

        if (nums.length == 1)
    		return;
        
        k = k % nums.length;
    	
    	int[] tmp = new int[nums.length];
    	
    	int j = 0;
    	for (int i=nums.length-k; i<nums.length; i++) {
    		tmp[j] = nums[i];
    		j++;
    	}
    	
    	for (int i=0; i<nums.length-k; i++) {
    		tmp[j] = nums[i];
    		j++;
    	}
    	
    	for (int i=0; i<nums.length; i++)
    		nums[i] = tmp[i];
    }
}
