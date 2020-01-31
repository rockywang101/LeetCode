package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
 * Memory Usage: 41.8 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
 * 
 * @author rocky
 */
public class A0590_NaryTreePostorderTraversal_V1 {

    public List<Integer> postorder(Node root) {
        
        List<Integer> retList = new ArrayList<Integer>();
        
        visitNode(root, retList);
        
        return retList;
    }
    
    private void visitNode(Node node, List<Integer> retList) {
        if (node == null)
            return;
        
        for (int i=0; i<node.children.size(); i++) {
            
            visitNode(node.children.get(i), retList);
        }
        
        retList.add(node.val);
    }
}
