package LeetCode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 * 
 * @author rocky
 */
public class A0101_SymmetricTree_V1 {
	
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
}
