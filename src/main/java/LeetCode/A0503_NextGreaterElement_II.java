package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/next-greater-element-ii/
 * 
 * @author rocky
 */
public class A0503_NextGreaterElement_II {
    
    // 寫一半，以為是對的，但不對
    public int[] nextGreaterElements(int[] nums) {
    
        if (nums.length == 0)
            return new int[0];
        
        int[] rtnNums = new int[nums.length];
        
        int[] greaterIndexArray = new int[nums.length];
        // 數字存放在 nums2 的第幾個 index 對應
        Map<Integer, Integer> numInNums2IndexMap = new HashMap<Integer, Integer>();

        greaterIndexArray[nums.length-1] = -1; // 最後一項不會有更大的
        numInNums2IndexMap.put(nums[nums.length-1], nums.length-1);
        
        for (int i = nums.length - 2; i >= 0; i--) {
            
            int gtIdx = i + 1;
            while (nums[i] > nums[gtIdx]) {

                gtIdx = greaterIndexArray[gtIdx]; // 找出比他大數的 index
                if (gtIdx == -1)
                    break; // 沒有更大數了
            }
            
            greaterIndexArray[i] = gtIdx;
            numInNums2IndexMap.put(nums[i], i);
            
            rtnNums[i] = gtIdx == -1 ? -1 : nums[gtIdx];
        }
        
        rtnNums[rtnNums.length-1] = rtnNums[0];

        return rtnNums;
    }
}
