package LeetCode;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * recursive version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 39.8 MB, less than 5.10% of Java online submissions for Invert Binary Tree.
 * 
 * @author rocky
 */
public class A0226_InvertBinaryTree_V1 {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) 
            return null;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        
        return root;
    }
}
