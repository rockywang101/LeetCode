package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * 
 * Runtime: 6 ms, faster than 22.21% of Java online submissions for Linked List Cycle II.
 * Memory Usage: 36.8 MB, less than 6.32% of Java online submissions for Linked List Cycle II.
 * 
 * Hash Table version
 * 
 * @author rocky
 */
public class A0142_LinkedListCycle_II_V1 {

    public ListNode detectCycle(ListNode head) {

    	Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
    	
    	while (head != null) {
    		
    		if (map.containsKey(head))
    			return head;
    		
    		map.put(head, 0);
    		head = head.next;
    	}
    	
    	return null;
    }
}
