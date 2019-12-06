package LeetCode;
/**
 * Linked List 基本練習題
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 * @author rocky.wang
 */
public class A0083_RemoveDuplicatesfromSortedList {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    // Memory Usage: 37.8 MB, less than 41.67% of Java online submissions for Remove Duplicates from Sorted List.
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode tmpHead = head;
        
        while (tmpHead != null && tmpHead.next != null) {
            
            if (tmpHead.val == tmpHead.next.val) {
                tmpHead.next = tmpHead.next.next; // 跳過重覆的數字 (這時還不能更換 head 因為下一個還是可能是重覆的)
            }
            else {
                tmpHead = tmpHead.next; // 沒問題，換下一個 Node
            }
        }
        
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
