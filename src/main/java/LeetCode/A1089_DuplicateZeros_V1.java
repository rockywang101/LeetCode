package LeetCode;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 * 
 * 還是有用到 ListNode 存放資料，沒有達到 space O(1)
 * 
 * Runtime: 1 ms, faster than 94.26% of Java online submissions for Duplicate Zeros.
 * Memory Usage: 41.4 MB, less than 100.00% of Java online submissions for Duplicate Zeros.
 * 
 * @author rocky
 */
public class A1089_DuplicateZeros_V1 {
    
    public void duplicateZeros(int[] arr) {
    	
    	ListNode head = null;
    	ListNode curr = null;
    	
    	for (int i=0; i<arr.length; i++) {

    		if (arr[i] == 0) {
    			if (head == null) {
    				head = new ListNode(0);
    				curr = head;
    			}
    			else {
    				curr.next = new ListNode(0);
    				curr = curr.next;
    			}
    		}
    		
    		if (head != null) {
    			curr.next = new ListNode(arr[i]);
    			curr = curr.next;
    			arr[i] = head.val;
    			head = head.next;
    		}
    	}
    }
}
