package LeetCode;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 * 
 * solution form network
 * 
 * Runtime: 3 ms, faster than 100.00% of Java online submissions for Next Greater Node In Linked List.
 * Memory Usage: 39.9 MB, less than 97.30% of Java online submissions for Next Greater Node In Linked List.
 * 
 * @author rocky
 */
public class A1019_NextGreaterNodeInLinkedList_V3 {
    
    /**
     * @param head
     * @return
     */
    public int[] nextLargerNodes(ListNode head) {

        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len += 1;
            cur = cur.next;
        }
        int[] index = new int[len];
        int[] value = new int[len];
        int[] res = new int[len];
        int ptr = -1;
        int count = 0;
        for (cur = head; cur != null; cur = cur.next, count++) {
            while (ptr >= 0 && value[ptr] < cur.val) {
                res[index[ptr--]] = cur.val;
            }
            ptr++;
            index[ptr] = count;
            value[ptr] = cur.val;
        }
        return res;
    }
}
