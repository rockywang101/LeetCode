package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 * 
 * 雖然解了大數，效能卻比 V2 差了
 * 
 * Runtime: 2 ms, faster than 97.21% of Java online submissions for Next Greater Element I.
 * Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Next Greater Element I.
 * @author rocky
 */
public class A0496_NextGreaterElement_I_V3 {

    // 這題最難的是了解題目到底在說什麼呀
    
    // 由網路上看到的 V2 改良，能符合所有的數字
    /* Test case 如下
        [65553,50000,3000,-5]
        [65553,100,50000,3000,600000,2,30,-5,1]
        []
        []
     */
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        if (nums2.length == 0)
            return new int[0];
        
        int[] greaterIndexArray = new int[nums2.length];
        // 數字存放在 nums2 的第幾個 index 對應
        Map<Integer, Integer> numInNums2IndexMap = new HashMap<Integer, Integer>();

        greaterIndexArray[nums2.length-1] = -1; // 最後一項不會有更大的
        numInNums2IndexMap.put(nums2[nums2.length-1], nums2.length-1);
        
        for (int i = nums2.length - 2; i >= 0; i--) {
            
            int gtIdx = i + 1;
            while (nums2[i] > nums2[gtIdx]) {

                gtIdx = greaterIndexArray[gtIdx]; // 找出比他大數的 index
                
                if (gtIdx == -1)
                    break; // 沒有更大數了
            }
            
            greaterIndexArray[i] = gtIdx;
            numInNums2IndexMap.put(nums2[i], i);
        }

        int[] rtnNums = new int[nums1.length];
        for (int i = 0; i < rtnNums.length; i++) {
            
            int numIdxInNums2 = numInNums2IndexMap.get(nums1[i]);
            int gtIdx = greaterIndexArray[numIdxInNums2];
            rtnNums[i] = gtIdx == -1 ? -1 : nums2[gtIdx]; 
        }
        
        return rtnNums;
    }
}
