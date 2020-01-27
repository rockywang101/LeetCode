package LeetCode;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 * Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 * 
 * @author rocky
 */
public class A1290_ConvertBinaryNumberInALinkedListToInteger_V1 {

    public int getDecimalValue(ListNode head) {

        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        
        return Integer.parseInt(sb.toString(), 2);
    }
}
