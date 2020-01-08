package LeetCode;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 * use counter to solve this problem
 * 
 * Runtime: 2 ms, faster than 96.79% of Java online submissions for Remove Outermost Parentheses.
 * Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
 * 
 * @author rocky
 */
public class A1021_RemoveOutermostParentheses_V2 {
    /* test case
    "(()())(())"
    "(()())(())(()(()))"
    "()()"
    "()))))()"
    */
    public String removeOuterParentheses(String S) {
     
        StringBuilder sb = new StringBuilder();

        int counter = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (counter++ != 0)
                    sb.append(c);
            }
            else if (c == ')') {
                if (--counter > 0)
                    sb.append(c);
            }
            else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
