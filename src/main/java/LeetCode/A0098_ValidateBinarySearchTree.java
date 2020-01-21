package LeetCode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
 * Memory Usage: 46.4 MB, less than 5.58% of Java online submissions for Validate Binary Search Tree.
 * 
 * @author rocky
 */
public class A0098_ValidateBinarySearchTree {
    
    public boolean isValidBST(TreeNode root) {
    
        if (root == null)
            return true;
        
        return isValidBST(root.left, null, root.val) && isValidBST(root.right, root.val, null);
        
    }
    
    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        
        if (node == null)
            return true;

        if (lower != null && node.val <= lower)
            return false;
        
        if (upper != null && node.val >= upper)
            return false;
        
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}

