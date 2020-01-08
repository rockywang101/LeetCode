package LeetCode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * two point 解法，
 * 短的走比較快，走完回到長的 list 重新走
 * 而長的走比較慢，走完回到短的 list 重新走，兩個剛好會在差異的地方開始一起走到終點
 * 
 * Runtime: 1 ms, faster than 99.11% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 43.4 MB, less than 5.71% of Java online submissions for Intersection of Two Linked Lists.
 * @author rocky
 */
public class A0160_IntersectionOfTwoLinkedLists_V2 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode p1 = headA;
        ListNode p2 = headB;
        
        while (p1 != p2) {
        	p1 = p1 == null ? headB : p1.next;
        	p2 = p2 == null ? headA : p2.next;
        }
        
        return p1; // p1 == p2
    }
}
