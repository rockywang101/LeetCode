package LeetCode;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
 * Memory Usage: 34 MB, less than 20.83% of Java online submissions for Implement Queue using Stacks.
 * @author rocky
 */
public class A0232_ImplementQueueUsingStacks {
    
    // 225 與 232 這兩題應該是在理解是否懂 Queue 與 Stack 的行為吧
    // 這裡的 Queue 是先進先出，而 225 的 Stack 則是先進後出
    
    ListNode head;
    ListNode last; // 為了 push 時要接在更後面

    /** Initialize your data structure here. */
    public A0232_ImplementQueueUsingStacks() {
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if (head == null) {
            head = new ListNode(x);
            last = head;
        }
        else {
            ListNode node = new ListNode(x);
            last.next = node;
            last = node;
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int val = head.val;
        head = head.next;
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        return head.val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return head == null;
    }
}
