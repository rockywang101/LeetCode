package LeetCode;

/**
 * https://leetcode.com/problems/trim-a-binary-search-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
 * Memory Usage: 45.3 MB, less than 5.55% of Java online submissions for Trim a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0669_TrimABinarySearchTree {
    
    public TreeNode trimBST(TreeNode root, int L, int R) {
        
        if (root == null)
            return null;
        
        if (root.val < L)
            return trimBST(root.right, L, R);
        if (root.val > R)
            return trimBST(root.left, L, R);
    
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        
        return root;
    }
}
