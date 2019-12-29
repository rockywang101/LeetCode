package LeetCode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-ii/
 * 
 * Runtime: 46 ms, faster than 22.27% of Java online submissions for Next Greater Element II.
 * Memory Usage: 42.6 MB, less than 71.43% of Java online submissions for Next Greater Element II.
 * @author rocky
 */
public class A0503_NextGreaterElement_II_V2 {
    
    public int[] nextGreaterElements(int[] nums) {
    
        Stack<Integer> stack = new Stack<Integer>();
        
        int[] rtnNums = new int[nums.length];
        
        for (int i=nums.length*2-1; i>=0; i--) {
            int idx = i % nums.length; 
            
            while (! stack.isEmpty() && nums[idx] >= nums[stack.peek()]) {
                stack.pop();
            }
            
            rtnNums[idx] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(idx);
        }
        
        return rtnNums;
    }
}
