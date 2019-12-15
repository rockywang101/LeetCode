package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class A0101_SymmetricTree {
	
	// recursive version
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
	// Memory Usage: 37.7 MB, less than 73.47% of Java online submissions for Symmetric Tree.
    public boolean isSymmetric(TreeNode root) {
        
        if (root == null)
            return true;
        
        return isSymmetric(root.left, root.right);
    }
    
    
    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        
        if (leftNode == null && rightNode == null)
            return true;
        
        if (leftNode == null || rightNode == null)
            return false;
        
        if (leftNode.val != rightNode.val)
            return false;
        
        return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
    }
    
    
    // iterative version
    // Runtime: 1 ms, faster than 41.09% of Java online submissions for Symmetric Tree.
    // Memory Usage: 38.4 MB, less than 62.58% of Java online submissions for Symmetric Tree.
    public boolean isSymmetricIterator(TreeNode root) {
    	
    	if (root == null || (root.left == null && root.right == null))
    		return true;
    	
    	if (root.left == null || root.right == null)
    		return false;
    	
    	Queue<TreeNode> q1 = new LinkedList<TreeNode>();
    	Queue<TreeNode> q2 = new LinkedList<TreeNode>();

    	q1.add(root.left);
    	q2.add(root.right);
    	
    	while (! q1.isEmpty() || ! q2.isEmpty()) {
    		Object[] q1Array = q1.toArray();
    		Object[] q2Array = q2.toArray();
    		
    		if (q1Array.length != q2Array.length)
    			return false;
    		
    		q1.clear();
    		q2.clear();
    		
    		for (int i=0; i<q1Array.length; i++) {
    			TreeNode node1 = (TreeNode) q1Array[i];
    			TreeNode node2 = (TreeNode) q2Array[i];

    			if (node1 == null && node2 == null)
    				continue;
    			if (node1 == null || node2 == null || node1.val != node2.val)
    				return false;
    			
    			q1.add(node1.left); // from left to right
    			q1.add(node1.right);
    			q2.add(node2.right); // form right to left
    			q2.add(node2.left);
    		}
    	}
    	
    	return true;
	}
}
