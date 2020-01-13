package LeetCode;

/**
 * https://leetcode.com/problems/rotate-array/
 * 
 * for loop to exchange value solution 
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
 * Memory Usage: 37.9 MB, less than 88.46% of Java online submissions for Rotate Array.
 * 
 * @author rocky
 */
public class A0189_RotateArray_V3 {

    public void rotate(int[] nums, int k) {
        
        if (nums.length <= 1)
            return;
        
        k = k % nums.length;
        
        int step = nums.length - k;
        
        int count = 0;
        for (int start = 0; count <nums.length; start++) {
            
            int nextNum = nums[(start + step) % nums.length];
            int prev = nums[start];
            int idx = (start + k) % nums.length;
            nums[start] = nextNum;
            count++;    
            do {
                int tmp = nums[idx];
                nums[idx] = prev;
                prev = tmp;
                idx = (idx + k) % nums.length;
                count++;
            }
            while (start != idx);
        }
    }
}
