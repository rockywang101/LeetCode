package LeetCode;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 * 
 * @author rocky
 */
public class A1290_ConvertBinaryNumberInALinkedListToInteger_V2 {

    public int getDecimalValue(ListNode head) {

        int ret = 0;
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        
        curr = head;
        while (curr != null) {
            ret += curr.val == 0 ? 0 : (int) Math.pow(2, size-1);;
            curr = curr.next;
            size--;
        }
        
        return ret;
    }
}
