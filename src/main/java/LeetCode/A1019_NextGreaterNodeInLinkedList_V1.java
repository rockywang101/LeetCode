package LeetCode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 * 
 * Runtime: 152 ms, faster than 26.04% of Java online submissions for Next Greater Node In Linked List.
 * Memory Usage: 40.7 MB, less than 97.30% of Java online submissions for Next Greater Node In Linked List. 
 * @author rocky
 */
public class A1019_NextGreaterNodeInLinkedList_V1 {
    
    public int[] nextLargerNodes(ListNode head) {
    
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        
        int size = stack.size();
        
        int[] rtn = new int[size];
        rtn[size-1] = 0; // 最後一個絕對沒有更大數一定是放 0
        stack.pop();
        
        for (int i=size-2; i>=0; i--) {

            ListNode node = stack.pop();
            if (node.next.val > node.val) {
                rtn[i] = node.next.val;
            }
            else {
                int j = i + 1; // next greater
                while (j < size-1) {
                    if (rtn[j] > node.val) {
                        rtn[i] = rtn[j];
                        break;
                    }
                    j++;
                }
                // 如果都沒符合，default 就是 0 了，不需處理
            }
        }
        
        return rtn;
    }
}
