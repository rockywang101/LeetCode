package LeetCode;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 * use counter to solve this problem
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Remove Outermost Parentheses.
 * Memory Usage: 38 MB, less than 15.58% of Java online submissions for Remove Outermost Parentheses.
 * 
 * @author rocky
 */
public class A1021_RemoveOutermostParentheses_V3 {
    /* test case
    "(()())(())"
    "(()())(())(()(()))"
    "()()"
    */
    public String removeOuterParentheses(String S) {
     
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (count++ != 0)
                    sb.append(c);
            }
            else if (--count > 0) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
