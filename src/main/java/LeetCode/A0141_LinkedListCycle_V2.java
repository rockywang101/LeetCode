package LeetCode;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
 * Memory Usage: 37.6 MB, less than 87.86% of Java online submissions for Linked List Cycle.
 * 
 * two pointer version
 * 
 * @author rocky
 */
public class A0141_LinkedListCycle_V2 {

    public boolean hasCycle(ListNode head) {
    	
    	if (head == null || head.next == null)
    		return false;
    	
    	ListNode slow = head;
    	ListNode fast = head.next;
    	
    	while (slow != fast) {
    		
    		if (fast == null || fast.next == null)
    			return false;
    		
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	
    	return true;
    }
}
