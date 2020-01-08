package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * Hash Table version
 * 
 * Runtime: 4 ms, faster than 21.48% of Java online submissions for Linked List Cycle.
 * Memory Usage: 37.5 MB, less than 91.43% of Java online submissions for Linked List Cycle.
 * @author rocky
 */
public class A0141_LinkedListCycle_V1 {

    public boolean hasCycle(ListNode head) {
     
    	Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
    	
    	while (head != null) {
    		
    		if (map.containsKey(head))
    			return true;
    		
    		map.put(head, 0);
    		
    		head = head.next;
    	}
    	
    	return false;
    }
}
