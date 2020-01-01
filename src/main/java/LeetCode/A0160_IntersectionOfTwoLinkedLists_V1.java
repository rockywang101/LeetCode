package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * use map to store one list, O(m) or O(n) space, O(m+n) time
 * 
 * Runtime: 7 ms, faster than 25.98% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 42.1 MB, less than 5.71% of Java online submissions for Intersection of Two Linked Lists.
 * @author rocky
 */
public class A0160_IntersectionOfTwoLinkedLists_V1 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    	if (headA == null || headB == null)
    		return null;
    	
    	Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
    	
    	ListNode tmpA = headA;
    	while (tmpA != null) {
    		map.put(tmpA, 0);
    		tmpA = tmpA.next;
    	}
    	
    	ListNode tmpB = headB;
    	while (tmpB != null) {
    		if (map.containsKey(tmpB))
    			return tmpB;
    		tmpB = tmpB.next;
    	}
    	
    	return null;
    }
}
