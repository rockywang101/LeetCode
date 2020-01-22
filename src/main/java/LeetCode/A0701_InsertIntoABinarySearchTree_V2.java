package LeetCode;

/**
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * 
 * iterative version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
 * Memory Usage: 59.9 MB, less than 5.17% of Java online submissions for Insert into a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0701_InsertIntoABinarySearchTree_V2 {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
     
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val > val) {

                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    break;
                }
                
                curr = curr.left;
            }
            else {
                
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    break;
                }
                
                curr = curr.right;
            }
        }
        
        return root;
    }
}
