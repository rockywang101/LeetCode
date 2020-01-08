package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 * 
 * 重點在於，
 * 1. 把較短的 list 放到 Map
 * 2. 走訪較長 list 時，加上判斷 i <= indexSum，因為通後面的一定超過已經沒意義了
 * 
 * Runtime: 5 ms, faster than 100.00% of Java online submissions for Minimum Index Sum of Two Lists.
 * Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Minimum Index Sum of Two Lists.
 * @author rocky
 */
public class A0599_MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

    	if (list1.length > list2.length)
    		return findRestaurant(list2, list1);
    	
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	
    	for (int i=0; i<list1.length; i++)
    		map.put(list1[i], i);
    	
    	int indexSum = Integer.MAX_VALUE;
    	List<String> termList = new ArrayList<String>();
    	for (int i=0; i<list2.length && i<=indexSum; i++) {
    		
    		if (! map.containsKey(list2[i]))
    			continue;
    		
    		int currSum = i + map.get(list2[i]);
    		
    		if (indexSum == currSum) {
    			termList.add(list2[i]);
    		}
    		else if (indexSum > currSum) {
    			indexSum = currSum;
    			termList.clear();
    			termList.add(list2[i]);
    		}
    	}
    	
    	return termList.toArray(new String[termList.size()]);
    }
}
