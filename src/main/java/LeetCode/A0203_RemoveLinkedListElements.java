package LeetCode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * 只是簡單的 ListNode 移除練習
 * 
 * Runtime: 1 ms, faster than 97.86% of Java online submissions for Remove Linked List Elements.
 * Memory Usage: 41.1 MB, less than 6.35% of Java online submissions for Remove Linked List Elements.
 * 
 * @author rocky
 */
public class A0203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

    	while (head != null && head.val == val)
    		head = head.next;
    	
    	ListNode curr = head;
    	
    	while (curr != null) {
    		
    		while (curr.next != null && curr.next.val == val)
    			curr.next = curr.next.next;
    		
    		curr = curr.next;
    	}
    	
    	return head;
    }
}
