package LeetCode;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/add-two-numbers/
/**
 * using Deque instead of Stack to print ordered item
 * https://stackoverflow.com/questions/14900710/stack-foreach-wrong-order
 * 
 * Playground Debug can see how your code be executed
 * 
 
 有點搞不懂 ListNode 到底要不要自己加，看起來如果加在程式碼裡一起 submit 上去反而會錯掉
 
 最後用到 BigInteger 反而要 import java.math.BigInteger
 其他的不用 import
 
 * 
 * @author rocky.wang
 *
 */
public class A002_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    	BigInteger num1 = listNodeToNumber(l1);
    	BigInteger num2 = listNodeToNumber(l2);
    	BigInteger sum = num1.add(num2);
    	
    	return numberToListNode(sum);
    }
    
    private ListNode numberToListNode(BigInteger sum) {
    	String str = String.valueOf(sum);
    	Deque<String> stack = new ArrayDeque<>();
    	for (char c : str.toCharArray()) {
    		stack.push(String.valueOf(c));
    	}

    	String single = stack.pop();
    	ListNode listNode = new ListNode(Integer.parseInt(single));
    	ListNode nowNode = listNode;
    	while (stack.size() != 0) {
    		nowNode.next = new ListNode(Integer.parseInt(stack.pop()));
    		nowNode = nowNode.next;
    	}
    	
    	return listNode;
    }
    
    private BigInteger listNodeToNumber(ListNode listNode) {
    
    	Deque<String> stack = new ArrayDeque<>();
    	
    	stack.push(listNode.val+"");
    	while (listNode.next != null) {
    		listNode = listNode.next;
    		stack.push(listNode.val+"");
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (String single : stack) {
    		sb.append(single);
    	}
    	
    	return new BigInteger(sb.toString());
    }
    
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	
	
	
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
    
    public static void main(String[] args) throws IOException {
//    	
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode l1 = stringToListNode(line);
//            line = in.readLine();
//            ListNode l2 = stringToListNode(line);
//            
//            ListNode ret = new A002_AddTwoNumbers().addTwoNumbers(l1, l2);
//            
//            String out = listNodeToString(ret);
//            
//            System.out.print(out);
//        }

        ListNode l1 = stringToListNode("[9]");
        ListNode l2 = stringToListNode("[1,9,9,9,9,9,9,9,9,9]");
        ListNode ret = new A002_AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(ret));

        l1 = stringToListNode("[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]");
        l2 = stringToListNode("[5,6,4]");
        ret = new A002_AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(ret));
        
    }
	
}

