package LeetCode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * Runtime: 17 ms, faster than 12.97% of Java online submissions for Majority Element.
 * Memory Usage: 41.3 MB, less than 83.09% of Java online submissions for Majority Element.
 * 
 * @author rocky
 */
public class A0169_MajorityElement_V1 {

    public int majorityElement(int[] nums) {

    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	int maxCount = -1;
    	int majorityNum = -1;
    	
    	for (int i=0; i<nums.length; i++) {
    		
    		int num = nums[i];
    		
    		map.put(num, map.getOrDefault(num, 0) + 1);
    		
    		if (map.get(num) > maxCount) {
    			
    			maxCount = map.get(num);
    			majorityNum = num;
    			
    			if (maxCount > nums.length/2)
    				return majorityNum;
    		}
    	}
   
    	return majorityNum;
    }
}
