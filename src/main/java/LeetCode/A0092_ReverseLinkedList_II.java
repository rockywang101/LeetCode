package LeetCode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.
 * Memory Usage: 37.6 MB, less than 11.36% of Java online submissions for Reverse Linked List II.
 * 
 * @author rocky
 */
public class A0092_ReverseLinkedList_II {
	
    public ListNode reverseBetween(ListNode head, int m, int n) {
    
    	ListNode curr = head;
    	ListNode prev = null;
    	int i = 1;
    	// 先把 curr 移到第 m 個 node (prev 是前一個)
    	while (i < m) {
    		prev = curr;
    		curr = curr.next;
    		i++;
    	}
    	
    	ListNode first = curr; // 要開始反轉的第一個 node
    	ListNode next = curr.next;
    	while (i < n) {
    		ListNode tmp = next;
    		next = next.next;
    		tmp.next = curr;
    		curr = tmp;
    		i++;
    	}
    	
    	first.next = next; // 1 -> "2 -> 3 -> 4" -> 5 的話，first 就是把 2，指向 5
    	if (m == 1)
    		head = curr;
    	else
    		prev.next = curr;

    	return head;
    }
    
    
    public static void main(String[] args) {
		
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
//    	head.next.next = new ListNode(3);
//    	head.next.next.next = new ListNode(4);
//    	head.next.next.next.next = new ListNode(5);
    	
    	ListNode headListNode = new A0092_ReverseLinkedList_II().reverseBetween(head, 1, 2);
    	
    	while (headListNode != null) {
    		System.out.print(headListNode.val + " -> ");
    		headListNode = headListNode.next;
    	}
	}
    
    
}
