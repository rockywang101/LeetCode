package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 * 
 * stack 解法 (效能差，但練習 stack 解問題)
 * 
 * Runtime: 4 ms, faster than 28.53% of Java online submissions for Next Greater Element I.
 * Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Next Greater Element I.
 * @author rocky
 */
public class A0496_NextGreaterElement_I_V4 {

    // 這題最難的是了解題目到底在說什麼呀
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<Integer>();
        
        Map<Integer, Integer> numIdxmap = new HashMap<Integer, Integer>();

        // 先求出 nums2 的所有 gtNums (透過 stack)
        int[] gtNums = new int[nums2.length];
        for (int i=nums2.length-1; i>=0; i--) {
            
            while (! stack.isEmpty() && stack.peek() < nums2[i])
                stack.pop();
            
            gtNums[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
            
            numIdxmap.put(nums2[i], i); // 順手把數字對應在哪個位置存下來
        }
        
        int[] rtnNums = new int[nums1.length];
        for (int i=0; i<nums1.length; i++)
            rtnNums[i] = gtNums[numIdxmap.get(nums1[i])];
        
        return rtnNums;
    }
    
}
