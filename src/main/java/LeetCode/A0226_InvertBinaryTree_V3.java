package LeetCode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * iterative version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 40 MB, less than 5.10% of Java online submissions for Invert Binary Tree.
 * 
 * @author rocky
 */
public class A0226_InvertBinaryTree_V3 {

    public TreeNode invertTree(TreeNode root) {
    	if (root == null)
    		return null;

    	LinkedList<TreeNode> keepList = new LinkedList<TreeNode>();
    	keepList.add(root);
    	
    	while (keepList.size() > 0) {
    		for (int i=0; i<keepList.size(); i++) {

    			TreeNode node = keepList.removeFirst();
    			
    			if (node.left != null || node.right != null) {
    				// exchange
    				TreeNode tmp = node.left;
    				node.left = node.right;
    				node.right = tmp;
    				
    				if (node.left != null)
    					keepList.add(node.left);
    				if (node.right != null)
    					keepList.add(node.right);
    			}
    		}
    	}
    	
    	return root;
    }
    
}
