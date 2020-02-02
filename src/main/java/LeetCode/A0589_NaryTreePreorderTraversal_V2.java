package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * 
 * Runtime: 3 ms, faster than 38.93% of Java online submissions for N-ary Tree Preorder Traversal.
 * Memory Usage: 41.6 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
 * 
 * @author rocky
 */
public class A0589_NaryTreePreorderTraversal_V2 {

    public List<Integer> preorder(Node root) {
        
        if (root == null)
            return new ArrayList<Integer>();
        
        Stack<Node> stack = new Stack<Node>();
        List<Integer> retList = new LinkedList<Integer>();

        stack.push(root);
        while (! stack.isEmpty()) {

            Node curr = stack.pop();
            retList.add(curr.val);
            
            for (int i=curr.children.size()-1; i>=0; i--)
                stack.push(curr.children.get(i));
        }
        
        return retList;
    }
        

    // 一樣是由上而下，但不是這題要的順序，先保留著
    private List<Integer> otherorder(Node root) {
        
        if (root == null)
            return new ArrayList<Integer>();

        List<Integer> retList = new ArrayList<Integer>();
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while (queue.size() > 0) {
            for (int i=0; i<queue.size(); i++) {
                Node node = queue.removeFirst();
                retList.add(node.val);
                for (Node child : node.children)
                    queue.add(child);
            }
        }
        
        return retList;
    }
}    
