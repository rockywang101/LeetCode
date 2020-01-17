package LeetCode;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * 不會 work 的 recursive 版本
 * 
 * @author rocky
 */
public class A0226_InvertBinaryTree_V3 {

    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;
        
        invert(root);
        
        return root;
    }
    
    private void invert(TreeNode node) {
        
        // 左邊的小孩還有小孩的話
        if (node.left != null && (node.left.left != null || node.left.right != null))
            invert(node.left);
        // 右邊的小孩還有小孩的話
        if (node.right != null && (node.right.left != null || node.left.right != null))
            invert(node.left);

        // 交換
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }
}
