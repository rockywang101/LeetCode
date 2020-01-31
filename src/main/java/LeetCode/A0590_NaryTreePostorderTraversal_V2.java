package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * 
 * iterative version
 * 
 * Runtime: 3 ms, faster than 39.63% of Java online submissions for N-ary Tree Postorder Traversal.
 * Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
 * 
 * @author rocky
 */
public class A0590_NaryTreePostorderTraversal_V2 {

    public List<Integer> postorder(Node root) {
        
        List<Integer> retList = new ArrayList<Integer>();
        if (root == null)
            return retList;
        
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        
        while (! stack.isEmpty()) {
            
            Node last = stack.lastElement();
            if (last.children != null && last.children.size() > 0) {
                
                for (int i=last.children.size()-1; i>=0; i--)
                    stack.push(last.children.get(i));
                    
                last.children = null; // 設成 null，讓下次迴圈遇到的時候會被 pop 出去
            }
            else {
                retList.add(stack.pop().val);
            }
        }
        
        return retList;
    }
}
