package LeetCode;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * recursive version by myself
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 40.1 MB, less than 5.10% of Java online submissions for Invert Binary Tree.
 * 
 * @author rocky
 */
public class A0226_InvertBinaryTree_V2 {

    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;
        
        invert(root);
        
        return root;
    }
    
    private void invert(TreeNode node) {
        // 左邊的小孩還有小孩的話，先讓下面的小孩去做交換
        if (node.left != null && (node.left.left != null || node.left.right != null))
            invert(node.left);
        // 右邊的小孩還有小孩的話，先讓下面的小孩去做交換
        if (node.right != null && (node.right.left != null || node.right.right != null))
            invert(node.right);
        // 交換
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }
}
