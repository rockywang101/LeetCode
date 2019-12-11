package LeetCode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class A0021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        // 生出 mergedListNode 的頭
        ListNode rtnList = null;
        if (l1.val <= l2.val) {
            rtnList = new ListNode(l1.val);
            l1 = l1.next;
        }
        else {
            rtnList = new ListNode(l2.val);
            l2 = l2.next;
        }
        
        while (l1 != null || l2 != null) {
            
           if (l2 == null || (l1 != null && l1.val <= l2.val)) {
               rtnList.next = new ListNode(l1.val);
               l1 = l1.next;
           }
           else {
               rtnList.next = new ListNode(l2.val);
               l2 = l2.next;
           }
        }
        
        return rtnList;
    }
}
