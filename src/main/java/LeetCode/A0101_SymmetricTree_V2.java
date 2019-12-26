package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/symmetric-tree/
 * 
 * @author rocky
 */
public class A0101_SymmetricTree_V2 {
	
    // iterative version
    // Runtime: 1 ms, faster than 38.79% of Java online submissions for Symmetric Tree.
    // Memory Usage: 37.3 MB, less than 74.15% of Java online submissions for Symmetric Tree.
    public boolean isSymmetric(TreeNode root) {
    	
    	if (root == null)
    		return true;
    	
    	Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
    	Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
    	queue1.add(root.left);
    	queue2.add(root.right);
    	
    	while (! queue1.isEmpty() || ! queue2.isEmpty()) {
    	    
    		for (int i=0; i<queue1.size(); i++) {
    		    
    			TreeNode node1 = queue1.remove();
    			TreeNode node2 = queue2.remove();

    			if (node1 == null && node2 == null)
    				continue;
    			
    			if (node1 == null || node2 == null)
    				return false;
    			
    			if (node1.val != node2.val)
    			    return false;
    			
    			queue1.add(node1.left); // from left to right
    			queue1.add(node1.right);
    			queue2.add(node2.right); // form right to left
    			queue2.add(node2.left);
    		}
    	}
    	
    	return true;
	}
}
