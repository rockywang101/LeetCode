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
public class A0021_MergeTwoSortedLists2 {

    // 其實一開始有想過更換指標就好，但沒想到可以用各個擊破，用 recursive 來做就很容易 ! 
    // 這是看了第一名的答案後才想到可以這麼簡單就做到
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
    // Memory Usage: 41.1 MB, less than 8.08% of Java online submissions for Merge Two Sorted Lists.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    
    // Runtime: 1 ms, faster than 22.27% of Java online submissions for Merge Two Sorted Lists.
    // Memory Usage: 39.3 MB, less than 17.51% of Java online submissions for Merge Two Sorted Lists.
    public ListNode mergeTwoListsV1(ListNode l1, ListNode l2) {
        
        if (l1 == null && l2 == null)
            return null;
        else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        
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
        
        ListNode tmpList = rtnList;
        while (l1 != null || l2 != null) {
            
           if (l2 == null || (l1 != null && l1.val <= l2.val)) {
               tmpList.next = new ListNode(l1.val);
               tmpList = tmpList.next;
               l1 = l1.next;
           }
           else {
               tmpList.next = new ListNode(l2.val);
               tmpList = tmpList.next;
               l2 = l2.next;
           }
        }
        
        return rtnList;    
    }
    
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
