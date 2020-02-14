package LeetCode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * 自己寫的版本，沒有達到空間 O(1)
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Palindrome Linked List.
 * Memory Usage: 42.2 MB, less than 28.05% of Java online submissions for Palindrome Linked List.
 * 
 * @author rocky
 */
public class A0234_PalindromeLinkedList_V1 {
    
    public boolean isPalindrome(ListNode head) {
        
        // 先取得全部數字的數量
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // 把前面一半的數字存放起來 (後續做比對)
        int[] nums = new int[size / 2];
        curr = head;
        for (int i=0; i<nums.length; i++) {
            nums[i] = curr.val;
            curr = curr.next;
        }
        
        // 如果數量是奇數，略過中間那個數字
        if (size % 2 != 0)
            curr = curr.next;
        
        // 開始比對
        for (int i=nums.length-1; i>=0; i--) {
            if (nums[i] != curr.val)
                return false;
            
            curr = curr.next;
        }
        
        return true;
    }
}
