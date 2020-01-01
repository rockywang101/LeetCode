package LeetCode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * 應該也算是 two point 解法，先求出差異多少，從長度沒差異的地方開始比對
 * 較好理解，但程式碼較長      
 * 
 * Runtime: 1 ms, faster than 99.11% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 43.5 MB, less than 5.71% of Java online submissions for Intersection of Two Linked Lists.
 * @author rocky
 */
public class A0160_IntersectionOfTwoLinkedLists_V3 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        int cnt1 = 0;
        while (p1 != null) {
        	cnt1++;
        	p1 = p1.next;
        }
        
        int cnt2 = 0;
        while (p2 != null) {
        	cnt2++;
        	p2 = p2.next;
        }
        
        p1 = headA;
    	p2 = headB;
        int diff = Math.abs(cnt1-cnt2);
        if (cnt1 > cnt2) {
        	while (diff-- > 0) {
        		p1 = p1.next;
        	}
        }
        else {
        	while (diff-- > 0) {
        		p2 = p2.next;
        	}
        }
        
        while (p1 != p2) {
        	p1 = p1.next;
        	p2 = p2.next;
        }
        
        return p1;
    }
}
