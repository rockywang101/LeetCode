package LeetCode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * Runtime: 1 ms, faster than 99.82% of Java online submissions for Majority Element.
 * Memory Usage: 42.3 MB, less than 61.03% of Java online submissions for Majority Element.
 * @author rocky
 */
public class A0169_MajorityElement_V2 {

    public int majorityElement(int[] nums) {

    	// 解題 sop，遇到數字陣列，想想 sort 有沒有機會解
    	Arrays.sort(nums);
    	
    	return nums[nums.length/2];
    }
}
