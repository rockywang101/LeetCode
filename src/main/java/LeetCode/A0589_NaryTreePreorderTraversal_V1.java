package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
 * Memory Usage: 41.5 MB, less than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
 * 
 * @author rocky
 */
public class A0589_NaryTreePreorderTraversal_V1 {    
    
    public List<Integer> preorder(Node root) {
        
        List<Integer> retList = new ArrayList<Integer>();
        
        visitNode(root, retList);
        
        return retList;
    }
    
    private void visitNode(Node node, List<Integer> retList) {
        if (node == null)
            return;
        
        retList.add(node.val);
        
        if (node.children == null)
            return;

        for (int i=0; i<node.children.size(); i++) {
            
            visitNode(node.children.get(i), retList);
        }
    }
}
