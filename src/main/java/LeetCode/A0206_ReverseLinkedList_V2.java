package LeetCode;

/**
 * recursive version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.1 MB, less than 98.92% of Java online submissions for Reverse Linked List.
 * @author rocky
 */
public class A0206_ReverseLinkedList_V2 {
    
    public ListNode reverseList(ListNode head) {
    
        if (head == null || head.next == null)
            return head;

        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        
        return p;
    }
    
}
