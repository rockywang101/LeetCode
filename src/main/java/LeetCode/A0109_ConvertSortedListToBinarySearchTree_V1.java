package LeetCode;

/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * 
 * Runtime: 2 ms, faster than 8.26% of Java online submissions for Convert Sorted List to Binary Search Tree.
 * Memory Usage: 50.4 MB, less than 5.26% of Java online submissions for Convert Sorted List to Binary Search Tree.
 * 
 * @author rocky
 */
public class A0109_ConvertSortedListToBinarySearchTree_V1 {
    
    public TreeNode sortedListToBST(ListNode head) {
        
        if (head == null)
            return null;

        if (head.next == null)
            return new TreeNode(head.val);
        
        ListNode middle = findMiddleNode(head);
        
        TreeNode root = new TreeNode(middle.val);
        
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);
        
        return root;
    }

    
    private ListNode findMiddleNode(ListNode node) {
        
        ListNode prev = null;
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (prev != null)
            prev.next = null;
        
        return slow;
    }
}
