package LeetCode;

/**
 * https://leetcode.com/problems/min-stack/
 * 
 * implement stack by self
 *
 * Runtime: 4 ms, faster than 99.84% of Java online submissions for Min Stack.
 * Memory Usage: 40 MB, less than 34.06% of Java online submissions for Min Stack.
 * @author rocky
 */
public class A0155_MinStack_V2 {
    
    class Item {
        int val;
        int min;
        Item next;
        Item(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    
    private Item head;

    public A0155_MinStack_V2() {
    }
    
    public void push(int x) {

        if (head == null) {
            head = new Item(x, x);
        }
        else {
            Item item = new Item(x, Math.min(head.min, x));
            item.next = head;
            head = item;
        }
    }
    
    public void pop() {
        
        head = head.next;
    }
    
    public int top() {
        
        return head.val;
    }
    
    public int getMin() {
        
        return head.min;
    }
}
