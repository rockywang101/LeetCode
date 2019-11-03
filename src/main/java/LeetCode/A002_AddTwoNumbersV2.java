package LeetCode;

// https://leetcode.com/problems/add-two-numbers/
/**
 * 因為結果也是反的，直接用 listNode 做計算就好，自己做進位
 * 
 * @author rocky.wang
 */
public class A002_AddTwoNumbersV2 {

	// Runtime: 2 ms, faster than 81.53% of Java online submissions for Add Two Numbers.
	// Memory Usage: 44 MB, less than 87.15% of Java online submissions for Add Two Numbers.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	int sum = l1.val + l2.val;
    	int carry = sum / 10; // 進位
    	ListNode retNode = new ListNode(sum % 10);
    	ListNode tmpNode = retNode;
    	while (l1.next != null || l2.next != null || carry != 0) {
    		int num1 = l1.next != null ? l1.next.val : 0;
    		int num2 = l2.next != null ? l2.next.val : 0;

    		sum = num1 + num2 + carry;
    		carry = sum / 10; 
    		tmpNode.next = new ListNode(sum % 10); 
    		tmpNode = tmpNode.next;
    		if (l1.next != null)
    			l1 = l1.next;
    		if (l2.next != null)
    			l2 = l2.next;
    	}
    	
    	return retNode;
    }
    
    
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	
	// ***********************************************************
	// code from leetcode Playground Debug 
	
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) {

        ListNode l1 = stringToListNode("[9]");
        ListNode l2 = stringToListNode("[1,9,9,9,9,9,9,9,9,9]");
        ListNode ret = new A002_AddTwoNumbersV2().addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(ret));

        l1 = stringToListNode("[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]");
        l2 = stringToListNode("[5,6,4]");
        ret = new A002_AddTwoNumbersV2().addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(ret));

        l1 = stringToListNode("[5]");
        l2 = stringToListNode("[5]");
        ret = new A002_AddTwoNumbersV2().addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(ret));
        
    }
	
}

