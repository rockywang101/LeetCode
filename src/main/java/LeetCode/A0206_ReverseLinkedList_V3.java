package LeetCode;

/**
 * iterative version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.2 MB, less than 98.56% of Java online submissions for Reverse Linked List. 
 * @author rocky
 */
public class A0206_ReverseLinkedList_V3 {
    
    public ListNode reverseList(ListNode head) {
    
    	ListNode prev = null;
    	
    	while (head != null) {
    		ListNode next = head.next;
    		head.next = prev;
    		prev = head;
    		head = next;
    	}
    	
    	return prev;
    }
}
