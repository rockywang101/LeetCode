package LeetCode;

/**
 * https://leetcode.com/problems/delete-node-in-a-bst/
 * 
 * @author rocky
 */
public class A0450_DeleteNodeInABST {
    
    // 未完成，用 [5,3,7,null,null,null,8] 要 delete root 5，會發生 cycle
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if (root == null)
            return null;

        if (root.val == key) {
            // 沒有左邊，直接換上右邊的下一個
            if (root.left == null) {
                root = root.right;
                return root;
            }
            // 取左邊最大值的 Node
            TreeNode maxNode = popLeftMaxNode(root.left);
            maxNode.right = root.right;
            
            if (root.left != null && maxNode.val != root.val)
                maxNode.left = root.left;
            
            root = maxNode;
            return root;
        }

        if (root.val > key)
            return deleteNode(root.left, key);
        
        if (root.val < key)
            return deleteNode(root.right, key);
        
        return root;
    }
    
    private TreeNode popLeftMaxNode(TreeNode node) {

        // 自己就是最大，直接回傳
        if (node.right == null)
            return node;

        // 還有更大的更大，往下一層走
        if (node.right.right != null)
            return popLeftMaxNode(node.right);
        
        TreeNode target = node.right;
        // 判斷更大的左邊如果有 node 的話要接上 
        if (target.left != null) {
            node.right = target.left;
            target.left = null;
        }
        
        return target;
    }
}
