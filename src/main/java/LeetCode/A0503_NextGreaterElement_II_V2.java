package LeetCode;

/**
 * https://leetcode.com/problems/next-greater-element-ii/
 * 
 * 不用 stack，改以 two point 來解
 * 
 * Runtime: 9 ms, faster than 93.52% of Java online submissions for Next Greater Element II.
 * Memory Usage: 40.4 MB, less than 100.00% of Java online submissions for Next Greater Element II.
 * 
 * @author rocky
 */
public class A0503_NextGreaterElement_II_V2 {
    
    public int[] nextGreaterElements(int[] nums) {
    
        int[] rtnNums = new int[nums.length];
        
        Integer[] gtIndices = new Integer[nums.length]; // 因為要用 null 判斷還沒存取過的，所以宣告成 Integer
        
        for (int i=nums.length-1; i>=0; i--) {
            
            int gt = (i + 1) % nums.length;
            
            while (nums[i] >= nums[gt] && gt != i) {
                // 繼續找更大數的 index 直到都沒有更大的數
                if (gt+1 == i) {
                    gt = -1;
                    break;
                }

                if (gtIndices[gt] == null || gtIndices[gt] == -1) {
                    gt = (gt + 1) % nums.length;
                }
                else {
                    gt = gtIndices[gt];
                }
            }
            
            if (gt == i)
                gt = -1;
            
            gtIndices[i] = gt;
            rtnNums[i] = gt == -1 ? -1 : nums[gt];
        }
        
        return rtnNums;
    }
}
