package LeetCode;

/**
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * 
 * recursive version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
 * Memory Usage: 57.5 MB, less than 5.17% of Java online submissions for Insert into a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0701_InsertIntoABinarySearchTree {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
     
        if (root == null)
            return null;
        
        if (root.val > val) {
            
            if (root.left == null) {
                root.left = new TreeNode(val);
                return root;
            }
            
            insertIntoBST(root.left, val);
        }
        else {
            
            if (root.right == null) {
                root.right = new TreeNode(val);
                return root;
            }
            
            insertIntoBST(root.right, val);
        }
        
        return root;
    }
}
