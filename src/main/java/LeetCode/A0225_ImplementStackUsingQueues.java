package LeetCode;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Stack using Queues.
 * Memory Usage: 34 MB, less than 91.67% of Java online submissions for Implement Stack using Queues.
 * @author rocky
 */
public class A0225_ImplementStackUsingQueues {

    // 就用了 ListNode (Queue) 實作了一個簡單的 Stack 行為
    
    ListNode head;
    
    public A0225_ImplementStackUsingQueues() {
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        if (head == null)
            head = new ListNode(x);
        else {
            ListNode node = new ListNode(x);
            node.next = head;
            head = node;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int val = head.val;
        head = head.next;
        return val;
    }
    
    /** Get the top element. */
    public int top() {
        return head.val;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return head == null;
    }
}
