package LeetCode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * 快慢指標，O(n) time, O(1) space
 * 很怪的是，寫法是 O(1) space，但 Memory 使用量的評分並沒有差異太多，拿別人的解法去 submit 也是一樣
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Palindrome Linked List.
 * Memory Usage: 42.2 MB, less than 29.27% of Java online submissions for Palindrome Linked List.
 * 
 * @author rocky
 */
public class A0234_PalindromeLinkedList_V2 {
    
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode right = head.next;
        while (fast.next != null && fast.next.next != null) {
        	fast = fast.next.next;
        	ListNode tmp = right;
        	right = tmp.next;
        	tmp.next = slow;
        	slow = tmp;
        }

        // 奇數個 nodes
        if (fast.next != null)
            right = right.next;
        
        while (right != null) {
            if (slow.val != right.val)
                return false;

            slow = slow.next;
            right = right.next;
        }
        
        return true;
    }
}
