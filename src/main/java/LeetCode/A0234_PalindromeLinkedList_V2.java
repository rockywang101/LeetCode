package LeetCode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * 快慢指標，O(n) time, O(1) space
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Palindrome Linked List.
 * Memory Usage: 42.2 MB, less than 28.05% of Java online submissions for Palindrome Linked List.
 * 
 * @author rocky
 */
public class A0234_PalindromeLinkedList_V2 {
    
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode curr = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            curr = slow;
        }
        
        // 偶數個 nodes
        if (fast.next == null)
            curr = curr.next;
        // 奇數個 nodes
        else
            curr = curr.next.next;
        
        slow = head;
        while (curr != null) {
            if (slow.val != curr.val)
                return false;
            
            slow = slow.next;
            curr = curr.next;
        }
        
        return true;
    }
}
