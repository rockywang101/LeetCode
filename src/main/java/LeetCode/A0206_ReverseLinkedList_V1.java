package LeetCode;

/**
 * 在我興高烈采的終於想到寫法也寫完了以後，才學會一堂課…  
 * newHead 在 recursive 裡傳來傳去的的永遠是當時傳入的 null 值 
 * @author rocky
 */
public class A0206_ReverseLinkedList_V1 {
    
    public ListNode reverseList(ListNode head) {
    
        if (head == null || head.next == null)
            return head;
        
        ListNode newHead = null;
        
        reverse(head, head.next, newHead);
        
        return newHead;
    }
    
    
    private void reverse(ListNode x, ListNode y, ListNode newHead) {

    	if (y.next == null) {
    		// reverse
    		y.next = x;
    		x.next = null;
    		
    		if (newHead == null)
    			newHead = y;
    		
    		return;
    	}

    	reverse(y, y.next, newHead);

    	y.next = x;
    	x.next = null;
    }
}
