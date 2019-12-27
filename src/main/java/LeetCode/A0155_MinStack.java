package LeetCode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/
 * 
 * @author rocky
 */
public class A0155_MinStack {
    
    // Runtime: 5 ms, faster than 80.25% of Java online submissions for Min Stack.
    // Memory Usage: 40.1 MB, less than 31.16% of Java online submissions for Min Stack.
    class Item {
        int val;
        int min;
        Item(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    
    
    Stack<Item> stack;
    
    public A0155_MinStack() {
        stack = new Stack<Item>();
    }
    
    public void push(int x) {
        
        int min;
        if (stack.size() == 0) {
            min = x;
        }
        else {
            Item node = stack.peek();
            min = node.min < x ? node.min : x;
        }
        
        Item item = new Item(x, min);
        stack.push(item);
    }
    
    public void pop() {
        
        stack.pop();
    }
    
    public int top() {
        
        return stack.peek().val;
    }
    
    public int getMin() {
        
        return stack.peek().min;
    }
}
