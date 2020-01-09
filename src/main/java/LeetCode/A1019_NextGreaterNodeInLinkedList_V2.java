package LeetCode;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 * 
 * Runtime: 4 ms, faster than 99.55% of Java online submissions for Next Greater Node In Linked List.
 * Memory Usage: 39.8 MB, less than 97.30% of Java online submissions for Next Greater Node In Linked List.
 * 
 * @author rocky
 */
public class A1019_NextGreaterNodeInLinkedList_V2 {
    
    public int[] nextLargerNodes(ListNode head) {

        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        
        // 把 list 轉成 int[] nums
        int[] nums = new int[size];
        curr = head;
        for (int i=0; i<size; i++) {
            nums[i] = curr.val;
            curr = curr.next;
        }
        
        int[] rtnNums = new int[size];
        int[] index = new int[size]; // 存放更大數的 index 位置
        
        rtnNums[size-1] = 0; // 最後一項一定沒有更大數，所以直接放 0
        index[size-1] = 0;
        
        for (int i=size-2; i>=0; i--) {
            int j = i + 1;
            while (nums[i] >= nums[j]) {
                j = index[j];
                if (j == 0)
                    break;
            }

            index[i] = j;
            rtnNums[i] = j == 0 ? 0 : nums[j];
        }
        
        return rtnNums;
    }
}
