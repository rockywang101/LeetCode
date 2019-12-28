package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 * 
 * Runtime: 2 ms, faster than 97.35% of Java online submissions for Next Greater Element I.
 * Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Next Greater Element I.
 * @author rocky
 */
public class A0496_NextGreaterElement_I_V1 {

    // 這題最難的是了解題目到底在說什麼呀
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums2.length; i++)
            map.put(nums2[i], i); // value : index 
        
        int[] rtnNums = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            
            int num1 = nums1[i];
            int idxInNums2 = map.get(num1);
            Integer greater = null;
            for (int j=idxInNums2+1; j<nums2.length; j++) {
                if (nums2[j] > num1) {
                    greater = nums2[j];
                    break;
                }
            }
            
            if (greater == null)
                greater = -1;
            
            rtnNums[i] = greater;
        }
        
        return rtnNums;
    }
    
}
