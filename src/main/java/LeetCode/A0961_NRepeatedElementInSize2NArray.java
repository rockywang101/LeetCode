package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * @author rocky
 */
public class A0961_NRepeatedElementInSize2NArray {

	// 用 array 反而慢了，原因還沒有很理解
	// Runtime: 1 ms, faster than 70.92% of Java online submissions for N-Repeated Element in Size 2N Array.
	// Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
	// 多 submit 幾次後又好了
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
	// Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
    public int repeatedNTimes(int[] A) {
        
    	int[] isSeen = new int[10000];
    	for (int num : A) {
    		
    		if (isSeen[num] == 1) {
    			return num;
    		}
    		else {
    			isSeen[num] = 1;
    		}
    	}
    	
    	throw new RuntimeException("no value matched");
    }
	
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
	// Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
    public int repeatedNTimesV1(int[] A) {
     
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int num : A) {
    		
    		if (map.containsKey(num)) {
    			return num;
    		}
    		else {
    			map.put(num, num);
    		}
    	}
    	
    	throw new RuntimeException("no value matched");
    }
}
