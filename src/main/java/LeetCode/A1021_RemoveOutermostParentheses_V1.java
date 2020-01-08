package LeetCode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 * Runtime: 5 ms, faster than 40.20% of Java online submissions for Remove Outermost Parentheses.
 * Memory Usage: 37.9 MB, less than 15.58% of Java online submissions for Remove Outermost Parentheses.
 * 
 * @author rocky
 */
public class A1021_RemoveOutermostParentheses_V1 {

    public String removeOuterParentheses(String S) {
     
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : S.toCharArray()) {
            
            if (c == '(') {
                if (! stack.isEmpty()) {
                    sb.append(c);
                }
                
                stack.push(c);
            }
            else if (c == ')') {
                
                stack.pop();
                
                if (! stack.isEmpty())
                    sb.append(c);    
            }
            else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
