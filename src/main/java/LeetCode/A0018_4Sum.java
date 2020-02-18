package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/4sum/
 * 
 * @author rocky
 */
public class A0018_4Sum {
    
    public List<List<Integer>> threeSum(int[] nums) {
    
        Map<AtomicInteger, Integer> valueIndexMap = new HashMap<AtomicInteger, Integer>();
        for (int i=0; i<nums.length; i++)
            valueIndexMap.put(new AtomicInteger(nums[i]), i);
        
        
        return null;
    }
}
